package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search_Page {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"searchBtn\"]/img");
	By searching=By.id("search");
	By close=By.xpath("//*[@id=\"searchPopup\"]/div/div[1]/button/span");
	By night=By.id("toggle");
	By instruction=By.xpath("//*[@id=\"aboutToolBtn\"]/img");
	By link=By.xpath("//*[@id=\"content\"]/div/ol[1]/li[1]/a/span");
	By down=By.id("content");
	By close1=By.xpath("//*[@id=\"aboutUsPopup\"]/div[1]/button");
	
	public Search_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public void set() {
		driver.findElement(search).click();
	}
	
	public void set2(String a) throws Exception {
		driver.findElement(searching).sendKeys(a,Keys.ENTER);
		Thread.sleep(2000);
	}
	
	public void set4() throws Exception {
		driver.findElement(close).click();
		Thread.sleep(2000);
	}
	
	public void set3() throws Exception {
		driver.findElement(night).click();
		Thread.sleep(2000);
	}
	
	public void set5() {
		driver.findElement(instruction).click();
		driver.findElement(link).click();
	}
	
	public void set6() {
		driver.findElement(instruction).click();
	}
	
	public void set7() {
		driver.findElement(down).click();
}
	public void set8() throws Exception {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)","");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	public void set9() {
		driver.findElement(close1).click();
	}
}

