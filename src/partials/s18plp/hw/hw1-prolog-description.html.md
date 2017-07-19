```
cacheable: false
```

For this assignment, you'll do the exercises for [Chapter 1](http://www.learnprolognow.org/lpnpage.php?pagetype=html&pageid=lpn-htmlch1) of *Learn Prolog Now!* This chapter defines a lot of the terms you'll hear throughout the first half of this course, so it's important that you read it closely and make sure you understand.

For the first week, the reading will likely be a little ahead of what I'm able to talk about in class, so please try to get ahead of this assignment so as to be able to ask in class about any topics you're unsure about.

You'll find the exercises [here](http://www.learnprolognow.org/lpnpage.php?pagetype=html&pageid=lpn-htmlse3). Do all the exercises from Exercise 1.1 through Exercise 1.5.

## Installing and running Prolog

Although for this first assignment you won't have to write any code, you'll probably want to run some of the exercise code in a Prolog interpreter.

All of the programs we will write and run in this class can be executed on [SWISH](http://swish.swi-prolog.org/), the browser-based cloud platform for running Prolog. SWISH is not very well suited to managing files, but it's a pretty nice Prolog environment, particularly if you run into problems with a local installation.

I recommend installing [SWI Prolog](http://www.swi-prolog.org/) on your local computer. However, there are known issues with the Mac versions available from the SWI website with OS X version 10.11 (El Capitan). Mac users on El Capitan should install it using [Homebrew](http://brew.sh/). First [install Homebrew itself](http://brew.sh/), and then install SWI Prolog with the following commands in the terminal:

    brew update
    brew install swi-prolog

When you've done this, you will be able to run Prolog in the terminal using the command

    swipl

Which will give a Prolog interpreter that looks something like this:

    For help, use ?- help(Topic). or ?- apropos(Word).

    ?-  

To consult a program you've written, enter the name of the program in square brackets and single quotes, followed by a period.

    ?- ['my_program.pl'].

If you run Prolog through the GUI that comes with the SWI installation, you can consult your program through the menu.
