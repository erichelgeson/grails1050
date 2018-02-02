package querynpe

import grails.gorm.PagedResultList
import grails.gorm.transactions.ReadOnly

@ReadOnly
class FooService {

    // this query will find no foos
    PagedResultList<Foo> findAllFoos() {
        Foo.createCriteria().list {
            eq('name', "foobar")
        }
    }
}
