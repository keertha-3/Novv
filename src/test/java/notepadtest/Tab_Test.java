package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import notepad.Tab_Page;

public class Tab_Test {
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
		Tab_Page a=new Tab_Page(driver);
		 a.set1("heyy");
		 a.set2();
		 a.set3("he");
		 a.set4();
		 a.set5();
		 a.set6();
		 a.set8("the login page is not working properly and is not secure");
		 a.set9();
}
}
