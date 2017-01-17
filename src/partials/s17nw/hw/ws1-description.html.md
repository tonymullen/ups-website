```
cacheable: false
```

## Introduction to Wireshark

In this course, you'll do a lot of exploring what happens in your own machine over its own network connections. One important tool for doing this is called a *packet sniffer*. In this class we'll use an open source packet sniffer called [Wireshark](https://www.wireshark.org/) (Technically speaking, Wireshark is a packet analyzer that uses a packet capture library in your computer). Wireshark is available for both OS X and Windows. The first thing you'll need to do is download and install Wireshark on your own machine. Let me know if you don't have a machine that you can install Wireshark on.

Wireshark is well documented, with documentation available including a [user guide](https://www.wireshark.org/docs/wsug_html_chunked/), online [man pages](https://www.wireshark.org/docs/man-pages/), and an extensive [faq](http://www.wireshark.org/faq.html). Be sure to make use of these resources.

For the in-class portions of this lab assignment, you can work in pairs, but please turn in the results individually.

### Getting started with Wireshark

In this first Wireshark lab, you’ll get acquainted with Wireshark, and make some simple packet captures and observations.

As the name suggests, a packet sniffer captures (“sniffs”) messages being sent/received from/by your computer; it will also typically store and/or display the contents of the various protocol fields in these captured messages. A packet sniffer itself is passive. It observes messages being sent and received by applications and protocols running on your computer, but never sends packets itself. Similarly, received packets are never explicitly addressed to the packet sniffer. Instead, a packet sniffer receives a copy of packets that are sent/received from/by application and protocols executing on your machine.

The figure below shows the structure of a packet sniffer. At the right of the figure are the protocols (in this case, Internet protocols) and applications (such as a web browser or ftp client) that normally run on your computer. The packet sniffer, shown within the dashed rectangle in Figure 1 is an addition to the usual software in your computer, and consists of two parts. The packet capture library receives a copy of every link-layer frame that is sent from or received by your computer. Recall from the discussion from section 1.5 in the textbook (Figure 1.241) that messages exchanged by higher layer protocols such as HTTP, FTP, TCP, UDP, DNS, or IP all are eventually encapsulated in link-layer frames that are transmitted over physical media such as an Ethernet cable. In Figure 1, the assumed physical media is an Ethernet, and so all upper-layer protocols are eventually encapsulated within an Ethernet frame. Capturing all link-layer frames thus gives you all messages sent/received from/by all protocols and applications executing in your computer.

![Packet Sniffer](/~tmullen/images/nw/packet_sniffer.png)

The second component of a packet sniffer is the packet analyzer, which displays the contents of all fields within a protocol message. In order to do so, the packet analyzer must “understand” the structure of all messages exchanged by protocols. For example, suppose we are interested in displaying the various fields in messages exchanged by the HTTP protocol. The packet analyzer understands the format of Ethernet frames, and so can identify the IP datagram within an Ethernet frame. It also understands the IP datagram format, so that it can extract the TCP segment within the IP datagram. Finally, it understands the TCP segment structure, so it can extract the HTTP message contained in the TCP segment. Finally, it understands the HTTP protocol and so, for example, knows that the first bytes of an HTTP message will contain the string “GET,” “POST,” or “HEAD,” as shown in Figure 2.8 in the textbook.

### Running Wireshark

When you run the Wireshark program, you’ll get a startup screen, as shown below:

<img src="/~tmullen/images/nw/wireshark.png " style="width: 600px;"/>

In the middle of the window you'll see a list of network interfaces in your computer. Some of these you may recognize from having run `ifconfig` or `ipconfig` on your computer. The Wi-Fi interface on my machine is called `en0` and it's listed first here. Once you choose an interface here, Wireshark will capture all packets on that interface.

If you click on one of these interfaces to start packet capture (i.e., for Wireshark to begin capturing all packets being sent to/from that interface), a screen like the one below will be displayed, showing information about the packets being captured. Once you start packet capture, you can stop it by using the Capture pull down menu and selecting Stop.

<img src="/~tmullen/images/nw/wireshark2.png " style="width: 600px;"/>

The Wireshark interface has five major components:

* The **command menus** are standard pulldown menus located at the top of the window in MS Windows and at the top of your desktop on OS X. Of interest to us now are the File and Capture menus. The File menu allows you to save captured packet data or open a file containing previously captured packet data, and exit the Wireshark application. The Capture menu allows you to begin packet capture.
* The **packet-listing window** displays a one-line summary for each packet captured, including the packet number (assigned by Wireshark; this is not a packet number contained in any protocol’s header), the time at which the packet was captured, the packet’s source and destination addresses, the protocol type, and protocol-specific information contained in the packet. The packet listing can be sorted according to any of these categories by clicking on a column name. The protocol type field lists the highest-level protocol that sent or received this packet, i.e., the protocol that is the source or ultimate sink for this packet.
* The **packet-header details window** provides details about the packet selected (highlighted) in the packet-listing window. (To select a packet in the packet- listing window, place the cursor over the packet’s one-line summary in the packet-listing window and click with the left mouse button.). These details include information about the Ethernet frame (assuming the packet was sent/received over an Ethernet interface) and IP datagram that contains this packet. The amount of Ethernet and IP-layer detail displayed can be expanded or minimized by clicking on the plus minus boxes to the left of the Ethernet frame or IP datagram line in the packet details window. If the packet has been carried over TCP or UDP, TCP or UDP details will also be displayed, which can similarly be expanded or minimized. Finally, details about the highest-level protocol that sent or received this packet are also provided.
* The **packet-contents window** displays the entire contents of the captured frame, in both ASCII and binary/hexadecimal (you can toggle between bin and hex views with the right-click menu) format.
* Towards the top of the Wireshark graphical user interface, is the **packet display filter** field, into which a protocol name or other information can be entered in order to filter the information displayed in the packet-listing window (and hence the packet-header and packet-contents windows). In the example below, we’ll use the packet-display filter field to have Wireshark hide (not display) packets except those that correspond to HTTP messages.


### Taking Wireshark for a test run

The best way to learn about any new piece of software is to try it out! We’ll assume that your computer is connected to the Internet via a WiFi interface.

1. Start up your favorite web browser, which will display your selected homepage.
2. Start up the Wireshark software. You will initially see a window similar to that shown above. Wireshark has not yet begun capturing packets.
3. To begin packet capture, double click on the interface name representing your WiFi interface. Packet capture will now begin - Wireshark is now capturing all packets being sent/received from/by your computer!
4. Once you begin packet capture, a window similar to that shown in the third figure above will appear. This window shows the packets being captured. By selecting Capture pulldown menu and selecting Stop, you can stop packet capture. But don’t stop packet capture yet. Let’s capture some interesting packets first. To do so, we’ll need to generate some network traffic. Let’s do so using a web browser, which will use the HTTP protocol that we will study in detail in class to download content from a website.
5. While Wireshark is running, enter the following URL:
http://www.something.com
and have that page displayed in your browser. In order to display this page, your browser will contact the HTTP server at www.something.com and exchange HTTP messages with the server in order to download the index.html page located on the web server, as discussed in section 2.2 of the textbook. The Ethernet frames containing these HTTP messages (as well as all other frames passing through your Ethernet adapter) will be captured by Wireshark.
6. After your browser has displayed the page, stop Wireshark packet capture by selecting stop in the Wireshark capture window. You now have live packet data that contains all protocol messages exchanged between your computer and other network entities! The HTTP message exchanges with the www.something.com web server should appear somewhere in the listing of packets captured. But there will be many other types of packets displayed as well (see, e.g., the many different protocol types shown in the Protocol column in Figure 3). Even though the only action you took was to download a web page, there were evidently many other protocols running on your computer that are unseen by the user. We’ll learn much more about these protocols as we progress through the text! For now, you should just be aware that there is often much more going on than “meets the eye”!
7. Type in “http” (without the quotes, and in lower case – all protocol names are in lower case in Wireshark) into the display filter specification window at the top of the main Wireshark window. Then click the arrow icon to the right of where you entered “http”. This will cause only HTTP message to be displayed in the packet-listing window.
8. Find the HTTP GET message that was sent from your computer to the gaia.cs.umass.edu HTTP server. (Look for an HTTP GET message in the “listing of captured packets” portion of the Wireshark window that shows “GET” followed by the www.something.com URL that you entered. When you select the HTTP GET message, the Ethernet frame, IP datagram, TCP segment, and HTTP message header information will be displayed in the packet-header window2. By clicking on ‘+’ and ‘-‘ right-pointing and down-pointing arrowheads to the left side of the packet details window, minimize the amount of Frame, Ethernet, Internet Protocol, and Transmission Control Protocol information displayed. Maximize the amount information displayed about the HTTP protocol. 
9. Exit Wireshark

Congratulations! You’ve now completed the first lab.

## Submission

Save the capture as `ws-lab1-<your_name>.pcapng` and upload your capture file to the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=376060).
