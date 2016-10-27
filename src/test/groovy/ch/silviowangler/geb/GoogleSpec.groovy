
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
}
