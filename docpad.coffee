# The DocPad Configuration File
# It is simply a CoffeeScript Object which is parsed by CSON
docpadConfig = {

	# =================================
	# Template Data
	# These are variables that will be accessible via our templates
	# To access one of these within our templates, refer to the FAQ: https://github.com/bevry/docpad/wiki/FAQ


	templateData:

		# Specify some site properties
		site:
			# The production url of our website
			url: "http://mathcs.pugetsound.edu/~tmullen"
			#url: "http://localhost:9778/"
			#url: "http://localhost/out/"

			# Here are some old site urls that you would like to redirect from
			oldUrls: [
				'www.website.com',
				'website.herokuapp.com'
			]

			# The default title of our website
			title: "Tony Mullen"

			# The website description (for SEO)
			description: """
				Visiting Assistant Professor of Computer Science, University of Puget Sound.
				"""

			# The website keywords (for SEO) separated by commas
			keywords: """
				computer, science, university, puget, sound, natural, language, processing, graphics, Blender, programming, software, engineering
				"""

			# The website author's name
			author: "Tony Mullen"

			# The website author's email
			email: "tmullen@pugetsound.edu"

			# Styles
			styles: [
	#			"//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.css"
				"http://mathcs.pugetsound.edu/~tmullen/vendor/bootstrap-3.3.4-dist/css/bootstrap.min.css"
				"http://mathcs.pugetsound.edu/~tmullen/styles/twitter-bootstrap.css"
				"http://mathcs.pugetsound.edu/~tmullen/vendor/jquery.bootstrap-touchspin.css"
				"http://mathcs.pugetsound.edu/~tmullen/vendor/angular-flippy/flippy.css"
				"http://mathcs.pugetsound.edu/~tmullen/vendor/angular-flippy/flippy-fancy.css"
				"http://mathcs.pugetsound.edu/~tmullen/styles/bs-style.css"
				"http://mathcs.pugetsound.edu/~tmullen/styles/style.css"
			]

			# Scripts
			scripts: [
				"//cdnjs.cloudflare.com/ajax/libs/jquery/1.10.2/jquery.min.js"
				"//cdnjs.cloudflare.com/ajax/libs/modernizr/2.6.2/modernizr.min.js"
				"//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.15/angular.min.js"
				"//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"
		    "http://mathcs.pugetsound.edu/~tmullen/vendor/ui-bootstrap-tpls-0.12.1.min.js"
			  "http://mathcs.pugetsound.edu/~tmullen/vendor/jquery.bootstrap-touchspin.min.js"
			 	"http://mathcs.pugetsound.edu/~tmullen/vendor/angular-flippy/flippy.min.js"
				"http://mathcs.pugetsound.edu/~tmullen/scripts/script.js"
			 	"http://mathcs.pugetsound.edu/~tmullen/scripts/app.js"
			 	"http://mathcs.pugetsound.edu/~tmullen/scripts/controllers.js"
			 	"http://mathcs.pugetsound.edu/~tmullen/scripts/directives.js"
				"http://mathcs.pugetsound.edu/~tmullen/scripts/domtweaks.js"
				"http://mathcs.pugetsound.edu/~tmullen/scripts/solutions.js"
			]

			# Out Path
			# Where should we put our generated website files?
			# If it is a relative path, it will have the resolved `rootPath` prepended to it
			#outPath: 'out'  # default


		# -----------------------------
		# Helper Functions

		# Get the prepared site/document title
		# Often we would like to specify particular formatting to our page's title
		# we can apply that formatting here
		getPreparedTitle: ->
			# if we have a document title, then we should use that and suffix the site's title onto it
			if @document.title
				"#{@document.title} | #{@site.title}"
			# if our document does not have it's own title, then we should just use the site's title
			else
				@site.title

		# Get the prepared site/document description
		getPreparedDescription: ->
			# if we have a document description, then we should use that, otherwise use the site's description
			@document.description or @site.description

		# Get the prepared site/document keywords
		getPreparedKeywords: ->
			# Merge the document keywords with the site keywords
			@site.keywords.concat(@document.keywords or []).join(', ')

		# Get the prepared site/document description
		getURL: ->
			# if we have a document description, then we should use that, otherwise use the site's description
			@site.url

	# =================================
	# Collections
	# These are special collections that our website makes available to us

	collections:
		pages: (database) ->
			database.findAllLive({tags:$has:'page'}, [pageOrder:1,title:1])

		current: (database) ->
			database.findAllLive({tags:$has:'f17'})

#		archives: (database) ->
#			database.findAllLive({tags:$has:'archive'})

		classes: (database) ->
			database.findAllLive({tags:$has:'class'})

		resources: (database) ->
			database.findAllLive({tags:$has:'resource'})

		posts: (database) ->
			database.findAllLive({tags:$has:'post'}, [date:-1])


	# =================================
	# Plugins

	plugins:
		downloader:
			downloads: [
				{
					name: 'Bootstrap'
					path: 'src/files/vendor/twitter-bootstrap'
					url: 'https://codeload.github.com/twbs/bootstrap/tar.gz/master'
					tarExtractClean: true
				}
			]


	# =================================
	# DocPad Events

	# Here we can define handlers for events that DocPad fires
	# You can find a full listing of events on the DocPad Wiki
	events:

		# Server Extend
		# Used to add our own custom routes to the server before the docpad routes are added
		serverExtend: (opts) ->
			# Extract the server from the options
			{server} = opts
			docpad = @docpad

			# As we are now running in an event,
			# ensure we are using the latest copy of the docpad configuraiton
			# and fetch our urls from it
			latestConfig = docpad.getConfig()
			oldUrls = latestConfig.templateData.site.oldUrls or []
			newUrl = latestConfig.templateData.site.url

			# Redirect any requests accessing one of our sites oldUrls to the new site url
			server.use (req,res,next) ->
				if req.headers.host in oldUrls
					res.redirect(newUrl+req.url, 301)
				else
					next()
}


# Export our DocPad Configuration
module.exports = docpadConfig
