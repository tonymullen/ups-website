```
cacheable: false
```

# Overview

To get your group repo set up correctly follow these steps:

* First, **one member** of the group should:
  1. Download (**not** fork or clone) the Mean.js .zip file (see below for more detailed instructions).
  2. Unzip the directory. Enter the top level directory of the project and run `git init` to initialize a repository. **Note: there are important files in this directory that are not visible in your desktop/finder by default, and their arrangement in the filesystem with respect to each other is important. Do not attempt to move the contents of this directory independently.**
  3. Set up a GitHub Repository with the group's name. *Do not* initialize the repository with a Readme. Instead, follow the instructions to set the new GitHub repository as a remote for the local repository you created in step 2.
  4. Commit and push the local repository from step 2 to the remote GitHub repository you created in step 3. Verify that it has the same directory structure as the official Mean.js repository (it should look exactly the same).
* Once the group repository is created, **all members** of the group should **clone** the newly created group repository to their local machines.
* Edit the Readme.md file to reflect your group project. **Each member** of the group should each edit the Readme.md file locally by adding their name, then commit and push the changes to the group repository. It may be simplest to do this one by one, with each member pulling changes as they are committed. If multiple people commit changes to the same file simultaneously without pulling each others' changes, it may be necessry to resolve conflicts.
* Verify that the Readme.md is as expected, with each member's edit in place. Verify that each member of the group is listed on the repository's "Contributors" link. No other contributors aside from the group members should appear on this list.
* **One member** (it doesn't have to be the same person as previously) should follow the steps below to create a remote push repository on Heroku and deploy the application to Heroku.

# Installing Mean.js

The installation instructions for the Mean.js boilerplate can be found [here](https://github.com/meanjs/mean). Follow the instructions under "Downloading The Repository Zip File". **Do not fork or clone the Mean.js repository**. Each of these options has some undesirable side effects for our purposes, but the main reason we will install from the `.zip` file is that this will ensure that the only people listed under the "Contributors" link on your group repository are the members of your group. Cloning and forking will maintain the full list of Mean.js contributors, which we don't want.

<!-- download_mean_zip.png -->

# Deploying your Mean.js application to Heroku

For the most part, the process is identical to what's described in chapter 3 and Appendix B of your book. You should already have done the following for the *Loc8r* app:

1. Make sure you have a Heroku account
2. Make sure you have the Heroku toolbelt installed

Assuming those have been done, you need to:

1. Run `heroku create` in your project directory. This will create your new Heroku application, which you can then view in the Heroku dashboard.
When you've done this, you should be able to run your application locally using `heroku local`. This should display your application on `localhost:5000`.
 * **Note:** In order to be deployed to Heroku, the application must be built for the production environment. The `heroku local` command will do this, as will `grunt prod` or `grunt build`. If there are problems running the application locally with `heroku local` you must solve them before pushing to Heroku.
2. Set up your mLabs MongoDB database for use by the Heroku application. You don't need to put any data into the database, just create it and hook it up to the application. If you do this via the mLabs add-on through Heroku, this is mostly automatic (but requires a credit card for ID). If you do it through the mLabs account, then you'll need to set the `MONGOLAB_URI` manually for your Heroku application, as described in Chapter 5 of the book. **Note:** the mLab database "username" and "password" are *not* the same as the username and password of your mLab account. You must set up a "user" for the database and create a corresponding username and password for this.
3. Git add, commit, and push to the Heroku remote (this was set when you initially called `heroku create`). **Note:** You **must** be sure to comment out the line `public/dist/` in your .gitignore file before adding, committing, and pushing to Heroku. *If your Mean.js website is showing up all white on Heroku, it's likely that this is the problem*.
