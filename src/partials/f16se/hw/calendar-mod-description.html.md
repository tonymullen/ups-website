```
cacheable: false
```

# Modifying the calendar module

This assignment is part of your group final project, and as such should be carried out by the entire group. The objective is to modify the Mean.js calendar module provided [here] in such a way that private calendar entries can be created by users who are logged in, which can then only be seen by that user. Currently, all events are public, can be created by unauthenticated users, and are seen by all. In the modified version, logged in users will see both the public events and their own private events. Here's the story:

![Calendar story](/~tmullen/images/se/calendar_story.png)

The following coding tasks must be carried out in order to get this working (details on each task follow):

* Modify view to display an "Add private event" button when user is logged in (authenticated)
* Modify client controller to add an event with public or private setting
* Modify model schema to add an attribute that indicates public or private
* Modify listing functionality in server controller to query DB appropriately
* Modify CSS file to use `className` attribute to change display color of private events

All of the above modifications should be made to files inside the `calendar` module (once the module has been correctly installed). Each modification can be made by editing a single file within the module.

**All members of the group must code some part of the assignment in order to receive credit. Divide responsibility for coding tasks in a way to ensure this happens.**

It is not necessary for each member of the group to implement the same number of individual coding tasks, or to write the same amount of code, but these tasks should give you a starting point for breaking the job up among yourselves.

Although individual contributions are important for this assignment, it is nevertheless a group assignment. You may work together as a group or as pairs on the coding tasks, and you are very much encouraged to help one another as needed.

## Installing the calendar module

Download the `.zip` file from the [meanjs-calendar GitHub repo](https://github.com/tonymullen/meanjs-calendar). Don't clone the repo. Unzip the file and rename the directory from `meanjs-calendar-master` to `calendar`. Place the directory into the `modules` directory of your project alongside `articles`, `chat`, `core`, and `users`.

In your `bower.json` file, add the following line to the `"dependencies"` object (or confirm it's there if you installed the Angular UI Calendar using `bower install --save`):

    "angular-ui-calendar": "^1.0.1"

And, between `"dependencies"` and `"overrides"`, add the `"resolutions"` key-value pair as follows:

    "resolutions": {
       "angular": "1.5.7"
    },

This should ensure that the correct version of Angular is installed to handle the various dependencies on it.

In your project's `config/assets/default.js` file, add the following entry into the `css` array:

    'public/lib/fullcalendar/dist/fullcalendar.css'

In the same file, add the following entries into the `js` array:


    'public/lib/jquery/dist/jquery.min.js',
    'public/lib/moment/min/moment.min.js',
    'public/lib/angular-ui-calendar/src/calendar.js',
    'public/lib/fullcalendar/dist/fullcalendar.min.js',
    'public/lib/fullcalendar/dist/gcal.js'

Once you've done these steps, run `bower install` to install the dependencies. The next time you run your Mean.js application, you should see the `Calendar` entry on the menu bar.


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

The server controller carries out database tasks using Mongoose (along with the model schema, which Mongoose uses to facilitate database queries). You need to modify how lists of events are retrieved from the database here. Specifically, you need to investigate how to filter results from the `.find()` method such that events are retrieved if they are either public or if their `user` value is identical to the `_id` of the current user. The current user can be retrieved from the HTTP request, which is represented here as `req`. So `req.user` is the user object, and `req.user._id` is the database id of the user. Note that if there is no logged in user, then `req.user` will be undefined, and trying to get its `._id` value will result in an error.

Read the Mongoose documentation on using `.find()` to make queries with object values, and in particular on the use of the `$or` operator for creating disjunctive queries.

## Modifying the CSS

Add CSS rules to alter the `background-color` and `border` values for private events. Coordinate with the person working on the client controller to know what the name of the class will be that represents private events, and then write your CSS rules for that class selector.
