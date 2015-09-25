```
cacheable: false
```

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">hwk2-&lt;your_name&gt;.plg</span>. Separate the code for each exercise within the file with comments indicating which code goes with which exercise. Put your own name in a comment at the top of the file. Like so:

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



## Exercise 2

Write a program for <span class="codefont">double(List, DoubledList)</span> where every element in
<span class="codefont">List</span> appears twice in <span class="codefont">DoubledList</span>. E.g., <span class="codefont">double([1,2,3],[1,1,2,2,3,3])</span> is true.

### Hint  

For this exercise, it's important to realize that the <span class="codefont">[Head|Tail]</span> list notation is not limited to accessing only the first element of the list. You can access as many elements into the list as you like by separating elements with commas before the pipe. So, for example, <span class="codefont">[H1, H2, H3|Tail]</span> would access the first three elements as <span class="codefont">H1</span>,  <span class="codefont">H2</span>, and class="codefont">H3</span>, with the remaining elements (starting with the fourth) accessible as a list in class="codefont">Tail</span>.

An example on the command line of the first two elements accessed in the head can be seen here:

<pre>
?- [H1, H2| Tail] = [a, b, c, d].
H1 = a,
H2 = b,
Tail = [c, d].
</pre>

## Exercise 3

<!--
Write a program for <span class="codefont">sum(ListOfIntegers, Sum)</span> which holds if  
<span class="codefont">Sum</span> is the sum of the
<span class="codefont">ListOfIntegers</span>. Refer to the comment above about arithmetic.
-->

Write a program for <span class="codefont">orderedTriples(ListOfInts1, ListOfInts2, ListOfInts3, OrderedTriples)</span> that takes three lists of integers and returns ordered lists of triples of corresponding numbers from the lists. E.g.:

<pre>?- orderedTriples([2,5,3,1], [1,3,4,6], [3,1,5,0], X).
X = [[1, 2, 3], [1, 3, 5], [3, 4, 5], [0, 1, 6]].</pre>

The program should fail if any of the three input lists are not the same length.

### Comparison operators

Prolog comparison operators look like this:

<pre>
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
</pre>

You can compare variables which have been instantiated by numbers, but not variables that have not yet been instantiated by numbers. Thus, on the command line:

<pre>
?- X < Y.
ERROR: &lt;/2: Arguments are not sufficiently instantiated
</pre>

but

<pre>
?- X = 5, Y = 6, X < Y.
X = 5,
Y = 6.
</pre>

Note: if you have trouble remembering the ordering of the greater/less than signs and the equals signs, remember that they are in the order that
<em>doesn't</em> look like an arrow. I.e., less-than-or-equal is <span class="codefont">=<</span> rather than <span class="codefont"><=</span>.
