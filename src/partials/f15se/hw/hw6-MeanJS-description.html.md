```
cacheable: false
```
## **Due  Fri 10/23<**

## Overview

In this assignment you will be introduced to the actual codebase from which you will craft your group project.

The acronym MEAN stands for <em>MongoDB, Express, Angular, Node</em>. MEAN isn't a framework or particular tool itself but a collection of JavaScript technologies that work well together for creating web and mobile applications. MongoDB is a noSQL database. Express is the back-end framework that takes care of the web server and routing for your application. Angular.js is the front-end framework and Node.js is the JavaScript runtime that the back-end is built on. Any of the individual parts can also be mixed and matched with other frameworks, tools and libraries, and often are.

MEAN.js is a <em>boilerplate</em> codebase for MEAN stack applications. This means that it contains starter code for developers to use to create their own applications. The starter code is well-organized and follows established best practices, and eliminates the need for developers to write the same thing over again whenever they write a new application. Studying the code is also a great way to learn how applications work, as there is minimal unnecessary functionality built in.

Be aware that the organization used in this boilerplate project is *not* the "only way" or even the "right way" to organize MEAN stack (or any other stack) code. In fact, another "competing" MEAN stack boilerplate project, MEAN.io, takes a different approach to organizing a project (the two projects were initially created by the same developer, who left MEAN.io to start up MEAN.js). Although it's not required, it is worthwhile to download and compare the file structure and naming conventions of that project as well.

### Installing MEAN.js

For this assignment you will install MEAN.js twice. In your personal Github repository create two directories, one called <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">meanjs-0.3.x</span> and the other called <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">meanjs-0.4.x</span>

First you will install MEAN.js version 0.3.x using the Yeoman Generator inside <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">meanjs-0.3.x</span>, following
[these instructions](http://meanjs.org/generator.html).

Get the boilerplate application running on <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">localhost</span>.

In the other directory, install
[MEAN.js 0.4.x](https://github.com/meanjs/mean) by cloning the repo.

Get this boilerplate application running on <span style="font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;">localhost</span>also.

### Why do the same thing twice?

Any time you are choosing a technology for your project, you need to get some sense of what is available and what the pros and cons of using different tools and versions are. In this case, you'll see that the Yeoman Generator is a very handy way to automate the installation of MEAN.js modules. But it hasn't yet been updated to handle the latest version of MEAN.js, which has improvements in other areas. For example, if you want real-time communication in your application with WebSockets, version 0.4.x has a Socket.io module built in. If you use the more stable and well-documented version 0.3.x you would need to integrate the Socket.io module yourself.

Read the docs for both versions to find out as much as you can about similar tradeoffs that might crop up. The first big tech decision you and your team will need to make on your group project will be which of these versions to base your application on!
