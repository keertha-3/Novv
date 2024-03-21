package notepad;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Upload_page {
	WebDriver driver;
	By clear=By.id("clear__document");
	By image=By.xpath("//*[@id=\"TtextEdior\"]/div[3]/div[4]/span[4]/button");
	By upload=By.id("txtFile");
	By page=By.xpath("/html/body/div[1]/aside/div/nav/a[1]");
	By page1=By.id("viewAllBtn");
	

	public Upload_page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public void sett() {
		driver.findElement(clear).click();
	}
	
	
	public void set1() throws IOException, Exception {
		driver.findElement(image).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\hp\\OneDrive\\Desktop\\up.exe");
		Thread.sleep(2000);
	}
	
	public void set() throws IOException, Exception {
		driver.findElement(image).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\hp\\OneDrive\\Desktop\\down1.exe");
		Thread.sleep(2000);
	}
	
	public void set2() {
		driver.findElement(page).click();
	}
	
	public void set3() {
		driver.findElement(page1).click();
	}
}
