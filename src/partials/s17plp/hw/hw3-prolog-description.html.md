```
cacheable: false
```

For this assignment you'll do the remaining exercise from Chapter 2 of *Learn Prolog Now!* For this exercise, you'll need to understand how named variables can be used to constrain values. When a particular variable appears in two different places in the same clause, it necessarily means that the value in those two places must be identical. In the crossword puzzle grid, you need to make sure that the letters on the intersections match. For values that are unconstrained (such as letters that do not fall on the intersections), you should use variables beginning with underscores. You'll also need to use named values to represent the words themselves.   

[Exercise 2.4, LPN](http://www.learnprolognow.org/lpnpage.php?pagetype=html&pageid=lpn-htmlse7)

## Exercise 2: Object positions

Write a collection of facts and rules to describe the layout of objects in the following image:

![Starter Image](/~tmullen/images/plp/objects.png)

**Part 1:** Write facts using the predicates `adjacent_left(Object1, Object2)` and
`immediately_above(Object1, Object2)`.

**Part 2:** Define rules for `
adjacent_right(Object1, Object2)` and `immediately_below(Object1, Object2)` in terms of
`adjacent_left(Object1, Object2)` and
`immediately_above(Object1, Object2)`

**Part 3:** Write recursive predicates
`right_of/2`,
`left_of/2`,
`above/2`,
`below/2`,.

## Exercise 3: Successor functions

We've looked in class writing recursive operators on natural numbers defined using the successor function. Below are definitions for `natural_number/1`,  `plus/3`, and `times/3`.

    natural_number(0).
    natural_number(s(X)):- natural_number(X).

    plus(0, X, X) :- natural_number(X).
    plus(s(X), Y, s(Z)) :- plus(X, Y, Z).

    times(0, _, 0).
    times(s(X), Y, Product) :-
      plus(Previous, Y, Product),
      times(Y, X, Previous).
<!-- ._ -->

Write a definition for `factorial/2` that takes a natural number (in successor function notation) as the first argument and yields its factorial value as the second argument. You may use whichever of the predicates defined above that you require. Your predicate does not need to work in reverse, and does not need to handle `;` cases.

### Testing and writing to the console

Factorials get big quickly, so even 4! will result in too many embedded successors for Prolog to print out in a single line by default. If you try, you will see that Prolog truncates the output with ellipses. There are ways to set Prolog's maximum output length, but a simple way to test your program is to use the `write/1` built in predicate to tell Prolog to write a value. You can include tests directly in your program using the approach we discussed in class. You can do this with the `write` predicate like this:

    :- factorial(s(s(s(s(0)))),X), write(X), nl.
    :- factorial(s(s(s(0))),X), write(X).

In the example above, `X` will first be instantiated as the factorial of four, then written out to the console (in its entirety), followed by a new line (`nl`). Then `X` will be instantiated as the factorial of three and written out to the console.
