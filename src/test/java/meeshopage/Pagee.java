package meeshopage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Pagee {
	WebDriver driver;
	
	By search=By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input");
	By men=By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[5]");
	By jew=By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[6]/div/div[3]/a[5]/p");
	By hair=By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[15]/div[2]/div/span[5]/a");
	
	
	public Pagee(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	
	public void set(String a) throws Exception {
		driver.findElement(search).sendKeys(a);
		Thread.sleep(2000);
	}
	
	public void set1() throws Exception {
		Actions action =new Actions(driver);
		driver.findElement(men).click();;
		action.perform();
		Thread.sleep(2000);
	}
	
	public void set2() throws Exception {
	driver.findElement(jew).click();
	Thread.sleep(2000);
}
	
	public void set3() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("Window.ScrollBy(0,1000)","");
	}
	
	public void set4() {
		String ac=driver.getTitle();
		String ex="Meesho Logo";
		Assert.assertEquals(ac, ex);
		}

	public void set5() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("Window.ScrollBy(0,1000)","");
	}
	
	public void set6() {
		driver.findElement(hair).click();
		
	}
	}
