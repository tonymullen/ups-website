```
cacheable: false
```

## State transition network

In this exercise, you'll need to think about how lists can be put to use to do more complex tasks, such as traversing a graph. Prolog's built-in backtracking and support for list recursion makes it a good fit for this sort of task. (Later, in a problem for Haskell, you'll have the opportunity to try something similar with a pure functional approach, which is a very different way to think about it).

You'll also see how you can store individual knowledge bases in separate Prolog files, so that you can write a generalized program that will deal with different sets of facts. In this exercise, you'll write a program that traverses red and green state transition networks, with different test networks stored in the separate files `testNet1.pl` and `testNet2.pl`, both of which can be found in the [starter code](https://mathcs.pugetsound.edu//~tmullen/secure/s18plp/NetworkTraversalStarter.zip). 

### Representing the test networks

Both test networks are made up of red and green states, red and green transitions, a set of start states (indicated graphically by a triangle to the left of the state) and a set of finish states (indicated by double outlines around the state). A traversal of the network is a series of states connected by transitions from a start state to a finish state. 

#### Test Network 1

The illustration below is a graphical representation of the network described in `testNet1.pl`. Compare the facts in that knowledge base with the graphical representation below and be sure you understand how they relate to each other. 

<img src="/~tmullen/images/plp/nodegraph.png" style="width: 100%;"/>

#### Test Network 2

The illustration below is a graphical representation of the network described in `testNet2.pl`. Compare the facts in that knowledge base with the graphical representation below and be sure you understand how they relate to each other. 

<img src="/~tmullen/images/plp/nodegraph2.png" style="width: 100%;"/>


### Traversing the networks

You'll write all of your code in `networkTraversal.pl`. In that program, you'll define the following predicates:

* `red_edge_sequence(List)` which instantiates `List` as a list of **states**, beginning with a start state and ending with a finish state, that can be traversed using only **red edges (transitions)** independent of state color.
* `alternating_edge_sequence(List)` which instantiates `List` as a list of **states**, beginning with a start state and ending with a finish state, that can be traversed using sequences of **alternating colored edges** (i.e red-green-red-green-red, green-red-green-red, etc.) also independent of state color.
* `matching_edge_state_sequence(List)` which instantiates `List` as a list of **states**, beginning with a start state and ending with a finish state, for which the path passes through **edges and states that are the same color**. Either all states and edges in the path are green, or all states and edges in the path are red.

The starter code already implements a `test/1` predicate that takes a filename as an argument, and uses `bagof` to find all of the possible lists for each of the defined predicates. 

## Design and implementation

Your program should be written to work with any red/green network represented in the format found in the test network files.

Study how the network is represented in the code. You will use a list to traverse the network recursively, instantiating elements of the list with state names as you go. Consider what information needs to be passed along from query to query in the recursive rules you define.

Think about what portion of the traversal process should be recursive and what portions should not be recursive. What are your base cases? What needs to be done or checked at the beginning of a traversal? Use as many predicates as necessary, taking care to consider which ones are/should be recursive and which ones aren't. If there is a special condition at the beginning of a traversal, you might consider starting the process with a non-recursive rule which then calls a recursive rule. 

When your program is working, `test(testNet1)` should output the following results:

    ?- test(testNet1).
    Red edge sequences:
    [b,d,f,h,k]
    [b,d,f,h,i,k]
    [b,d,i,k]

    Alternating edge sequences:
    [b,d,f,h,j]
    [a,f,h,j]
    [a,d,f,g,j]
    [a,d,e,i,k]
    [b,d,f,g,j]
    [b,d,e,i,k]

    Matching edge/state sequences:
    [a,f,g,h,j]
    [b,d,i,k]
    
    true.

And `test(testNet2)` should output the following results:

    ?- test(testNet2).
    Red edge sequences:
    [a,c,f,h,k]
    [b,d,g,i,l]
    [b,d,g,i,j,l]

    Alternating edge sequences:
    [b,d,f,h,i,l]
    [a,f,h,i,l]
    [a,d,e,j,l]
    [b,d,e,j,l]

    Matching edge/state sequences:
    [a,f,i,k]
    
    true.
