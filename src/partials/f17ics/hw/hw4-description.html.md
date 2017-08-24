```
cacheable: false
```

## Introduction

You've now seen how classes are written, so it's time to create a new class on your own. This class will have private instance variables, including one which will represent a changing state.

## Assignment

In this assignment, you'll create a new class called <span class="codefont">Student</span>. Instances of this class will have a name (String) and student ID number (String) which will be set with the class constructor. Any String objects will be acceptable for these attributes. Write accessor (getter) methods to return the student's name and ID number. Neither of these values should ever be altered, so you should *not* write mutator (setter) methods for them.  

Each student will also have an attribute of type <span class="codefont">double</span>, representing the student's GPA. This value will range between 0.0 and 4.0. Write a getter method for this value also.

A student's grade point average is never set directly. Rather, it is calculated as the average of course grades over the student's undergraduate career. You will write a method that assigns the student a grade for a single course and updates the student's GPA accordingly. You can do this one of two ways:

### Basic assignment

Write a method <span class="codefont">assignCourseGrade(double grade)</span> that assigns a single course grade of type double, between the values of 0.0 and 4.0. Each time this method is called with a grade for a class, it should update the student's GPA accordingly.

### Extra credit

A slightly more challenging and interesting approach is to use <span class="codefont">enum</span> types to assign letter grades that can be automatically converted to numerical grades. Read section 3.7 on <span class="codefont">enum</span> types in your textbook and study the code in Listing 3.6. For this assignment, you'll create an enum type with the values
<span class="codefont">F</span>,
<span class="codefont">D</span>,
<span class="codefont">C</span>,
<span class="codefont">B</span>,
and <span class="codefont">A</span>, so the letter grades are associated with ordinal values 0, 1, 2, 3, and 4, respectively. Write a method <span class="codefont">assignCourseGrade(String grade)</span> which takes a <span class="codefont">String</span> object representing the letter grade for the class and updates the student's GPA accordingly. Use the built-in method <span class="codefont">valueOf(String string)</span> for the <span class="codefont">Enum</span> class to convert the letter grade from a <span class="codefont">String</span> to the corresponding enum value. You can see a simple example of how to do that [here](http://stackoverflow.com/questions/604424/convert-a-string-to-an-enum-in-java).

## Style Guide

Before you submit your assignment, go through the checklist below and make sure your code conforms to the style guide.

* No unused variables or commented-out code is left in the class
* All instance variables are used in more than one method (if not, make them local)
* Javadoc comment above each class
* All methods have Javadoc comments
* All numbers have been replaced with constants (i.e. no "magic numbers")
* Proper capitalization of variables, methods, and classes
* Use white space to separate different sections of your code

### Submission

Compress the full project directory for the completed assignment into a zip file and upload it to the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407287).
