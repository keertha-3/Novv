package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.Share_Page;

public class Share_Test {
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
		Share_Page a=new Share_Page(driver);
		a.set();
		a.set5();
		a.set7();
		a.set6();
		a.set8();
		a.set4();
		a.set1();
		a.set2();
		a.set3();
	}	
}
