```
cacheable: false
```

## For loops

At last we come to the `for` loop! Up until now, we’ve been using the `while` loop for all our looping needs. However, if you know the number of iterations in advance, a `for` loop is a much better choice than a `while` loop. The purpose of today’s lab is to give you experience using `for` loops in various scenarios. You'll find the starter code for the lab [here](http://mathcs.pugetsound.edu/~tmullen/ics/lab10.zip).

A few comments before you begin:

* The textbook does not use curly brackets when there is only one statement inside the body of the `for` loop. See the example below. *This is a bad habit to get into and is an easy way to introduce unintentional errors into your code. Always use curly brackets with your for loops!*

    Bad:

        for(int count = 1; count <= 5; count++)
            System.out.println(count);

    Good:

        for(int count = 1; count <= 5; count++) {
            System.out.println(count);
        }

* The variable `count` above is called a loop counter. A loop counter is a variable that controls the iterations of a loop. Historically, loop counters are named in a similar manner as mathematical subscripting variables: `i`, `j`, `k`, etc. For example, in math you see notation like xi or xij. In the same way, in Java it is common to see for loops like:

        for(int i = 0; i < N; i++){
        }

    or

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
            }
         }

    This is one of the only times where it is acceptable to have a variable with a non-descriptive name such as i or j.

## Warm Up

Today’s lab is a series of standalone programming questions. The starter code has a Java class called WarmUp that has a main method along with other private, static methods.

Implement each method (one at a time) and then call the method from main to check that your output is correct. For example, after you finish implementing the `printHello` method, you can call it in `main` using the following syntax:

    public static void main(String[] args){
        printHello();
    }

When you run the main method you should see `“Hello world!”` printed 10 times to the screen.

## Asterisk Pictures

The second Java class in the starter code is called `AsteriskPictures`. There are two methods inside: one for drawing a square and one for drawing a triangle. This is
similar to the way we drew the diagram of the seats in the `Theater` class in class. Take the code in the starter file and rewrite it so that it uses nested for loops instead of nested while loops to draw a square.

The second method asks you to draw a triangle of a given height to the screen (using nested for loops). For example, if height=5 then your method should draw the following picture:

    *
    **
    ***
    ****
    *****

Finally, together with your partner write a third method that prints a picture of your choosing. Feel free to experiment with nesting 3 for loops, or perhaps putting 2 for loops one after the other inside an outer for loop.

## Submitting your lab assignment
Submit your lab10 folder with both the `WarmUp` and `AsteriskPictures` classes inside.                                                       
Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=329583).
