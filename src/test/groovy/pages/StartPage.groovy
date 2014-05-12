package pages

import geb.Page

class StartPage extends Page {

    static url = "/"

    static at = { $("h1").text() == "NANO Banking System" }

    static content = {
        newCustomerButton { $("a", text: containsWord("Register")) }
        activityRows { $("h3", text: "Recent Activity").next("table").find("tr") }
    }

}
