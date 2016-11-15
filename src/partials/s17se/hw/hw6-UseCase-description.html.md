```
cacheable: false
```
## **Due Mon 10/10**

## Overview

In this assignment you will be writing a *Use Case Specification* for your system---a method of documenting requirements commonly used in "Plan and Document" process models. You will be formally documenting a use case and its scenarios for one (1) piece of functionality described by one of the user stories you developed as part of Project Iteration 0.2, as well as identifying a few non-functional requirements. You will then briefly compare this process for documenting requirements with the Agile approach used with the project.

This means that you'll be writing requirements for this piece of functionality *twice*. This is deliberate. For one thing, this will help you make sure you have a really clear understanding of your project's functionality, but it will also give you a chance to compare activities from different approaches to software engineering. This is really the only "Plan and Document" style work you'll do in this class, but it's an important thing to touch on.

## Objectives

* Write a formal Use Case Specification
* Practice creating technical documentation
* Compare different activities for recording requirements

## Assignment details

Pick one of the user stories you developed as part of Project Iteration 0.3. You will likely need to use a small number of related user stories to cover a complete Use Case with its different scenarios. Make sure that your chosen user stories don't overlap with those chosen by other members of your team--the goal is that in the end your team will have use cases that give decent coverage of the system.

Write a detailed Use Case Specification describing the functionality of your system that is represented by your chosen user stories. This use case will follow the modified version of [Cockburn's template](http://alistair.cockburn.us/get/2465) for a [fully dressed](https://en.wikipedia.org/wiki/Use_case#Fully_dressed) use case that is described below.

You can find more information about writing Use Cases online; for example, [this write-up](http://agile.csc.ncsu.edu/SEMaterials/UseCaseRequirements.pdf) has extensive, good examples of event flows.

* **Name:** A descriptive name for the use case. Names should be short and reflect the <em>goal</em> of the user. Use clear active verbs in present tense, such as "Buy House" in the Monopoly example.
    * The reader should understand the goal of the use case just from the title: for example, instead of "Process Invoices" you might use "Collect Late Payments from Customers".
* **Brief Description:** A short (1-2 sentence) prose description of what the use case is about. This can come directly from your user stories.
* **Actors:** List and name the actor(s) involved in the use case. Remember that an actor is a *role* for a person or machine that interacts (exchanges information) with the system. Give actors consistent names.
* **Preconditions:** Any special conditions that need to have been met before the use case can occur. The existence of these conditions implies that another use case somewhere can cause them to be true.
    * These are conditions for the system's usage, as a way of situating this particular use case within the overall system usage; think about what kinds of activities or states must have occured before this use case. "The user is authenticated" is a common precondition. "The user can connect to the internet" probably doesn't tell us anything.
    * It is quite possible for there not to be any preconditions on a use case!
* **Flow of Events:** This is the bulk of the use case write-up. This is a list of events that occur in this use case (I recommend you write them as a list, rather than in prose).
    * Include both the **Basic Flow** and any **Alternative Flows**. The Basic Flow is your "happy path", and Alternative Flows would be the "sad paths" (you can think of them as Exceptions). You are welcome to use *subflows* for readability.
    * Write each event/step in natural language (not code)--the goal is readability!
    * Describe what the actors *do* in each step, but not how they do it! Remember, in each step the actors are taking an action to complete their goal.
      * "The Buyer selects a product" is good. "The Buy clicks on the product's name in the drop-down list on the left" is less good. The idea is to list what the system needs to do, but not add in assumptions about how it needs to be built (or what it needs to look like).
    * **Alternative flows** are written just like the **Basic Flow** (as a list of steps the Actors take), but start when something goes "wrong." These steps should either take the system back into the Basic Flow of events, or to the end of the use case.
* **Postconditions:** Any details about the state of the system at the end of the use case. This is a good place to explicitly state the outcome of the user case. If the use case has caused some permanent change (that might be a precondition for a future use case), be sure to note it!
    * Again "the user is authenticated" is a common postcondition. "The book has been purchased and the order sent to the warehouse" is another good example.

Note that you are **not** required to include a UML Use Case diagram (though you of course can if you want!)

## Comparison

In addition to your Use Case Specification, include a short (~2 paragraph) written discussion of your experiences writing User Stories and Use Case Specification. You should draw on your project's User Stories and Use Cases as examples! You might consider:

* Which is more useful for internal developers (i.e., team members?)
* Which is more useful for external developers (i.e., if you were bringing in a new team member halfway through)?
* Which is more useful for the customer?
* Which is a better representation of what the system will do (and what makes it better)?
* Overall, what are the advantages and disadvantages of using User Stories vs. Use Case Specifications?

Other points of reflection are of course welcome! The goal is to evaluate the benefits and drawbacks of these different forms.

## Grade weighting & lateness

This assignment has a weight of 1 within the individual assignments portion of your overall grade. This assignment will be accepted for partial credit up to 4 days late, with a penalty of 20% per day.

## Submitting

Please take some time to **proofread** and revise your specification--iterate your writing!. Think of this as a professional document, something that you would show to your boss!

Submit your specification in **pdf format** on the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=336598). **Do not submit .doc, .txt, or any other format files.**

I also encourage you to post it publically on Piazza so that (a) you can share your specification with your team mates, and (b) so that you can share with others examples of how to write these specifications.

## Grading

This assignment will be graded out of 10 points:

* [1pt] Have included all parts of the Use Case Specification
* [1pt] You have appropriately named your use case and its Actors
* [1pt] Preconditions and Postconditions are descriptive and usefully informative
* [4pt] The Basic Flow of events effectively describes the system usage
* [1pt] You have included Alternative Flows as appropriate
* [2pt] You have included a comparison between your User Stories and Use Case Specification
