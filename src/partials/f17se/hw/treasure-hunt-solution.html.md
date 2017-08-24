```
cacheable: false
```

# Mean.js treasure hunt

Here are the solutions to the treasure hunt.

## Round 1

1. List three files in the top level directory of this project that will not generally be displayed in your Finder or Windows Explorer window (assuming default settings for your operating system). What do these files do/contain? 

    **Answer:**  Anything that begins with a `.` (often called a "dot file") will be hidden by default in most OS GUIs. On your command line, they will be hidden by the `ls` command, but listed with the `ls -a` command. In the Mean.js codebase, a lot of these are configuration files (filenames that end with "rc", such as `.bowerrc` often contain configuration settings). Files with "ignore" in their names generally tell some process to ignore certain files or directories, such as `.gitignore`, which is the subject of the next question. 

2. List three directories in this project that will be ignored by Git. Explain why you think they should (or shouldn't) be ignored by Git. 

    **Answer:** Anything files or directories listed in `.gitignore` will be disregarded by Git. Examples of directories include `node_modules`, `public/lib`, and `modules/*/client/scss/*.css` (which is a pattern that matches multiple directories, using the `*` wildcard). All of these are places which are automatically populated at installation or deployment, and would be a waste of time and space to push to repositories. `node_modules`, for example, contains all the 3rd party server-side dependencies of your application. All the software specified in `package.json` is downloaded and installed here when you run `npm install`. There's no reason to keep it in a repository, or to upload it to Heroku; we can simply tell Heroku to run `npm install` itself and get the dependencies from their origins. The same story with `public/lib` although these are client-side dependencies which are wrangled by `bower`. The last example is a little different. Part of our pre-processing at deployment involves converting `.scss` files into `.css` files. Sass (`.scss`) is a format that lets us write style sheets in a more convenient and concise way that straight css (which is read by the browser). The Sass pre-processor converts these to standard css. We don't need to store the output `.css` files in a repo or submit them to Heroku, we just need to be sure to generate them each time we deploy. 

3. Find and list three `.md` files in the top level of the project. What are `.md` files generally used for? What do the `#`, `##`, and `###` sequence of characters indicate?

    **Answer:** Markdown (`.md`) is a way to write text intended to be read in a browser. It's a lot more concise and convenient than writing in html directly, although not quite as flexible. A pre-processing step is necessary to compile `.md` files into html. The `#` sign indicates header text. One `#` is a top level header ("header 1"), two is a smaller header for subtitles, three is a still smaller header, etc. 

4. Find the `package.json` file for your project's installation of Express. Where is this file located? What is the "description" listed for Express

    **Answer:** The `package.json` for Express is located in `node_modules/Express`. The description is "Fast, unopinionated, minimalist web framework".

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

    The title of the application is in the first line. By default, the app's title is `MEAN.JS`. Where is this set? Find where this is located in the code and change the app title to something more suitable to your group.  

    **Answer:** The title for the application is set in `config/env/default.js` as the value of `title` in the `app` object exported in `module.exports`.

2. Study your project's `gulpfile.js`. Which tasks are part of the `default` task, but not part of the `prod` task? Which tasks are part of `prod`, but not part of `default`? Which of these tasks will ultimately result in minified JavaScript? What is the name of the task that does the minifying?

    **Answer:** Aside from setting the environment `env:dev` versus `env:prod` the `default` task includes `wiredep`, whereas the `prod` task includes `build` and runs the version of `nodemon` without debugging (`nodebug`). The `wiredep` task installs client side dependencies that are also available to the app in production mode, so doesn't need to be run both times. The `build` task does things like minifying and concatenating files which is not necessary for development. The task that handles JS minifying is called `uglify`.

3. The `bower install` command depends on the file `bower.json` and the file `.bowerrc`. Read these files. What do you think it uses the information in these files for? How is `bower install` different from `npm install`?

    **Answer:** The `bower.json` file tells Bower what client-side dependencies to install, and the `.bowerrc` file tells Bower where to put them. The difference between `bower install` and `npm install` is mainly that NPM handles server-side dependencies and Bower handles client-side dependencies. However, another difference is that `bower install` is called as part of `npm install` (as determined in the `scripts` portion of `package.json`) whereas the reverse isn't true. 

4. In the development environment, your application uses a database on localhost called `mean-dev` which it creates automatically. Where is the name of this database set? What is the corresponding name of the database used in production mode, and where is that database name set?

    **Answer:** This is set in `config/env/development.js` in the `db` object. The production mode database is `mean` and is set in `config/env/production.js`

5. Read the file `config/assets/default.js` closely. This is a list of assets which will be automatically added to your html. Portions of this list are generated automatically by `wiredep` based on the contents of your `bower.json`. Other portions depend on what files are placed in certain directories in your project. Based on what you see in this file, if you wanted to add a .css (style sheet) file for a particular module, where would be a good place to put that file?

    **Answer:** There are several ways this could be done, but the most relevant code is probably here:

        css: [
          'modules/*/client/{css,less,scss}/*.css'
        ],

    This tells us that if we place any file with the suffix `.css` into a directory called `/client/css/` (among other possibilities) within our module's own subdirectory (for example, `modules/articles/client/css/`) it will be included in the html. 

# Round 3

1. What needs to be changed to make it so that non-admin users can post a new article?

2. What needs to be changed to make it so that non-logged in users can use the chat functionality as guests? This isn't an entirely trivial thing to do, so I'm going to give you some hints. The solution requires changing several files:
  
  `core/client/services/socket.io.client.service.js`
  
  `chat/client/config/chat.client.routes.js`
  
  `chat/client/config/chat.client.menus.js`
  
  `config/lib/socket.io.js` 
  
  `chat/server/sockets/chat.server.socket.config.js`

    **Answer:** In the file `core/client/services/socket.io.client.service.js`  around line 26 there's an  `if (Authentication.user)`  conditional that needs to be removed. Once this is removed the Authentication injection can be removed from the service completely, but this isn't necessary.

    In the file   `chat/client/controllers/chat.client.controller.js`  the `if (!Authentication.user)` conditional around line 21 needs to be removed. 

    In the file `chat/client/config/chat.client.routes.js`  the 'roles' line in the data object (around line 17) should be deleted.

    In `chat/client/config/chat.client.menus.js` the `roles` value in `addMenuItem` should be `['*']` 

    In the file  `config/lib/socket.io.js`  around line 98 there's an `if (socket.request.user) {` conditional. Comment out the conditional and the `} else {` block.

    Finally, in the file  `chat/server/sockets/chat.server.socket.config.js`  all instances of `profileImageURL` and `username` need to be made conditional on `socket.request.user` being defined. In `socket.on('chatMessage'`, this should be done in the function argument. However, in `io.emit('chatMessage'`, the second argument is an object, rather than a function, so it's necessary to tweak it a bit. I suggest making it into an iife (immediately invoked function expression) that returns the object but with the values given defaults as appropriate. 

    Here's the code to do that for the `io.emit('chatMessage'` event:

        io.emit('chatMessage', (function(){
          var _profileImageURL;
          var _username;
          if (socket.request.user) {
            _profileImageURL = socket.request.user.profileImageURL;
            _username = socket.request.user.username
          } else {
            _profileImageURL = 'modules/users/client/img/profile/default.png';
            _username = 'Guest';
          }
          return  {
              type: 'status',
              text: 'Is now connected',
              created: Date.now(),
              profileImageURL: _profileImageURL,
              username: _username
            }
          })()
        );​


 