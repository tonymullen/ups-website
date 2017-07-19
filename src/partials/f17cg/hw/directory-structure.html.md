```
cacheable: false
```

## Overview


Arrange your assignment directories in your `public_html` directory like this:

![File Structure](/~tmullen/images/cg/filestructure.png)

Each week's starter .zip file will unzip into the corresponding assignment directory. This should be placed directly in your local http directory (I recommend running an instance of the [node.js `http-server`](https://www.npmjs.com/package/http-server), but any http server will do). The [`js`](/~tmullen/secure/f17cg/js.zip) and [`images`](/~tmullen/secure/f17cg/images.zip) directory should also be placed directly in your `public_html` directory to ensure that all the dependencies are where they need to be. You shouldn't need to create any new directories if you unzip everything directly into your `public_html` directory.  


To submit your work, you will need to uploade it to your `public_html` directory at `http://cs315.pugetsound.edu/`. There, you'll see a directory with your username. Your homework assignments should all be uploaded as described above.

In order to upload the file to the server, you must be either on campus or connected to the campus network via VPN. Instructions for accessing the campus network via VPN can be found [here](http://www.pugetsound.edu/about/offices-services/technology-services/help-support/self-help/vpn/).

Using [FileZilla](https://filezilla-project.org/) or a similar FTP client, enter `sftp://cs315.pugetsound.edu` in the Host field, your username in the Username field, and your password in the Password field, then click connect. You should be able to drag and drop files and directories from your filesystem in the window on the left to the remote filesystem in the window on the right of the FileZilla interface.  