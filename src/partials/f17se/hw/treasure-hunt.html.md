```
cacheable: false
```

# Mean.js treasure hunt

Welcome to the treasure hunt! In each round, you'll poke around the Mean.js codebase, finding out about how it all hangs together bit by bit. To answer some of the questions you'll turn to online documentation or Google, but most of the questions can be answered just by reading the code. 

Use a text editor that enables you to have the full project available to you and enables string searches throughout the project. I recommend [Atom](https://atom.io/). 

You may divide up the effort however you feel appropriate. For example, you could work in pairs with each pair working on several items, or you could have individuals each take a single item to investigate, or you could work on each item as a group. However you choose divide the labor, the whole group will be responsible for answering the questions. Include a note describing how you divided the labor and clearly detailing each member's contribution in your Piazza report for each round.


## Round 1

1. List three files in the top level directory of this project that will not generally be displayed in your Finder or Windows Explorer window (assuming default settings for your operating system). What do these files do/contain? 

2. List three directories in this project that will be ignored by Git. Explain why you think they should (or shouldn't) be ignored by Git. 

3. Find and list three `.md` files in the top level of the project. What are `.md` files generally used for? What do the `#`, `##`, and `###` sequence of characters indicate?

4. Find the `package.json` file for your project's installation of Express. Where is this file located? What is the "description" listed for Express?

## Round 2

1. When you run your Mean.js application with the `gulp` command, you'll see something like this appear in the command line:

        --
        MEAN.JS - Development Environment
    
        Environment:     development
        Server:          http://0.0.0.0:3000
        Database:        mongodb://localhost/mean-dev
        App version:     0.5.0
        MEAN.JS version: 0.5.0
        --
    
    The title of the application is in the first line. By default, the app's title is `MEAN.JS`. Find where this is located in the code and change the app title to something more suitable to your group. The new title to should show up here when you run the application. Copy and past the output into your report. 

2. Study your project's `gulpfile.js`. Which tasks are part of the `default` task, but not part of the `prod` task? Which tasks are part of `prod`, but not part of `default`? Which of these tasks will ultimately result in minified JavaScript? What is the name of the task that does the minifying?

3. The `bower install` command depends on the file `bower.json` and the file `.bowerrc`. Read these files. What do you think it uses the information in these files for? How is `bower install` different from `npm install`?

4. In the development environment, your application uses a database on localhost called `mean-dev` which it creates automatically. Where is the name of this database set? What is the corresponding name of the database used in production mode, and where is that database name set?

5. Read the file `config/assets/default.js` closely. This is a list of assets which will be automatically added to your html. This list in turn is generated automatically by `wiredep` based on the contents of your `bower.json`. Based on what you see here, if you wanted to add a .css (style sheet) file for a particular module, where would be a good place to put that file?

# Round 3

1. What needs to be changed to make it so that non-admin users can post a new article?

2. What needs to be changed to make it so that non-logged in users can use the chat functionality? This isn't a trivial thing to do, so I'm going to give you some hints. The solution requires making changes to several files in both `core` and `chat` modules, as well as the socket.io config file:
  
    `core/client/services/socket.io.client.service.js`
  
    `chat/client/config/chat.client.routes.js`
  
    `chat/client/config/chat.client.menus.js`
  
    `config/lib/socket.io.js` 
  
    `chat/server/sockets/chat.server.socket.config.js`




 