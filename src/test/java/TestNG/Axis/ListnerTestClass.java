package TestNG.Axis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class ListnerTestClass {
		
		@Test
		public void invokechrome() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
			driver.close();

		

}
}