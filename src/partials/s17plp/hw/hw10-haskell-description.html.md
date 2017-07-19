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

The scalar product of two lists of integers  `xs` and  `ys` of
length  `n` is given by the
sum of the products of corresponding integers.

Show how a list comprehension
can be used to define a function   `scalarproduct :: [Int] -> [Int] -> Int` that returns the scalar product of two lists.  For example:

<pre><code class="haskell">> scalarproduct [1,2,3] [4,5,6]
32</code></pre>

You may use whatever library functions you wish in addition to the list comprehension.

## Exercise 4

Write a function that inserts an element into a list at a given position. Assume that position 1 is the first position. So, for example:

<pre><code class="haskell">> insertAt 'X' "abcd" 2
"aXbcd"</code></pre>

You may use whatever library functions or logical structures you think are appropriate.

## Exercise 5

Write a function that removes all duplicate elements from a list. You may use whatever library functions you need except `nub`. You may write whatever helper functions you need. It might help to think about how you would have done this recursively in Prolog.


## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=374237) as a single `.hs` file. Be sure that your name is written in the file in a comment. (Comments in Haskell are preceded by `--`) and of course double check to make sure the code runs. 