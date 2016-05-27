```
cacheable: false
```

## Overview

In this lab, you'll practice using `while` loops, conditionals, and random numbers by creating a souped up variation on the classic Rock-Paper-Scissors game.

## Objective

For this lab, you'll start implementing a simple Rock-Paper-Scissors game and then, time permitting, you'll take it a little further and implement [*Rock, Paper, Scissors, Lizard, Zombie, Spock and the Large Hadron Collider!*](http://blog.timehorse.com/2009/02/rock-paper-scissors-lizard-zombie-spock.html)

To implement the initial RPS game, remember that:

>Scissors cuts Paper

>Paper covers Rock

>Rock breaks Scissors


Allow your user to type their choice into the terminal, and use a random number generator to determine the computer's choice (you can represent the three possibilities as integers). Use conditionals to determine whether the user or the computer wins each round.

Consider how best to represent the conditions in such a way as to keep your code as clear as possible and to avoid duplicating code where possible.

### More options

The idea of *Rock, Paper, Scissors, Lizard, Zombie, Spock and the Large Hadron Collider* is the same as the traditional RPS game: each gesture is beats some gestures and is beaten by others. But with RPSLZSLHC there are more gestures to play. The relationship between the gestures is shown here:

<img src="/~tmullen/images/ics/RPSLZSLHC.png" style="width: 100%;"/>

And described (from the website) here:

>Scisors cuts Paper …

>… which covers Rock …

>… which crushes Lizard …

>… which evades LHC …

>… which cures Zombie …

>… who brains Spock …

>… who bends Scissors …

>… which decapitates Lizard …

>… which poisons Spock …

>… who vaporizes Rock …

>… which trips Zombie …

>… who shreds Paper …

>… which reprograms LHC …

>… which magnetizes Scissors …

>… which stabs Zombie …

>… who swallows Lizard …

>… which eats Paper …

>… which disproves Spock …

>… who deactivates LHC …

>… which nukes Rock …

>… which blunts Scissors.

## How to implement the game

The game should repeat for as long as the user wants to continue, and cease when the user no longer wants to play. It's up to you how you choose to prompt the user to continue or quit (a simple Y/N question will be fine, or a value like "bye" will work). Use a random number generator and conditionals to choose the computer's gesture first, then use the `Scanner` class to get the user's gesture. Make sure that the input is robust to variance in capitalization.

Make your program respond accordingly to wins, losses, and ties, and keep a record of:

* Total games played
* User wins
* Computer wins
* Ties

Don't use more instance variables than are necessary to maintain the required information.

At the end of the game, when the user quits, have your program output a summary of how well the user did against the computer. You can choose how to represent this information and what specific details to include.

**Implement a simple, working Rock-Paper-Scissors game first.** It's easier to add complexity once you've got the basics in place. Figure out the details of how you'll make your game first with the classic three-gesture game, and then add to it by adding the extended gestures. This way, if you run out of time, at least you'll have a working piece of software completed.

Finally, just as you were asked to do for Lab 4, structure the application using two classes: one class that holds the functionality of the game and has a method `play` that launches the game and a wrapper class with only a `main` method that does nothing but an instance of the game object and call its `play` method.


Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=326880).
