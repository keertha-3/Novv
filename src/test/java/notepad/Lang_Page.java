package notepad;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Lang_Page {
	WebDriver driver;
	By drop=By.id("langs");
	By select=By.xpath("//*[@id=\"langs\"]/div/a[2]");
	By select1=By.xpath("//*[@id=\"langs\"]/div/a[3]");
	By select2=By.xpath("//*[@id=\"langs\"]/div/a[1]/span");
	By full=By.id("fullscreen");
	By clone=By.xpath("//*[@id=\"TtextEdior\"]/div[1]/div[2]/div[1]");
	
	public Lang_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	
	public void set() {
		driver.findElement(drop).click();
	}
	
	public void set2(){
	List<WebElement>li= driver.findElements(By.tagName("a"));
	System.out.println("total link="+ li.size());
	for (WebElement element :li) {
	String link=element.getAttribute("href");
	Verify(link);
	}
	}
	
	private void Verify(String link) {
		// TODO Auto-generated method stub
		System.out.println(link);
		
	}

	public void set1() throws Exception {
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(select).click();;
		Thread.sleep(2000);
	}
	
	public void set7() {
		driver.findElement(drop).click();
	}
	
	public void set6() {
		driver.findElement(select1).click();
	}
	
	public void set8() {
		driver.findElement(drop).click();
	}
	
	public void set5() {
		driver.findElement(select2).click();
	}
	
	public void set4() throws Exception {
		driver.findElement(full).click();
		Thread.sleep(2000);
	}
	
	public void set3() throws Exception {
		driver.findElement(clone).click();
		Thread.sleep(2000);
	}
}
