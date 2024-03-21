package amazontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazonclass.Amazon_Class;

public class Amazon_Test {
	WebDriver driver;
	String url="https://www.amazon.in";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get(url);
	}
	@Test
	public void eh() {
		Amazon_Class ob=new Amazon_Class(driver);
		ob.setvalues();
		ob.log("abc@123");
		ob.signin();
	}
}
