package br.cefetrj.webdep.tests.smoke;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSmokeTest {

	@Test
	public void openPageSelenium() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/webdep/index.jsp");
        driver.quit();
	}

}
