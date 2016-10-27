/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/
import org.openqa.selenium.chrome.ChromeDriver

waiting {
	timeout = 2
}

environments {

	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}
}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://www.google.com"
