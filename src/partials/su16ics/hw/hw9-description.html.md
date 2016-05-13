```
cacheable: false
```

## Water Consumption

This week you'll write a program that performs some analysis on actual, real-life data! Professor Richards recently moved into a new house — one that has a device that monitors how much electricity they're using. Once a minute, it records the power usage on each of the electrical circuits in the house. The water comes from a well, and it dawned on him that he could calculate how much water the house is using by looking at the power data. He knows that the pump produces two gallons of water per minute when it's running. That should make it pretty simple to calculate how much water is being used: Look through the power usage data for the pump, and count the number of data points (minutes) where the pump is drawing power. Once we know how many minutes it ran, we can multiply by the flow rate to get the number of gallons produced. (For example, if I see that the pump ran for five minutes, I know that it produced 10 gallons since it produces two gallons per minute.) You'll write methods to read data from a file and do some analysis on it, including determining water use.

## The `FileAnalysis` class

Download the [PumpProject](http://mathcs.pugetsound.edu/~tmullen/ics/PumpProject.zip) project and open it in BlueJ. It contains a starting point for the `FileAnalysis` class, including a list of the methods you'll have to implement. The project folder also includes two data files you can use to test your code: `pump_data.txt` contains power consumption data for the well pump from January and February of this year. The `short_data.txt` file contains just one hour's worth of data from the pump. (The short file is small enough that you could calculate the expected results by hand and use that to verify that your program is working correctly.)

The basic plan is that when we construct an instance of the `FileAnalysis` class we'll pass it the name of the data file to be analyzed (as a String). We'll use `Scanner` and `File` to read the data into an ArrayList.

After that, we can call any of the analysis methods we want, and they'll work their way through the data in the ArrayList calculating things like the total number of gallons pumped and the total power used. The `FileAnalysis` class will have the following methods:

* A constructor that takes a single string (the name of the file) as an argument.
* A `totalHours()` method that looks through the data to determine how many hours' worth of data it contains. It should return the number of hours as a double. (Recall that each data point in the file represents one minute's worth of data.)
* A `totalPower()` method that looks through the data and calculates the total amount of power used by the pump. The data values in the file represent the amount of power in Watts that the pump is using at the moment the monitoring device records the data point. Thus, to get the total power used, this method just needs to add up all of those individual power readings. (This will produce a value with units of Watt minutes, which is an odd way to present power data, but that's ok — we'll fix it later.) You can include the noisy almost-zero values in your sum — they're so much smaller than the values when the pump is running that they won't make much of a difference.
* The `minutesPumping()` method returns the number of data points for which the pump was actually running. If you look at the data files, you'll see that there's a little bit of "noise" in the data. When the pump is running it's drawing almost 1000 Watts, but when it's not running the recorded value isn't always zero — it's often zero, but can be a small positive or negative value too. You'll need to check whether the power use is above some minimum value when deciding whether the pump is running.
* The `minutesToPumpAmount(double gallonAmount)` method determines how many *total* minutes (data points) pass before the pump has produced `gallonAmount` gallons of water, whether the pump is running or not. This will look a lot like `minutesPumping()`, in that you'll need to watch for data points where the pump is running and add things up as you go, but here you'll want to stop processing the data once you've seen enough data points. (See below for an example.) If you make it all the way through the array list and the pump still hasn't produced gallonAmount, return `-1` so the user knows that the pump never produces that much. One could use this to see how many days it takes to use 1000 gallons, for example.

Some sample interactions from the codepad are shown below. There are 60 data points in the short data file, so it's exactly one hour's worth of data, but the pump is only running for 7 of those data points (7 minutes). That would produce 14 gallons of water. The last three calls show that the pump has produced 4 gallons of water after the 10th data point, and we need to run until the 11th data point to produce 5 gallons of water. The pump doesn't run for long enough to produce 100 gallons so the last call returns -1.

    > FileAnalysis analyzer;
    > analyzer = new FileAnalysis("short_data.txt");
    > analyzer.totalHours()
    1.0   (double)
    > analyzer.totalPower()
    6795.0   (double)
    > analyzer.minutesPumping()
    7   (int)
    > analyzer.minutesToPumpAmount(4)
    10   (int)
    > analyzer.minutesToPumpAmount(5)
    11   (int)
    > analyzer.minutesToPumpAmount(100)
    -1   (int)

## The `PumpResults` Class

Once you've got your FileAnalysis methods written, create a second class, PumpResults that uses them to analyze a data file. This new class should only contain a main method. It should prompt the user for a file name, create a FileAnalysis object, and then call methods to analyze the data file. For full credit, you should:

