```
cacheable: false
```

## Wireshark Lab 6: DHCP

In this lab, we’ll investigate the behavior of the dynamic host configuration protocol (DHCP).  DHCP is covered in Section 4.3.3 of the text (see the assigned reading for the week). Recall that is used extensively in corporate, university and home-network wired and wireless LANs to dynamically assign IP addresses to hosts (as well as to configure other network configuration information).

This lab is brief, as we’ll only examine the DHCP packets captured by a host. The process is slightly different for Windows and Mac. 

### DHCP Experiment

In order to observe DHCP in action, we’ll perform several DHCP-related commands and capture the DHCP messages exchanged as a result of executing these commands. Do the following:

**On Windows:**

1. Begin by opening the Windows Command Prompt. Enter `ipconfig/release`. This command releases your current IP address, so that your host’s IP address becomes 0.0.0.0.
2. Start up the Wireshark packet sniffer and begin Wireshark packet capture. Filter on the string `bootp`.
3. Now go back to the Windows Command Prompt and enter `ipconfig/renew`.
This instructs your host to obtain a network configuration, including a new IP
address. 
4. Wait until the `ipconfig/renew` has terminated. Then enter the same command
`ipconfig/renew` again.
5. When the second `ipconfig/renew` terminates, enter the command
`ipconfig/release` to release the previously-allocated IP address to your computer.
6. Finally, enter `ipconfig/renew` to again be allocated an IP address for your
computer.
7. Stop Wireshark packet capture.

**On Mac OS X**

1. Begin by opening the terminal. Enter `sudo ipconfig set en0 none`. This command releases your current IP address, so that your host’s IP address becomes 0.0.0.0.
2. Start up the Wireshark packet sniffer and begin Wireshark packet capture. Filter on the string `bootp`.
3. Now go back to the Windows Command Prompt and enter `sudo ipconfig set en0 dhcp`.
This instructs your host to obtain a network configuration, including a new IP
address. 
4. Wait until the process has terminated and an ACK appears in Wireshark. Then enter the same command
`sudo ipconfig set en0 dhcp` again.
5. When the second `sudo ipconfig set en0 dhcp` terminates, enter the command
`sudo ipconfig set en0 none` to release the previously-allocated IP address to your computer.
6. Finally, enter `sudo ipconfig set en0 dhcp` to again be allocated an IP address for your
computer.
7. Stop Wireshark packet capture.

Now let’s take a look at the resulting Wireshark window. To see only the DHCP packets, enter into the filter field `bootp` if you haven't already done so. (DHCP derives from an older protocol called BOOTP. Both BOOTP and DHCP use the same port numbers, 67 and 68.) We see from the screenshot below that that the first command (`ipconfig renew ` in windows and `sudo ipconfig set en0 dhcp` in OS X caused four different DHCP packets to be generated (disregarding repetitions): a DHCP Discover packet, a DHCP Offer packet, a DHCP Request packet, and a DHCP ACK packet.

<img src="/~tmullen/images/nw/wireshark-dhcp.png " style="width: 600px;"/>


## What to hand in

Your submission pdf should include a screen shot of the Command Prompt or terminal where you ran your commands, and sceenshots of the Wireshark window displaying the packet trace information corresponding to the questions, as well as the answers to the following questions:

1. Are DHCP messages sent over UDP or TCP?
2. For each packet, find the source and destination port numbers. Are the port numbers the same described in the text of the assignment?
3. What is the link-layer (e.g., Ethernet) address of your host?
4. What values in the DHCP discover message differentiate this message from the
DHCP request message?
5. What is the value of the Transaction-ID in each of the first four
(Discover/Offer/Request/ACK) DHCP messages? What are the values of the Transaction-ID in the second set (Request/ACK) set of DHCP messages? What is the purpose of the Transaction-ID field?
6. A host uses DHCP to obtain an IP address, among other things. But a host’s IP address is not confirmed until the end of the four-message exchange! If the IP address is not set until the end of the four-message exchange, then what values are used in the IP datagrams in the four-message exchange? For each of the four DHCP messages (Discover/Offer/Request/ACK DHCP), indicate the source and destination IP addresses that are carried in the encapsulating IP datagram.
7. What is the IP address of your DHCP server?
8. What IP address is the DHCP server offering to your host in the DHCP Offer
message? Indicate which DHCP message contains the offered DHCP address.
9. In the example screenshot in this assignment, there is no relay agent between the
host and the DHCP server. What values in the trace indicate the absence of a relay agent? Is there a relay agent in your experiment? If so what is the IP address of the agent?
10. Explain the purpose of the router and subnet mask lines in the DHCP offer message.
11. In the DHCP trace file noted in footnote 2, the DHCP server offers a specific IP address to the client (see also question 8. above). In the client’s response to the first server OFFER message, does the client accept this IP address? Where in the client’s RESPONSE is the client’s requested address?
12. Explain the purpose of the lease time. How long is the lease time in your
experiment?
13. What is the purpose of the DHCP release message? Does the DHCP server issue
an acknowledgment of receipt of the client’s DHCP request? What would happen
if the client’s DHCP release message is lost?
14. Clear the `bootp` filter from your Wireshark window. Were any ARP packets sent or received during the DHCP packet-exchange period? If so, explain the purpose of those ARP packets.


## Submission

Create a **pdf** file with the answers to the questions above and the requested screenshots, with the file name  `ws-lab6-<your_name>.pdf` and upload your capture file to the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=444573).
