package TestNG.Axis;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChrome {

	
@Test


public void InvokeChrome() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/");

	
}
}


