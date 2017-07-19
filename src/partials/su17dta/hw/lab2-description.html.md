```
cacheable: false
```


For today’s lab, you’ll be practicing the following skills:

1. Declaring, initializing, and assigning to variables of type int and double
2. Basic arithmetic operations and expressions
3. Casting types

To get started, open BlueJ and create a new project called `lab2`. Make sure you create this new project
inside your `cs161` directory.


### Programming exercises

1. Read the following questions (a)-(q). For each of them, write down what you think the value of the result should be on a piece of paper (guessing is fine). When you've finished this, write a program to print out the correct values. To do this, create a class called `Arithmetic` and copy the code into the `main` method of your class. Create the class in the same way as you created the `Test` class in lab 1. Which of the answers you wrote down were correct, and which were incorrect? Is there anything that surprises you or doesn't make sense?

    Assume the following declarations and assignments:

        int iResult, num = 25, num2 = 40, num3 = 17, num4 = 5;
        double fResult, val1 = 17.0, val2 = 12.78;
<p>
    (a) `iResult = num1 / num4`

    (b) `fResult = num1 / num4`

   (c) `iResult = num3 / num4`

   (d) `fResult = num3 / num4`

   (e) `fResult = val1 / num4`

   (f) `fResult = val1 / val2`

   (g) `iResult = num1 / num2`

   (h) `fResult = (double) num1 / num2`

   (i) `fResult = num1 / (double) num2`

   (j) `fResult = (double) (num1 / num2)`

   (k) `iResult = (int) (val1 / num4)`

   (l) `fResult = (int) (val1 / num4)`

   (m) `fResult = (int) ((double) num1 / num2)`

   (n) `iResult = num3 % num4`

   (o) `iResult = num2 % num3`

   (p) `iResult = num3 % num2`

   (q) `iResult = num2 % num4`

2. Click [here](http://www.wunderground.com/q/zmw:98406.1.99999?sp=KWATACOM97) to go to Weather Underground for Tacoma, WA. This website compiles a variety of climate data such as high and low temperatures, pressure, visibility, precipitation, etc.
    * Use the data provided on this website to perform arithmetic computations using the four operators: +, −, ∗, and /
    * Create a class called `Weather` with a `main` method exactly as you've seen in previous examples.
    * In `main`, write code that computes the average temperatures for the past 7 days (in fahrenheit).
    * In `main`, write code that computes the standard deviation of temperatures for the past 7 days
    * In `main`, write code that converts fahrenheit values to celsius.
    * In `main`, write code that prints out your computations (along with explanations) to the screen.

## Submitting your lab assignment

Please hand in your written answers for exercise 1 on paper.

You will be submitting the `lab2` folder that BlueJ created for you. This folder should contain your `Arithmetic` class and your `Weather` class.


The Moodle page to submit this lab can be found [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=334883). See the Lab 1 description for more details on how to submit to Moodle.
