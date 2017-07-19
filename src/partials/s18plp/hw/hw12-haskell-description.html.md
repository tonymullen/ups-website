```
cacheable: false
```

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

The documentation on the `sequence` function may be a little bit confusing. When applied to an N-length list of lists, `sequence` will yield a list of N element lists, where each of the elements are drawn from the corresponding list in the original list of lists. 

So here, where there are 3 lists in the input, the output is a list of 3-element lists. The first element of the lists is drawn from the `[1,2]` list, the second element is drawn from `[3,4]`, and the third is in all cases `5`.

    > sequence [[1,2],[3,4],[5]]
    [[1,3,5],[1,4,5],[2,3,5],[2,4,5]]

You can of course recycle this function for use on your Bert Bos puzzle.  


## Extra credit

Adapt your own solution or (or begin with [this solution](http://mathcs.pugetsound.edu/~tmullen/plp/red_and_green_network.pl)) to [Homework 5, Exercise 1](http://mathcs.pugetsound.edu/~tmullen/hw/s16plp/hw5-prolog/) (red and green state transition network) from Prolog to Haskell.

## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=374239) as a single `.hs` file. Be sure that your name is written in the file in a comment. (Comments in Haskell are preceded by `--`) and of course double check to make sure the code runs. 