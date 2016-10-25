```
cacheable: false
```

## Modifying the calendar module -- Solution

The new calendar functionality can be implemented with the following code modifications.

## Modifying the view

The main thing to be done in the view is to display a button when the user is logged in, but not when the user is not logged in.


    <div class="btn-group calTools">
      <!-- vm.authentication.user is true if the user is properly logged in.-->
      <button type="button" class="btn btn-primary" ng-click="vm.addEvent(true)">
        Add Public Event
      </button>
      <button type="button" class="btn btn-danger" ng-click="vm.addEvent(false)" ng-show="vm.authentication.user">
        Add Private Event
      </button>
    </div>



## Modifying the client controller

One way to do this is to use the same `addEvent` function, but with an additional argument representing whether the event is public or private.  An attribute `public` is set to the value of this argument (the `!!` double negation is an easy way to convert falsy values to an actual `false` boolean).

    vm.addEvent = function(pub_priv) {
      var newEvent = new CalendarService({
          title: 'Coffee Break',
          start: vm.selectedDate.local(),
          end: vm.selectedDate.local(),
          className: [(!!pub_priv ? 'public' : 'private')],
          stick: true,
          public: !!pub_priv
      });


## Modifying the model schema

Add a `public` attribute to the model:

      public: Boolean


## Modifying the server controller

In the `exports.list` function, you can use the `$or` operator in conjunction with the `find()` method in Mongoose to pass criteria to a database call, like this:

    CalEvent.find({
      $or: [
        { 'public': true },
        { 'user': (req.user ? req.user._id : null) }
      ]
    }).sort('-created').populate('user', 'displayName').exec(function (err, calEvents) {

<!-- darn markdown_ -->

## Modifying the CSS

In the `exports.create` function, you can create a check to verify that there is a user if the event to be written is not public by wrapping the save code in a conditional:

    if (calEvent.public || !!calEvent.user) {
      calEvent.save(function (err) {
        if (err) {
          return res.status(400).send({
            message: errorHandler.getErrorMessage(err)
          });
        } else {
          res.json(calEvent);
        }
      });
    } else {
      return res.status(403).send({
        message: 'Must be logged in to save a private event'
      });
    }


## Modifying the CSS

You can add styling in your css file for the private class of fc-event elements like this:

    .fc-event.private {
      border: 1px solid #FF2300;
      background-color: #FF2300;
    }
