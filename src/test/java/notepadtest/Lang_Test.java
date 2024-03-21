package notepadtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.Lang_Page;

public class Lang_Test {
	WebDriver driver;
	String url3="https://www.onlinenotepad.io/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url() {
		driver.get(url3);
	}
	@Test
	public void log () throws Exception {
		Lang_Page b=new Lang_Page(driver);
		b.set();
		b.set2();
		b.set1();
		b.set7();
		b.set6();
		b.set8();
		b.set5();
		b.set4();
		b.set3();
	}	
	}