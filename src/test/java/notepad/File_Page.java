package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class File_Page {
	WebDriver driver;
	By files=By.id("viewAllBtn");
	By search=By.id("popup__searchBtn");
	By search1=By.id("search");
	By close=By.xpath("//*[@id=\"searchPopup\"]/div/div[1]/button");
	By az=By.id("notes__filter");
	By all=By.id("show__label__dropdown");
	By close1=By.xpath("//*[@id=\"viewAllContentPopup\"]/div[1]/button");
	
	public File_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	
	public void set() throws Exception {
		driver.findElement(files).click();
		Thread.sleep(3000);
	}
	
	public void set1() throws Exception {
		driver.findElement(search).click();
		Thread.sleep(3000);
	}
	
	public void set3(String a) throws Exception {
		driver.findElement(search1).sendKeys(a,Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public void set4() throws Exception {
		driver.findElement(close).click();
		Thread.sleep(4000);
	}
	
	public void set5() throws Exception {
		driver.findElement(files).click();
		Thread.sleep(3000);
	}
	
		public void set6(String value) throws Exception {
		   WebElement element= driver.findElement(az);
			Select select=new Select(element);
		    select.selectByValue(value);
		    Thread.sleep(3000);
		}	
		
		public void set7() {
			driver.findElement(all).click();
		}
		
		public void set8() {
			driver.findElement(close1).click();
		}		
		}

