package com.tekdays

class TekEvent {

    String city
    String name
    TekUser organizer
    String venue
    Date startDate
    Date endDate
    String description

    String toString() {
        "$name, $city"
    }

static hasMany = [volunteers : TekUser, respondents : String]
    static constraints = {
        name()
        city()
        description maxSize: 5000
        organizer()
        venue()
        startDate()
        endDate()
    }
}
