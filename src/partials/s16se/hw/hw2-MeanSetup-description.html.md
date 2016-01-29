```
cacheable: false
```

## **Due Fri 1/29**

## Overview

The practical component of this course deals with full-stack JavaScript web development using a collection of tools (sometimes called a "stack") that work together on the server and client side to create a complete application. Specifically, we will use the Node.js server-side application platform, the Express server-side web-application framework, the MongoDB database, and the Angular.js client-side framework to tie the data model to a browser-based (or mobile) user interface. This collection tools is informally referred to as the "MEAN stack".

When you begin your group project, you will be using a readymade open-source boilerplate project to start from (Mean.js), which makes use of the MEAN stack. In order to understand what's going on in this project, you must understand how the elements work and interact.

The book *Getting MEAN with Mongo, Express, Angular, and Node* covers the MEAN stack from end to end. For this assignment, you will follow the steps in chapter 3 of the book, getting a MEAN application set up and deploying it on the Heroku application hosting platform. Once the necessary software (Node, NPM, and Express) are installed on your system, the instructions begin in section 3.2.2. 

In addition to deploying the application to Heroku, as described in the book, you should *also* commit the same code to your personal Github repository (this is done using the same git commands, but simply pushing to a different remote), which we will set up in class.

In brief, for each commit, you need to do the following:

<pre>
git add .
git commit -m "a meaningful note about the commit"
git push <remote> master
</pre>

Where <remote> is the name of the remote repository you're pushing to, i.e. either your Heroku repo or your Github repo.

To add the Github repo (after creating a new repo in Github) do:

<pre>
git remote add github http://github.com/UPS-CS240-S16/TonyMullen.git
</pre>

Where the URL is substituted for the URL of the repo you created (i.e. YourName.git).

After doing that, you can push to:

<pre>
git push github master
</pre>

(This will of course not update any code on the Heroku repo. That will need to be pushed separately.)

You should also *tag* the commit (create a 'release') for each chapter. You will be continuing through the book using the same code, so this will make it possible to easily identify the state the code was at for each chapter). To do this, first commit your code, then do:

<pre>
git tag -a ch3 -m "project through chapter 3 of Getting MEAN"
</pre>

Here the tag we're using is <span class="codefont">ch3</span> to indicate that this code goes through chapter 3. In subsequent chapter assignments, you'll be expected to tag the releases <span class="codefont">ch4</span>, <span class="codefont">ch5</span>, etc.

In order for your tags to show up on Github, you will need to push the tags also, like so:

<pre>
git push --tags github master
</pre>

Include a README.md file describing what you did and detailing any issues you had. The README.md is the first place I will look to make sure you did this assignment, so make sure to include/update it!
