```
cacheable: false
```

## Exercise 1: State transition network

The graph below has red and green states, red and green transitions, two start states (A and B, represented by a triangle to the left of the node) and two finish states (J and K, represented by double outlines). Terminology note: *states* are the labeled circles, *edges* or *transitions* are the arrowed lines between states.

<img src="/~tmullen/images/plp/nodegraph.png" style="width: 100%;"/>


Write a program to represent this graph in Prolog. Write the following three predicates:

* `red_edge_sequence(List)` which returns all possible lists of states, beginning with a start state and ending with a finish state, that can be traversed using only red edges (transitions) independent of state color.
* `alternating_edge_sequence(List)` which returns all possible lists of states, beginning with a start state and ending with a finish state, that can be traversed using sequences of alternating colored edges (i.e red-green-red-green-red, green-red-green-red, etc.) also independent of state color.
* `matching_edge_state_sequence(List)` which returns all possible lists of states, beginning with a start state and ending with a finish state, for which the path passes through edges *and* states that are the same color. Either all states and edges in the path are green, or all states and edges in the path are red.

## Design and implementation

Consider how the network can be represented in terms of facts in your program's knowledge base. You will need a way to tell the program what the states are, what the transitions are, and any other information about them. There are a number of design choices to be made. How will you represent the color of the states and transitions? Consider the advantages and disadvantages of doing this with a predicate or using an atomic value to represent color.

Regardless of which approach you take, you will probably want to use lists to traverse the network. Consider what information needs to be passed along from query to query in the recursive rules you define.
