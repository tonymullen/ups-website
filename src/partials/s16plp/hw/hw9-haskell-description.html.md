```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk8-&lt;your_name&gt;.hs</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:


    --Your Name
    --
    --Exercise 1

    ...

    --Exercise 2

    ...



Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308771).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.


## Exercise 1

Write a function that inserts an element into a list at a given position. Assume that position 1 is the first position. So, for example:

<pre><code class="haskell">> insertAt 'X' "abcd" 2
"aXbcd"</code></pre>

You may use whatever library functions or logical structures you think are appropriate.

## Exercise 2

Write a function that removes duplicate elements from a list. You may use whatever library functions you need except `nub` (which does exactly this on its own). You may write whatever helper functions you need.

## Exercise 3

Write a function that takes a list of numbers and a number n and returns a list of pairs of numbers from the original list, such that each pair adds up to n. Any given pair of the same two numbers (in any order) should appear only once in the final list and elements in the original list cannot be duplicated (a number can appear more than once in the solution only if it also appears more than once in the original list, as in the case of the number 5 in the example below).

<pre><code class="haskell">> sumpairs [5,1,4,0,5,6,9] 10
[(5,5),(1,9),(4,6)]</code></pre>

The tuples can appear in any order. You may use library functions or write whatever helper functions you need.

## Exercise 4

Write a function that generates combinations of K distinct objects chosen from N elements of a list. Consider the different ways a committee of 3 people could be drawn from a group of 12 people. The function should take a list and return a list of lists.

<pre><code class="haskell">combinations :: Int -> [a] -> [[a]]</code></pre>

You may want to make use of the <span class="codefont">tails</span> function provided by the <span class="codefont">Data.List</span> library. This function takes a list and returns a list of recursively-generated tails of the list. Like so:

<pre><code class="haskell">> tails [0,1,2,3]
[[0,1,2,3],[1,2,3],[2,3],[3],[]]</code></pre>

You can import that function like this:

<pre><code class="haskell">import Data.List (tails)</code></pre>

The `combinations` function can be written as a recursive list comprehension using the `tails` function. You can use pattern matching to define a base case for when k is equal to 0.

## Exercise 5

Using <span class="codefont">foldl</span>, define a function <span class="codefont">dec2int :: [Int] -> Int</span> that takes a list of single digit integers and returns the integer made up of the digits in the decimal place that corresponds to their position in the list. So, for example:

<pre><code class="haskell">> dec2int [5,4,2,6,1]
54261</code></pre>

## Exercise 6

Generalizing from the previous exercise, write a function <span class="codefont">base2int :: Int -> String -> Int</span> that takes an argument representing a base and a string representing a number in that base, and returns an integer representing the decimal number expressed by the string.

<pre><code class="haskell">> base2int 2 "10111"
23</code></pre>
