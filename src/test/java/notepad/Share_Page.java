package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Share_Page {
	WebDriver driver;
	By share=By.id("shareDoc");
	By dismiss=By.xpath("//*[@id=\"main-content\"]/div/footer/div[2]/div[8]/div[3]/button");
	By close=By.xpath("//*[@id=\"main-content\"]/div/footer/div[2]/div[8]/div[1]/button");
	By fb=By.xpath("//*[@id=\"popup__content\"]/div/a[1]");
	By twitter=By.xpath("//*[@id=\"popup__content\"]/div/a[2]");
	By mail=By.xpath("//*[@id=\"popup__content\"]/div/a[3]");
	By link=By.xpath("//*[@id=\"popup__content\"]/div/a[4]");
	
	
	public Share_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public void set() {
		driver.findElement(share).click();
	}
	
	public void set5() {
		driver.findElement(dismiss).click();
	}
	
	public void set7() {
		driver.findElement(share).click();
	}
	
	public void set6() {
		driver.findElement(close).click();
	}
	
	public void set8() {
		driver.findElement(share).click();
	}
	
	public void set4() throws Exception {
		driver.findElement(link).click();
		Thread.sleep(2000);
	}
	
	public void set1() throws Exception {
		driver.findElement(fb).click();
		Thread.sleep(2000);
	}
	
	public void set2() throws Exception {
		driver.findElement(twitter).click();
		Thread.sleep(2000);
	}
	
	public void set3() throws Exception {
		driver.findElement(mail).click();
		Thread.sleep(2000);
	}

}
