package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvokeEdgeDriver {
@Test
	public void InvokeEdgeDriver() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Program Files\\Java\\edgedriver\\msedgedriver.exe");

		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev");

	}

}