* Report the duration of the data file in both hours and days
* Report both the total number of gallons produced and the average daily consumption.
* Report the total power used by the pump. As shown below, I'm reporting this is both Watt minutes (this is just the value returned by the totalPower method) and the more traditional Kilowatt Hours (kWh). You can divide the Watt minutes value by 1000 to turn the Watts into Kilowatts, and then divide by 60 to turn minutes into hours. (Power costs about 11 cents per kWh here, so once you've got kWh you could also estimate the cost of the electricity used.)
* Print how long it took to consume a certain quantity of water. In my output below I'm reporting results for 7 gallons and for 4000 gallon

Here is some sample output from a run of my program. The name of the file is input by the user.

    Please enter the file name: short_data.txt
    Data file contains 1.0 hours worth of data
    (That's 0.041666666666666664 days.)

    Pump ran for 7 minutes, producing 14.0 gallons
    (That's 336.0 gallons per day)

    Pump required a total of 6795.0 Watt minutes of power
    (That's 0.11325 kWh)

    It took 12 minutes of data to reach 7 gallons.
    It took -1 minutes of data to reach 4000 gallons.
    Done with analysis.

## Handling files with `Scanner`

Review section 5.5 in your book about how to handle file input with the `Scanner` class. In short, `Scanner` behaves the same with files as it does with user input from the command line, but the constructor for the `Scanner` object must be called with the `File` object instead of `System.in`. The necessary libraries have already been loaded into the starter code for you.

## Throwing and catching exceptions

Note also that the `java.io.FileNotFoundException` library has been imported. This enables Java to "throw" an "exception" in the case that a file that is called for is not found. An "exception" in Java is a situation that is unexpected or not what the correct functioning of the program requires (for example, a missing file that the program is trying to load.) By throwing an exception, the program is able to alert the user or developer as to what has caused the problem. If exceptions are not thrown, the program can simply fail without giving any indication as to what has gone wrong.

The way this is used is also demonstrated for you in the starter code. Methods that may encounter this exception use `throws FileNotFoundException` to enable them to throw the exception if the filename given doesn't match an existing file.

You'll also need to deal with this in the `PumpResults` class. Because the constructor for `FileAnalysis` is set up to throw an exception, you must call it in a way that the exception can be caught. This is done using `try` and `catch`, as follows:

    try
    {
        FileAnalysis fa = new FileAnalysis(fileName);

        //Code for what to do with the FileAnalysis
        //object goes here

    }
    catch (FileNotFoundException ex)  
    {
        //This handles the case in which the exception
        //is thrown, i.e. the file is not found.
        System.out.print("Can't find " + fileName + "\n");
    }

The above code assumes that the `fileName` variable has been given an appropriate value.

## Extra credit

If you finish the code above and are anxious for more, consider taking on this extra challenge. The analysis above tells me what the average daily water use is for the house, but we'd also like to know how often the water softener was recharging, and how much water that was using. Water softeners remove minerals and scale from the water, but after a certain interval they need to "recharge". This involves running water through them to wash out all of the collected minerals and scale. We know that the water softener is programmed to recharge after softening 3000 gallons of water. The process uses so much water that it takes the well pump several hours of pumping to refill the holding tank after a recharge.

The goal for the extra credit challenge is to look through the data file for times when the pump runs for at least 120 minutes in a row, and report when the long run started and how long it lasted. This information is of interest for two reasons: Since we know the softener recharges at 3000 gallon intervals, we can use information about the gap between recharges to double-check the flow rate. (I was told that it was 2 gallons/minute, but maybe that's an estimate.) The duration of those long pump runs also represent "wasted" water. How many minutes, total, was the pump running just to recharge the softener? Both of those questions can be answered once we figure out where those long pump runs occur in the data, but all you need to do for the extra credit is find those long runs and report them. Add an extra method to the `FileAnalysis` class that prints output something like this when run:

    Information on water softener recharges:
    152 minute run started at 9273
    182 minute run started at 28822

This assignment is worth 100 points without the extra credit, and I'll give you an extra 15 points, maximum, for your efforts on the extra credit problem.

## Style Guide

For this assignment, I'm also introducing Professor Richards' style guide. These are excellent tips for writing good Java code and we should all start following them!

Before you submit your assignment, go through the checklist below and make sure your code conforms to the style guide.

* No unused variables or commented-out code is left in the class
* All instance variables are used in more than one method (if not, make them local)
* Javadoc comment above each class
* All methods have Javadoc comments
* All numbers have been replaced with constants (i.e. no "magic numbers")
* Proper capitalization of variables, methods, and classes
* Use white space to separate different sections of your code

Once you've tested your code and verified that it meets style guidelines, submit from within BlueJ as usual.

 [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=328645).
