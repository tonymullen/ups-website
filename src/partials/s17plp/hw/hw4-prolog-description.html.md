```
cacheable: false
```

For this week's exercises, you'll need to review Chapter 5 of *LPN* on arithmetic.

## Exercise 1: LPN exercises from Chapter 5

Complete Exercise 5.1 from *LPN* and understand why some of the more unexpected answers work the way they do. Include the solutions as commented out code in your `.pl` file.

## Exercise 2: Math Maze

A while back [a story from the Guardian](http://www.theguardian.com/science/alexs-adventures-in-numberland/2015/may/20/can-you-do-the-maths-puzzle-for-vietnamese-eight-year-olds-that-has-stumped-parents-and-teachers) went viral about Vietnamese schoolchildren solving a challenging puzzle by correctly inserting the digits 1 to 9 (with no repetitions) into the following maze to form a correct equation:

![Starter Image](/~tmullen/images/plp/mathmaze2.jpg)

While I applaud any third grader who can solve this puzzle, I think it would be easier just to let Prolog do the work! For this exercise, write a Prolog program that generates correct answers to the puzzle (there may be more than one). Assume ordinary rules of arithmetic precedence (i.e. multiplication/division before addition/subtraction). The answers should be in the form of a list of digits which would be entered into the blanks in the maze from left to right. Name the predicate **mathmaze** and have it take one argument, which gets instantiated as the correct list of numbers (and gives other answers when prompted with **;**).

### Some hints

#### Generate and Test

Although there are several ways to approach this puzzle, it's a good opportunity to use a commonly used pattern in Prolog called "generate and test". In generate and test, the idea is to first create a predicate that can generate possible solutions, and then a predicate that can test them to see if they satisfy the requirements of the puzzle. Prolog will use backtracking to generate alternate solutions until one is found that passes the test. In this case, possible solutions are permutations of the digits 1 through 9.

An example of how this should work (on a smaller list of numbers) is here:


    ?- permutations([1,2,3],X).
    X = [1, 2, 3] ;
    X = [1, 3, 2] ;
    X = [2, 1, 3] ;
    X = [2, 3, 1] ;
    X = [3, 1, 2] ;
    X = [3, 2, 1] ;
    false.

The good news is that `permutations/2` is built-in to Prolog. We'll discuss how it works in class, using `select/3`, but you can use the built-in predicate for your homework. 

#### Testing solutions

The value of a variable is consistent within a single rule. Any time you want to directly compare multiple values to each other or calculate some result using multiple values,
you will probably want some single rule in which variables are instantiated by all the necessary values for your calculation in order to test the possible solutions you generate.

Finally, to make Prolog do arithmetic, we use the **is** operator. So, to instantiate a variable called Sum with the sum of 5 and 5 would look like this:

    ?- Sum is 5 + 5.
    Sum = 10


## Exercise 3

Write a program for `double(List, DoubledList)` where every element in
`List` appears twice in `DoubledList`. E.g., `double([1,2,3],[1,1,2,2,3,3])` is true.

### Hint  

For this exercise, it will be helpful to realize that the `[Head|Tail]` list notation is not limited to accessing only the first element of the list. You can access as many elements into the list as you like by separating elements with commas before the pipe. So, for example, `[H1, H2, H3|Tail]` would access the first three elements as `H1`,  `H2`, and `H3`, with the remaining elements (starting with the fourth) accessible as a list in `Tail`.

An example on the command line of the first two elements accessed in the head can be seen here:


    ?- [H1, H2| Tail] = [a, b, c, d].
    H1 = a,
    H2 = b,
    Tail = [c, d].


## Exercise 4

<!--
Write a program for `sum(ListOfIntegers, Sum)` which holds if  
`Sum` is the sum of the
`ListOfIntegers`. Refer to the comment above about arithmetic.
-->

Write a program for `orderedTriples(ListOfInts1, ListOfInts2, ListOfInts3, OrderedTriples)` that takes three lists of integers and returns ordered lists of triples of corresponding numbers from the lists. E.g.:

    ?- orderedTriples([2,5,3,1], [1,3,4,6], [3,1,5,0], X).
    X = [[1, 2, 3], [1, 3, 5], [3, 4, 5], [0, 1, 6]].

For this program, you may use the built-in predicate `sort/2`, which takes as its first argument a list and instantiates its second argument as that list sorted. 

Your program program should fail if any of the three input lists are not the same length.

### Comparison operators

If you wanted to write your own `sort/2` predicate or something similar, you could do so using comparison operators. 

Prolog comparison operators look like this:


    ?- 5 < 6.
    true.

    ?- 5 =< 6.
    true.

    ?- 5 =< 5.
    true.

    ?- 5 =< 4.
    false.

    ?- 5 >= 4.
    true.


You can compare variables which have been instantiated by numbers, but not variables that have not yet been instantiated by numbers. Thus, on the command line:


    ?- X < Y.
    ERROR: &lt;/2: Arguments are not sufficiently instantiated

but


    ?- X = 5, Y = 6, X < Y.
    X = 5,
    Y = 6.

Note: if you have trouble remembering the ordering of the greater/less than signs and the equals signs, remember that they are in the order that
*doesn't* look like an arrow. I.e., less-than-or-equal is `=<` rather than `<=`.


## Exercise 5

Write a program for `no_doubles(L1, L2)` where `L2` is the result of removing all duplicate elements from
`L1`. For example,
`no_doubles([a,b,c,b], [a,b,c])` is true.
