package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.File_Page;

public class File_Test {
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
		File_Page a=new File_Page(driver);
		 a.set();
		 a.set1();
		 a.set3("he");
		 a.set4();
		 a.set5();
		 a.set6("z-a");
		 a.set7();
		 a.set8();
		 
	}
}