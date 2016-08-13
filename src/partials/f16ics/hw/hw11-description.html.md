```
cacheable: false
```

## A university course management tool

This assignment will give you a bit more practice with several of the features of Java we've worke with so far. The particular focus here is on putting together multiple classes that depend on others.

### Objective

This exercise is based on Programming Projects 7.2 and Project 7.3 in the text book, which are in turn based on the `Student` class from listing 7.6 in the book (page 318). You can find this class and the `Address` class it depends on in the [starter file](http://mathcs.pugetsound.edu/~tmullen/ics/CourseStarter.zip) for this assignment.

For the assignment, do the following:

* Modify the `Student` class to keep a record of three exam scores. You may represent the exam scores however you think is best, but please *add comments explaining your reasons for representing them one way or another*. Provide or modify the following methods:
  * `setTestScore` that accepts two parameters: the test number (1 through 3) and the score (between 0 and 100)
  * `getTestScore` that accepts the test number parameter and returns the score for that test
  * `average` that returns the student's average score for the three tests
  * `toString` should be modified such that it includes test scores and average in the description of the student.
  * `Student` constructor should be overloaded such that you can either create a student object with parameters for the three test scores *or* create a student without test scores and have the scores' values initializes as zeros. We talked about method overloading in class a few weeks ago, but read section 7.8 to refresh your memory.

* Create a class called `Course` that represents a course taken at a school. The course should include an `ArrayList` of `Student` objects representing the students enrolled in the course. Provide the following methods:
  * `Course` the constructor should accept a string with the name of the course.
  * `addStudent` that accepts a `Student` object and adds it to the list of enrolled students.
  * `average` computes and returns the average score of all students' tests.
  * `roll` should print out a list of the students in the course.

* Create a driver class with a `main` method that creates an instance of a `Course` object, populates it with a few students, prints out the roll for the course, and prints the overall course test average.


Submit the file at the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340439).
