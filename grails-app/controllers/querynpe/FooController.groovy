package querynpe

import grails.converters.JSON

class FooController {

    def fooService

    def index() {
        def fooList = fooService.findAllFoos()
        def total = fooList.totalCount // NPE

        render([foos: fooList, total: total] as JSON)
    }
}
