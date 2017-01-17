```
cacheable: false
```



## Exercise 1

What are the types of the following values? Try to figure out the answer before checking with the interpreter, but be sure to confirm your answers with GHCI.

`['a', 'b', 'c']`

`('a', 'b', 'c')`

`[(False, '0'), (True, '1')]`

`([False, True], ['0', '1'])`

`[tail, init, reverse]`

## Exercise 2

What are the types of the following functions? Be sure to include the necessary class constraints if the functions are defined using overloaded operators. Try to figure out the answer before checking with the interpreter, but confirm your answers with GHCI.

`second xs = head (tail xs)`

`swap (x, y) = (y, x)`

`pair x y = (x, y)`

`double x = x * 2`

`palindrome xs = reverse xs == xs`

`twice f x = f (f x)`

## Exercise 3

Some of the following expressions are not syntactically correct, while others are syntactically correct but do not have sensible types. Some are well-formed. Which is which? In the case of the well-formed expressions, give their types. Assume that `double :: Int -> Int`  is defined as described in the previous exercise.

Try to figure out the answer before checking with the interpreter, but confirm your answers with GHCI. Also, not all well-formed expressions are printable. If there's no `Show` function available for an expression, you can still find out what it's type is.  

`[0, 1)`

`double -3`

`double (-3)`

`double double 0`

`if 1==0 then 2==1`

`"++" == "+" ++ "+"`

`[(+),(-)]`

`[[],[[]],[[[]]]]`

`concat ["tea", "for", '2']`

`concat ["tea", "for", "2"]`

## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308764) as an ordinary text file (this assignment involves no actual coding). Be sure that your name is written in the file and that all answers have their associated questions with them so a grader or I can tell at a glance what question is being answered.
