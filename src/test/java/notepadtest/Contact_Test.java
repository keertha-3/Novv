package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.Contact_Page;

public class Contact_Test  {
	WebDriver driver;
	String url="https://www.onlinenotepad.io/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url() {
		driver.get(url);
	}
	
	@Test
	public void log() throws Exception {
	Contact_Page a=new Contact_Page(driver);
	 a.set();
	 a.set2("keertha");
	 a.set4("sureshsankeertha3@gmail.com");
	 a.set5("message");
	 a.set6();
	 a.set7();
	}
}
