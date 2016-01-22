```
cacheable: false
```

## Submitting

Submit this assignment on [Moodle](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=308764) as an ordinary text file (this assignment involves no actual coding). Be sure that your name is written in the file and that all answers have their associated questions with them so a grader or I can tell at a glance what question is being answered.

## Exercise 1

What are the types of the following values? Try to figure out the answer before checking with the interpreter, but be sure to confirm your answers with GHCI.

<span class="codefont">['a', 'b', 'c']</span>

<br>

<span class="codefont">('a', 'b', 'c')</span>

<br>

<span class="codefont">[(False, '0'), (True, '1')]</span>

<br>

<span class="codefont">([False, True], ['0', '1'])</span>

<br>

<span class="codefont">[tail, init, reverse]</span>

## Exercise 2

What are the types of the following functions? Be sure to include the necessary class constraints if the functions are defined using overloaded operators. Try to figure out the answer before checking with the interpreter, but confirm your answers with GHCI.

<span class="codefont">second xs = head (tail xs)</span>

<br>

<span class="codefont">swap (x, y) = (y, x)</span>

<br>

<span class="codefont">swap (x, y) = (y, x)</span>

<br>

<span class="codefont">pair x y = (x, y)</span>

<br>

<span class="codefont">pair x y = (x, y)</span>

<br>

<span class="codefont">double x = x * 2</span>

<br>

<span class="codefont">palindrome xs = reverse xs == xs</span>

<br>

<span class="codefont">twice f x = f (f x)</span>


## Exercise 3

Some of the following expressions are not syntactically correct, while others are syntactically correct but do not have sensible types. Some are well-formed. Which is which? In the case of the well-formed expressions, give their types. Assume that <span class="codefont">double :: Int -> Int</span>  is defined as described in the previous exercise.

Try to figure out the answer before checking with the interpreter, but confirm your answers with GHCI. Also, not all well-formed expressions are printable. If there's no <span class="codefont">Show</span> function available for an expression, you can still find out what it's type is.  

<span class="codefont">[0, 1)</span>

<br>

<span class="codefont">double -3</span>

<br>

<span class="codefont">double (-3)</span>

<br>

<span class="codefont">double double 0</span>

<br>

<span class="codefont">if 1==0 then 2==1</span>

<br>

<span class="codefont">"++" == "+" ++ "+"</span>

<br>

<span class="codefont">[(+),(-)]</span>

<br>

<span class="codefont">[[],[[]],[[[]]]]</span>

<br>

<span class="codefont">concat ["tea", "for", '2']</span>

<br>

<span class="codefont">concat ["tea", "for", "2"]</span>
