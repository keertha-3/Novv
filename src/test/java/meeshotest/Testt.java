package meeshotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import meeshopage.Pagee;

public class Testt {
		WebDriver driver;
		String url="https://www.meesho.com/";
		
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void url() {
			driver.get(url);
		}
		
		@Test
		public void u() throws Exception {
			Pagee a=new Pagee(driver);
			a.set("saree");
			a.set1();
			a.set2();
			a.set3();
			a.set4();
			a.set5();
			a.set6();			
		}
}
