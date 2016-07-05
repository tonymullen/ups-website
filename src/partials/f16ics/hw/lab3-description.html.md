```
cacheable: false
```
For Lab 3, complete each of the following exercises.

1. Consider the following variable assignments. What is the value in the variable for each assignment? Which of these variable assignments produce errors?

         String time = "The time right now is " + 8 + " o'clock";

         String seq =  "\"one\""+" \\ \"word\""+
                       " \\ \"and\""+" \\ \"another\""+
                       " \\ \"word\"";

         double sum = "10.5" + "0.5";

         double num1 = 5.0/2.0;

         double num2 = 5/2;

         double num3 = 5.0/2;

         int num4 = 5/2;

         int num5 = 5.0/2.0;

2. Write a short program that takes a string of input from the user (using Scanner) with any capitalization and prints out the string, but with all consonants in lower case and all vowels in upper case.

3. The Department of Motor Vehicles (DMV) is responsible for issuing driver’s licenses. This question asks you
to write a Java class called DMV that prompts the user to enter their full name (first, middle, and last) and
their date of birth and then produces a “driver’s license”. The license should have the following pieces of information:

    * A random driver’s license number that consists of 7 random digits
    * The user’s last name
    * The user’s first and middle name
    * An expiration date which is the user’s birth date except for the year which should be 2020

The first letter of the first, middle, and last name should always be capitalized (and the other letters lower cased). Here is an example of what my program produces when run:

        Welcome to the DMV (estimated wait time is 3 hours)
        Please enter your first, middle, and last name:
        Anthony James Mullen
        Enter date of birth (MM/DD/YY):
        05/15/71
        -------------------------------------
        Washington Driver License
        DL 8704266
        LN Mullen
        FN Anthony James
        DOB 05/15/71
        EXP 05/15/20
        -------------------------------------



[Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=318511)
