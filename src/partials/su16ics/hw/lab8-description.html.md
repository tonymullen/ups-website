```
cacheable: false
```

## Diamond of stars

This lab will give you some more practice with `for` loops, including working with nested loops.

### Objective

This exercise is based on the `StarTriangle` example we saw in class (see the Week 4 in-class code for details). For this exercise, you will write a program that draws a diamond out of asterisks, similar to the examples below. You won't hard-code the size of the diamond. Instead, you should write a method that takes an int argument representing the height of the diamond and prints out an appropriately-sized diamond.

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

This assignment requires you to iterate over lines and iterate over characters in each line, so it will require at least a couple of `for` loops. You will need to figure out how to derive the width of the diamond from the user-inputted height, and how to print out the correct number of spaces and asterisks on each line.

Try to solve the problem in as concise and general a way as you can. Can you get the correct behavior for even and odd-numbered lines without using `if` statements? It's possible to do!

Submit the file at the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=335517).
