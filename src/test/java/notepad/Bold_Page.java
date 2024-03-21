package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bold_Page {
	WebDriver driver;
	By signin=By.id("loginBtn");
	By google=By.xpath("//*[@id=\"main-content\"]/div/footer/div[2]/div[5]/div[2]/div/div/button");
	By name=By.id("identifierId");
	By next=By.id("identifierNext");
	By dissmiss=By.xpath("//*[@id=\"main-content\"]/div/footer/div[2]/div[5]/div[3]/button");
	By header=By.xpath("//*[@id=\"TtextEdior\"]/div[3]/div[4]/span[1]/span/span[1]");
	By heading1=By.xpath("//*[@id=\"ql-picker-options-0\"]/span[1]");
	By bold=By.xpath("//*[@id=\"TtextEdior\"]/div[3]/div[4]/span[2]/button[1]");
	By enter=By.xpath("//*[@id=\"editorTextarea\"]/div[1]");
	By keyword=By.xpath("//*[@id=\"editorTextarea\"]/div[1]");
	By italic=By.xpath("//*[@id=\"TtextEdior\"]/div[3]/div[4]/span[2]/button[2]");
	By enter1=By.xpath("//*[@id=\"editorTextarea\"]/div[1]");
	By keyword1=By.xpath("//*[@id=\"editorTextarea\"]/div[1]");
	By underline=By.xpath("//*[@id=\"TtextEdior\"]/div[3]/div[4]/span[2]/button[3]");
	By enter2=By.xpath("//*[@id=\"editorTextarea\"]/div[1]");
	By keyword2=By.xpath("//*[@id=\"editorTextarea\"]/div[1]");
	By count=By.xpath("//*[@id=\"TtextEdior\"]/div[3]/div[4]/span[3]/button[1]");
	By bullet=By.xpath("//*[@id=\"TtextEdior\"]/div[3]/div[4]/span[3]/button[2]");
	By title=By.id("doc__title");
	By save=By.id("downloadFile");
	By text=By.xpath("//*[@id=\"popup__content\"]/div/button[1]");
	By pdf=By.xpath("//*[@id=\"popup__content\"]/div/button[2]");
	By word=By.xpath("//*[@id=\"popup__content\"]/div/button[3]");
	By download=By.id("downloadFileBtn");
	By dismiss=By.xpath("//*[@id=\"main-content\"]/div/footer/div[2]/div[6]/div[3]/button[1]");
	By close=By.xpath("//*[@id=\"main-content\"]/div/footer/div[2]/div[6]/div[1]/button");
	By clear=By.id("clear__document");
	
	
	 public Bold_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
    
	public void set() throws Exception {
		driver.findElement(signin).click();
		Thread.sleep(1000);
	}
	
	public void sett() throws Exception {
		driver.findElement(google).click();
		Thread.sleep(1000);
	}
	
	public void settt(String d) throws Exception {
		driver.findElement(name).sendKeys(d);
		Thread.sleep(1000);
	}
	
	public void setttt() throws Exception {
		driver.findElement(next).click();
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
//	public void settttt() {
//		driver.findElement(dissmiss).click();
//	}
	public void se() throws Exception {
		driver.findElement(header).click();
		Thread.sleep(2000);	
	}
	
	public void se1() {
		driver.findElement(heading1).click();
	}
	
	public void set1() throws Exception {
		driver.findElement(bold).click();
		Thread.sleep(1000);
	}
	
	public void set3() throws Exception {
		driver.findElement(enter).click();
		Thread.sleep(1000);
	}
	
	public void set7() throws Exception {
		driver.findElement(enter).clear();
		Thread.sleep(1000);
	}
	
	public void set2(String a) throws Exception {
		driver.findElement(keyword).sendKeys(a);
		Thread.sleep(1000);
	}
	
	public void set4() throws Exception {
		driver.findElement(italic).click();
		Thread.sleep(3000);
	}
	
	public void set5() throws Exception{
		driver.findElement(enter1).click();
		Thread.sleep(1000);
	}
	
	public void set11() throws Exception {
		driver.findElement(enter1).clear();
		Thread.sleep(1000);
	}
	
	public void set6(String b) throws Exception {
		driver.findElement(keyword1).sendKeys(b);
		Thread.sleep(1000);
	}
	
	public void set9() throws Exception {
		driver.findElement(underline).click();
		Thread.sleep(1000);
	}
	
	public void set8() throws Exception {
		driver.findElement(enter2).click();
		Thread.sleep(1000);
	}
	
	public void set10(String c) throws Exception {
		driver.findElement(keyword2).sendKeys(c);
		Thread.sleep(2000);
	}
	
	public void set12() throws Exception {
		driver.findElement(count).click();
		Thread.sleep(2000);
		driver.findElement(bullet).click();
		Thread.sleep(2000);
	}
	
	public void set13() throws Exception {
		driver.findElement(title).click();
		Thread.sleep(1000);
	}
	
	public void set14(String d) throws Exception {
		driver.findElement(title).sendKeys(d);
		Thread.sleep(1000);
	}
	
	public void set15() throws Exception {
		driver.findElement(save).click();
		Thread.sleep(1000);
	}
	
	public void set16() throws Exception {
		driver.findElement(text).click();
		Thread.sleep(2000);
	}
	
	public void set19() throws Exception {
		driver.findElement(pdf).click();
		Thread.sleep(2000);
	}
	
	public void set20() throws Exception {
		driver.findElement(word).click();
		Thread.sleep(2000);
	}
	
	public void set17() throws Exception {
		driver.findElement(download).click();
		Thread.sleep(2000);
	}
	
	public void set18() throws Exception{
		driver.findElement(dismiss).click();
		Thread.sleep(1000);
	}
	
	public void set22() throws Exception {
		driver.findElement(save).click();
		Thread.sleep(2000);
	}
	
	public void set21() throws Exception {
		driver.findElement(close).click();
		Thread.sleep(2000);
	}
	
	public void set23() throws Exception {
		driver.findElement(clear).click();	
		Thread.sleep(4000);
		}
	
	
	}
	
	
	
	
	
	
	
	
