```
cacheable: false
```

In today's lab, you'll finish up the Fizz Buzz task you started working on yesterday, then work on creating a diamond of stars using similar techniques to those you used a few days ago in the triangle exercise. 

## Fizz Buzz

In case you missed class on Friday, the challenge is to write a program that prints out the numbers 1 to 100 one line at a time. The complication is that for every number that is evenly divisible by 3, the string `Fizz` should appear *instead* of the number. For every number that's evenly divisible by 5, `Buzz` should appear. For every number evenly divisible by both 3 and five `FizzBuzz` should appear. 

You should do this with the minimal amount of comparisons and conditions, and the minimal amount of redundancy. For example, you should not have to test for divisibility by 3 more than once. You should not have to print or output the string `Fizz` more than once (even though it also appears in the string `FizzBuzz`). 

Start by getting the correct output printed to the screen, and then go over your code and find ways to eliminate redundancy. 

## Diamond of stars

This lab will give you some more practice with `for` loops, including working with nested loops.

### Objective

This exercise is based on the `StarTriangle` example you implemented recently in class (see the code in the slides directory for details). For this exercise, you will write a program that draws a diamond out of asterisks, similar to the examples below. You won't hard-code the size of the diamond. Instead, you should write a method that takes an int argument representing the height of the diamond and prints out an appropriately-sized diamond.

For example, if the method is given the value 5, the resulting diamond will look like this:

        *  
       ***
      *****
       ***
        *  

If the method is given the value 7, the diamond will look like this:

        *   
       ***  
      *****
     *******
      *****
       ***  
        *   

If the value is an even number, the widest line of the diamond should be doubled, as in this case, where the height of the diamond is 6:

        *  
       ***
      *****
      *****
       ***
        *  

### Implementation

This assignment requires you to iterate over lines and iterate over characters in each line. You can use nested `for` loops or string concatenation, however seems most intuitive to you. You will need to figure out how to derive the width of the diamond from the user-inputted height, and how to print out the correct number of spaces and asterisks on each line.

Consider using two separate outer `for` loops, one for the top half, where the diamond is increasing in width and one for the lower half, where it is decreasing. Think about how to set the correct ranges for these loops. (It's not actually necessary to use 2 outer loops for this, but using 1 loop requires a bit more arithmetic to ensure that the width increases before the midpoint and decreases afterwards. If you want to try it this way `Math.abs()`, `Math.min()`, and `Math.max()` may be useful for getting absolute value, minimum, and maximum of numbers).

Try to solve the problem in as concise and general a way as you can. Can you get the correct behavior for even and odd-numbered lines without using `if` statements? It's possible to do!


Submit the file at the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407296).
