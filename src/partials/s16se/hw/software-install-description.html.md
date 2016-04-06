```
cacheable: false
```

## Installing the MEAN Stack (for working through the book)

Instructions for installing what you need to follow the book are given in appendices A and B of the book. I strongly recommend a few changes to how and in what order you install the software.

0. **(For OS X users) Install XCode** You should be able to get this from the Apple App Store. This contains necessary development tools.

1. **Install Git first** This is especially recommended for Windows users. You will need to be using a Unix-style command-line terminal to do most of the work in this class, and Git Bash provides this. (Mac OSX and Linux have this built in). **A DOS-style terminal (cmd) is not adequate**. For this reason, install Git first, then use Git Bash (you can find it in your Start menu once Git is installed) to do the rest of the installation.

2. **Install NVM** Installing Node.js using NVM (Node Version Manager) is recommended for everybody to be able to easily switch between Node.js versions, but it's also particularly useful for OS X users, who will otherwise have some additional complexity to avoid permission issues. To do this, you need to install [NVM](https://github.com/creationix/nvm) (Mac or Linux) or [NVM-Windows](https://github.com/coreybutler/nvm-windows) (Windows) first. Carry out the installation instructions on the appropriate software page linked above (for Windows you can carry out the instructions either in the built-in command prompt or in Git Bash, but I recommend Git Bash.)

3. **Install Node.js using NVM** From the command line, run

          nvm install 4.1.0

   This should install a version of Node.js that is sure to be compatible with the book code. To ensure you're using this version of Node.js, call

          nvm use 4.1.0

   Verify that Node.js has been installed by calling (from the command line):

          node --version

   and:

          npm --version

   Which should output something like v4.1.0 and 3.5.2, respectively (these numbers may be a little different, but shouldn't be too far off).

4. **Install the rest of the globally installed software** Follow the instructions from A.2 in Appendix A to install Express and MongoDB.

5. **The rest you can install after you start on the book project** Read Chapter 3 carefully, and begin following the instructions for the project starting at section 3.2.2 (this is where Assignment 2 begins). As you go, install the remaining software as it becomes necessary. Follow the instructions in Appendix B (except B.2 and B.3, because you've already done that) to install Twitter Bootstrap, the Amelia theme for Bootstrap, and the Heroku toolbelt.

Good luck with it! Let me know if you hit any snags!

# Troubleshooting

As they come in, I'll post some problems (and hopefully solutions!) here.

## Windows issues

### NVM installs, but Node is not found

There can be problems when NVM and Node.js are installed in file paths which include blank spaces in directory names. If NVM appears to be properly installed (i.e. calling <span class="codefont">nvm --version</span> gives a version number) and Node.js appears to install correctly but then can't be found. Also, if you try to run  <span class="codefont">nvm use 4.1.0</span> and it yields an error, this may be the problem.

**solution:** Uninstall NVM using the uninstaller (found in the <span class="codefont">nvm</span>  directory). Re-install NVM using the installer you downloaded, however, when asked for the installation directories for <span class="codefont">nvm</span> and <span class="codefont">nodejs</span> rather than going with the default installation directories, choose <span class="codefont">C:/nvm</span> and <span class="codefont">C:/nodejs</span>, respectively.  

## OS X issues

### NVM installs and gives a message about <span class="codefont">.bashrc</span> or  <span class="codefont">.bash_profile</span> or doesn't remember your NVM installation when you open a new terminal

NVM may need an environment variable set so that the shell (terminal environment) knows where to look to execute the program. Typically, environment variables for the terminal shell (<span class="codefont">bash</span>) are set in startup files like  <span class="codefont">.bash_profile</span>. If you don't use your terminal much, it's possible you don't have such a file.

**solution:** In a text editor (e.g. Atom), create a new file. Save it in your home directory (typically the directory with your name in OS X) with the name <span class="codefont">.bash_profile</span>. Don't forget the dot at the beginning of the name, even if OS X complains slightly when you save it (normally, dots at the beginning of file names are reserved for system files. Use it anyway.) In the body of the file, copy and paste this:


    export NVM_DIR=« $HOME/.nvm"
    [ -s "$NVM_DIR/nvm.sh" ] && . "$NVM_DIR/nvm.sh"  # This loads nvm

You will need to open a new terminal for the environment variable setting to take effect. After that, NVM should run properly.

### NVM installs, and your <span class="codefont">.bash_profile</span> is set as above, Node.js installs correctly, but then gets forgotten when you open a new terminal

Call

    nvm alias default <version_number>

With the version number you want to use. This is like <span class="codefont">nvm use </span> but should persist across various shell (terminal) sessions.

# Installing Mean.js

The installation instructions for the Mean.js boilerplate can be found [here](https://github.com/meanjs/mean).

# Deploying your Mean.js application to Heroku

For the most part, the process is identical to what's described in chapter 3 and Appendix B of your book. You should already have done the following for the Loc8r app:

1. Make sure you have a Heroku account
2. Make sure you have the Heroku toolbelt installed

Assuming those have been done, you need to:

1. Run `heroku create` in your project directory. This will create your new Heroku application, which you can then view in the Heroku dashboard.
When you've done this, you should be able to run your application locally using `heroku local`. This should display your application on `localhost:5000`.
2. Set up your mLabs MongoDB database for use by the Heroku application. You don't need to put any data into the database, just create it and hook it up to the application. If you do this via the mLabs add-on through Heroku, this is mostly automatic (but requires a credit card for ID). If you do it through the mLabs account, then you'll need to set the `MONGOLAB_URI` manually for your Heroku application, as described in Chapter 5 of the book.
3. Git add, commit, and push to the Heroku remote (this was set when you initially called `heroku create`). **Note!** You **must** be sure to comment out the line `public/dist/` in your .gitignore file before adding, committing, and pushing to Heroku. *If your Mean.js website is showing up all white on Heroku, it's likely that this is the problem*.
