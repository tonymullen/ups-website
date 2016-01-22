```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk3-&lt;your_name&gt;.pl</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>%Your Name
%
%Exercise 1

...

%Exercise 2

...

</pre>

Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308695).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.


## Exercise 1

Write a program for <span class="codefont">double(List, DoubledList)</span> where every element in
<span class="codefont">List</span> appears twice in <span class="codefont">DoubledList</span>. E.g., <span class="codefont">double([1,2,3],[1,1,2,2,3,3])</span> is true.

### Hint  

For this exercise, it may be helpful to realize that the <span class="codefont">[Head|Tail]</span> list notation is not limited to accessing only the first element of the list. You can access as many elements into the list as you like by separating elements with commas before the pipe. So, for example, <span class="codefont">[H1, H2, H3|Tail]</span> would access the first three elements as <span class="codefont">H1</span>,  <span class="codefont">H2</span>, and class="codefont">H3</span>, with the remaining elements (starting with the fourth) accessible as a list in class="codefont">Tail</span>.

An example on the command line of the first two elements accessed in the head can be seen here:

<pre>
?- [H1, H2| Tail] = [a, b, c, d].
H1 = a,
H2 = b,
Tail = [c, d].
</pre>

## Exercise 2

<!--
Write a program for <span class="codefont">sum(ListOfIntegers, Sum)</span> which holds if  
<span class="codefont">Sum</span> is the sum of the
<span class="codefont">ListOfIntegers</span>. Refer to the comment above about arithmetic.
-->

Write a program for <span class="codefont">orderedTriples(ListOfInts1, ListOfInts2, ListOfInts3, OrderedTriples)</span> that takes three lists of integers and returns ordered lists of triples of corresponding numbers from the lists. E.g.:

<pre>?- orderedTriples([2,5,3,1], [1,3,4,6], [3,1,5,0], X).
X = [[1, 2, 3], [1, 3, 5], [3, 4, 5], [0, 1, 6]].</pre>

The program should fail if any of the three input lists are not the same length.

### Comparison operators

Prolog comparison operators look like this:

<pre>
?- 5 < 6.
true.

?- 5 =< 6.
true.

?- 5 =< 5.
true.

?- 5 =< 4.
false.

?- 5 >= 4.
true.
</pre>

You can compare variables which have been instantiated by numbers, but not variables that have not yet been instantiated by numbers. Thus, on the command line:

<pre>
?- X < Y.
ERROR: &lt;/2: Arguments are not sufficiently instantiated
</pre>

but

<pre>
?- X = 5, Y = 6, X < Y.
X = 5,
Y = 6.
</pre>

Note: if you have trouble remembering the ordering of the greater/less than signs and the equals signs, remember that they are in the order that
<em>doesn't</em> look like an arrow. I.e., less-than-or-equal is <span class="codefont">=<</span> rather than <span class="codefont"><=</span>.


## Exercise 3

Write a program for <span class="codefont">substitute(X, Y, L1, L2)</span> where
<span class="codefont">L2</span> is the result of substituting Y for all occurrences of
X in L1. For example, <span class="codefont">substitute(a, x, [a,b,a,c], [x,b,x,c])</span>
 is true, whereas  <span class="codefont">substitute(a, x, [a,b,a,c], [a,b,x,c])</span> is
  false

## Exercise 4

Write a program for <span class="codefont">no_doubles(L1, L2)</span> where <span class="codefont">L2</span> is the result of removing all duplicate elements from
<span class="codefont">L1</span>. For example,
<span class="codefont">no_doubles([a,b,c,b], [a,b,c])</span> is true.
