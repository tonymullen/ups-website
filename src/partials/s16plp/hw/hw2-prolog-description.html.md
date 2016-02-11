```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk2-&lt;your_name&gt;.pl</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>%Your Name
%
%Exercise 1

...

%Exercise 2

...

</pre>

Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308693).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.

## Exercise 1

Write a collection of facts and rules to describe the layout of objects in the following image:

![Starter Image](/~tmullen/images/plp/objects.png)

**Part 1:** Write facts using the predicates <span class="codefont">adjacent_left(Object1, Object2)</span> and
<span class="codefont">immediately_above(Object1, Object2)</span>.

**Part 2:** Define rules for <span class="codefont">
adjacent_right(Object1, Object2)</span> and <span class="codefont">immediately_below(Object1, Object2)</span> in terms of
<span class="codefont">adjacent_left(Object1, Object2)</span> and
<span class="codefont">immediately_above(Object1, Object2)</span>

**Part 3:** Write recursive predicates
<span class="codefont">right_of/2</span>,
<span class="codefont">left_of/2</span>,
<span class="codefont">above/2</span>,
<span class="codefont">below/2</span>,.

**Part 4:** Write a rule <span class="codefont">higher_than(Object1, Object2)</span> that is true when ever <span class="codefont">Object1</span> is higher in the layout than <span class="codefont">Object2</span>.

## Exercise 2

We've looked in class writing recursive operators on natural numbers defined using the successor function. Below are definitions for <span class="codefont">natural_number/1</span>,  <span class="codefont">plus/3</span>, and <span class="codefont">times/3</span>.

<pre>natural_number(0).
natural_number(s(X)):- natural_number(X).

plus(0, X, X) :- natural_number(X).
plus(s(X), Y, s(Z)) :- plus(X, Y, Z).

times(0, X, 0) :- natural_number(X).
times(s(X), Y, Product) :-
  times(X, Y, Previous),
  plus(Previous, Y, Product).
</pre>

Write a defnition for <span class="codefont">factorial/2</span> that takes a natural number (in successor function notation) as the first argument and yields its factorial value as the second argument. You may use whichever of the predicates defined above that you require.

### Testing and writing to the console

Factorials get big quickly, so even 4! will result in too many embedded successors for Prolog to print out in a single line by default. If you try, you will see that Prolog truncates the output with ellipses. There are ways to set Prolog's maximum output length, but the simplest way to test your program is to use the <span class="codefont">write/1</span> built in predicate to tell Prolog to write a value. You can include tests directly in your program using the approach we discussed in class. You can do this with the <span class="codefont">write</span> predicate like this:

<pre>:- factorial(s(s(s(s(0)))),X), write(X), nl.
:- factorial(s(s(s(0))),X), write(X).</pre>

In the example above, <span class="codefont">X</span> will first be instantiated as the factorial of four, then written out to the console (in its entirety), followed by a new line (<span class="codefont">nl</span>). Then <span class="codefont">X</span> will be instantiated as the factorial of three and written out to the console.
