package TestNG.Axis;

import org.testng.annotations.Test;

public class PriorityTesting {
	@Test(priority = 0)

	public void testcase0 () {

	System.out.println("Testcase0 executed successfully");

	}
	@Test(priority = 2)

	public void testcase2 () {

	System.out.println("Testcase2 executed successfully");

	}
	@Test(priority = 1)

	public void testcase1 () {

	System.out.println("Testcase1 executed successfully");

	}

}
