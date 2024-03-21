package notepadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import notepad.Upload_page;

public class Upload_test {
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
		Upload_page a=new Upload_page(driver);
		a.set1();
}
	
	@Test
	public void log1() throws Exception {
		Upload_page b=new Upload_page(driver);
	    b.set();
	    b.set2();
	    b.set3();
}	
}