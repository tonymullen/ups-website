```
cacheable: false
```

## Testing search algorithms

Today you and your partner will be running empirical experiments to determine the best, worst, and average time complexity of three different algorithms: linear search, binary search, and a median finding algorithm. Recall that the time complexity is the number of comparisons as a function of the array size. To get started, first download the [starter code](http://mathcs.pugetsound.edu/~tmullen/ics/lab11.zip).

This lab is unusual because you will be generating plots and providing a **lab report** (see the Word document in the starter code)! At the end of this lab, please submit whatever you and your partner were able to accomplish.

## Familiarizing yourself with the code

Begin by looking through the `PerformanceTester` and `ListSearcher` classes. Make sure you understand what each class is doing, what the methods do, and what the instance variables represent. If you have any questions, call me or the lab assistant over.

## Counting comparisons

You will notice that there is no code for actually counting the number of comparisons in the `ListSearcher` class! This is your first task.

1. Add an instance variable to the ListSearch class to keep track of the number of comparisons made.
2. Modify the `linearSearch()`, `binarySearch()`, and `findMedian()` methods so that they count how many comparisons are made
3. Finally, add the following accessor/mutator methods:
    * public int `getComparisons()` - This method returns the number of comparisons made
    * public void `resetComparisons()` - This method resets the number of comparisons to 0.

You should now be able to reset, count, and get the number of comparisons made.

## Running experiments

Once you have the above code implemented and you can count comparisons, test to see if your analyses of the time complexity of linear and binary search are actually correct.

The `PerformanceTester` class has three static methods: `testLinearSearch`, `testBinarySearch`, and `testMedian`. This section will step you through experimenting with linear search. Once you learn how to do this, you can go back and do the same for binary search. (Ignore the median method for now.)

Look inside the `main` method. You’ll see that we’re calling `testLinearSearch` with an array of size N=1000, number of trials equal to 1, and unordered data. If you run the `main `method, you should see something similar to the following print out (the 333 won't be exactly the same. The algorithm is searching for a randomly generated number, so it will probably be different each time the code is run):

    N=1000, best=333 (expected 1), worst=333 (expected 1000), avg=333 (expected 500)

Spend a little bit of time making sure you understand the report you just generated above. Recall our hypothesis that the best case, worst case, and average case comparisons for linear search are 1, N, and N/2, respectively.

In the report printed out, the best, worst, and average number of comparisons are all the same because `linearSearch()` was only run once. As a result, the quality of these results is not very good, and as computer scientists, we know that results from a single experiment cannot be taken at face value! A good scientist would repeat the experiment multiple times to get a good understanding of what’s really happening.

* Modify the input values to `testLinearSearch` to repeat the experiment 10 times. The report printed out should show values closer to the expected number of comparisons. Notice that with the greater number of repetitions of the experiment, the best, worst, and average values come closer to their expected values.
* Open up the Word document included in the starter code and answer question **Q1**.

### Generating plots

It would be great to generate plots to better visualize our results. Open up your favorite spreadsheet tool, like Sheets on Google Docs or Excel. The following example shows how to generate charts using Sheets on Google Docs:

* In main, call `testLinearSearch` for N = 1000,2000,3000,...,10000 using the number of trials you found worked best in question **Q1**.
* Head over to Google Docs. One of you will need a Google ID to sign in. Once in, click on the striped lines button on the top-left corner, and select Sheets. Next, click on the `+` button and it should generate a new blank spreadsheet. Let ms know if you have troubles getting this far.
* After you’ve got a blank sheet in front of you, copy the numbers for N, best case, worst case, and average case as follows:

<img src="/~tmullen/images/ics/spreadsheet.png" style="width: 80%; display: block; margin: 20px auto;"/>

* Double-check that all of your data is entered correctly. Then highlight your data (including the first row containing labels). From the menu bar, click “Insert > Chart...” Click on the “Chart Types” tab at the top and make sure there is checkmark in “Use Row 1 as Headers” and “Use Column A as Labels”. Select the first “Line” box to generate a line plot.

<img src="/~tmullen/images/ics/chartEditor.png" style="width: 50%; display: block; margin: 20px auto;"/>

* Click on the “Customisation” tab at the top. Give your chart a title. Scroll down to the “Axis” panel. Label your horizontal axis “N (List Size)” and your vertical axis “Comparisons”. Click the “Insert” button and you’re all done! Your chart should look something like this:

<img src="/~tmullen/images/ics/linearSearchGraph.png" style="width: 80%; display: block; margin: 20px auto;"/>

* Click on the chart, and on the top-right hand corner you should see a triangle button. Click on this button, and click “Save Image”. This will download the chart as a PNG file. Open it and drag this chart into the appropriate place in your lab report under **Q2**.

* That’s all there is! Go ahead and answer **Q3** in your lab report. This question asks you to experiment with linear search using ordered (i.e. sorted) data.


## Binary search

Repeat the process above but this time with binary search.

Notice that `testBinarySearch` has no boolean flag to indicate whether it should generate ordered or unordered data because binary search requires an ordered array to work correctly. Run this method for N = 1000, 2000, 3000, . . . , 10000. Generate a plot and add it to your report. Answer question **Q4**.

## Analyzing a new algorithm

If time allows, you'll analyze a brand new algorithm: an algorithm to find the median value in an array. The median of a set of numbers is the number that is bigger than half the values and smaller than half the values. If the array was sorted, the median would be in the middle spot. Note: If the array has even length, there is no unique median. In this case, either of the middle values will be satisfactory.

1. Open up the `ListSearcher` class and read the `findMedian()` code. This is a very naive algorithm for finding the median!
2. Make a guess for the best, worst, and average time complexity for this method. Record your guess in your lab report.
3. Run experiments by calling the `testMedian` method in the `PerformanceTester` class using N = 100,200,300,...,1000. If you run bigger values, it will take a long time to complete. Try to run as many trials as possible.
4. Open your spreadsheet program, and generate another plot, with the best, worst, and average-case. Insert the plot in your Lab Report, and answer the final question.

## Submitting your lab assignment                                                      
Submit your lab14 folder with both Java classes and your Word lab report inside. Remember to put both of your names on the folder before you zip it.
[Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=335953).
