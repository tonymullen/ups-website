```
cacheable: false
```


## Exercise 1

Anonymous functions can be defined in Haskell using [lambda expressions](http://learnyouahaskell.com/higher-order-functions#lambdas).

Consider the function

<pre><code class="haskell">mult x y z = x * y * z</code></pre>

Give an alternate definition of `mult` that has the same meaning but which uses the <span class="latex">\lambda</span> operator for each argument.

## Exercise 2

Show how a single comprehension with two generators

    [(x,y) | x <- [1,2,3], y <- [4,5,6]]

can be re-expressed using two comprehensions with single generators. Make use of the library function `concat` and nest one comprehension within the other. This should look similar to the above, i.e. it should be expressed in a single line of code (you don't need to write any helper functions), however it will make use of the built-in function `concat`, which operates on a list of lists.

To solve this problem, first run the above line of code and see what it outputs. Consider whether there is an intuitive way to think of the output list as being a concatenation of three smaller lists. You will structure the solution to this question as a list comprehension on the head of another list comprehension, and then concatenate the results of the outer comprehension.


## Exercise 3

Write a function that inserts an element into a list at a given position. Assume that position 1 is the first position. So, for example:

<pre><code class="haskell">> insertAt 'X' "abcd" 2
"aXbcd"</code></pre>

If the number given is higher than the length of the list, place the element to be inserted at the end of the list.
You may use whatever library functions or logical structures you think are appropriate.

## Exercise 4

Write a function that removes all duplicate elements from a list. You may use whatever library functions you need except `nub`. You may write whatever helper functions you need. It might help to think about how you would have done this recursively in Prolog.

## Exercise 5

Write a function that takes a list of numbers and a number n and returns a list of pairs of numbers from the original list, such that each pair adds up to n. Any given pair of the same two numbers (in any order) should appear only once in the final list and elements in the original list cannot be duplicated (a number can appear more than once in the solution only if it also appears more than once in the original list, as in the case of the number 5 in the example below).

<pre><code class="haskell">> sumpairs [5,1,4,0,5,6,9] 10
[(5,5),(1,9),(4,6)]</code></pre>

The tuples can appear in any order. You may use library functions or write whatever helper functions you need.


## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=374237) as a single `.hs` file. Be sure that your name is written in the file in a comment. (Comments in Haskell are preceded by `--`) and of course double check to make sure the code runs. 