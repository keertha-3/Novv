package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import notepad.Terms_Page;

public class Terms_Test {
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
	Terms_Page a=new Terms_Page (driver);
//	a.set();
	a.set0();
	a.set11();
	a.set12();
	a.set13("anu");
	a.set14();
	a.set15();
	a.set16();
	a.set17();
	a.set18();
	a.set19("anu");
	a.set20();
	a.set21();
	a.set24();
	a.set22();
	a.set25();
	a.set26("heyy");
	a.set23();
	a.set28();
	a.set29();
	a.set30("hey");
	a.set31();
	a.set32();
	a.set27();
	a.set34();
	a.set33();
	a.set35();
	a.set36();
	a.set37();
	a.set38();
	a.set39();
	a.set40();
	a.set41();
	a.set42();
	a.set43();
	a.set44();
	a.set45();
	
	}
}
