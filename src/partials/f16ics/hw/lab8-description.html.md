```
cacheable: false
```

## A seat reservation system

For this lab, you will write an automatic reservation system for a small theater. In fact, the theater is so small that it only has one row of seats comprising ten seats, named A, B, C, D, E, F, G, H, I, and J.

The application will use Scanner, and the user will be able to do three things: reserve seats, show the current list of seat reservations, and end the session.

## The system's operation

The system will begin by prompting the user, "What do you want to do?"

Reserving seats: if the user enters the word "reserve" followed by a number, the system will try to reserve that number of seats. The system will check to see if there are enough seats available. If so, the system will ask the user for their name, and reserve the seats in the user's name, then report back that the seats have been reserved.

If the correct number of seats aren't available, the system will apologize and return to the original prompt.

Showing seat reservations: If the user inputs the word "show", the system will display the list of seats along with their reservation status.

An example of an interactive session with the system might look  like this:


    What would you like to do?
    reserve 3
    What's your name?
    John Quincy Adams
    I've reserved 3 seats for you, John Quincy Adams.
    What would you like to do?
    reserve 5
    What's your name?
    Millard Filmore
    I've reserved 5 seats for you, Millard Filmore.
    What would you like to do?
    reserve 3
    Sorry, we don't have that many seats available
    What would you like to do?
    show
    [
    Seat A is reserved for John Quincy Adams.,
    Seat B is reserved for John Quincy Adams.,
    Seat C is reserved for John Quincy Adams.,
    Seat D is reserved for Millard Filmore.,
    Seat E is reserved for Millard Filmore.,
    Seat F is reserved for Millard Filmore.,
    Seat G is reserved for Millard Filmore.,
    Seat H is reserved for Millard Filmore.,
    Seat I is available.,
    Seat J is available.]
    What would you like to do?
    done
    Have a nice day!

## Implementing the system

Use an ArrayList of Seat objects. A Seat object should have a name ("A"-"J") and a "reservedFor" attribute which takes a string (the name of the person the seat is reserved for). An unreserved seat is a seat with "null" for this attribute's value. Create public getters and setters as appropriate for these values. Don't create unnecessary getters or setters.

Your system should initialize the ArrayList with the ten seats. You will need to create each of these seats with a new keyword and add them to the ArrayList individually using the add() method.

You may assume that all users have unique names. You may also assume that the user input will be of the correct format. You don't need to build in exception handling, for example in the case that the user enters "reserve" followed by something other than a number.

For displaying the list of seats, you should implement a `toString()` method on the `Seat` class. This will make it possible to call `System.out.println()` directly on your ArrayList object, and have it print out meaningful strings. Remember, you can use conditionals or any other technique you wish in your `toString()` method, just so long as it returns a string.

**Heads up:** The easiest way to take commands such as `reserve` which are followed by some other value is to use the Scanner method `next()`. Likewise, the easiest way to grab a number is to use the Scanner method `nextInt()`. Neither of these read the newline character, so don't forget that there will always be a remaining newline character to be read next. If you call `nextLine()` when there's still an unread newline, it won't contain any useful content.

## If you have extra time

* Try implementing a `cancel` command that enables a user to cancel all reservations made in their name.
* Consider how you could ensure that reserved seats were all together in sequence. If a user wants 4 seats, and there are two pairs of seats that are separated, you might want to ask the user to confirm that that is all right. How would you check for this?
* Consider how you might approach a seat reservation system for a larger venue, with more than one row of seats. Would there be advantages to creating a `Row` class? What other ways might be appropriate to represent row and seat numbers?

Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=327741).
