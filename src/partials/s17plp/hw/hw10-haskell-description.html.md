```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk10-&lt;your_name&gt;.hs</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:


    --Your Name
    --
    --Exercise 1

    ...

    --Exercise 2

    ...


Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308777).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.

## Exercise 1

Declare a data type `Tree` as follows:

    data Tree = Leaf Int | Node Tree Int Tree

Write a function `sumtree` that traverses the tree and returns the sum of the integer values of its nodes.

For example, a call to `sumtree` with a tree with three leaves and two non-terminal nodes with the following values:

<img src="/~tmullen/images/plp/numtree.png"/>

should result in the output 20, as shown:

    > sumtree (Node (Leaf 5) 5 (Node (Leaf 5) 2 (Leaf 3)))
    20


## Exercise 2


Declare a data type `Tree2` as follows:

    data Tree2 = Leaf2 Int | Node2 Tree2 Tree2

Consider the tree to be *balanced* if the number of leaves in the left and right subtree of every node differs by at most one, with leaves themselves being trivially balanced.
Define a function `balanced :: Tree2 -> Bool` that decides if a tree is balanced or not. Hint: first define a function that returns the number of leaves in a tree.


## Exercise 3

In preparation for working on the Bert Bos puzzle in Haskell, it would be good to establish how to get a list of possible click lists. (The rest of the Bert Bos puzzle can be solved by figuring out how to filter this list down to only the successful click lists).

You can generate a list of all possible `"click"` and `"noclick"` strings using two built-in functions that are both available in Prelude: the `replicate` function and the `sequence` function. Using these two functions, write a function `clicklists :: Int -> [[[Char]]]` that takes an integer and outputs a list of lists of strings representing clicks and non-clicks.

You can of course recycle this function for use on your Bert Bos puzzle.  

## Extra credit

Adapt your own solution or (or begin with [this solution](http://mathcs.pugetsound.edu/~tmullen/plp/red_and_green_network.pl)) to [Homework 5, Exercise 1](http://mathcs.pugetsound.edu/~tmullen/hw/s16plp/hw5-prolog/) (red and green state transition network) from Prolog to Haskell.

This is *considerably* more difficult to do in Haskell than in Prolog and should serve as a nice illustration of the kind of problems that Prolog is well-suited to solving. Consider what features of Prolog make it so much easier to solve this kind of problem.  
