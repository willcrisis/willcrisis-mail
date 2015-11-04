[![Build Status](https://travis-ci.org/willcrisis/willcrisis-mail.svg)](https://travis-ci.org/willcrisis/willcrisis-mail)

# Willcrisis Mail Plugin #

This plugin writes default mail configuration to `Config.groovy` file.  

### Installing ###

Add the following to your configuration:

```Groovy
//BuildConfig.groovy

repositories {
    ...
    mavenRepo "https://dl.bintray.com/willcrisis/plugins/"
}

plugins {
    compile ":willcrisis-mail:1.0.0"
}
```

### What this plugin do ###

* Installs [Grails Mail Plugin](https://github.com/gpc/grails-mail) to the app
* Writes default mail configuration to `Config.groovy`

### What I have to do after installing this plugin? ###

* Check your `Config.groovy` file
* Replace default values from the following keys:
	* grails.mail.host
	* grails.mail.port
	* grails.mail.username
	* grails.mail.password
	* grails.mail.props
	* grails.from.register
	* grails.from.general
* Use `sendMail` method inside controllers, or inject `mailService` inside other places.

For full-reference on how send emails, check [here](http://gpc.github.io/grails-mail/).