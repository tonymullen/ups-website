```
cacheable: false
```


## Exercise 1

Using library functions, define a function `halve :: [a] -> ([a],[a])` that splits an even-lengthed list into two halves, and an odd list into as near as possibly equal parts. For example:

<pre><code class="haskell">> halve [1,2,3,4,5,6]
([1,2,3],[4,5,6])</code></pre>

## Exercise 2

The built-in predicate `product :: Num a => [a] -> a` returns the product of all the numbers in a list of numbers. Implement your own version of this function. Name your function `product'` and define it using the ` * ` operator.

## Exercise 3

Define a function `safetail :: [a] -> [a]` that behaves the same as the library function `tail`, except that `safetail` maps the empty list to itself, whereas `tail` produces an error in this case. Define
`safetail` three ways, using each of the following:

* (a) a conditional expression
* (b) guarded equations
* (c) pattern matching

## Exercise 4

Consider the function

<pre><code class="haskell">mult x y z = x * y * z</code></pre>

Give an alternate definition of `mult` that has the same meaning but which uses the <span class="latex">\lambda</span> operator for each argument.

## Exercise 5

The library function `replicate :: Int -> a -> [a]` takes a number n and another argument and returns a list with the second argument repeated n times. For example,

<pre><code class="haskell">replicate 3 True
[True, True, True]</code></pre>

Implement a version of this function called `replicate'`, which has the same meaning but is defined using a list comprehension.
