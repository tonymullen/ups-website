```
cacheable: false
```

For this assignment you'll do a few more exercises from *Learn Prolog Now!* and then you'll write a slightly longer program for the family tree exercise below.

The important concept from Chapter 2 is unification. This is the way variables in Prolog get instantiated. A Prolog program executes by trying to find suitable unifications for variables such that the necessary constraints are met and the query is found to be true.

Do the following exercises from the book:

[Exercises 2.1, 2.2, and 2.3., LPN](http://www.learnprolognow.org/lpnpage.php?pagetype=html&pageid=lpn-htmlse7)

You do not need to draw the search tree for exercise 2.2.

These exercises do not involve writing code, just executing some code and answering questions. Include the answers in your `.pl` code file, but commented out with `%` so that they don't affect how your code runs.

## Family tree exercise

This exercise will define a number of familial relationships based on the following family tree:

<img src="/~tmullen/images/plp/family-tree.png" style="width: 100%;"/>

You'll begin by writing a knowledge base containing the basic facts that are known about the family tree. Specifically, include predicates `male/1` and `female/1` to list the family members according to gender (based on the red and blue color of the nodes in the diagram). **Remember to represent names as atomic values in the facts, not as variables. Review the syntax of how to write atomic values and variables in Prolog.**

Include another predicate of facts to represent married couples, shown in the diagram as nodes connected by a single straight horizontal line. Use `spouse/2` to list these pairs.

Lastly, add the `parent/2` relationship to your knowledge base. Make sure each parent/child relationship is represented.

Once you have your facts represented, we can add some rules. Add the following defined relationships by simply copying and pasting them into your program:

    father(Dad, Child) :- parent(Dad, Child), male(Dad).
    mother(Mom, Child) :- parent(Mom, Child), female(Mom).

    sibling(Sibling1, Sibling2):-
      parent(Parent, Sibling1),
      parent(Parent, Sibling2),
      Sibling1 \= Sibling2.

    brother(Brother, Sib) :-
      sibling(Brother, Sib),
      male(Brother).

    sister(Sister, Sib) :-
      sibling(Sister, Sib),
      female(Sister).

Test these rules to make sure your facts and rules are accurately representing the situation. You should be able to query your program now with

    ?- father(ward, wally).

and have Prolog return `true`. Try it also with

    ?- sister(maggie, lisa).

Next, on the basis of the predicates you've defined above, write rules for the relationships
`mother_in_law`, `daughter_in_law`, and `brother_in_law`.

Consider the brother-in-law relationship to be true in two cases: a) the brother of one's spouse, and b) the husband of one's sibling. You can ignore extended cases of brother-in-law relationships (i.e. the brother of your brother's wife, etc.)

Test your program on the following queries:

    ?- mother_in_law(marge, wally).

    ?- brother_in_law(ted, lisa).

    ?- brother_in_law(wally, maggie).

    ?- daughter_in_law(mary, ward).

should all return `true`, whereas:

    ?- mother_in_law(marge, maggie).

    ?- mother_in_law(homer, wally).

    ?- brother_in_law(wally, ted).

    ?- brother_in_law(wally, lisa).

should all return `false`.
