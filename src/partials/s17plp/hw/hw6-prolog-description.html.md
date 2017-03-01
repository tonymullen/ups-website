```
cacheable: false
```

In these exercises, you'll get some more practice with recursive programming with lists, and also start to work with binary branching trees. 

Binary branching trees are tree structures where each internal node has exactly two children which are themselves trees. In Prolog, these can be represented by a compound term with three arguments, `tree(Element, Subtree1, Subtree2)` where `Element` is the data on the node, and `Subtree` and `Subtree2` are the left and right subtree, respectively. This predicate is not built-in, but conceptually it's very similar to lists, except with two tails. Of course, we also need a value that represents the empty tree. Since this is also not built-in, we need to represent this with a particular atom, which we will call `void`. Thus, a predicate recognizing tree structures would look something like:

    binary_tree(void).
    binary_tree(tree(_Element, Left, Right)) :-
      binary_tree(Left),
      binary_tree(Right).

<!--_-->

For example, a tree with root node `a` and two children `b` and `c` would be written 

    tree(a, tree(b, void, void), tree(c, void, void))

Take a good look at how that is structured. Note that `b` and `c` here are leaf nodes, so they have no children. Nevertheless, in order to treat them recursively we regard them as tree structures with `void` children. In this sense, `void` is analogous to the empty list, which is the tail of single-element lists. 

Recursive programming with binary branching trees is very much like programming with lists, except that recursion must happen on two substructures, rather than just one. 

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

Do [Exercise 3.5](http://www.learnprolognow.org/lpnpage.php?pagetype=html&pageid=lpn-htmlse11) from *Learn Prolog Now!*. Define the `swap/2` predicate that produces the mirror image of a binary tree passed as the predicate's first argument.

**Note** The definition of the `tree` data structure is slightly different in the LPN exercise, from what we've discussed in class and what you should use in the rest of these exercises. Instead of labeled nodes at every level of the tree, the LPN trees *only label leaf nodes*. Furthermore, instead of having leaf nodes defined as trees with `void` children, the LPN approach uses a special functor `leaf` to identify leaf nodes. For this reason, the LPN `tree` functor takes only two arguments, each representing subtrees (which may themselves be leaf structures). Whereas the slightly more complex version we've talked about in class enables every node in the tree to carry a value, and so has three arguments. 

There is no naming issue here. Both terms can be described as `tree` without conflicts. 

## Exercise 4

Define a program for
`subtree(S, T)` where T and S are both binary trees and S is a subtree of T. Represent a tree using a data structure of the form `tree(Label, LeftSubtree, RightSubtree)`.

For example, in the case of the tree below,
`tree(c, tree(f, void, void), tree(g, void, void))`
should evaluate as a subtree of the tree.

<img src="/~tmullen/images/plp/binarytree.png" style="width: 100%;"/>

Trees written out in this notation can get rather long and take a lot of typing. Write your test cases out in the program so that they can be accessed with brief predicate calls from the command line. 

## Exercise 5

Define a program for
`path(X, Tree, Path)` which yields the *list* of labels on the path from the root of the tree to X. For example, in the tree above, querying for the path to `i` would result in 
`Path = [a, b, e, i]`.





