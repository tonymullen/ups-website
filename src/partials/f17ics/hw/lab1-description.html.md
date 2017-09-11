```
cacheable: false
```

**If you plan to use your own laptop</span>, create a folder called <span class="codefont">cs161</span> somewhere on your computer. This is where you will keep all of the labs and homework assignments for this class. Now download BlueJ onto your own laptop by going to <http://bluej.org>**


**If you plan to use a lab machine</span>, you'll need to bring a USB flash drive to lab. On your USB drive, create a folder called <span class="codefont">cs161</span>. This is where you will keep all of the labs and homework assignments for this class. The lab machines already have BlueJ installed.**

### Writing/compiling/running a hello world in BlueJ

1. Open BlueJ on your machine.

2. Create a new Java project

    1. Go to <span class="codefont">Project > New Project</span>. This will open up a dialogue box.
    <img src="/~tmullen/images/ics/lab1_new_project_dialogue_box.png" style="width: 80%;"/>

    2. You may need to navigate to the <span class="codefont">cs161</span> folder you created.

    3. In the text field labeled "File:" type <span class="codefont">lab1</span>. This is the name of the Java project you are creating.

    4. Hit the <span class="codefont">Create</span> button and you should see a new empty Java project:
    <img src="/~tmullen/images/ics/lab1_new_java_project.png" style="width: 80%;"/>

		If you navigate to your <span class="codefont">cs161</span> folder on your system (i.e. using Finder on Mac or Windows Explorer on Windows) you will notice that BlueJ has created a new folder called <span class="codefont">lab1</span> and inside of this new folder will be all of the Java code that you write for this lab.

3. Create a new Java class called <span class="codefont">Test</span> by clicking on the <span class="codefont">New Class...</span> button in the left sidebar. A box icon with the name <span class="codefont">Test</span> should appear in the Project window. This icon represents your Java class. The stripes mean that the code in your class has not been compiled yet. That's okay.

4. Double click on this icon to open up the Editor.

5. BlueJ automatically fills your class with code. Go ahead and delete all of this stuff. Start with an empty file.

6. Type the following code into the Editor:

        public class Test{
           public static void main(String[] args){
               System.out.println("This is a test of the emergency broadcast system!");
             }
           }

7. Compile your code by clicking the <span class="codefont">Compile</span> button in the left sidebar of the Project window. The stripes in the <span class="codefont">Test</span> box should now go away unless you have an error in your code. *If your code doesn't compile, call me or one of the student TAs over.*

8. Run your code by right-clicking on the <span class="codefont">Test</span> class in the Project window. Choose the option for the <span class="codefont">main</span> method. This will open a dialogue box. Select <span class="codefont">Ok</span>.

    <img src="/~tmullen/images/ics/lab1_run_main.png" style="width: 100%;"/>

9. Congratulations! You have just written, compiled, and run your first Java application! Sit for a few seconds and appreciate your accomplishment.

10. Let's go a little deeper: spend some time thinking about the connection between the code you wrote and what appeared on the screen. In particular, what line(s) of code do you think are responsible for the text that appeared on the screen?

11. Now it's time to experiment. Once you think you understand the connection between your code and what appears on the screen, test your guess by modifying your code to make some other text appear on the screen. You could print your name, a saying, a favorite quote, etc. Compile and run your code.


### Submitting assignments on Moodle

You will be submitting the <span class="codefont">lab1</span> folder that BlueJ created for you. This folder should contain your <span class="codefont">Test</span> class among other things. Here are the instructions for how to submit assignments in this class:

1. **Rename the folder**  To submit your assignment, navigate to your <span class="codefont">cs161</span> folder using Windows Explorer (on Windows) or Finder (on Macs). Rename the folder that contains your Java code using the following convention:

    <span class="codefont">**labXX\_firstName\_lastName**</span> for lab assignments

    <span class="codefont">**hwXX\_firstName\_lastName**</span>  for homework assignments

    where "XX" is the number of the lab or homework assignment ("1", "2", "3", etc.). To rename a folder on a Windows machine, right-click and choose "Rename". To rename a folder on a Mac machine, click on the folder and hit the enter key.

2. **Zip the folder** After you have renamed your folder,  right-click on the folder and select "Send to > Zip file" (on Windows) or "Compress" (on Macs).  This will generate a zipped (.zip) file.

3. **Drag zipped file into Moodle** Log into Moodle and navigate to [the submission page for this lab](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407280). Click on the appropriate link and then click "Add submission". This will allow you to drag and drop your zipped file into the Moodle window.


*Good job, you've completed your first lab!*
