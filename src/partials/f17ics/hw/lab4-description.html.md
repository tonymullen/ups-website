```
cacheable: false
```
This week you'll work in groups to practice building a Java class. You'll use BlueJ to create objects and investigate their state, experiment with constructors, practice writing methods, and learn more about variables and their scope. The sections below make use of the [lab4](http://mathcs.pugetsound.edu/~tmullen/ics/lab4.zip) project.

## BlueJ and Objects

Start by downloading the [lab4](http://mathcs.pugetsound.edu/~tmullen/ics/lab4.zip) project. Open it in BlueJ and spend a minute looking at what's in the Calculator project. There's a variable (instance data) to hold the value currently on the calculator's virtual "display" and a few methods that work with that state. Before working with the code, follow along with the interactions below to see how BlueJ helps us create and explore objects. When you right-click (control-click on Mac) on the Calculator project and pick `new Calculator()` off of the menu, BlueJ creates a new Calculator instance and puts it on the "workbench". Here I'm creating an instance:

<img src="/~tmullen/images/ics/lab4/new.png" style="width: 80%;"/>

After telling BlueJ to call it `calc1`, the red rectangle corresponding to my new Calculator object shows up on the workbench:

<img src="/~tmullen/images/ics/lab4/calc1.png" style="width: 80%;"/>

Double-clicking on the `calc1` object brings up BlueJ's object inspector. It shows the values of all of the object's instance variables. The image below shows that `displayValue` is apparently `0.0` when the object is first constructed:

<img src="/~tmullen/images/ics/lab4/state.png" style="width: 80%;"/>

Now if you right-click on the object (not the class), you'll see a list of methods you can invoke on it:

<img src="/~tmullen/images/ics/lab4/methods.png" style="width: 80%;"/>

After adding 25, checking the state by double-clicking shows the object's updated internal instance data:

<img src="/~tmullen/images/ics/lab4/state2.png" style="width: 80%;"/>

You can create as many objects (instances of `Calculator`) as you like. Below, a second instance has been created. Note that its instance variable holds `0.0` while the original `Calculator` object still holds `25.0`.

<img src="/~tmullen/images/ics/lab4/two_states.png" style="width: 80%;"/>

## Constructors

1. Go back and look through the code again. You'll notice that there is no constructor in `Calculator`, yet we were still able to create instances of the class and they got their `displayValue` set to zero. That's because Java has created an "invisible" constructor for us that sets an object's state to zero. Add your own constructor that does the same thing (takes no arguments and sets displayValue to zero), but add a print statement to your constructor so that you can see when it has been called. Create some objects in BlueJ and see what happens. Does it call your new constructor or the one that was being used previously?

2. Next, add a second constructor that takes a double as its argument and uses that value as the initial `displayValue`. Use a print statement again — something different from your first constructor — so that you can see when this constructor is being called. When you create objects in BlueJ now, how do you determine which constructor to use?

3. Comment out your no-argument constructor: Put a `/*` above it in your code and a `*/` below it so that the compiler thinks it's all human-readable comments instead of Java code. Try creating objects via BlueJ again and see what has changed. When you're done, un-comment the original constructor and put things back the way they were.

## Methods

Now that we've experimented with constructors, it's time to get some practice writing methods!

1. Our calculator can add, subtract, and multiply, but it can't divide. Add a divide method that's structured like the rest of the methods: It takes one argument, divides the calculator's displayed value by that argument, and sets the display to the resulting value. In other words, when we call divide, we're asking the calculator object to "divide itself" by the new value passed to divide.

2. Constructors gave us one way to specify a calculator's display value, but they only get run when we first construct an object. If we want to change that value after an object has been created, we need to write a "setter" to modify the value. Create a new method called `setDisplayValue` that takes a double as its argument, and changes `displayValue` to the specified value. Your method should have a return type of void since we don't need to return a value.

3. The method you just wrote will change the value, but sometimes we just want to read that value instead. (For example, if we had several calculator objects and wanted to add their values together.) Write a method called `getDisplayValue` that returns the current value of the `displayValue` instance variable. Your new method doesn't need to take any parameters.

## Adding a Memory

Now let's make our calculator fancier by adding the equivalent of a "memory". Imagine a real calculator that has a button that can store the displayed value into a memory, and another button that causes the stored value to be "recalled" (in which case it replaces the value on the calculator's display).

1. If we're going to implement a memory, we need a place to store the memory value. Declare a new instance variable called `memory` right below `displayValue` in your calculator code. It should be of type double as well. Now that your calculator has an additional piece of state, you should also add an assignment statement to each of your constructors that sets this new variable to zero.

2. Next, add a method called `store` that causes the calculator's value to be copied into your new variable. Your method won't need to take any parameters, and it doesn't need to return any values.

3. Now add a method called `recall` that causes the value stored in the calculators "memory" to replace `displayValue`. As before, your method won't need to take any parameters, and it doesn't need to return any values. Once you've gotten this far, test out your new additions and make sure they behave as expected.

4. Your `recall` method wipes out the calculator's display value. If time permits, write a kinder, gentler version of the method that exchanges the two values instead. For example, if the display value was `100` and the value in memory was `2`, after calling this method we'd have `2` as the display value and `100` in memory.



Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407286).
