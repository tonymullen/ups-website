```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk7-&lt;your_name&gt;.hs</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>--Your Name
--
--Exercise 1

...

--Exercise 2

...

</pre>

Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=298603).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.


## Exercise 1

Using a list comprehension, give an expression that calculates the sum
1<sup>2</sup>+2<sup>2</sup>+...100<sup>2</sup> of the first one hundred integer squares.

## Exercise 2

Show how a single comprehension with two generators

[(x,y) | x <- [1,2,3], y <- [4,5,6]]

can be re-expressed using two comprehensions with single generators. Make use of the library function <span class="codefont">concat</span> and nest one comprehension within the other.

## Exercise 3

The scalar product of two lists of integers  <span class="codefont">xs</span> and  <span class="codefont">ys</span> of
length  <span class="codefont">n</span> is given by the
sum of the products of corresponding integers.

In a similar manner to the <span class="codefont">chisqr</span> function
from the Caeser cipher example, show how a list comprehension
can be used to define a function   <span class="codefont">scalarproduct :: [Int] -> [Int] -> Int</span> that returns the scalar product of two lists.  For example:

<pre><code class="haskell">> scalarproduct [1,2,3] [4,5,6]
32</code></pre>

## Exercise 4

Modify the [Caesar cipher program ](/~tmullen/plp/caesar.hs) to also handle upper-case letters.
