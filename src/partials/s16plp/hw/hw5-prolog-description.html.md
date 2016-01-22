```
cacheable: false
```
## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk5-&lt;your_name&gt;.pl</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>%Your Name
%
%Exercise 1

...

%Exercise 2

...

</pre>

Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308720).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.

## Exercise 1

The graph below has red and green states, red and green transitions, two start states (A and B, represented by a triangle to the left of the node) and two finish states (J and K, represented by double outlines).

<img src="/~tmullen/images/plp/nodegraph.png" style="width: 100%;"/>


Write a program to represent this graph in Prolog. Write the following three predicates:

* <span class="codefont">red_edge_sequence(List)</span> which returns all possible lists of states, beginning with a start state and ending with a finish state, that can be traversed using only red edges (independent of state color).
* <span class="codefont">alternating_edge_sequence(List)</span> which returns all possible lists of states, beginning with a start state and ending with a finish state, that can be traversed using sequences of alternating colored edges (i.e red-green-red-green-red, green-red-green-red, etc.) also independent of state color.
* <span class="codefont">matching_edge_state_sequence(List)</span> which returns all possible lists of states, beginning with a start state and ending with a finish state, for which the path passes through edges <em>and</em> states that are the same color. Either all states and edges in the path are green, or all states and edges in the path are red.
