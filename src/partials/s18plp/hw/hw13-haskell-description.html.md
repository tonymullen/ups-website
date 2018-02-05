```
cacheable: false
```

**This assignment may be optionally done in pairs**

## State transition network, Haskell edition

For this assignment, we'll return to the state-transition networks we looked at in [Homework 7](http://mathcs.pugetsound.edu/~tmullen/hw/s18plp/hw7-prolog/). In this exercise you will
work from [starter code](https://mathcs.pugetsound.edu//~tmullen/secure/s18plp/state_transitions_starter.hs) written in Haskell to implement functions that give paths through
the network along the same lines of those you implemented in Prolog. There are some big differences, though, in how we can best approach this problem in Haskell. Notably, we made heavy use of Prolog's built-in backtracking to let it do the heavy lifting of finding paths through the network. Haskell has no such ability; there's no concept of the sort of retries you get with `;` in Prolog of that you can collect using Prolog's `bagof`.

Instead, the approach we take with Haskell focuses on functions that return values based on inputs, so you will need to break the problem down into smaller problems. You will probably want to use a combination of tools that we have covered in class. 

Specifically, the following three functions need to be implemented:

<pre><code class="haskell">red_edge_sequence :: Network -> [Path]</code></pre>

<pre><code class="haskell">alternating_edge_sequence :: Network -> [Path]</code></pre>

<pre><code class="haskell">matching_edge_state_sequence :: Network -> [Path]</code></pre>

These each return lists of `Path` type elements (`Path` is defined in the starter code as a list of state names). 

Recall the network from Assignment 7, encoded in the starter code as `testNetwork1`:

<img src="/~tmullen/images/plp/nodegraph.png" style="width: 100%;"/>

The expected output from the program for this network is:

<pre><code class="haskell">Red edge sequences:
["BDIK","BDFHK","BDFHIK"]
Alternating edge sequences:
["AFHJ","ADFGJ","ADEIK","BDFGJ","BDEIK","BDFHJ"]
Matching edge/state sequences:
["AFGHJ","BDIK"]</code></pre>

And a second one (`testNetwork2` in the starter code):

<img src="/~tmullen/images/plp/nodegraph2.png" style="width: 100%;"/>

The expected output from the program for this network is:

<pre><code class="haskell">Red edge sequences:
["ACFHK","BDGIL","BDGIJL"]
Alternating edge sequences:
["AFHIL","ADEJL","BDEJL","BDFHIL"]
Matching edge/state sequences:
["AFIK"]</code></pre>

The starter code has 8 specific functions declared that will complete the program. No other helper functions are necessary (although if you find it useful, you may write other functions). It is strongly recommended that you study the approach taken and implement those functions. However, alternate approaches to solving the task are also eligible for credit, provided your program works and yields the correct output. In any case, you should make sure you understand all the code (aside from the `IO` blocks) on a syntactic level before proceeding.

The functions in the starter code that contain `IO()` in their declaration (`main` and `showSolution`) we have (probably) not yet covered in class. They are involved with input/output (which is a somewhat convoluted topic in Haskell) and you do not need to understand them in order to write the functions necessary to complete this assignment. We will talk about them in class by and by, and of course the textbooks and other resources have information available to you if you're curious about these parts of the code. 

## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=374239) as a single `.hs` file. Be sure that your name is written in the file in a comment. (Comments in Haskell are preceded by `--`) and of course double check to make sure the code runs. 