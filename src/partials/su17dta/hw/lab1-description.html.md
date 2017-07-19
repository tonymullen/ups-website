```
cacheable: false
```

**If you plan to use your own laptop, create a folder called `cs161` somewhere on your computer. This is where you will keep all of the labs and homework assignments for this class. Now download BlueJ onto your own laptop by going to <http://bluej.org>**


**If you plan to use a lab machine, you'll need to bring a USB flash drive to lab. On your USB drive, create a folder called `cs161`. This is where you will keep all of the labs and homework assignments for this class. The lab machines already have BlueJ installed.**

### Writing/compiling/running a hello world in BlueJ

1. Open BlueJ on your machine.

2. Create a new Java project

    1. Go to `Project > New Project`. This will open up a dialogue box.
    <img src="/~tmullen/images/ics/lab1_new_project_dialogue_box.png" style="width: 80%;"/>

    2. You may need to navigate to the `cs161` folder you created.

    3. In the text field labeled "File:" type `lab1`. This is the name of the Java project you are creating.

    4. Hit the `Create` button and you should see a new empty Java project:
    <img src="/~tmullen/images/ics/lab1_new_java_project.png" style="width: 80%;"/>

		If you navigate to your `cs161` folder on your system (i.e. using Finder on Mac or Windows Explorer on Windows) you will notice that BlueJ has created a new folder called `lab1` and inside of this new folder will be all of the Java code that you write for this lab.

3. Create a new Java class called `Test` by clicking on the `New Class...` button in the left sidebar. A box icon with the name `Test` should appear in the Project window. This icon represents your Java class. The stripes mean that the code in your class has not been compiled yet. That's okay.

4. Double click on this icon to open up the Editor.

5. BlueJ automatically fills your class with code. This is often helpful, but we don't need it now. Take a look at it, then go ahead and delete all of this stuff. Start with an empty file.

6. Type the following code into the Editor:

        public class Test{
           public static void main(String[] args){
               System.out.println("This is only a test!");
             }
           }

7. Compile your code by clicking the `Compile` button in the left sidebar of the Project window. The stripes in the `Test` box should now go away unless you have an error in your code. *If your code doesn't compile, call me over.*

8. Run your code by right-clicking on the `Test` class in the Project window. Choose the option for the `main` method. This will open a dialogue box. Select `Ok`.

    <img src="/~tmullen/images/ics/lab1_run_main.png" style="width: 100%;"/>

9. Congratulations! You have just written, compiled, and run your first Java application! Sit for a few seconds and appreciate your accomplishment.

10. Let's go a little deeper: spend some time thinking about the connection between the code you wrote and what appeared on the screen. In particular, what line(s) of code do you think are responsible for the text that appeared on the screen?

11. Now it's time to experiment. Once you think you understand the connection between your code and what appears on the screen, test your guess by modifying your code to make some other text appear on the screen. You could print your name, a saying, a favorite quote, etc. Compile and run your code.

12. Download the book projects zip file from [http://www.bluej.org/objects-first/](http://www.bluej.org/objects-first/). Open the project called `figures` from the Chapter 1 directory. Look at the code for the various shapes. Follow the instructions in sections 1.2-1.5 to create various shapes. Create a scene with a yellow circle, a magenta triangle and a green square and position them vertically.

13. Let me know if you finish this during the lab period and I'll give you some more to do!


### Submitting assignments on Moodle

You will be submitting the `lab1` folder that BlueJ created for you. This folder should contain your `Test` class among other things. See below for instructions on how to submit assignments in this class. These instructions are also on your lab syllabus:

1. **Rename the folder**  To submit your assignment, navigate to your `cs161` folder using Windows Explorer (on Windows) or Finder (on Macs). Rename the folder that contains your Java code using the following convention:

    `labXX_firstName_lastName` for lab assignments

    `hwXX_firstName_lastName`  for homework assignments

    where "XX" is the number of the lab or homework assignment ("1", "2", "3", etc.). To rename a folder on a Windows machine, right-click and choose "Rename". To rename a folder on a Mac machine, click on the folder and hit the enter key.

2. **Zip the folder** After you have renamed your folder,  right-click on the folder and select "Send to > Zip file" (on Windows) or "Compress" (on Macs).  This will generate a zipped (.zip) file.

3. **Drag zipped file into Moodle** Log into Moodle and navigate to [our course page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=334820). In Moodle, you will see links for each lab and homework assignment. Click on the appropriate link and then click "Add submission". This will allow you to drag and drop your zipped file into the Moodle window.


*Good job, you've completed your first lab!*
