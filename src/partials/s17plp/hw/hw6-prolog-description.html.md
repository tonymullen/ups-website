```
cacheable: false
```

Here's another fun constraint satisfaction problem, this time slightly more complex than the ones you've seen so far. This is a variant of a well-known style of logic problem.

Write a Prolog program to solve the following problem. You should be able to query the problem with the predicate `pie_eater/1` and have it instantiate the argument variable with the correct answer.

I recommend making heavy use of lists for this problem. You may find [`member/2`](http://www.swi-prolog.org/pldoc/man?predicate=member/2) and  [`permutation/2`](http://www.swi-prolog.org/pldoc/man?predicate=permutation/2) to be useful built-in functions for this assignment.

### The International Neighborhood Hobbyists Puzzle

There are 5 houses in five different colors.

In each house lives a person with a different nationality.

These five homeowners each listen to a certain type of music,
enjoy a certain hobby and like a certain food.

No two homeowners listen to the same music, have the same hobby, or like the same food.

**The question is: Who likes pie?**

The Irish person lives next to the yellow house.

The person who likes donuts lives next to the person who enjoys embroidery.

The person who enjoys train spotting lives next to the one who likes pizza.

The person who enjoys pachinko likes beets.

The Czech lives in the purple house.

The person living in the center house listens to grunge.

The person who enjoys glassblowing listens to hip hop.

The American likes tofu.

The Dutch person listens to J-Pop.

The pink house's owner listens to country.

The owner of the green house enjoys embroidery.

The Irish person lives in the first house.

The pink house is on the left of the orange house.

The Japanese person enjoys gardening.

The person who enjoys train spotting has a neighbor who listens to jazz.
