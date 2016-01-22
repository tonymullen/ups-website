```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk2-&lt;your_name&gt;.pl</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

<pre>%Your Name
%
%Exercise 1

...

%Exercise 2

...

</pre>

Submit the file on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308693).

Of course, you should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.

## Exercise 1

Write a collection of facts and rules to describe the layout of objects in the following image:

![Starter Image](/~tmullen/images/plp/objects.png)

**Part 1:** Write facts using the predicates <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">left_of(Object1, Object2)</span> and
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">above(Object1, Object2)</span>.

**Part 2:** Define rules for <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">right_of(Object1, Object2)</span> and <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">below(Object1, Object2)</span> in terms of
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">left_of</span> and
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">below</span>

**Part 3:** Write recursive rules for all four predicates.

**Part 4:** Write a rule <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">higher_than(Object1, Object2)</span> that is true when ever Object1 is higher in the layout than Object2.

## Exercise 2

A while back [a story from the Guardian](http://www.theguardian.com/science/alexs-adventures-in-numberland/2015/may/20/can-you-do-the-maths-puzzle-for-vietnamese-eight-year-olds-that-has-stumped-parents-and-teachers) went viral about Vietnamese schoolchildren solving a challenging puzzle by correctly inserting the digits 1 to 9 (with no repetitions) into the following maze to form a correct equation:

![Starter Image](/~tmullen/images/plp/mathmaze2.jpg)

While I applaud any third grader who can solve this puzzle, I think it would be easier just to let Prolog do the work! For this exercise, write a Prolog program that generates correct answers to the puzzle (there may be more than one). The answers should be in the form of a list of digits which would be entered into the blanks in the maze from left to right. Name the predicate **mathmaze** and have it take one argument, which gets instantiated as the correct list of numbers (and gives other answers when prompted with **;**).

### Some hints

#### Generate and Test

Although there are several ways to approach this puzzle, it's a good opportunity to use a commonly used pattern in Prolog called "generate and test". In generate and test, the idea is to first create a predicate that can generate possible solutions, and then a predicate that can test them to see if they satisfy the requirements of the puzzle. In this case, possible solutions are permutations of the digits 1 through 9.

An example of how this should work (on a smaller list of numbers) is here:

<pre>
?- generate_permutations([1,2,3],X).
X = [1, 2, 3] ;
X = [1, 3, 2] ;
X = [2, 1, 3] ;
X = [2, 3, 1] ;
X = [3, 1, 2] ;
X = [3, 2, 1] ;
false.
</pre>

Two convenient built-in predicates that you may want to use for your generate predicate are

<pre>
member(Element, List).
</pre>

which is true if Element is a member of the list and

<pre>
delete(List, Element, RemainingElementsList).
</pre>

which, if given List and Element, will generate RemainingElementsList containing the original list with only Element removed.

#### Testing solutions

The value of a variable is consistent within a single rule. Any time you want to directly compare multiple values to each other or calculate some result using multiple values,
you will probably want some single rule in which variables are instantiated by all the necessary values for your calculation in order to test the possible solutions you generate.

Finally, to make Prolog do arithmetic, we use the **is** operator. So, to instantiate a variable called Sum with the sum of 5 and 5 would look like this:

<pre>
?- Sum is 5 + 5.
Sum = 10
</pre>
