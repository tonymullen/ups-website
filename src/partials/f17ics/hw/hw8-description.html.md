```
cacheable: false
```

## Introduction

For this assignment, you're going to practice several things you've done in the past: using Scanner, comparing strings, using conditionals, working with objects, and using the `while` statement. In addition, you'll also work with the `ArrayList` class.

## Objective

You will write a program that enables the user to manage a soccer team through an interactive console interface. Once the program runs, it will take commands from the command line (console) using the `Scanner` class until the user inputs the word `done`, at which point the program will sign off.

Internally, the program will maintain an ArrayList representing the soccer team. The ArrayList will be a list of objects of class `Player` which you will also need to implement. An object of class `Player` will have two attributes: `name` and `position`. For the purposes of this exercise, player objects will only hold last names, and you may assume that players' names are all unique.

There are three commands you need to implement: `add`, followed by a player name, `cut` followed by a player name, and `show`. If the user enters `add` followed by a name, your program should prompt for a position, and then add a new player to the team with that name and position, like so:

    add Jones
    What is Jones's position?
    defender
    Adding Jones as defender.
    add Miller
    What is Miller's position?
    goalkeeper
    Adding Miller as goalkeeper.
    add Garcia
    What is Garcia's position?
    forward
    Adding Garcia as forward.

For this method, remember that the `Scanner` method `next()` returns the *next word* that the user enters.
The next method you need to write is `show`. This method should print out a list of the current team members, like so:

    show
    [Jones (defender), Miller (goalkeeper), Garcia (forward)]

The easiest way to do this is to simply print out the team ArrayList, but in order to do this you will need to make sure that your `Player` class has a `toString()` method defined for it.

Finally, you will implement the method `cut` followed by an existing player's name. This method will remove that player (assuming the name is unique) from the team. So:

    cut Miller
    Cutting Miller from the team.
    show
    [Jones (defender), Garcia (forward)]

The user should be able to call add, call, and show in any order repeatedly. When the user is finished, they should type in `done` to terminate the session:

    add Suzuki
    What is Suzuki's position?
    goalkeeper
    Adding Suzuki as goalkeeper.
    show
    [Jones (defender), Garcia (forward), Suzuki     (goalkeeper)]
    done
    Finished managing the team

## Classes

For this assignment, you'll write three classes. One will be the `Player` class, which the team manager depends on. The next class will be `TeamManager` which executes the functionality of this exercise in a method called `run()`. Finally, you'll implement a wrapper class called `TeamManagerApp` which has only a `main` function that creates a `TeamManager` instance and calls its `run()` method.

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

Compress the full project directory for the completed assignment into a zip file and upload it to the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407294).
