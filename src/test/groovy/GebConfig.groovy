/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/


import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

waiting {
	timeout = 2
}

environments {

	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		ChromeDriverManager.instance.setup()
		driver = {

			ChromeOptions options = new ChromeOptions()
			options.addArguments('--headless', '--disable-gpu')

			def capabilities = DesiredCapabilities.chrome()
			capabilities.setCapability(ChromeOptions.CAPABILITY, options)

			def driver = new ChromeDriver(capabilities)
			return driver
		}
	}
}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "https://www.google.com"
reportsDir = "build/reports/intellij-geb-reports"
