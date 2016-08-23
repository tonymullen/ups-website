```
cacheable: false
```

## Heart Health

Your *heart-rate* is defined as the number of contractions (i.e. beats) of your heart per minute. (A good place to feel your heart beat is on your neck right under the corner of your jaw. If you press two fingers there, and count the number of beats in a single minute, this gives you an estimate for your heart rate).

Your *resting heart rate* is your heart rate when you have been resting -- i.e., sitting or lying for at least 20 minutes.

Your *maximum heart rate* is the highest heart rate you can achieve without hurting yourself! One way to find your maximum heart rate is through exercise. For our purposes though, we'll just define the maximum heart rate as

max_heart_rate = 208 - 0.7 * age

which is an equation commonly used in medicine.


When you work out, your heart rate falls within different *training zones*. You can think of these training zones as a percentage of your maximum heart rate. Thus, 100% means you're exercising as hard as you can!


* **Zone 1 (50-60%):** This zone should feel super easy -- almost like you didn't work out at all.
* **Zone 2 (60-70%):** This is the "average effort" level where it is still possible to hold a conversation.
* **Zone 3 (70-80%):** This is the "above average effort" level where you can only talk in one- or two- word answers.
* **Zone 4 (80-93%):** This is the "hard effort" level. Your breathing is labored, your arms and legs feel heavy, and you can't sustain the pace for much more than an hour (at best).
* **Zone 5 (93-100%)]:** This is the "all out" level. You can sustain this pace for a few seconds to maybe five minutes.


The great thing about training zones is you can use them to help plan your work out. Let's say your goal is to maintain good heart health. Then, ideally, you'd want to spend most of your workout within zone 2. So the question is, what range of heart rates corresponds to zone 2? The purpose of this assignment is to answer this question.

## Project Description

This assignment asks you to create a Java class that takes a users age and resting heart rate, and computes the range of heart rates that correspond to each of the zones above.  

There are three steps in order to compute the range of heart rates for each zone:

1. Compute the maximum heart rate using the equation given above.
2. Subtract the resting heart rate from the maximum heart rate. This is called your heart rate *reserve*.
3. Multiply your reserve by the corresponding percentage and then add this to your resting heart rate:
    rest_heart_rate + reserve * X%

For example, suppose you are 20 years old and your resting heart rate is 70 beats per minute. Here are the three steps you would go through to figure out the range of heart rates for zone 2:

* Your maximum heart rate is 208-0.7*20 = 194 bpm.
* Your reserve is 194-70 = 124 bpm
* At 60%, your heart rate should be 70 + 124 * .6 = 144 bpm. At 70%, your heart rate should be 70 + 124 * .7 = 156 bpm.

Thus, if you want to work out at zone 2, your heart rate should be between 144 and 156 bpm.

## Getting Started

Download the [starter code for this assignment](http://mathcs.pugetsound.edu/~tmullen/ics/hw2.zip) from the course webpage. It's very important that you move the starter code into the <span class="codefont">cs161</span> folder you created. Unzip the starter code, and you'll find a folder called <span class="codefont">hw2</span> that contains a BlueJ project.

1. Open the BlueJ project. Inside, you'll see a class called <span class="codefont">TrainingZones</span>. There is already code in this class for reading the age and resting heart rate from the keyboard.

2. Finish the <span class="codefont">TrainingZones</span> class. In particular, given a user's age and resting heart rate, compute the range of heart rates that corresponds to each zone. Here is an example of your program should produce:

<img src="/~tmullen/images/ics/training_zones_output.png" style="width: 80%;"/>

3. Before submitting your assignment, make sure you have commented your code. In particular,  place a block comment before the class declaration that contains your name and a brief description of the class.
        /*
         * Name
         * Brief description of what the class does
         */


## Submitting the assignment

Place all files you created for this assignment in a directory together called <span class="codefont">hw2</span> and create a zip file from the directory. Upload the zip file to the [Moodle page for this assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340428).

You should make sure you programs are working before submitting them.
Make a note in the comments if you had trouble getting the program to work.
