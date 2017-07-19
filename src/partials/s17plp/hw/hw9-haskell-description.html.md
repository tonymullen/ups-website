```
cacheable: false
```

## Exercise 1

Haskell includes a variety of convenient built-in functions for use on lists. The most important of these are listed in [Learn You A Haskell](http://learnyouahaskell.com/starting-out#an-intro-to-lists)

Using built-in list functions, define a function `halve :: [a] -> ([a],[a])` that splits an even-lengthed list into two halves, and an odd list into as near as possibly equal parts. For example:

<pre><code class="haskell">> halve [1,2,3,4,5,6]
([1,2,3],[4,5,6])</code></pre>

Don't forget to include you type declaration for this and all other functions. 

## Exercise 2

The built-in predicate `product :: Num a => [a] -> a` returns the product of all the numbers in a list of numbers. Implement your own recursive version of this function. Name your function `product'` (note the prime) and define it using the ` * ` operator. Use [pattern matching](http://learnyouahaskell.com/syntax-in-functions#pattern-matching) to implement the base case and the recursive case.   

## Exercise 3

The built-in function `tail` will produce an error if it's called with the empty list. 

Define a function `safetail :: [a] -> [a]` that behaves the same as the library function `tail`, except that `safetail` maps the empty list to itself, rather than producing an error. Define your function 
in *three different ways*, using each of the following:

* (a) a conditional expression
* (b) guarded equations
* (c) pattern matching

Call the three functions `safetail`, `safetail'`, and `safetail''` and include the type declarations for all three.    

## Exercise 4

[List comprehensions](http://learnyouahaskell.com/starting-out#im-a-list-comprehension) are powerful tools for processing lists. 

Using a list comprehension, give an expression that calculates the sum
1<sup>2</sup>+2<sup>2</sup>+...100<sup>2</sup> of the first one hundred integer squares.

## Exercise 5

The library function `replicate :: Int -> a -> [a]` takes a number n and another argument and returns a list with the second argument repeated n times. For example,

<pre><code class="haskell">replicate 3 True
[True, True, True]</code></pre>

Implement a version of this function called `replicate'`, which has the same meaning but is defined using a list comprehension.

## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=374236) as a single `.hs` file. Be sure that your name is written in the file in a comment. (Comments in Haskell are preceded by `--`) and of course double check to make sure the code runs. 