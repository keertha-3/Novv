package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewW_page {
	WebDriver driver;
	By ter=By.xpath("/html/body/div/aside/div/nav/a[8]");
	By terms=By.xpath("//*[@id=\"main-content\"]/div/div/p[5]/a");
	By federal=By.id("Layer_1");
	By expand=By.xpath("//*[@id=\"block-menu-block-cfg-main-menu-mega\"]/ul/li[1]/button");
	By expand1=By.xpath("//*[@id=\"block-menu-block-cfg-main-menu-mega\"]/ul/li[2]/button");
	By expand2=By.xpath("//*[@id=\"block-menu-block-cfg-main-menu-mega\"]/ul/li[3]/button");
	By expand3=By.xpath("//*[@id=\"block-menu-block-cfg-main-menu-mega\"]/ul/li[4]/button");
	By expand4=By.xpath("//*[@id=\"block-menu-block-cfg-main-menu-mega\"]/ul/li[5]/button");
	By expand5=By.xpath("//*[@id=\"block-menu-block-cfg-main-menu-mega\"]/ul/li[6]/a");
	By expand6=By.xpath("//*[@id=\"block-language-block-language-content\"]/div/div/a");
	By expand7=By.xpath("//*[@id=\"top\"]/div/div[2]/div/ul/li/a");
	By expand8=By.xpath("//*[@id=\"block-menu-block-cfg-secondary-menu\"]/ul/li[1]/a");
	By expand9=By.xpath("//*[@id=\"block-menu-block-cfg-secondary-menu\"]/ul/li[2]/a");
	By expand10=By.xpath("//*[@id=\"block-menu-block-cfg-secondary-menu\"]/ul/li[3]/a");
	By expand11=By.xpath("//*[@id=\"block-menu-block-cfg-secondary-menu\"]/ul/li[4]/a");
	By expand12=By.cssSelector("svg.tawk-min-chat-icon");
	
	
	public NewW_page(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public void ter() {
		driver.findElement(ter).click();
	}
	
	public void termss() {
		driver.findElement(terms).click();
	}

	public void set4() {
		driver.findElement(federal).click();
	}

	public void set5() {
		driver.findElement(expand).click();
	}

	public void set6() {
		driver.findElement(expand1).click();
	}

	public void set7() {
		driver.findElement(expand2).click();
	}

	public void set8() {
		driver.findElement(expand3).click();
	}

	public void set9() {
		driver.findElement(expand4).click();
	}

	public void set10() {
		driver.findElement(expand5).click();	
	}
	
	public void set11() {
		driver.findElement(expand6).click();
	}
	
	public void set12() {
		driver.findElement(expand7).click();
	}
	
	public void se13() throws Exception {
		driver.findElement(expand8).click();
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void set14() {
		driver.findElement(expand9).click();
	}
	
	public void set15() {
		driver.findElement(expand10).click();
		driver.navigate().back();
	}
		
	public void set16() {
		driver.findElement(expand11).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
//	public void set17() throws Exception {
//		Thread.sleep(4000);
//		WebElement chat=driver.findElement(expand12);
//		String res=chat.getText();
//		System.out.println("chat:"+res);
//	}	
	}

