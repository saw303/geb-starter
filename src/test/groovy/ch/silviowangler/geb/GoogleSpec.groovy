
import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class GoogleSpec extends GebReportingSpec {

  void "Visit Google.com"() {

    when:
    go "/"

    then:
    title == 'Google'
  }

  void "Make sure the query field is initially empty"() {

    expect:
    $("input", name: "q").text() == ''
  }

  void "Enter a query"() {

    when: 'Enter "Geb Framework" into the search field'
    $("input", name: "q").value 'Geb Framework'

    and: 'Click the search button'
    $("button", name: "btnG").click()

    and: 'wait until the search result element is visible'
    waitFor { $('#sbfrm_l').displayed }

    then:
    $('h3.r')[0].text() == 'Geb - Very Groovy Browser Automation'

  }
}
