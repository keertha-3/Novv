package amazonclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_Class {
	WebDriver driver;
	By enter=By.id("nav-link-accountList-nav-line-1");
	By email=By.name("email");
	By cont=By.id("continue");
	
	public Amazon_Class(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public void setvalues() {
		driver.findElement(enter).click();
		
	}
	
	public void log(String emails) {
		driver.findElement(email).sendKeys(emails);
	}
	public void signin()
	{
		driver.findElement(cont).click();
	}

}
