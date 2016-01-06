```
cacheable: false
```

## Overview

For this class you will work in groups to develop medium-sized software projects over the course of the semester. The nature of each project will be determined by the group, and we will discuss possibilities in class.

All the projects will be "Software as a Service" (SaaS) systems such as web applications. If the project is conceived of as a mobile application, there are several possibilities of how best to implement this in the context of the class, but it may require some additional work to carry out.

You  will be implementing the systems following Agile methodology (which we will study
  further in class). This means that there will be multiple short iterations to be turned in, each with their own requirements and due dates.

## Iteration 0

This preliminary iteration will involve setting up teams and doing a lo-fi "prototype" iteration (without code) to focus on the design.

### Iteration 0.0

**Due Date: Fri 9/11**

*Divide into teams of 5 students (and one team of 4 students)*

Talk to other students and decide who you think you would work well with, as it's a long project. It's a good idea to form groups with a mix of skills and experience so as to better distribute your efforts. I recommend using [Piazza](https://piazza.com/pugetsound/fall2015/csci240/home) to coordinate your team building. If you need any help finding a team contact me *before* the deadline.

Once  you've formed a group, pick a **Team Name** we can refer to each team by!

**Submit** this iteration by having one person create a post on Piazza introducing your team and listing the members (first and last names please!). Tag the post with `#Iter0.0`.

### Iteration 0.1 (2 pts)

**Due Date: Fri 9/18, 11:59 PM**

*Settle on the project concept and choose your on-site customers*

Discuss ideas and possibilities for projects and settle on one of an appropriate size and complexity. Consider what the user's needs are and make everyone understands the goals of the project. The decisions you make here will feed into Iteration 0.2 and your Requirements assignment.

Choose two members of the team to serve as *on-site customers*. These are members of an Agile team who are tasked with representing user/client/customer needs. Other members may contribute suggestions at any time, but these two serve as the authority on the user perspective. If possible, these members should have some real connection to the people who would be using the software.

**Submit** this iteration by having one person create a post on Piazza informally describing the goals of the software and who it's for, and giving the names of your on-site customers. Tag the post with `#Iter0.1`.

### Iteration 0.2 (10 pts)

**Due Date: Fri 10/2, 11:59 PM**

*Work with the customers and generate user stories*

Write a short (2 paragraph max) summary of the main customers' need and how your application will meet that need. Explain the problem, then explain your solution. This summary should act as a "blurb" describing your project.

Create at least 5 user stories on index cards (or quarter-pages). User stories should be in Connextra format:

1.   Feature name
2.   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;As a [kind of stakeholder],
3.   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;So that [I can achieve some goal],
4.   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I want to [do some task]

Develop these user stories together so that everyone is on the same page! User stories should be [INVEST and SMART](http://xp123.com/articles/invest-in-good-stories-and-smart-tasks/). Note that you will also use the information from these customer discussions to complete Hwk 3.

Submit this iteration by creating a post on Piazza containing your user stories (tag the post with #Iter0.2). You may either submit photos of your index cards or type up the stories.

### Iteration 0.3 (10 pts)

**Due Date: <span style="color:red">Mon</span> 10/12, 11:59 PM**

*Create lo-fi mockups and storyboards corresponding to at least 4 of your user stories.*

Develop lo-fi mock-ups and prototypes of 4 different user stories. These should be paper prototypes and sketches, as they are easier to get feedback on. Once you've gone through a round of paper mockups, you can then make digital prototypes if you wish.

Finally, to complete Iteration 0, put all of your user stories on Pivotal Tracker. You will have received a link to a Pivotal Tracker account for your team's use. The professor will have viewing access to these.

**Submit** this iteration by creating a private post on Piazza with your lo-fi mockups and storybook sketches (I already have access to your Tracker); tag your post with #Iter0.3. You should scan (or clearly photograph) your mockups and attach them as images to your post.


### Iterations 1-4 (25 pts each)

**Iteration 1 Due Date: Mon 10/26, 11:59 PM**

**Each team member must** fill out the Iteration 1 Team Evaluation Survey giving scores to each team member (including yourself). These scores will be used to normalize grades among the team members. You can find this survey on the Moodle site for this class. 

**Iteration 2 Due Date: Mon 11/9, 11:59 PM**

**Iteration 3 Due Date: Mon 11/23, 11:59 PM**

**Iteration 4 Due Date: Wed 12/16, 4:00 PM**

First, create a new repository for your team project on Github and name the repo CS240-YourTeamName (substituting your team name). Do not initialize the repository with a readme.

From the command line in complete, clean local installation of mean.js, add a new remote with the address of the repository you just created. Read this:

[https://help.github.com/articles/adding-a-remote/](https://help.github.com/articles/adding-a-remote/)

Don't use the name "origin" for this remote. Leave that for the original mean.js repository. Use a name like "github".

After adding a remote, stage your changes with git add, commit, and push them to this remote with

git push github master

Check your repository to make sure the entire application code has been properly uploaded.

Each member should then clone the repository locally, and each member should make and commit some change (editing the README is a good place to start) in order to show me that everybody is able to commit. Each member should also test their local cloned code to ensure that it runs properly on their own machine.

## For all iterations

For each of these iterations, you will use Tracker to identify a set of user stories to work on during the iteration (and who will work on each). You will then use techniques from BDD and TDD to implement these user stories.

As you proceed, stories may be re-prioritized and new stories may be added.

Remember, you should be committing code regularly, not only when you're tagging iterations. Don't be shy about committing, and always be sure you're working on an updated local repository, in case other members of the team have made contributions. Make sure you are logged in under your own name when you make commits. This helps me to know how much code each member of the team contributed.

At the end of each iteration, I will check the following:

* **Development Practices [6pts]**
   *   Make sure that all your code and tests--including Mocha and Jasmine tests--have been pushed to Github. Tag your git repository revision with iteration-i, where i is the iteration number. To tag the current revision, use git tag -a iteration-1 -m "<commit message>" (for Iteration 1).
      *  **Warning:**  you must explicitly push your tags with the command git push [origin] --tags. Please double-check that you can checkout the tag from your Github repository before the deadline!
   *  I should be able to run your tests from a fresh clone using:
        <pre>
        git checkout iteration-i
        grunt
        </pre>
   *  Your Pivotal Tracker should be correctly used and up-to-date. Current   stories should be started, and completed stories should be finished. You should use releases and epics when appropriate.
* **Test Cases and Scenarios [6pts]**
   *   Your system should include test cases (either via Mocha or Jasmine) automatically demonstrating its functionality.
   *   Tests should ideally cover both the "happy path" and the "sad path" of each user story that your Tracker indicates is completed.
   *   All tests should either pass or be pending. I should get all green and yellow, no red!.
* **Design and Deployment [10pts]**
   *   Your production application is deployed (e.g., to Heroku), and the production deployment is up to date (all completed stories should work there).
   *   Stories should represent sufficient progress for the iteration.
   *   Your production application is usable (following UI principles).
* **Admin [3pts]**
   *   You have created a submission post on Piazza for this iteration (see below)
   *   All team members have completed the Team Evaluation Survey

**Submit** each iteration by creating a private post on Piazza with a link to your Tracker, your Github repository (if different than the one I set up), and your Heroku deployment if there is one; tag your post with the iteration number (e.g., #Iter1). Also include a short summary noting which user stories have been completed this iteration.

* Please do this even for your final product (Iteration 4).

**Each team member must** fill out the Iteration i Team Evaluation Survey (where i is the number of the iteration) giving scores to each team member (including yourself). These scores will be used to normalize grades among the team members.

### Final Presentation (20 pts)

**Due Wed 12/16, 4:00 PM**

In addition to the implementation, your team will be formally presenting your project during our allotted final period (on Wednesday, Dec 16).

Presentations should be about 20 minutes long, with all team members participating. Your presentation should pitch your project (e.g., what is the problem? how does your application solve that problem), walk us through major user stories (and major implementation architecture, if appropriate), and reflect briefly on the development process (e.g., what aspects of the development process worked well or poorly? What, if anything, would you do differently?). Your team should be ready to answer questions after your presentation.

* Pretend you're "selling" your product--why should your customer choose to buy your implementation?

* Each team member must talk for *at least* 2 minutes. Team members who do not participate in the presentation will receive a 0.

Presentations will be graded on the following criteria:

**Content and Organization**

* [2pt] Organized, with strong introduction and conclusion
* [2pt] Clear explanation of the motivation for the project (including major User Stories)
* [2pt] Explanation of how your system solves the customer's "problem"--sell your product's features!
* [2pt] An easy-to-follow walkthrough and demonstration of the system
* [2pt] Insightful reflection on the development process

**Speaking and Professionalism**

* [2pt] Appropriate use of time (about 20 minutes)
* [2pt] Engages with the audience (verbally and non-verbally)
* [2pt] Eye contact with the audience (do not read your slides!)
* [2pt] Clear diction: speak slowly and loud enough to hear, and avoid "ums" or other distractors (Do as I say, not as I do!)
* [2pt] Able to respond to questions

A note of advice: there are few activities I can think of where the benefits of practice are more immediate and striking than in public speaking. Every single time you go through your presentation from beginning to end beforehand will make your performance better for the audience and more comfortable for you.
