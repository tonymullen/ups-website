```
cacheable: false
```

## State transition network

In this exercise, you'll see how lists can be put to use to do more complex tasks, such as traversing a graph. Prolog's built-in backtracking and support for list recursion makes it a good fit for this sort of task. (Later, in an extra-credit problem for Haskell, you'll have the opportunity to try something similar with a pure functional approach, which is quite a bit more difficult).

The graph below has red and green states, red and green transitions, two start states (A and B, represented by a triangle to the left of the node) and two finish states (J and K, represented by double outlines). Terminology note: *states* are the labeled circles, *edges* or *transitions* are the arrowed lines between states. *Traversing* the graph involves starting at a start state and following arrows from state to state until you arrive at a finish state. 

<img src="/~tmullen/images/plp/nodegraph.png" style="width: 100%;"/>

You're going to write a program to represent and traverse this graph in Prolog. In addition to writing facts that represent the graph itself, you will need to write the following three predicates:

* `red_edge_sequence(List)` which returns all possible lists of **states**, beginning with a start state and ending with a finish state, that can be traversed using only **red edges (transitions)** independent of state color.
* `alternating_edge_sequence(List)` which returns all possible lists of **states**, beginning with a start state and ending with a finish state, that can be traversed using sequences of **alternating colored edges** (i.e red-green-red-green-red, green-red-green-red, etc.) also independent of state color.
* `matching_edge_state_sequence(List)` which returns all possible lists of **states**, beginning with a start state and ending with a finish state, for which the path passes through **edges and states that are the same color**. Either all states and edges in the path are green, or all states and edges in the path are red.

Of course, your predicates should be defined recursively and in such a way that they would work generally for any similar but differently structured red/green graph, provided the graph was defined in the format as you define this one. (That is to say don't simply hard-code solutions for this specific graph). 

## Design and implementation

Consider how the network can be represented in terms of facts in your program's knowledge base. You will need a way to tell the program what the states are, what the transitions are, and any other information about them. There are a number of design choices to be made. For example, how will you represent the color of the states and transitions? Consider the advantages and disadvantages of doing this with a predicate or using an atomic value to represent color. In this case, I would recommend using atomic values of `red` and `green`. These can be used in definitions of both states and transitions and can be written into recursive rules. 

Regardless of which approach you take, you will probably want to use lists to traverse the network. Consider what information needs to be passed along from query to query in the recursive rules you define.

This code can be used to test your program. Copy it directly into the program and run it by querying `test`. 

    test :-
      write("Red edge sequences:"), nl,
      bagof(X, red_edge_sequence(X), Xs),
      writeOut(Xs), nl,
      write("Alternating edge sequences:"), nl,
      bagof(Y, alternating_edge_sequence(Y), Ys),
      writeOut(Ys), nl,
      write("Matching edge/state sequences:"), nl,
      bagof(Z, matching_edge_state_sequence(Z), Zs),
      writeOut(Zs), nl.
  
    writeOut([]). 
      writeOut([H|T]) :-
      write(H), nl,
      writeOut(T). 

When your program is working, `test` will output the following results:

    ?- test.
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

