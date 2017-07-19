```
cacheable: false
```

## Wireshark Lab 8: IP

In this lab, we’ll investigate the IP protocol, focusing on the IP datagram. We’ll do so by analyzing a trace of IP datagrams sent and received by an execution of the traceroute program (the traceroute program itself is explored in more detail in the Wireshark ICMP lab). We’ll investigate the various fields in the IP datagram, and study IP fragmentation in detail.

Before beginning this lab, you’ll probably want to review sections 1.4.3 in the text1 and [section 3.4](https://tools.ietf.org/html/rfc2151#section-3.4) of [RFC 2151](https://tools.ietf.org/html/rfc2151) to update yourself on the operation of the traceroute program. You’ll also want to read Section 4.4 in the text, and probably also have [RFC 791](https://tools.ietf.org/html/rfc791) on hand as well, for a discussion of the IP protocol.

### Capturing packets from an execution of traceroute

In order to generate a trace of IP datagrams for this lab, we’ll use the `traceroute` program to send datagrams of different sizes towards some destination *X*. Recall that `traceroute` operates by first sending one or more datagrams with the time-to-live (TTL) field in the IP header set to 1; it then sends a series of one or more datagrams towards the same destination with a TTL value of 2; it then sends a series of datagrams towards the same destination with a TTL value of 3; and so on. Recall that a router must decrement the TTL in each received datagram by 1 (actually, RFC 791 says that the router must decrement the TTL by *at least* one). If the TTL reaches 0, the router returns an ICMP message (type 11 – TTL-exceeded) to the sending host. As a result of this behavior, a datagram with a TTL of 1 (sent by the host executing `traceroute`) will cause the router one hop away from the sender to send an ICMP TTL-exceeded message back to the sender; the datagram sent with a TTL of 2 will cause the router two hops away to send an ICMP message back to the sender; the datagram sent with a TTL of 3 will cause the router three hops away to send an ICMP message back to the sender; and so on. In this manner, the host executing `traceroute` can learn the identities of the routers between itself and destination X by looking at the source IP addresses in the datagrams containing the ICMP TTL-exceeded messages.

We’ll want to run `traceroute` and have it send datagrams of various lengths.

* **Linux/Unix/MacOS:** With the Unix/MacOS `traceroute` command, the size of the UDP datagram sent towards the destination can be explicitly set by indicating the number of bytes in the datagram; this value is entered in the traceroute command line immediately after the name or address of the destination. For example, to send `traceroute` datagrams of 2000 bytes towards gaia.cs.umass.edu, the command would be:

        %traceroute gaia.cs.umass.edu 2000
		
* **Windows users:** Unfortunately, the Windows Traceroute application `tracert` does not enable manual setting of the packet size. The standard and pro versions of [Pingplotter (www.pingplotter.org)](www.pingplotter.org)  enable this, but their latest free versions appear to have disabled that option. After extensive searching, I am not able to find any alternative Traceroute that allows manual setting of packet size! However, if you are downloading Pingplotter for the first time, a 14 day trial period is enabled for using the less restricted version. So you may do one of two things, either A) download a fresh installation of the Pingplotter (if you haven't already installed it) or B) work with a partner in class (I will give in-class time to work on this lab) to get a Wireshark packet capture file to share. Then complete the analysis and submit the packet capture and your report individually. 

To get the packet capture do the following:

* Start up Wireshark and begin packet capture (Capture->Start) and then press OK on the Wireshark Packet Capture Options screen (we’ll not need to select any options here).

* Enter three traceroute commands to `gaia.cs.umass.edu`, one with a length of 56 bytes, one with a length of 2000 bytes, and one with a length of 3500 bytes. Let each one complete before starting the next one. 

* Stop Wireshark tracing.

### A look at the captured trace

In your trace, you should be able to see the series UDP segments sent by your computer and the ICMP TTL-exceeded messages returned to your computer by the intermediate routers. Whenever possible include screenshots of the packets in question in your answers to the questions. 

1. Select the first UDP Echo Request message sent by your computer, and expand the Internet Protocol part of the packet in the packet details window.What is the IP address of your computer?

2. Within the IP packet header, what is the value in the upper layer protocol field?

3. How many bytes are in the IP header? How many bytes are in the payload of the IP datagram? Explain how you determined the number of payload bytes.

4. Has this IP datagram been fragmented? Explain how you determined whether or not the datagram has been fragmented.

Next, sort the traced packets according to IP source address by clicking on the *Source* column header; a small downward pointing arrow should appear next to the word *Source*. If the arrow points up, click on the Source column header again. Select the first UDP message sent by your computer, and expand the Internet Protocol portion in the details window. In the captured packets listing window, you should see all of the subsequent UDP messages (perhaps with additional interspersed packets sent by other protocols running on your computer) below this first UDP packet. Use the down arrow to move through the UDP messages sent by your computer.

5. Which fields in the IP datagram *always* change from one datagram to the next within this series of UDP messages sent by your computer?
6. Which fields stay constant? Which of the fields must stay constant? Which fields must change? Why?
7. Describe the pattern you see in the values in the Identification field of the IP datagram.

Next find the series of ICMP TTL- exceeded replies sent to your computer by the nearest (first hop) router.

8. What is the value in the Identification field and the TTL field?
9. Do these values remain unchanged for all of the ICMP TTL-exceeded replies sent to your computer by the nearest (first hop) router? Why?

### Fragmentation

Sort the packet listing according to time again by clicking on the *Time* column.

10. Find the first UDP message that was sent by your computer after you changed the packet size to be 2000. Has that message been fragmented across more than one IP datagram? 

11. Select the first fragment of the fragmented IP datagram. What information in the IP header indicates that the datagram been fragmented? What information in the IP header indicates whether this is the first fragment versus a latter fragment? How long is this IP datagram?
12. Select the second fragment of the fragmented IP datagram. What information in the IP header indicates that this is not the first datagram fragment? Are there more fragments? How can you tell?
13. What fields change in the IP header between the first and second fragment? 

## Submission

Create a **pdf** file with the answers to the questions above and corresponding screenshots, with the file name  `ws-lab8-<your_name>.pdf` and upload your capture file to the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=399831).
