```
cacheable: false
```

## Bert Bos Puzzle

For this project you will work in pairs to use Prolog (later Haskell) to solve
the [Bert Bos Puzzle](/~tmullen/pages/bertspel). Take a look at the puzzle now to
get a general gist of the puzzle.

For this assignment, you will write a predicate **bertgame** that will take two arguments. The first
argument will be size of the board (i.e., the number of squares to a side; this should be between 1 and 12) and the second argument should be a variable that will be instantiated to the solution of the puzzle in the form of a list. It is up to you how you represent this solution, but it should tell us which squares need to be clicked or not clicked in order to convert the board to all red. Also, only report
the minimum amount of necessary information to solve the puzzle. Your program should return all correct answers when prompted with ;.

This will require more than just one or two predicates to solve. You should approach the problem as a case of *generate and test*. This means you will first create a predicate to generate potential answers, and then create one to test whether they are correct. Both of those predicates will in turn depend on other predicates to define their meaning.  

## Submitting

Write all the predicates and facts for this assignment in one file, called
<span class="codefont">bertsgame-&lt;partner1LastName_partner2LastName&gt;.plg</span>. Put your full names in a comment at the top of the file. Like so:

<pre>%Partner1 Name
%Partner 2 Name
%

...

</pre>

Submit the file on [Moodle]().

Of course, you should make sure your program is working before submitting it.
