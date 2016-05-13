```
cacheable: false
```

## Introduction

This exercise will give you some more practice writing classes. This time, you'll write a class that uses other class type objects as instance variables (attributes) and uses multiple constructors to create objects in different ways. In this assignment, you'll make some changes to the dice rolling program we've looked at in class. Specifically, you'll write a new class called <span class="codefont">Dice</span> that will represent a *pair* of dice.

## Assignment

First, download the [starter code for this assignment](http://mathcs.pugetsound.edu/~tmullen/ics/hw5.zip). Read over the code to get an idea of what needs to be done. *You will only need to edit the <span class="codefont">Dice</span> class*. Don't make changes to the <span class="codefont">Die</span> class or the <span class="codefont">DiceRoller</span> class. Those have been prepared for you.

I've made a few changes to <span class="codefont">Die</span> already. Read the code closely to see what has changed. (Hint: there used to be a <span class="codefont">final</span> valued attribute, but this attribute is now an ordinary variable). Among other small changes, you'll notice that there are now two constructors. Think about how they differ. You'll need to write multiple constructors in a similar way for the class you write for this assignment.

For this assignment, you'll create a new class called <span class="codefont">Dice</span>. The starter file has been created already, but the content of the class definition is blank. You'll need to give this class the necessary attributes, methods and constructors to do what <span class="codefont">DiceRoller</span> needs it to do.

When the <span class="codefont">Dice</span> class has been written correctly, calling the  <span class="codefont">main</span> method of <span class="codefont">DiceRoller</span> should output something along the lines of the following:

    DiceRoller.main({ });
    Rolled 1 and 2, total: 3
    Rolled 2 and 5, total: 7
    The averge of this pair of dice rolled so far is 5.0
    Rolled 10 and 14, total: 24
    Rolled 13 and 3, total: 16
    Rolled 20 and 6, total: 26
    The averge of this pair of dice rolled so far is 15.333333333333334
    Rolled 4 and 12, total: 16
    Rolled 1 and 9, total: 10
    Rolled 2 and 18, total: 20
    Rolled 6 and 13, total: 19
    The averge of this pair of dice rolled so far is 7.5


### Submission

Compress the full project directory for the completed assignment into a zip file and upload it to the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=324343).
