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

The value of a variable is consistent within a single rule. Any time you want to directly compare multiple values to each other or calculate some result using multiple values,
you will need some single rule in which all the necessary values are instantiated as variables.

In this case, you should use a generate-and-test approach. First, you will need to generate sequences of non-repeating digits from 0 to 0, then you will call another predicate on the result to test whether the sequence solves the maze.

Two convenient built-in predicates that you may want to use are

<pre>
member(Element, List).
</pre>

which is true if Element is a member of the list and

<pre>
delete(List, Element, RemainingElementsList).
</pre>

which, if given List and Element, will generate RemainingElementsList containing the original list with only Element removed.

Finally, to make Prolog do arithmetic, we use the **is** operator. So, to instantiate a variable called Sum with the sum of 5 and 5 would look like this:

<pre>
?- Sum is 5 + 5.
Sum = 10
</pre>




## Exercise 2

Write a program for <span class="codefont">double(List, DoubledList)</span> where every element in
<span class="codefont">List</span> appears twice in <span class="codefont">DoubledList</span>. E.g., <span class="codefont">double([1,2,3],[1,1,2,2,3,3])</span> is true.

## Exercise 3

Write a program for <span class="codefont">sum(ListOfIntegers, Sum)</span> which holds if  
<span class="codefont">Sum</span> is the sum of the
<span class="codefont">ListOfIntegers</span>. Refer to the comment above about arithmetic.
