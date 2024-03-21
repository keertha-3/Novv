package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Privacy_Page {
	WebDriver driver;
	By privacy=By.xpath("/html/body/div/aside/div/nav/a[7]");
	By url1=By.xpath("//*[@id=\"main-content\"]/div/div/p[1]/a");
	By url=By.xpath("//*[@id=\"main-content\"]/div/div/p[3]/a");
	
	
	public Privacy_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public void set() {
		driver.findElement(privacy).click();
	}
	
	public void set1() {
		driver.findElement(url1).click();
		driver.navigate().back();
	}
	
	public void set2() {
		driver.findElement(url).click();
		driver.navigate().back();
		}
	
	public void set3() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)", "");
	}	
	}
	
	

