package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.Bold_Page;
import notepad.Contact_Page;
import notepad.File_Page;
import notepad.Share_Page;
import notepad.Tab_Page;
import notepad.Terms_Page;
import notepad.Upload_page;

public class Bold_Test {
	WebDriver driver;
	String url1="https://www.onlinenotepad.io/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url() {
		driver.get(url1);
	}
	@Test
	public void log() throws Exception {
		Bold_Page a=new Bold_Page(driver);
		a.set();
		a.sett();
		a.settt("sureshsankeertha3@gmail.com");
		a.setttt();
//		a.settttt();
		a.se();
		a.se1();
		a.set1();
		a.set3();
		a.set2("introduction");
		a.set7();
		a.set4();
		a.set5();
		a.set6("introduction");
		a.set11();
		a.set9();
		a.set8();
		a.set10("introduction");
		a.set12();
		a.set13();
		a.set14("intro");
		a.set15();
		a.set16();
		a.set19();
		a.set20();
		a.set17();
		a.set18();
		a.set22();
		a.set21();
		a.set23();
	}
}