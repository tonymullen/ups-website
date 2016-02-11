```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk4-&lt;your_name&gt;.pl</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>%Your Name
%
%Exercise 1

...

%Exercise 2

...

</pre>

Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308698).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.


## Exercise 1

Write a program for <span class="codefont">substitute(X, Y, L1, L2)</span> where
<span class="codefont">L2</span> is the result of substituting Y for all occurrences of
X in L1. For example, <span class="codefont">substitute(a, x, [a,b,a,c], [x,b,x,c])</span>
 is true, whereas  <span class="codefont">substitute(a, x, [a,b,a,c], [a,b,x,c])</span> is
  false

## Exercise 2

Define a predicate
<span class="codefont">adjacent(X, Y, Zs)</span> that is true if X and Y are adjacent in a list. For example, <span class="codefont">adjacent(c, d, [a, b, c, d, e])</span> would be true.

## Exercise 3

Define a program for
<span class="codefont">subtree(S, T)</span> where T and S are both binary trees and S is a subtree of T. Represent a tree using a data structure of the form <span class="codefont">tree(Label, LeftSubtree, RightSubtree)</span>.

For example, in the case of the tree below,
<span class="codefont">tree(c, tree(f, void, void), tree(g, void, void))</span>
should evaluate as a subtree of the tree.

<img src="/~tmullen/images/plp/binarytree.png" style="width: 100%;"/>

## Exercise 4

Define a program for
<span class="codefont">path(X, Tree, Path)</span> which returns the list of labels on the path from the root of the tree to X. For example, in the tree above, the path to <span class="codefont">i</span> would return the list
<span class="codefont">[a, b, e, i]</span>.
