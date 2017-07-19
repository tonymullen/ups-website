```
cacheable: false
```

## Overview

In this lab, you will create a simple game to play! The game is a "number guessing game"---the computer will pick a random number between 1 and 50 (inclusive), and then the player will try to guess it in as few guesses as possible. Starter code for the lab is [here](http://mathcs.pugetsound.edu/~tmullen/ics/lab4_NumberGuesser.zip).

The player will enter their guess using the command line interface, and will continue to guess until they get the right answer,



    Welcome to the Guessing Game!
    I picked a number between 1 and 50. Try and guess!
    25

    Try a little higher.
    15

    Try a little higher.
    30

    Try a little higher
    40

    Try a little lower.
    38

    Try a little lower.
    37

    Congratulations, you figured it out in 7 guesses!

This lab should be completed in pairs. Remember to switch off who is driving and who is navigating!

## Objectives

* To practice with conditionals and boolean expressions
* To practice `while` loops
* More practice with class design
* To practice using the Random class

## Instructions

Download the [starter file](http://mathcs.pugetsound.edu/~tmullen/ics/lab4_NumberGuesser.zip). Consider why there are two classes defined. This is an example of the correct way to use `main`. We won't be touching the `NumberGuessingGamePlayer` class at all for this lab. It's only intended to demonstrate the use of `main` in application design. You'll focus on the `NummberGuessingGame` class. In the starter code, you'll see comments indicating what needs to be done.

For this lab, you'll need to declare the appropriate variables and put them together in a `while` loop. The whole game will take place within a single call of the `play()` method, so most of your code will go in there. However, you will need to write a constructor to set the value of the secret number.

Using the `while` loop, the program will repeatedly prompt the user for input, as long as the input does not match the secret number. If the input *does* match the secret number, the program will stop looping. Consider what the condition should be for the `while` loop.

**If the user's guess is correct**, the `while` loop should end, and the program should print out a message congratulating the user, and let them know how many guesses it took them. (Again, see above output).

**If the user's guess is wrong**, you need to do several things. First, you tell the user whether their guess should be "higher" or "lower" (as in the above example). Use comparison operators and a if/else block to do this.

You should avoid writing the same print statement more than once--it makes it difficult to change the message later! Also, consider using a `String` variable if you want a different message printed depending on some condition.

Debugging strategy: Be sure to test and retest your code at each step of the process! You may want to (temporarily) print out the secret number so you know what you are looking for, then you can guess numbers that are within a certain range to test your conditionals.

Double-check that your program works perfectly by playing multiple games. If there is ever any behavior that seems wrong, stop and figure out what caused that! "Play computer" and work through the program by hand to see what Java is doing.

**Upgrading the Game**

If you finish the game within the allotted time, continue on to the following upgrades:

**Upgrade 1:**

The program could also print out a message depending on how close the guess was to the secret number. You can see how "close" the guess is by subtracting the guess from the secret number to get the difference. Use an if-else block to print a different message depending on this difference:
<p>

<p>
<table  border="1">
<tr>
<td> Within 1 </td>
<td> "scalding hot" </td>
</tr>
<tr>
<td> Within 2 </td>
<td>  "extremely warm"   </td>
</tr>
<tr>
<td>Within 3 </td>
<td>  "very warm"  </td>
</tr>
<tr>
<td>Within 5 </td>
<td>  "warm"   </td>
</tr>
<tr>
<td>Within 8 </td>
<td>  "cold" </td>
</tr>
<tr>
<td>Within 13 </td>
<td>  "very cold"  </td>
</tr>
<tr>
<td>Within 20  </td>
<td>  "extremely cold" </td>
</tr>
<tr>
<td>More than 20 away</td>
<td>  "icy freezing miserably cold"</td>
</tr>
</table>
</p>

The interaction above would then look something like this:

    Welcome to the Guessing Game!
    I picked a number between 1 and 50. Try and guess!
    25

    Your guess is cold.
    Try a little higher.
    15

    Your guess is icy freezing miserable cold.
    Try a little higher.
    30

    Your guess is warm.
    Try a little higher
    40

    Your guess is extremely warm.
    Try a little lower.
    38

    Your guess is scaldingly hot!
    Try a little lower.
    37

    Congratulations, you figured it out in 7 guesses!



Think about how to do this most efficiently. Should these use the same `if-else` control structure as you used above, or should they use a separate `if-else` control structure?

Remember to handle both positive and negative differences! For example, if the secret number is 35, and the user guesses either 34 or 36, then they should both print out "scalding hot." Hint: There are many ways to handle this. You can either get the absolute value of the difference, or you can use boolean operators like && (which means AND) and || (meaning OR) to check both cases. For example,

<pre><code class="java">if (age >= 18 && age <= 21)
{
    //do somewhere where you know
    //age is between 18 and 21
}
else
{
    //do somewhere where you know
    //age is outside the range of 18 to 21
}</pre></code>


**Upgrade 2:** When the user guesses the answer correctly, we now want to either mock or compliment them depending on the number of guesses it took. Recall that you already have a field that remembers this value. Using the table below, print out the appropriate message when the guess is correct:

<p>
<table  border="1">
<tr>
<td>Guesses</td>
<td>Message to print   </td>
</tr>
<tr>
<td> 1 </td>
<td>"That was lucky!"  </td>
</tr>
<tr>
<td> 2-4 </td>
<td> "That was amazing!"  </td>
</tr>
<tr>
<td> 5-6 </td>
<td>	"That was okay."   </td>
</tr>
<tr>
<td> 7  </td>
<td>"Meh."  </td>
</tr>
<tr>
<td> 8-9  </td>
<td> "This is not your game."   </td>
</tr>
<tr>
<td> 10 or more  </td>
<td> "That was the worst I've ever seen."   </td>
</tr>
</table>
</p>


Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=335079).
