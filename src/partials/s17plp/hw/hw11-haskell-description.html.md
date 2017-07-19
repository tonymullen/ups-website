```
cacheable: false
```


## Exercise 1

Write a function that takes a list of numbers and a number n and returns a list of pairs of numbers from the original list, such that each pair adds up to n. Any given pair of the same two numbers (in any order) should appear only once in the final list and elements in the original list cannot be duplicated (a number can appear more than once in the solution only if it also appears more than once in the original list, as in the case of the number 5 in the example below).

<pre><code class="haskell">> sumpairs [5,1,4,0,5,6,9] 10
[(5,5),(1,9),(4,6)]</code></pre>

The tuples can appear in any order. You may use library functions or write whatever helper functions you need.

## Exercise 2

Write a function that generates combinations of K distinct objects chosen from N elements of a list. Consider the different ways a committee of 3 people could be drawn from a group of 12 people. The function should take a list and return a list of lists.

<pre><code class="haskell">combinations :: Int -> [a] -> [[a]]</code></pre>

You may want to make use of the `tails` function provided by the `Data.List` library. This function takes a list and returns a list of recursively-generated tails of the list. Like so:

<pre><code class="haskell">> tails [0,1,2,3]
[[0,1,2,3],[1,2,3],[2,3],[3],[]]</code></pre>

You can import that function like this:

<pre><code class="haskell">import Data.List (tails)</code></pre>

The `combinations` function can be written as a recursive list comprehension using the `tails` function. You can use pattern matching to define a base case for when k is equal to 0.

## Exercise 3

Using `foldl`, define a function `dec2int :: [Int] -> Int` that takes a list of single digit integers and returns the integer made up of the digits in the decimal place that corresponds to their position in the list. So, for example:

<pre><code class="haskell">> dec2int [5,4,2,6,1]
54261</code></pre>

Note that this exercise uses `foldl` instead of `foldr`, which we spent more time on in class. This is an example where `foldl` is a much more natural choice than `foldr`. Consider why this is. 

## Exercise 4

Generalizing from the previous exercise, write a function `base2int :: Int -> String -> Int` that takes an argument representing a base and a string representing a number in that base, and returns an integer representing the decimal number expressed by the string.

<pre><code class="haskell">> base2int 2 "10111"
23</code></pre>

Note that this exercise differs from Exercise 3 in that the argument determines the base and also in that the function is expected to work on a string rather than a list of numbers. You may want to use `digitToInt` from the `Data.Char` library to help with this. You may define helper functions if it's easier or clearer than doing everything inline.

## Exercise 5

Modify the [Caesar cipher program ](/~tmullen/plp/caesar.hs) to also handle upper-case letters. You should assume that the distribution of upper case letters is identical to the corresponding distribution of lower-case letters (i.e 'A' has the same probability as 'a'). Capital letters will be encoded analogously to their lower-case equivalents. Thus if 'h' is encoded as 'm' (as in the example below) 'H' will be encoded as 'M'.

    Main> encode 5 "hello there"
    "mjqqt ymjwj"
    Main> encode 5 "Hello There"
    "Mjqqt Ymjwj"
    Main> crack "MJQQT YMJWJ"
    "HELLO THERE"


## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=374238) as a single `.hs` file. Be sure that your name is written in the file in a comment. (Comments in Haskell are preceded by `--`) and of course double check to make sure the code runs. 