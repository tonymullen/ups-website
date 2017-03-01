```
cacheable: false
```

## Overview

In this assignment, you will learn more about how web proxy servers work and one of their basic functionalities – caching.

Your task is to develop a small web proxy server which is able to cache web pages. It is a very simple proxy server which only understands simple GET-requests, but is able to handle all kinds of objects - not just HTML pages, but also images.

Generally, when the client makes a request, the request is sent to the web server. The web server then processes the request and sends back a response message to the requesting client. In order to improve the performance we create a proxy server between the client and the web server. Now, both the request message sent by the client and the response message delivered by the web server pass through the proxy server. In other words, the client requests the objects via the proxy server. The proxy server will forward the client’s request to the web server. The web server will then generate a response message and deliver it to the proxy server, which in turn sends it to the client.

### Code 

Download the [starter code for this assignment](http://mathcs.pugetsound.edu/~tmullen/slides/s17nw/ProxyServerStarter.zip) and read it over. The places where you need to fill in code are marked with `#Fill in start` and `#Fill in end`. Each place may require one or more lines of code.

### Running the proxy server

Run the proxy server program using your command prompt. The starter file program is set up to run on port 8888. The first command line argument will tell the program what the hostname of the proxy is. You can assume this will be localhost. 

Your browser can be pointed to a proxy by setting your system's network settings. You need to give the address of the proxy and the port number that you gave when you ran the proxy server. On OSX, this is found under System Preferences. Click "Advanced", then click on the "Proxies" tab and check "Web Proxy (HTTP)" as shown:

<img src="/~tmullen/images/nw/osx_proxy_settings.jpg" style="width: 600px;"/>

Then click "OK" and return to the Network System Preferences panel, and then be sure to click "Apply". 

Instructions for setting up a proxy server on your own OS/version should be easy to find. For Windows 10 [these instructions](http://www.dummies.com/computers/operating-systems/windows-10/how-to-set-up-a-proxy-in-windows-10/) should get you there. 

You should be able to run the proxy and the browser on the same computer without any problem. With this approach, to get a web page using the proxy server, you simply provide the URL of the page you want.

### Goal

Your proxy server will be a simple one, designed to handle plain HTML webpages without multiple objects, dynamic content, redirects, etc. Much of web content these days incorporates those elements, so you can limit your testing of the proxy to simple pages such as `www.something.com` and this class webpage at `mathcs.pugetsound.edu/~tmullen/classes/s17-CS325-nw/`. You should try it on some other pages and see if you can understand where it fails (for pages where caching doesn't seem to work, be sure to check what's being written to your cached file).

For this exercise, I've indicated in the code how to make a simple substitution to turn the background of the cached webpage pink. When your proxy is up and running, the course website (and `www.something.com`) should appear normally (with white backgrounds) the first time you access them, but when you refresh the page, they will appear with a pink background, like this:

<img src="/~tmullen/images/nw/proxy_webpage.jpg" style="width: 600px;"/>

Obviously, in a real proxy web server, you probably wouldn't want to tamper with the content in this way, but this will enable you to know at a glance that your page is being loaded from the cache. 

## Submission

In your submission, provide the complete code for your proxy server as well as a screenshot of your browser displaying the pink version of `www.something.com`. Put all the files together in a `.zip` archive to submit them on Moodle. 

Submit this assignment by uploading your files to the [assignment's Moodle page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=394717).

Each assignment will be accepted for partial credit up to 4 days late, with a penalty of 20% per day.
