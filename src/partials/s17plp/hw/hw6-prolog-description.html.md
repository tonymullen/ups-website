```
cacheable: false
```

## Exercise 1

Write a program for `substitute(X, Y, L1, L2)` where
`L2` is the result of substituting Y for all occurrences of
X in L1. For example, `substitute(a, x, [a,b,a,c], [x,b,x,c])`
 is true, whereas  `substitute(a, x, [a,b,a,c], [a,b,x,c])` is
  false

## Exercise 2

Define a predicate
`adjacent(X, Y, Zs)` that is true if X and Y are adjacent in a list. For example, `adjacent(c, d, [a, b, c, d, e])` would be true.

## Exercise 3

Define a program for
`subtree(S, T)` where T and S are both binary trees and S is a subtree of T. Represent a tree using a data structure of the form `tree(Label, LeftSubtree, RightSubtree)`.

For example, in the case of the tree below,
`tree(c, tree(f, void, void), tree(g, void, void))`
should evaluate as a subtree of the tree.

<img src="/~tmullen/images/plp/binarytree.png" style="width: 100%;"/>

## Exercise 4

Define a program for
`path(X, Tree, Path)` which returns the list of labels on the path from the root of the tree to X. For example, in the tree above, the path to `i` would return the list
`[a, b, e, i]`.

## Exercise 5

Do [Exercise 3.5](http://www.learnprolognow.org/lpnpage.php?pagetype=html&pageid=lpn-htmlse11) from *Learn Prolog Now!*. Define the `swap/2` predicate that produces the mirror image of a binary tree passed as the predicate's first argument.
