package specs

import geb.spock.GebReportingSpec
import pages.StartPage

class LoginSpec extends GebReportingSpec {

    def "login to see recent activity"() {
        given:
        go "/login"

        when:
        $("form").username = "demo"
        $("form").password = "demo"
        $("button").click(StartPage)
        
        then:
        activityRows.size() > 0
    }
}
