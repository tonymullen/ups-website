```
cacheable: false
```

# Overview

To get your group repo set up correctly follow these steps:

* First, **one member** of the group should:
  1. Download (**not** fork or clone) the Mean.js .zip file (see below for more detailed instructions).
  2. Unzip the directory. Enter the top level directory of the project and run `git init` to initialize a repository. **Note: there are important files in this directory that are not visible in your desktop/finder by default. Do not attempt to move the contents of this directory independently.**
  3. On the GitHub web page, set up a GitHub Repository with your project group's name. Do not initialize the repository with a Readme. Instead, follow the instructions to set the new GitHub repository as a remote for the local repository you created in step 2.
  4. Add changes, commit and push the local repository from step 2 to the remote GitHub repository you created in step 3. Verify that it has the same directory structure as the official Mean.js repository (it should look exactly the same).
  <p>
* Once the group repository is created, **all members** of the group should **clone** the newly created group repository to their local machines using the `git clone` command.

* Edit the Readme.md file to reflect your group project. **Each member** of the group should each edit the Readme.md file locally by adding their name, then commit and push the changes to the group repository. It may be simplest to do this one by one, with each member pulling changes as they are committed. If multiple people commit changes to the same file simultaneously without pulling each others' changes, it may be necessry to resolve conflicts.

* Verify that the Readme.md is as expected, with each member's edit in place. Verify that each member of the group is listed on the repository's "Contributors" link. No other contributors aside from the group members should appear on this list.

* **One member** (it doesn't have to be the same person as previously) should follow the steps below to create a remote push repository on Heroku and deploy the application to Heroku.

# Installing and running Mean.js

The installation instructions for the Mean.js boilerplate can be found [here](https://github.com/meanjs/mean). Follow the instructions under "Downloading The Repository Zip File". **Do not fork or clone the Mean.js repository**. Each of these options has some undesirable side effects for our purposes, but the main reason we will install from the `.zip` file is that this will ensure that the only people listed under the "Contributors" link on your group repository are the members of your group. Cloning and forking will maintain the full list of Mean.js contributors, which we don't want.

Once the code has been cloned, you must install the software using

`npm install`

This will check the `package.json` file, then download and install all the necessary (server side) dependencies into `node_modules`. It will also call `bower install` automatically, which will do the same thing for your client side dependencies (which will be installed in your `public/lib` directory). Assuming this all executes cleanly, you should be ready to run the application.

## Running the application

To run your application, simply call

`gulp`

This will check your `gulpfile.js` and carry out the necessary tasks to get your application running, eventually starting up the server on `localhost:3000`. Note that this runs your application in the development environment.

<!-- download_mean_zip.png -->

# Deploying your Mean.js application to Heroku

For the most part, the process is identical to what's described in chapter 3 and Appendix B of your book. You should already have done the following for the *Loc8r* app:

1. Make sure you have a Heroku account
2. Make sure you have the Heroku toolbelt installed

Assuming those have been done, you need to:

1. Run `heroku create` in your project directory. This will create your new Heroku application, which you can then view in the Heroku dashboard.
When you've done this, you should be able to run your application locally using `heroku local`. This should display your application on `localhost:5000`.
 * **Note:** In order to be deployed to Heroku, the application must be built for the production environment. (Specifically, the `application.min.js` and `application.min.css` files in `public/dist` must be generated.) The `heroku local` command will do this, as will `gulp prod` or `gulp build`. If there are problems running the application locally with `heroku local` you must solve them before pushing to Heroku.
<p>
2. Set up your mLabs MongoDB database for use by the Heroku application. You don't need to put any data into the database, just create it and hook it up to the application. If you do this via the mLabs add-on through Heroku, this is mostly automatic (but requires a credit card for ID). If you do it through the mLabs account, then you'll need to set the `MONGODB_URI` manually for your Heroku application, as described in Chapter 5 of the book. **Note:** the mLab database "username" and "password" are *not* the same as the username and password of your mLab account. You must set up a "user" for the database and create a corresponding username and password for this.

3. You'll need to set the `NPM_CONFIG_PRODUCTION` Heroku config value to `false` in order to ensure that dev dependencies get installed on Heroku along with the other dependencies. This is done on your command line like this:

        heroku config:set NPM_CONFIG_PRODUCTION=false

4. Git add, commit, and push to the Heroku remote (this was set when you initially called `heroku create`).


# Exploring Mean.js

The Mean.js boilerplate application includes several modules you can study in order to implement your own. In particular, the default CRUD module is `Articles`. You should find a lot of code in the module folder and subfolders that is recognizable from your work on the Getting MEAN book.

Further functionality, including creating new articles, is available for `admin` users. Create a user and manually change its role in the database (you can use the Mongo client or use the Robomongo GUI for this).

You can also use the [Mean.js Yo generator](http://meanjs.org/generator.html) to generate components. Follow the instructions to install a new CRUD module for some further sample functionality.   
