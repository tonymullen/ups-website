```
cacheable: false
```

## Overview

In this lab, you will create a simple game to play! The game is a "number guessing game"---the computer will pick a random number between 1 and 50 (inclusive), and then the player will try to guess it in as few guesses as possible.

The player will enter guesses through the BlueJ interface, calling a `guess()` method and providing a parameter. The program will let the player know how close their guess is (if they are "hot" or "cold", and whether their guess was too high or too low). When finished, your program's output might look something like the following:

(Note that I called a `guess()` method multiple times with parameters 25, 15, 30, 40, 38, and 37. If you have BlueJ's Terminal set to "Clear screen at method call", then you will only see one of these at a time. Uncheck that option to be able to see your game history!)

    Welcome to the Guessing Game!
    I picked a number between 1 and 50. Try and guess!

    You guessed 25.
    Your guess is cold.
    Try a little higher.

    You guessed 15.
    Your guess is icy freezing miserable cold.
    Try a little higher.

    You guessed 30.
    Your guess is warm.
    Try a little higher

    You guessed 40.
    Your guess is extremely warm.
    Try a little lower.

    You guessed 38.
    Your guess is scaldingly hot!
    Try a little lower.

    You guessed 37.
    Congratulations, you figured it out in 7 guesses!

This lab should be completed in pairs. Remember to switch off who is driving and who is navigating!

## Objectives

* To practice with conditionals and boolean expressions
* More practice with class design
* To practice using the Random class

## Instructions

Create a new project in BlueJ using the `Project > New Project` menu. You can name it `Lab6_SecretNumber`. Inside, you will create just one Java class: `SecretNumber`. The `SecretNumber` class represents the secret number, as well as the number of times the user has tried to guess that number.

**Part 1: The Naive SecretNumber Class**

We'll start by building a naive class, and eventually build on top of it. Define your classes in a systematic way:

<ol>
<li>
**Fields (attributes):** What does this game need to remember about itself? Think about what fields are needed for this class. For starters, you need to keep track of the secret number to guess, as well as the number of guesses the player has made so far. You can assume that the secret number is an `int`.
</li>
<li>
**Constructors:** Your class should have two constructors:
<ul>
<li>
A default (or "no args") constructor (one with no parameters) that picks a random number between 1 and 50, and remembers it.
</li>
<li>
A second constructor with a parameter of the upper-bound x of the random number. It picks a random number between 1 and x inclusive (where x is the input argument) and remembers it.
</li>
<li>
Both constructors should also greet the player, and inform them of the range of numbers from which to guess. See the interaction in the beginning of this lab for a sample greeting.
</li>
</ul>
To write the constructors, you need to figure out how to ask Java to generate a random value. Read on:
<ul>
<li>
Java has a built-in class called Random, and because it's an external file that you need to use, you need to import it into your code. Place this line at the top of your class file, above the class header:
<pre><code class="java">import java.util.Random;</pre></code>
</li>
<li>
In your constructors' bodies, instantiate a new Random object. Then you can call its nextInt(int n) method to fetch a random integer between 0 (inclusive) and n (not inclusive). For example:
<pre><code class="java">Random randomGenerator = new Random(); //a random generator
int randomNumber = randomGenerator.nextInt(10); //a random number between 0 (inclusive) and 10 (exclusive)</pre></code>
</li>
<li>
If you want to have a different lower bound, you can offset the result by adding the minimum value to it. For example:

<pre><code class="java">int randomNumber = randomGenerator.nextInt(10) + 1;
// random number is now between 0+1 (inclusive) and 10+1 (exclusive),
// or between 1 and 10 (inclusive) </pre></code>

Check-in with the instructor before moving on to ensure correctness, and switch partners.
</li>
</ul>
</li>
<li>
**Methods:** You will need a guess method that can be called when the user guesses a number. This method should take an integer as a parameter. The method then compares the parameter with the secret number, and prints a message to the screen depending on how close the guess is to the secret number (see below), and whether the guess is too low or too high. Finally, this method should also return whether or not the user guessed correctly. (Hm... what data type is this return value?)
<p>
When the user calls guess, several things need to happen:
<ul>
<li>
You need to increment the number of guesses that the user has taken by 1. Afterwards, you need to check whether the user's guess was correct. Take a moment and draw out the flowchart if it helps. Take the following instructions into consideration.
</li>
<li>
**If the user's guess is correct**, you should then print out a message congratulating the user, and let them know how many guesses it took them. (Again, see above output).
</li>
<li>
**If the user's guess is wrong**, you need to do several things. First, you tell the user whether their guess should be "higher" or "lower" (as in the above example). Use comparison operators and a if/else block to do this.
<p>
Next, you need to print out a message depending on how close the guess was to the secret number. You can see how "close" the guess is by subtracting the guess from the secret number to get the difference. Use a if-else block to print a different message depending on this difference:
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

Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=361349).
