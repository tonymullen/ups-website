```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk1-&lt;your_name&gt;.plg</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>%Your Name
%
%Exercise 1

...

%Exercise 2

...

</pre>

Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=280579).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.

## Exercise 1

Write a collection of facts and rules to describe the layout of objects in the following image:

![Starter Image](/~tmullen/images/plp/objects.png)

**Part 1:** Write facts using the predicates <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">left_of(Object1, Object2)</span> and
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">above(Object1, Object2)</span>.

**Part 2:** Define rules for <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">right_of(Object1, Object2)</span> and <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">below(Object1, Object2)</span> in terms of
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">left_of</span> and
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">below</span>

**Part 3:** Write recursive rules for all four predicates.

**Part 4:** Write a rule <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">higher_than(Object1, Object2)</span> that is true when ever Object1 is higher in the layout than Object2.


## Exercise 2

Start with the following defined relationships (copy and paste them into your program):

<pre>father(Dad, Child) :- parent(Dad, Child), male(Dad).
mother(Mom, Child) :- parent(Mom, Child), female(Mom).

had_a_child(Man, Woman):- father(Man, Child), mother(Woman, Child).

sibling(Sibling1, Sibling2):-
  parent(Parent, Sibling1),
  parent(Parent, Sibling2),
  Sibling1 \= Sibling2.

brother(Brother, Sib) :-
  sibling(Brother, Sib),
  male(Brother).

sister(Sister, Sib) :-
  sibling(Sister, Sib),
  female(Sister).</pre>

Add a new predicate
<span class="codefont">married_couple(Spouse1, Spouse2)</span>. This relationship will be
determined by facts in the database.
On the basis of this predicate and those already defined above, write rules for the relationships
<span class="codefont">mother_in_law</span>,
<span class="codefont">brother_in_law</span>, and
<span class="codefont">daughter_in_law</span>.

Add the appropriate facts to your program to test these predicates with the family from this graphic:

<img src="/~tmullen/images/plp/family-tree.png" style="width: 100%;"/>