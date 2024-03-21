package notepadtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.Search_Page;

public class Search_Test {
	WebDriver driver;
	String url2="https://www.onlinenotepad.io/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url() {
		driver.get(url2);
	}
	
	@Test
	public void log () throws Exception{
		Search_Page a=new Search_Page(driver);
		a.set();
		a.set2("hey");
		a.set4();
		a.set3();
		a.set5();
		a.set6();
		a.set7();
		a.set8();
		a.set9();
	}
}