```
cacheable: false
```

# Modifying the calendar module

This assignment is part of your group final project, and as such should be carried out by the entire group. The objective is to modify the Mean.js calendar module provided [here](https://github.com/tonymullen/meanjs-calendar) in such a way that private calendar entries can be created by users who are logged in, which can then only be seen by that user. Currently, all events are public, can be created by unauthenticated users, and are seen by all. In the modified version, logged in users will see both the public events and their own private events. Here's the story:

![Calendar story](/~tmullen/images/se/calendar_story.png)

Most of the existing tests for the calendar module will still apply. However, there are some new tests that need to be carried out. I have written two new server tests that need to be passed. In `cal-event.server.routes.tests.js` uncomment the two test cases starting at line 124 and remove the test case starting at line 110. When you've done this, the first of the new tests that deals with saving public events should pass. The second test, which prevents a private test from being saved without the user being logged in, will not pass. We need to have a http response with a 403 error code and a message reading "Must be logged in to save a private event" in the case of trying to save a private event without a user object.  

The following coding tasks must be carried out in order to get this working (details on each task follow):

* Modify view to display an "Add private event" button when user is logged in (authenticated)
* Modify client controller to add an event with public or private setting
* Modify model schema to add an attribute that indicates public or private
* Modify listing functionality in server controller to query DB appropriately
* Modify create functionality in server controller to ensure that a user object is saved with private events, or that a 403 error response is returned
* Modify CSS file to use `className` attribute to change display color of private events

All of the above modifications should be made to files inside the `calendar` module (once the module has been correctly installed). Each modification can be made by editing a single file within the module (two of the changes require editing the same file, the server controller file).

**All members of the group must code some part of the assignment in order to receive credit. Divide responsibility for coding tasks in a way to ensure this happens.** Each member of the group should take responsibility for committing at least two of the bullet-pointed features above under their own GitHub identity. If there are more than 3 members in your group, add the following test cases to your group's todo list to ensure that each member has 2 items to work on.

* The server test case beginning on line 223 of the server routes test file
* The server test case beginning on line 227 of the server routes test file
* The server test case beginning on line 231 of the server routes test file
* The server test case beginning on line 235 of the server routes test file   

Although individual contributions are important for this assignment, it is nevertheless a group assignment. You may work together as a group or as pairs on the coding tasks, and you are very much encouraged to help one another as needed. However, **be sure that each member commits their changes under their own GitHub identity**.

## Installing the calendar module

Download the `.zip` file from the [meanjs-calendar GitHub repo](https://github.com/tonymullen/meanjs-calendar). Don't clone the repo. Unzip the file and rename the directory from `meanjs-calendar-master` to `calendar`. Place the directory into the `modules` directory of your project alongside `articles`, `chat`, `core`, and `users`.

In order to ensure that the dependencies get properly installed, we need to add them to `bower.json` file. Starting at the end the `"dependencies"` object (line 18-19), add the `angular-ui-calendar` dependency, then modify the rest of the file as follows. Note the addition of `resolutions` and the modification of `overrides` to include jquery as a dependency of angular.:

      "owasp-password-strength-test": "~1.3.0",
      "angular-ui-calendar": "^1.0.1"
      },
      "resolutions": {
       "angular": "^1.5.8"
      },
      "overrides": {
       "angular": {
         "dependencies": {
          "jquery": "*"
         }
       },
       "bootstrap": {
         "main": [
           "dist/css/bootstrap.css",
           "dist/css/bootstrap-theme.css",
           "less/bootstrap.less"
          ]
        }
      }
    }
<!-- .* -->
Make sure all commas are where they belong (between object elements, but not after the last element of an object).

This should ensure that the correct version of Angular is installed to handle the various dependencies on it.

Run

    bower install

to install all client dependencies.

We're also going to use `wiredep` to add the necessary dependencies to our assets file automatically. Modify the default task in your `gulpfile.js` file to add the `wiredep` task to the default `gulp` task, like this (use a string search to find the default task):

    // Run the project in development mode
    gulp.task('default', function (done) {
      runSequence('env:dev', ['copyLocalEnvConfig', 'makeUploadsDir'], 'wiredep', 'lint', ['nodemon', 'watch'], done);
    });

Finally, run

    gulp

