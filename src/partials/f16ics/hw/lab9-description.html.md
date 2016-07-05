```
cacheable: false
```

## Reservations revisited

For the past few classes we've talked about setting up a reservation system for theater seats. We've also discussed 2-dimensional ArrayLists (i.e. ArrayLists of ArrayLists) and how they might be useful for representing a list of rows of seats.

For this lab, you'll work on extending the implementation of the reservation system to automatically book the best seats in a theater.

## Objective

The system is a booking system for movie theaters. As in the previous system, users will use a command `reserve` followed by a number to book a number of seats, then enter their names. However, in this case, the theater has multiple rows, and the system has to book them into the best rows it can. We assume the following desirable characteristics of seats:

* Seats in a given reservation should always be adjacent to each other. Nobody wants to have their party spread out over multiple rows. If adjacent seats in a single row can't be found, the system won't make the booking.
* The best rows are in the middle (depthwise) of the theater. Too far forward and your neck hurts, too far back and the screen gets small. The best seats are as close as possible to the middle row.
* Nobody minds about which seat in a row they take, so we can book from left to right in each row.

You will also implement a useful `show` command output that displays an overview of which seats are available and which are occupied in the theater.

## Implementation

Download the starter file [lab9](http://mathcs.pugetsound.edu/~tmullen/ics/TheaterRowsStarter.zip). Most of the places you'll need to write significant amounts of code are indicated with `TODO` comments, however you are free to add code elsewhere also (for example, if you wanted to add an instance variable).

You will need to implement the booking algorithm such that it begins checking seat availability in the middlemost row and then incrementally checks further away. The front row and back row should be the last rows filled. You will need to store a variable representing the optimal row and also store a variable representing the distance away from that row, which increments.

Also, write the `Theater` class's `toString()` such that it displays the rows of the theater (with corresponding numbers) and each seat displayed as an `_` if it is empty and as a `X` if it is occupied.

An example of the finished program in action can be seen here:

    What would you like to do?
    reserve 7
    What's your name?
    Tony
    I've reserved 7 seats for you at the Roxy in row 7, Tony.
    What would you like to do?
    show
     0 _ _ _ _ _ _ _ _ _ _
     1 _ _ _ _ _ _ _ _ _ _
     2 _ _ _ _ _ _ _ _ _ _
     3 _ _ _ _ _ _ _ _ _ _
     4 _ _ _ _ _ _ _ _ _ _
     5 _ _ _ _ _ _ _ _ _ _
     6 _ _ _ _ _ _ _ _ _ _
     7 X X X X X X X _ _ _
     8 _ _ _ _ _ _ _ _ _ _
     9 _ _ _ _ _ _ _ _ _ _
    10 _ _ _ _ _ _ _ _ _ _
    11 _ _ _ _ _ _ _ _ _ _
    12 _ _ _ _ _ _ _ _ _ _
    13 _ _ _ _ _ _ _ _ _ _
    14 _ _ _ _ _ _ _ _ _ _

    What would you like to do?
    reserve 9
    What's your name?
    Sara
    I've reserved 9 seats for you at the Roxy in row 6, Sara.
    What would you like to do?
    show
     0 _ _ _ _ _ _ _ _ _ _
     1 _ _ _ _ _ _ _ _ _ _
     2 _ _ _ _ _ _ _ _ _ _
     3 _ _ _ _ _ _ _ _ _ _
     4 _ _ _ _ _ _ _ _ _ _
     5 _ _ _ _ _ _ _ _ _ _
     6 X X X X X X X X X _
     7 X X X X X X X _ _ _
     8 _ _ _ _ _ _ _ _ _ _
     9 _ _ _ _ _ _ _ _ _ _
    10 _ _ _ _ _ _ _ _ _ _
    11 _ _ _ _ _ _ _ _ _ _
    12 _ _ _ _ _ _ _ _ _ _
    13 _ _ _ _ _ _ _ _ _ _
    14 _ _ _ _ _ _ _ _ _ _

    What would you like to do?
    reserve 5
    What's your name?
    Jo
    I've reserved 5 seats for you at the Roxy in row 8, Jo.
    What would you like to do?
    show
     0 _ _ _ _ _ _ _ _ _ _
     1 _ _ _ _ _ _ _ _ _ _
     2 _ _ _ _ _ _ _ _ _ _
     3 _ _ _ _ _ _ _ _ _ _
     4 _ _ _ _ _ _ _ _ _ _
     5 _ _ _ _ _ _ _ _ _ _
     6 X X X X X X X X X _
     7 X X X X X X X _ _ _
     8 X X X X X _ _ _ _ _
     9 _ _ _ _ _ _ _ _ _ _
    10 _ _ _ _ _ _ _ _ _ _
    11 _ _ _ _ _ _ _ _ _ _
    12 _ _ _ _ _ _ _ _ _ _
    13 _ _ _ _ _ _ _ _ _ _
    14 _ _ _ _ _ _ _ _ _ _

    What would you like to do?
    reserve 3
    What's your name?
    Jean Claude
    I've reserved 3 seats for you at the Roxy in row 7, Jean Claude.
    What would you like to do?
    show
     0 _ _ _ _ _ _ _ _ _ _
     1 _ _ _ _ _ _ _ _ _ _
     2 _ _ _ _ _ _ _ _ _ _
     3 _ _ _ _ _ _ _ _ _ _
     4 _ _ _ _ _ _ _ _ _ _
     5 _ _ _ _ _ _ _ _ _ _
     6 X X X X X X X X X _
     7 X X X X X X X X X X
     8 X X X X X _ _ _ _ _
     9 _ _ _ _ _ _ _ _ _ _
    10 _ _ _ _ _ _ _ _ _ _
    11 _ _ _ _ _ _ _ _ _ _
    12 _ _ _ _ _ _ _ _ _ _
    13 _ _ _ _ _ _ _ _ _ _
    14 _ _ _ _ _ _ _ _ _ _

    What would you like to do?
    done
    Have a nice day!

Have fun with it! 

Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=328646).
