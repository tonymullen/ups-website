```
cacheable: false
```

## Overview

For this assignment, you'll get started doing some socket programming in Python on your own. Specifically, you'll learn the basics of socket programming for TCP connections in Python: how to create a socket, bind it to a specific address and port, as well as send and receive a HTTP packet. You will also learn some basics of HTTP header format.

You will develop a web server that handles one HTTP request at a time. Your web server should accept and parse the HTTP request, get the requested file from the server’s file system, create an HTTP response message consisting of the requested file preceded by header lines, and then send the response directly to the client. If the requested file is not present in the server, the server should send an HTTP “404 Not Found” message back to the client. In addition to the server, you'll also implement an HTTP client, which is capable of requesting a web page from your server. You will be able to make a request either from your own client, or from a browser.

### Starter code

In the [starter code for the assignment](http://mathcs.pugetsound.edu/~tmullen/slides/s17nw/WebServerStarter.zip) you will find the skeleton code for the Web server and client. You are to complete the skeleton code. The places where you need to fill in code are marked with `#Fill in start` and `#Fill in end`. Each place may require one or more lines of code. Read the comments in the code for pointers on what needs to be done and where to look for solutions. First complete the server and test it using a browser, then complete the client.

### Running the Server

Put the HelloWorld.html file in the same directory that the server is in. Run the server program. Determine the IP address of the host that is running the server (e.g., 'localhost'). Open a browser and provide the corresponding URL. For example:

    http://localhost:6789/HelloWorld.html

Note the use of the port number after the colon. You need to replace this port number with whatever port you have used in the server code. In the above example, we have used the port number 6789. The browser should then display the contents of HelloWorld.html. If you omit ":6789", the browser will assume port 80 and you will get the web page from the server only if your server is listening at port 80.

Then try to get a file that is not present at the server. You should get a “404 Not Found” message.

### Running the Client

With the server running, you should be able to retrieve the same HTML using your own client `WebClient.py`. This will be called from the command line like this:

    python WebClient.py "HelloWorld.html"

Where the argument is the name of the file to be retrieved.

When this is called, you should see the following printed to your terminal:

    HTTP/1.x 200 OK
    Content-type: text/html

    <!DOCTYPE html>
    <html lang=en>
    <meta charset=utf-8>
    <head>
      <title>Hello World</title>
    </head>
    <body>
      Hello World!
    </body>

Try calling the client with a different argument, and make sure that the `404.html` file is returned.

## Submission

Please submit the complete server and client code along with screen verifying that you actually receive the contents of the HTML file from the server. I have set the Moodle assignment to accept multiple files.

Submit this assignment by uploading your files to the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=391635).

Each assignment will be accepted for partial credit up to 4 days late, with a penalty of 20% per day.