Check your project's `config/assets/default.js` file. The `css` and `js` assets arrays should look like this:

    css: [
      // bower:css
      'public/lib/bootstrap/dist/css/bootstrap.css',
      'public/lib/bootstrap/dist/css/bootstrap-theme.css',
      'public/lib/ng-img-crop/compile/minified/ng-img-crop.css',
      'public/lib/fullcalendar/dist/fullcalendar.css',
      // endbower
    ],
    js: [
      // bower:js
      'public/lib/jquery/dist/jquery.js',
      'public/lib/angular/angular.js',
      'public/lib/angular-animate/angular-animate.js',
      'public/lib/angular-bootstrap/ui-bootstrap-tpls.js',
      'public/lib/angular-messages/angular-messages.js',
      'public/lib/angular-mocks/angular-mocks.js',
      'public/lib/angular-resource/angular-resource.js',
      'public/lib/angular-ui-router/release/angular-ui-router.js',
      'public/lib/ng-file-upload/ng-file-upload.js',
      'public/lib/ng-img-crop/compile/minified/ng-img-crop.js',
      'public/lib/owasp-password-strength-test/owasp-password-strength-test.js',
      'public/lib/moment/moment.js',
      'public/lib/fullcalendar/dist/fullcalendar.js',
      'public/lib/angular-ui-calendar/src/calendar.js',
      // endbower
    ],

## Modifying the view

A button to add a private event must be displayed in the view when the user is logged in (authenticated), but not when the user is not logged in.

To display things in the view depending on some model value, Angular has several useful directives: `ng-show`, `ng-hide`, and `ng-if`. Look into these and decide which is the best for what you need to do.

The model holds information about the state of the user's authentication also. You can find out how this is handled by digging into the code a bit. In particular, look at things in the interface that you know are displayed or not displayed depending on whether the user is logged in. There are several such things in the header, which you'll find in the `core` module's `client/views` directory.

You'll also have to decide what function to call on `ng-click`. To do this, you'll need to coordinate with the person tasked with modifying or writing the appropriate function in the client controller. You may also want to adjust the button for adding public events to specify that they are public and/or the `ng-click` value for adding public events.

## Modifying the client controller

The `addEvent()` function currently creates an event resource (it gets this from `CalendarService`), adds it to the model and writes it to the database. The event is not marked as public or private, but it is treated as public and can be seen by anyone, whether they are logged in or not.

One way to adjust this to handle the public and private case would be to have the function take a boolean argument representing whether the event is public or not. You would also need to modify the newly created event object to hold this information. Coordinate with the person working on the model schema to ensure that the data you add to this object will conform to the model schema and be properly persisted.

In addition to representing whether the event is public or private, you should also make use of the `className` attribute to add a (HTML) class value that will be associated with the event in the DOM. This will enable different types of events to be styled differently with CSS. Coordinate with the person who will work on the CSS file for this.

## Modifying the model schema

The model schema for calendar events needs to include an attribute that represents whether the event is public or private. Coordinate with the person working on the client controller for this.

## Modifying the server controller

### Retrieving the data

The server controller carries out database tasks using Mongoose (along with the model schema, which Mongoose uses to facilitate database queries). You need to modify how lists of events are retrieved from the database here. Specifically, you need to investigate how to filter results from the `.find()` method such that events are retrieved if they are either public or if their `user` value is identical to the `_id` of the current user. The current user can be retrieved from the HTTP request, which is represented here as `req`. So `req.user` is the user object, and `req.user._id` is the database id of the user. Note that if there is no logged in user, then `req.user` will be undefined, and trying to get its `._id` value will result in an error.

Read the Mongoose documentation on using `.find()` to make queries with object values, and in particular on the use of the `$or` operator for creating disjunctive queries.

### Creating the events

You will need to look for where the event is initially saved and ensure that the `.save()` method is only called if the calendar event is either private or has a defined user object. If not, you will need to send a response with status 403. The message value of the response should be 'Must be logged in to save a private event'. The http response object is represented as `res`. Look at other examples in the code to see how the status and message values are sent and how the response is sent.

## Modifying the CSS

Add CSS rules to alter the `background-color` and `border` values for private events. Coordinate with the person working on the client controller to know what the name of the class will be that represents private events, and then write your CSS rules for that class selector.
