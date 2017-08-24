```
cacheable: false
```

## **Due Mon 9/11**

## Overview

The practical component of this course deals with JavaScript web development using a collection of tools (sometimes called a "stack") that work together on the server and client side to create a complete application. Specifically, we will use the Node.js server-side application platform, the Express server-side web-application framework, the MongoDB database, and the Angular.js client-side framework to tie the data model to a browser-based (or mobile) user interface. This collection tools is informally referred to as the "MEAN stack".

When you begin your group project, you will be using a readymade open-source boilerplate project to start from (Mean.js), which makes use of the MEAN stack. In order to understand what's going on in this project, you must understand how the elements work and interact.

The book *Getting MEAN with Mongo, Express, Angular, and Node* covers the MEAN stack from end to end. For approximately the first half of this course, you will work through this book as it describes the construction of a full-fledged MEAN-stack web application.

For this assignment, you will follow the steps in chapter 3 of the book, getting a MEAN application set up and deploying it on the Heroku application hosting platform. Once the necessary software (Node, NPM, and Express) are installed on your system, the instructions begin in section 3.2.2.

My own GitHub repository for working through this book can be seen [here](https://github.com/UPS-CSCI240-F16/TonyMullen). Study this repo closely and use it as a model for your own (see below for more on this). Notice that I have added to the Readme with each chapter release, placing comments and screenshots for each subsequent chapter *above* those of the previous chapter. Scroll to the [bottom](https://github.com/UPS-CSCI240-F16/TonyMullen#chapter-3) to read the earliest chapter notes. **Pay attention to the chapter notes, as they often describe errors or obsolete points in the text.**

## Screenshots and live application

Because these assignments are based on copying code from a book, the true challenge is to make sure you get your code working! For this reason, it is *essential* that each chapter update is accompanied by a link to the live application and a screenshot of your live application at the time of the chapter commit. Code commits without a live application and a screenshot will be worth no more than 60% of the assignment's value.

## Using GitHub

In addition to deploying the application to Heroku, as described in the book, you must *also* commit the same code to your personal Github repository (this is done using the same git commands, but simply pushing to a different remote), which we will set up in class.

In brief, for each commit, you need to do the following:


    git add .
    git commit -m "a meaningful note about the commit"
    git push <remote> master


Where &lt;remote> is the name of the remote repository you're pushing to, i.e. either your Heroku repo or your Github repo.

To add the Github repo (after creating a new repo in Github) do:


    git remote add github http://github.com/UPS-CSCI240-F16/<YourNameWithoutAngleBrackets>.git


Where the angle-bracketed portion of the URL is substituted for the name of the repo you created (e.g: TonyMullen.git).

After doing that, you can push to:


    git push github master


(This will of course not update any code on the Heroku repo. That will need to be pushed separately.)

You should also *tag* the commit (create a 'release') for each chapter. You will be continuing through the book using the same code, so this will make it possible to easily identify the state the code was at for each chapter). To do this, first commit your code, then do:


    git tag -a ch3 -m "project through chapter 3 of Getting MEAN"


Here the tag we're using is <span class="codefont">ch3</span> to indicate that this code goes through chapter 3. In subsequent chapter assignments, you'll be expected to tag the releases <span class="codefont">ch4</span>, <span class="codefont">ch5</span>, etc.

In order for your tags to show up on Github, you will need to push the tags also, like so:

    git push --tags github master


Include a README.md file describing what you did and detailing any issues you had. The README.md is the first place I will look to make sure you did this assignment, so make sure to include/update it! **The README file should include a link to the live application on Heroku.**

## Making regular commits

**You should commit frequently. You must make at least 4 commits per chapter, representing incremental progress.** Please refer to my repository's commit history [here](https://github.com/UPS-CSCI240-F16/TonyMullen/commits/master) for reference. Committing frequently is good practice, and it is also creates a record of your incremental progress through the book as further evidence that you did not simply copy and paste the author's code.

In general, you should commit whenever you complete a single piece of functionality. Make sure your code is working when you commit. Do not commit broken code. **Check for problems frequently, and fix them before moving forward**.  

## References

The author's code is available on his GitHub site, and you are encouraged to *refer* to it if you get stuck working through the book. **Do not copy/paste, fork, or otherwise use this code directly without typing it in yourself. Any evidence that this was done may result in forfeiture of credit for this assignment**. Be aware that the author's code on GitHub is in a completed state, and that your own code as you work through the book will not be identical to the finished state of the author's code, so it is often possible to identify copy/pasting on this basis. The same is true of referring to the code in my own repository.

## Grade weighting & lateness

This assignment has a weight of 1 within the individual assignments portion of your overall grade. **Credit for this milestone assignment will not be given after the deadline. You will receive implicit partial credit by turning in subsequent assignments with this work completed.**
