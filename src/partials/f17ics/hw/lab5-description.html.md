```
cacheable: false
```

## Overview

You can download a starter file for this lab [here](http://mathcs.pugetsound.edu/~tmullen/secure/f17ics/NumberGuesser.zip).

In this lab, you will create a simple game to play! The game is a "number guessing game"---the computer will pick a random number between 1 and 50 (inclusive), and then the player will try to guess it in as few guesses as possible. 

The player will enter guesses through the command line interface, using the Scanner. The program will let the player know how close their guess is (if they are "hot" or "cold", and whether their guess was too high or too low). When finished, your program's output might look something like the following:

The play will progress like this:

    Welcome to the Guessing Game!
    I picked a number between 1 and 50. Try and guess!
    25
    You guessed 25
    Your guess is very cold
    20
    Your guess is extremely cold
    40
    Your guess is very warm
    45
    Your guess is cold
    35
    Your guess is extremely warm
    33
    Your guess is warm
    32
    Your guess is warm
    37
    Congratulations. You figured it out in 8 tries.

This lab should be completed in pairs. Remember to switch off who is driving and who is navigating!

## Objectives

* To practice with conditionals and boolean expressions
* More practice with class design
* To practice using the Random class

## Instructions

Download the [starter code](http://mathcs.pugetsound.edu/~tmullen/secure/f17ics/NumberGuesser.zip). Read the code and the comments to see what needs to be implemented. 

For the guessing game, use an if-else block to print a different message depending on this difference:
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

Although there are many ways to organize the conditions, some are better than others. Try to keep your conditional block as simple, concise, and clear as possible. Don't forget about `else if` blocks. 

You should avoid writing the same print statement more than once--it makes it difficult to change the message later!
</li>
</ul>
</li>
<li>
Debugging strategy: Be sure to test and retest your code at each step of the process! You may want to (temporarily) print out the secret number so you know what you are looking for, then you can guess numbers that are within a certain range to test your conditionals.

Double-check that your program works perfectly by playing multiple games. If there is ever any behavior that seems wrong, stop and figure out what caused that! "Play computer" and work through the program by hand to see what Java is doing.
</li>
</ol>

**Part2: Upgrading the Game**

If time allows in the lab, upgrade your class to include the following functionalities.

<ol>
<li>
**Upgrade 1:** When the user guesses the answer correctly, we now want to either mock or compliment them depending on the number of guesses it took. Recall that you already have a field that remembers this value. Using the table below, print out the appropriate message when the guess is correct:

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
<td> "You are the worst I've ever seen."   </td>
</tr>
</table>
</p>
</li>
<li>

**Upgrade 2:** Once the user correctly guesses the secret number, your game continues to allow more guesses to be made (go ahead, try it!). Update your code so that no more guesses can be made at this point, and instead, your guess method should simply output a message like this:

<pre><code class="java">Game Over: You won!
You guessed that the secret number was 37 in 5 tries.</pre></code>


</li>
</ol>

Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407289).
