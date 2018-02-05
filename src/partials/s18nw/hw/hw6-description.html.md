```
cacheable: false
```

## Overview

By the end of this assignment, you will have acquired a better understanding of SMTP protocol. You will also gain experience in implementing a standard protocol using Python.

Your task is to develop a basic mail client that sends email from a Gmail account to any recipient. Your client will need to connect to a the smtp.gmail.com server, dialogue with the mail server using the SMTP protocol, and send an email message to the mail server. You'll also take it one step further than what we've done in class with Telnet by attaching an image, which makes things a bit more complicated. 

Python does provide a module, called `smtplib`, which has built in methods to send mail using SMTP protocol. However, we will not be using this module in this lab, because it hides the details of SMTP and socket programming. You'll be doing it the hard way!

In order to limit spam and to maintain security, some mail servers do not accept TCP connection from arbitrary sources. For this assignment, as we discussed in class, you'll need to log into the Gmail server using an encrypted wrapper around your TCP connection.  

### Before you begin 

If you haven't already signed up for an extra Gmail account, please do so. Although nothing you'll do in this assignment is particularly dangerous or insecure, it involves playing around with passwords and login information and it would be best not to use an email address that is in active use. You'll also need to set the Gmail account options to accept connections from less secure apps. 

### Code

Download the [starter code for this assignment](http://mathcs.pugetsound.edu/~tmullen/secure/s18nw/SMTPStarter.zip) and read it over. The places where you need to fill in code are marked with `#Fill in start` and `#Fill in end`. Each place may require one or more lines of code.

### Opportunistic TLS and MIME multipart messages

Two things make this assignment a little more involved than minimal SMTP interaction. The first is the need to encrypt our communication with transport layer security (TLS), which is required by Gmail's servers. This is done by initiating a plaintext SMTP session and then upgrading the session to an encrypted session with the `STARTTLS` command. This is known as [Opportunistic TLS](https://en.wikipedia.org/wiki/Opportunistic_TLS). You'll see links to documentation on Python's SSL/TLS features in the starter code comments.

The other complicating factor is the need to use [MIME multipart messages](https://en.wikipedia.org/wiki/MIME#Multipart_messages) to send text and an image in the same mail. Read the linked documentation carefully. New lines and encoding details can make the difference in whether things work properly.   

### Additional notes

In some cases, the receiving mail server might classify your e-mail as junk. Make sure you check the junk/spam folder when you look for the e-mail sent from your client.

## Submission

In your submission, provide the complete code for your SMTP mail client as well as a screenshot showing that you indeed receive the e-mail message with the shark picture attached. Put all the files together in a `.zip` archive to submit them on Moodle. 

Submit this assignment by uploading your files to the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=444571).

Each assignment will be accepted for partial credit up to 4 days late, with a penalty of 20% per day.
