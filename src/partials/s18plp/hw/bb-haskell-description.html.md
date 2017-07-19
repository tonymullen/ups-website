```
cacheable: false
```

## Bert Bos Puzzle, Haskell edition

Once again you'll tackle the [Bert Bos Puzzle](/~tmullen/pages/bertspel). This time, you'll do it individually, rather than working in pairs.

This time, you will (hopefully) begin armed with some insight into how to break down the task from having solved it in Prolog. But as you'll see, the languages are different enough that it's not trivial to convert your results from one language to the other.

Doing the same exercise in both languages should help you to get a deeper understanding of the similarities and differences between the languages. As you carry out this exercise, think about how you might approach it in an object-oriented imperative language such as Java. Consider whether the task lends itself to one or another style of programming.

Use the same name, `bertsgame`, that you used for your top-level predicate in Prolog for your top-level function here.

As in the Prolog implementation, your solutions should be in the form of lists of clicks **for the top row** that lead deterministically to a fully red board. Unlike Prolog, Haskell doesn't have a mechanism for backtracking and outputting one solution after another (i.e., there's no `;` for Haskell), so your solution should take the form of a list of click lists.

You may represent the clicks themselves however makes sense to you, provided that the meaning of the lists is apparent to the grader. 

## Submitting

Title the file
<span class="codefont">bertsgame-&lt;YourLastName&gt;.hs</span>. Put your full name in a comment at the top of the file. Like so:

<pre>--Your Name

...

</pre>

## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=374240) as a single `.hs` file. Be sure that your name is written in the file in a comment. (Comments in Haskell are preceded by `--`) and of course double check to make sure the code runs. 

