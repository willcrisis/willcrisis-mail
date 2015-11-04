appDir = "$basedir/grails-app"
escreverConfiguracoes()

private void escreverConfiguracoes() {
    File config = new File(appDir, 'conf/Config.groovy')
    if (config.exists()) {
        println 'Writing mail configurations to Config.groovy...'
        config.append('''
grails {
    mail {
        host = "smtp.host.org"
        port = 465
        username = "user@host.org"
        password = "pass"
        props = ["mail.smtp.auth":"true",
                 "mail.smtp.socketFactory.port":"465",
                 "mail.smtp.socketFactory.class":"javax.net.ssl.SSLSocketFactory",
                 "mail.smtp.socketFactory.fallback":"false"]
    }
}
grails.from.register = "You <you@host.org>"
grails.from.general = "Someone <someone@host.org>"
environments {
    development {
        grails.mail.disabled=true
    }
}
''')
        println 'Plugin installed. Please check your Config.groovy file and update it with your e-mail configurations. ' +
                'If you aren\'t using Willcrisis Security Plugin, you can delete grails.from.register property.'
    }
}