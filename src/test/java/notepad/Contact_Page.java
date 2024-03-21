package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact_Page {
	WebDriver driver;
	By contact=By.xpath("/html/body/div/aside/div/nav/a[6]");
	By name=By.id("name");
	By email=By.id("email");
	By message=By.id("message");
	By submit=By.name("submit");
	By mail=By.xpath("//*[@id=\"main-content\"]/main/section/div/div/div[2]/address/a[1]/span");
	By close=By.xpath("//*[@id=\"contact_success\"]/div[3]/button");
	
	public Contact_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	
	public void set() throws Exception {
		Thread.sleep(3000);
		driver.findElement(contact).click();
	}
	
	public void set2(String a) {
		driver.findElement(name).sendKeys(a);
	}
	
	public void set4(String b) {
		driver.findElement(email).sendKeys(b);;
	}
	
	public void set5(String c) throws Exception {
		driver.findElement(message).sendKeys(c);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void set6() {
		driver.findElement(submit).click();
	}
	
	public void set7() throws Exception {
		driver.findElement(mail).click();
		Thread.sleep(2000);
	}
	
	public void set8() throws Exception {
		driver.findElement(close).click();
		Thread.sleep(2000);
	}
	
	
}
