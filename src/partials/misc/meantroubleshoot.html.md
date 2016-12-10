## Installing Node.js

**All users:** Using the correct Node.js version for a project is critical. The best way to know which version of Node.js to use is to look in the application's package.json file.

The best method for managing Node versions is the Node Version Manager (NVM), which allows you to easily install any version and to switch between using versions easily. The original NVM is only available for OS X and Linux, but NVM-Windows is available for Windows. Use NVM to install Node.js.

**OS X users:** Make sure you have an up-to-date version of XCode installed before installing Node.js.

**Windows users:** Make sure you have Ruby installed before installing the Mean.js boilerplate. In the Ruby command line interface, run

gem install sass

to make sure Sass is also installed.

## Logging into or uploading database content to Mongolab

Authorization will fail when accessing your database on MongoLab if your local Mongo shell is not sufficiently up-to-date. If you are sure you're using the correct database username and database password (*not* your MongoLab username/password) then you should make sure your MongoDB installation is up-to-date.
