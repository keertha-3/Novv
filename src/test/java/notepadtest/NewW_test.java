package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.NewW_page;

public class NewW_test {
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
		NewW_page a= new NewW_page (driver);
		a.ter();
		a.termss();
		a.set4();
		a.set5();
		a.set6();
		a.set7();
		a.set8();
		a.set9();
		a.set10();
		a.set11();
		a.set12();
		a.se13();
		a.set14();
		a.set15();
		a.set16();
//		a.set17();
	}
}
