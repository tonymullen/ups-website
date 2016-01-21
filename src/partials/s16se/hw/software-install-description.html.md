```
cacheable: false
```

## Installing the MEAN Stack

Instructions for installing what you need to follow the book are given in appendices A and B of the book. I strongly recommend a few changes to how and in what order you install the software.

1. **Install Git first** This is especially recommended for Windows users. You will need to be using a Unix-style command-line terminal to do most of the work in this class, and Git Bash provides this. (Mac OSX and Linux have this built in). **A DOS-style terminal (cmd) is not adequate**. For this reason, install Git first, then use Git Bash (you can find it in your Start menu once Git is installed) to do the rest of the installation.

2. **Install NVM** Installing Node.js using NVM (Node Version Manager) is recommended for everybody to be able to easily switch between Node.js versions, but it's also particularly useful for OS X users, who will otherwise have some additional complexity to avoid permission issues. To do this, you need to install [NVM](https://github.com/creationix/nvm) (Mac or Linux) or [NVM-Windows](https://github.com/coreybutler/nvm-windows) (Windows) first. Carry out the installation instructions on the appropriate software page linked above (for Windows you can carry out the instructions either in the built-in command prompt or in Git Bash, but I recommend Git Bash.)

3. **Install Node.js using NVM** From the command line, run

          nvm install latest

   This should install the latest version of Node.js. Verify that Node.js has been installed by calling (from the command line):

          node --version

   and:

          npm --version

   Which should output something like v4.2.1 and 3.5.2, respectively (these numbers may be a little different, but shouldn't be too far off).

4. **Install the rest of the software** Follow the instructions from A.2 in Appendix A to install Express, MongoDB, and Angular. Follow the instructions in Appendix B (except B.2 and B.3, because you've already done that) to install Twitter Bootstrap, the Amelia theme for Bootstrap, and the Heroku toolbelt.

Good luck with it! Let me know if you hit any snags!
