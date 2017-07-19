```
cacheable: false
```

## Histogram

A [histogram](https://en.wikipedia.org/wiki/Histogram) is a widely used method of visualizing statistical distributions. In this exercise, you will use what you've learned about working with arrays to create a histogram to visualize a distribution of numbers in a list.

Specifically, you'll be working on an exercise based on programming project 8.3 on P 435 of your book. If time allows, you will generalize it as described below.

## Objective

Write a program that creates a histogram that allows you to visually inspect the frequency distribution. Your program will read a file (included in the starter project  [here](http://mathcs.pugetsound.edu/~tmullen/ics/HistogramStarter.zip)) called `numbers.txt`. The file-reading apparatus (including the FileNotFound exception handling) has been set up for you.

Your program will use an array to keep track of the counts of the numbers. When all the numbers have been read from the file, your program will call a method to draw a histogram to the screen using asterisks to represent counts in each "bin" of the histogram. Each "bin" should include a span of 10 values, so a histogram like the following would indicate that there were four values between 1 and 10 in the data, 6 values between 11 and 20, and the frequency over all the values exhibits something like a normal distribution:

    1    - 	10  ****
    11   - 	20  ******
    21   - 	30  ************
    31   - 	40  ***********************
    41   - 	50  ********************************
    51   - 	60  ********************************************
    61   - 	70  *******************************
    71   - 	80  ************************
    81   - 	90  ************
    91   - 	100 ******

If time allows, generalize your histogram method to allow for an argument that sets the bin size.


## Submitting your lab assignment                                                      
Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=366952).
