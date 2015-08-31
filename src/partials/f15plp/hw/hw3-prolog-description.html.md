```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk3-&lt;your_name&gt;.plg</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>%Your Name
%
%Exercise 1

...

%Exercise 2

...

</pre>

Submit the file on [Moodle]().

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.

## Exercise 1

Write a program for <span class="codefont">substitute(X, Y, L1, L2)</span> where
<span class="codefont">L2</span> is the result of substituting Y for all occurrences of
X in L1. For example, <span class="codefont">substitute(a, x, [a,b,a,c], [x,b,x,c])</span>
 is true, whereas  <span class="codefont">substitute(a, x, [a,b,a,c], [a,b,x,c])</span> is
  false

## Exercise 2

Write a program for <span class="codefont">no_doubles(L1, L2)</span> where <span class="codefont">L2</span> is the result of removing all duplicate elements from
<span class="codefont">L1</span>. For example,
<span class="codefont">no_doubles([a,b,c,b], [a,b,c])</span> is true.

## Exercise 3

Write a program for the relation
<span class="codefont">better_poker_hand(Hand1, Hand2, Hand)</span> that succeeds if
<span class="codefont">Hand</span> is the better poker hand between
<span class="codefont">Hand1</span> and <span class="codefont">Hand2</span>. For those
unfamiliar with the game, here are some rules of poker necessary for answering this exercise:

* The order of cards is 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace.
* Each hand consists of five cards.
* The rank of hands in ascending order is: no pairs < one pair < two pairs < three of a kind
< flush (all cards the same suit) < straight (all cards in order) < full house (one pair and three of a kind) < four of a kind < straight flush (all cards the same suit and in order).
* When two hands have the same rank, the higher denomination cards win. For example, a pair of kings beats a pair of 7's.

Hints:
* Represent a poker hand by a list of terms of the form
<span class="codefont">card(Suit, Value)</span>. For example, a hand consisting of the 2 of clubs, the 5 of spades, the queen of hearts, the queen of diamonds, and the 7 of spades would be represented by the list
<span class="codefont">[card(clubs,2),card(spades,5),card(hearts,queen),card(diamonds,queen),card(spades,7)].
* It may be helpful to define relations such as
<span class="codefont">has_flush(Hand)</span> which is true if all the cards in <span class="codefont">Hand</span> are the same suit; <span class="codefont">has_full_house(Hand)</span> which
is true if <span class="codefont">Hand</span> has three cards with the same value but in different suits, and the other two cards have the same different value; and <span class="codefont">has_straight(Hand)</span> which is true if <span class="codefont">Hand</span> has cards with consecutive values.
* The number of cases to consider is reduced if the hand is first sorted.


## Exercise 4

The graph below has red and green states, red and green transitions, two start states (A and B, represented by a triangle to the left of the node) and two finish states (J and K, represented by double outlines).

<img src="/~tmullen/images/plp/nodegraph.png" style="width: 100%;"/>


Write a program to represent this graph in Prolog. Write the following three predicates:

* <span class="codefont">red_edge_sequence(List)</span> which returns all possible lists of states, beginning with a start state and ending with a finish state, that can be traversed using only red edges (independent of state color).
* <span class="codefont">alternating_edge_sequence(List)</span> which returns all possible lists of states, beginning with a start state and ending with a finish state, that can be traversed using sequences of alternating colored edges (i.e red-green-red-green-red, green-red-green-red, etc.) also independent of state color.
* <span class="codefont">matching_edge_state_sequence(List)</span> which returns all possible lists of states, beginning with a start state and ending with a finish state, for which the path passes through edges <em>and</em> states that are the same color. Either all states and edges in the path are green, or all states and edges in the path are red.
