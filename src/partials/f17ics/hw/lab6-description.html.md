```
cacheable: false
```

## Overview

In this lab, you'll practice using `while` loops, conditionals, and random numbers by creating a classic Rock-Paper-Scissors game. You can download a starter file for this lab [here](http://mathcs.pugetsound.edu/~tmullen/secure/f17ics/RPSStarter.zip).


## Objective

In in this lab, you'll write a program that lets the user play Rock-Paper-Scissors against the computer. 

Similarly to last week's lab, the user will interact with the computer with the command line (using Scanner). The game will progress like this: 

    Input a hand gesture:
    rock
    Rock smashes scissors
    You win.
    Play again?
    y
    Input a hand gesture:
    scissors
    Scissors cut paper
    You win.
    Play again?
    y
    Input a hand gesture:
    paper
    Tie!
    Play again?
    y
    Input a hand gesture:
    rock
    Tie!
    Play again?
    y
    Input a hand gesture:
    scissors
    Rock smashes scissors
    You lose.
    Play again?
    n
    You played 5 games
    You won 2 games
    You lost 1 games
    You tied 2 games


Each gesture beats some gestures and is beaten by others. Rock beats scissors, scissors beats paper, and paper beats rock. 

## How to implement the game

The game should repeat for as long as the user wants to continue, and cease when the user no longer wants to play. It's up to you how you choose to prompt the user to continue or quit (a simple Y/N question will be fine). Use a random number generator and conditionals to choose the computer's gesture first, then use the `Scanner` class to get the user's gesture. Make sure that the input is robust to variance in capitalization.

Make your program respond accordingly to wins, losses, and ties, and keep a record of:

* Total games played
* User wins
* Computer wins
* Ties

Don't use more instance variables than are necessary to maintain the required information.

At the end of the game, when the user quits, have your program output a summary of how well the user did against the computer. You can choose how to represent this information and what specific details to include.

Just as we did last week, we'll structure the application using two classes: one class that holds the functionality of the game and has a method `play` that launches the game and a wrapper class with only a `main` method that does nothing but an instance of the game object and call it's `play` method.

Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407291).
