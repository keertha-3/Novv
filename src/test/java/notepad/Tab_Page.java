package notepad;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tab_Page {
	WebDriver driver;
	By untitled=By.id("doc__title");
	By search=By.id("searchBtn");
	By searching=By.id("search");
	By result=By.xpath("//*[@id=\"searchResult\"]/li/a/mark");
	By document=By.id("viewAllBtn");
	By feedback=By.cssSelector("#main-content > div > footer > div.popup__wrapper > div.secondPopUp.feedback__popup > div.popup__body > div > div.row.emoji_box.visible");
	By message=By.id("message");
	By send=By.id("send_feedback");
	
	public Tab_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	
	public void sett() {
		driver.findElement(untitled).click();
	}
	
	public void set1(String a) throws Exception {
		driver.findElement(untitled).sendKeys(a);
	    Thread.sleep(3000);
	}
	
	public void set2() throws Exception {
		driver.findElement(search).click();
		Thread.sleep(2000);
	}
	
	public void set3(String a) throws Exception{
		driver.findElement(searching).sendKeys(a);
		Thread.sleep(5000);
	}
	
	public void set4(){
		driver.findElement(result).click();
	}
	
	public void set5() throws Exception {
		driver.findElement(document).click();
		Thread.sleep(5000);
	}
	
	public void set6() {
		List<WebElement>fee=driver.findElements(feedback);
		for(WebElement b:fee) {
			b.click();
		}
	}
	
	public void set8(String a) {
		driver.findElement(message).sendKeys(a);
	}
	
	public void set9() {
		driver.findElement(send).click();
	}
	
}
