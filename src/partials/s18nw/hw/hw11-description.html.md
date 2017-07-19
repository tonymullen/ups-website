```
cacheable: false
```

## Overview

In this assignment, you will implement your own reliable transport protocol on the Seattle network. As with assignments 8 and 9, you're encouraged to do this assignment in **pairs**.  

The assignment description is [here](https://seattle.poly.edu/wiki/EducationalAssignments/StopAndWait). Read the instructions closely and download the [starter code for this assignment](http://mathcs.pugetsound.edu/~tmullen/secure/s17nw/StopAndWaitStarter.zip) that I've provided. 

Most of the code you'll write will be in the `reliable.repy` file. You will make fairly small changes to `reliable_client.repy` and `reliable_server.repy`. You'll need the Seattle library code, which can be downloaded [here](https://seattleclearinghouse.poly.edu/download/flibble/). Extract the archive. The extracted directory is called `seattle` and inside this directory is a directory called `seattle_repy` with the important scripts. **Wherever you place this directory will be your `<repy_path>`**. 

You'll run your client and server programs on Seattle Clearinghouse nodes. Before doing so, however, you'll need to pre-process them to include the library functions defined in `reliable.repy`. This is done by running the `repypp.py` script on your scripts, like this (where Python2 is whatever command executes Python 2.7 on your system):

    python2 <repy_path>/repypp.py reliable_client.repy reliable_client

This generates an output file called `reliable_client` (note the lack of extension). Take a look at this file in your text editor to see what it's composed of. It's essentially just the original client file with the library functions appended. You'll do the same for the server program. **Don't forget that you need to do this before uploading and executing your programs whenever a change is made.**

### Getting started with Seattle

We will be going through the process of getting set up on Seattle Clearinghouse and using the `repy` tools in class. You will need an account and API key on Seattle Clearinghouse. This is managed via the web interface [here](https://seattleclearinghouse.poly.edu/html/login).

In order to run your code on remote vessels, you'll need to get some vessels via the web interface at the Seattle Clearinghouse. You will need to do this *at least* once each time you sit down to do any coding, as they expire within a couple of hours. It's likely you'll have to do it more often than that. You may not be able to get 10 vessels at once in the environment you want them (LAN or WAN). You will only ever need two working vessels, but it helps to have a few to choose from. Get as many vessels as you can. 

Once you've got some vessels, you should open up one or more terminals on your computer (I prefer to have two terminals open running the Seattle shell to clearly distinguish where I'm running my client and my server, and then one more terminal open where I can run the pre-processing script as I make changes to my code). 

In order to run things in your vessels, you'll run the Seattle shell:

    $ python2 <repy_path>/seash.py

This starts up the Seattle shell. [This tutorial](https://seattle.poly.edu/wiki/RepyTutorial), which we'll do (at least partially) in class, guides you through the process of working with the repy tools. If you're not in class when we do this, you'll want to follow it on your own. Below is a sample session showing the process of browsing and listing vessels. **The API keys created in the Seattle Clearinghouse web interface must be in the working directory.***

    !> loadkeys tmullen
    !> as tmullen
    tmullen@ !> browse
    ['130.194.252.9:1224', '139.80.206.132:1224', '128.10.18.53:1224', '128.223.8.114:1224', '133.69.32.133:1224', '128.112.139.19:1224', '202.141.161.44:1224', '206.117.37.7:1224', '142.103.2.2:1224']
    Added targets: %2(142.103.2.2:1224:v6), %9(133.69.32.133:1224:v4), %6(139.80.206.132:1224:v8), %8(206.117.37.7:1224:v10), %4(130.194.252.9:1224:v4), %3(202.141.161.44:1224:v8), %7(128.10.18.53:1224:v10), %1(128.223.8.114:1224:v8), %5(128.112.139.19:1224:v4)
    Added group 'browsegood' with 9 targets
    tmullen@ !> on browsegood
    tmullen@browsegood !> list
    An error occurred: Socket closed
    Affected vessels: 133.69.32.133:1224:v4.
     ID Own                      Name     Status              Owner Information
     %1         128.223.8.114:1224:v8 Terminated                               
     %2           142.103.2.2:1224:v6      Fresh                               
     %3        202.141.161.44:1224:v8      Fresh                               
     %4         130.194.252.9:1224:v4      Fresh                               
     %5        128.112.139.19:1224:v4      Fresh                               
     %6        139.80.206.132:1224:v8      Fresh                               
     %7         128.10.18.53:1224:v10      Fresh                               
     %8         206.117.37.7:1224:v10      Fresh                               
    Added group 'listFresh' with 7 targets 'listTerminated' with 1 targets

### Implementing stop-and-wait in repy

Refresh your memory about how [the stop and wait (alternating bit) protocol](https://en.wikipedia.org/wiki/Stop-and-wait_ARQ) works. The client will send datagrams headed by a `0` or a `1`, and the server will ACK the datagrams to let the client know when it's safe to send the next one. 

The [Repy API](https://seattle.poly.edu/wiki/RepyApi) page will be useful for keeping track of what functionality is available and how to use it. Repy is essentially a small subset of Python, so you can assume that standard Python syntax (dictionaries, arrays, loops, etc.) are available, but beyond that you're limited to the Repy API functions.

As it says in the instructions, remember that your callbacks and handlers are threaded, and may access global data simultaneously. I've already set up a global lock object for you using `getlock()` (this also demonstrates how to use the `mycontext` dictionary to hold global values). You'll want to call `.acquire()` and `.release()` on this lock before and after making changes to global values in callback functions. 

This is a fairly open-ended assignment. There are some hints in the starter files for how you might want to proceed, but you'll have to do some experimentation and come up with your own solution. 

## Submission

In your submission, provide the complete code for the `reliable.repy`, `reliable_client.repy` and `reliable_server.repy` as well as a report of your evaluation of the implementation, as described on the assignment page. 

Submit this assignment by uploading your files to the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=400171).

Each assignment will be accepted for partial credit up to 4 days late, with a penalty of 20% per day.
