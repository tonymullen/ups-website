```
cacheable: false
```

**You are encouraged to do these assignments in pairs.**

## Overview

For these two assignments, you'll write a minimal BitTorrent download client. It won't be fully functional, but it will be able to parse a simple .torrent file, get a list of available peers from a tracker, and download the file from a peer. As you work on it, you should get a sense of what would need to be modified in order to provide all the functionality you'd expect from a full BitTorrent client. 

You'll depend heavily on the [unofficial BitTorrent specifications](https://wiki.theory.org/BitTorrentSpecification). Please read these closely. [This link](http://www.kristenwidman.com/blog/33/how-to-write-a-bittorrent-client-part-1/) is also a helpful reference. 

This assignment will be broken up into two consecutive assignments, with the second dependent on the first (I will provide a solution to the first part after the due date, which you may incorporate into your second part if you wish).

### Starter code

Download the [starter code for this assignment](http://mathcs.pugetsound.edu/~tmullen/secure/s18nw/BitTorrentDownloaderStarter.zip) and read it over. You'll notice that there are no explicit indications of where your code should go (although there are many hints). Although I've given you some structure to guide your work, you've got a lot of latitude in how to solve the problem.

You'll see that there are two starter files. One is for the full assignment, and one is a pared down copy intended to allow you to work on the Part 1 assignment without getting distracted by non-functioning starter code elsewhere in the file. Part 1 will ultimately be incorporated into the full program, so you'll eventually want to copy what you've done for Part 1 into the full program. 

### Part 1: The `.torrent` and the tracker

The first part of the assignment deals with parsing the .torrent file and getting peer information from the tracker. This is necessary in order to know which peers you can contact to get pieces of your file. 

This part of the protocol is not actually P2P at all, but rather a conventional client-server request/response interaction. BitTorrent does not insist on a particular protocol for contacting trackers, and both UDP and HTTP are used. For our test torrent, the protocol used is HTTP, and you will use the `requests` Python library to simplify the process of making the GET request to the tracker and including the necessary parameters. 

The screenshot below shows what the command line should look like when you run your code. The top portion indicated by the red rectangle shows the functionality you should implement for Part 1. The rest will come with Part 2. 

<img src="/~tmullen/images/nw/bt-client-annot.png" style="width: 600px;"/>

For Part 1, you'll want to study the Wireshark capture provided in the starter files for the tracker request, shown below. This is a simple HTTP request and response, but getting the correct parameters and formatting them properly is important. 

<img src="/~tmullen/images/nw/ws-req.png" style="width: 600px;"/>

### Part 2: Peer interaction

Once you know where your peers are, it's time to get the data. This part of the assignment is considerably simplified from how it would be done in a more full-featured tracker. In a full-featured tracker, we would make multiple concurrent requests for different pieces of the file to different peers. This would require multiple threads or other ways to handle concurrency, and would also involve a bit more bookkeeping with respect to which pieces we had obtained. Being able to do this is a major strength of BitTorrent, but it's really primarily a benefit for very large files. The test file we're using is a small file, so it should download quickly in any case. 

In our implementation, we'll try to download the whole file (all pieces) from a single peer, cycling through the list of peers in case anything goes wrong until we've found one that provides us with the full file. You can see some of this happening in the screenshot above, where some of the attempts at connections fail. 

Part 2 is all about message passing on a TCP connection. Read the specs about the peer wire protocol and messages. 

The included Wireshark trace (shown in the screenshot below) should be very helpful. Getting the messages formatted and parsed and converting between binary and hexadecimal representations and human readable ascii can be tricky. The trace includes all TCP traffic between my local computer and a peer. You might want to filter it with `bittorrent` to see a more condensed view of the interactions. 

<img src="/~tmullen/images/nw/ws-dl.png" style="width: 600px;"/>

### Doing your own Wireshark traces

You'll be able to run your own code on the campus network without problems, and the Wireshark captures I've provided should show you what you need to know about the protocol's behavior. It may also be worthwhile to run a Wireshark packet capture while downloading the test torrent file with an established BitTorrent client such as [uTorrent](http://www.utorrent.com/). This is prohibited on the campus network, however, so until we're able to make arrangements to work around this, you'll have to run these traces on another network. 

### What's missing?

We're leaving out some significant functionality here, and in many ways we're glossing over BitTorrent's greatest strengths. For one thing, as mentioned above, we're not taking advantage of the data being distributed over multiple peers. Doing so requires using concurrent connections and implementing an algorithm for deciding which peers to choke and unchoke, as we talked about in class. 

Another major bit of functionality we're leaving out is the ability to listen for requests from other peers and provide a way for them to access our data. We *have* registered with a tracker (part 1), so the peers can find out about us, but we aren't handling any incoming requests. Note that nothing in the BitTorrent protocol prohibits this sort of one-way data transfer, but it goes against the spirit of the protocol and is not good practice. Most full-featured clients do not even give the user an option to download in this way. 

To implement a full client with all this functionality, it would probably be best to work with multiple virtual machines, so that we could have complete control over the tracker and multiple peers simultaneously, and be able to see what the full network was doing at all times. For the purposes of this assignment, it's enough to assume that the file is well-seeded (i.e. there are enough peers out there providing the full file) and that the tracker is responsive and up to date.  

## Submission

Put all the files for an assignment together in a `.zip` archive to submit them on Moodle. Include your code and a screenshot of your terminal after having run the program (it should look similar to mine above for Part 2, and include only the first portion for Part 1). Both Part 1 and Part 2 should be fully functional and run without errors. Part 2 should include Part 1's functionality, including what's printed to the screen. 

Part 1 should be submitted [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=444574).

Part 2 should be submitted [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=444575).

Each assignment will be accepted for partial credit up to 4 days late, with a penalty of 20% per day.
