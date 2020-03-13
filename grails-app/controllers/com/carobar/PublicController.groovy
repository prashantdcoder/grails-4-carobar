package com.carobar

import grails.plugin.springsecurity.annotation.Secured

class PublicController {

    @Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
    def index() { }
}
