package notepad;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Terms_Page {
	WebDriver driver;
//	By terms=By.xpath("/html/body/div[1]/aside/div/nav/a[8]");
	By changelog=By.xpath("/html/body/div/aside/div/nav/a[9]");
	By profile=By.xpath("//*[@id=\"main-content\"]/main/section/div[1]/div[1]");
	By name=By.id("user__name");
	By preferences=By.xpath("//*[@id=\"main-content\"]/main/section/div[1]/div[2]");
	By theme=By.id("themeLight");
	By theme1=By.id("themeDark");
	By theme2=By.id("themeSystem");
	By label=By.xpath("//*[@id=\"main-content\"]/main/section/div[1]/div[3]");
	By labelname=By.xpath("//*[@id=\"main-content\"]/main/section/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/input");
	By color=By.id("label__color__list");
	By color1=By.cssSelector("input[name='label__color__list']");
	By create=By.xpath("//*[@id=\"main-content\"]/main/section/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]/button");
	By about=By.id("aboutToolBtn");
	By close=By.xpath("//*[@id=\"aboutUsPopup\"]/div[1]/button");
	By home=By.xpath("/html/body/div/aside/div/div");
	By untitled=By.id("doc__title");
	By settings=By.id("viewAllBtn");
	By search=By.id("popup__searchBtn");
	By doc=By.id("search");
	By close1=By.xpath("//*[@id=\"searchPopup\"]/div/div[1]/button");
	By openfile=By.xpath("//*[@id=\"viewcontent\"]/div/div[1]/div[1]/div/a");
	By label1=By.xpath("//*[@id=\"viewcontent\"]/div/div[1]/div[2]/div[2]/button[2]");
	By selectlabel=By.xpath("//*[@id=\"new__label__id\"]/div[1]");
	By create1=By.id("create__new__label");
	By delete=By.xpath("//*[@id=\"viewcontent\"]/div/div[1]/div[2]/div[2]/button[1]");
	By pop=By.xpath("//*[@id=\"main-content\"]/footer/div[2]/div[7]/div[1]/button");
	By label2=By.xpath("//*[@id=\"viewcontent\"]/div/div[1]/div[2]/div[2]/button[2]");
	By done=By.id("assignLabelBtn");
	By dissmiss=By.id("dismissLabelPopup");
	By close2=By.xpath("//*[@id=\"viewAllContentPopup\"]/div[1]/button");
	

	public Terms_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

//	public void set() throws Exception{
//		driver.findElement(terms).click();
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2000)", "");
//		Thread.sleep(4000);
//	}
	
	public void set0() {
		driver.findElement(changelog).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
	}
	
	public void set11() {
		driver.navigate().to("https://www.onlinenotepad.io/account/?new-label");
	}
	
	public void set12() {
		driver.findElement(profile).click();
	}
	
	public void set13(String a) {
		driver.findElement(name).sendKeys(a);
	}
	
	public void set14() {
		driver.findElement(preferences).click();;
	}
	
	public void set15() throws Exception {
		driver.findElement(theme).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)","");
		Thread.sleep(3000);
	}
	
	public void set16() throws Exception {
		driver.findElement(theme1).click();
		Thread.sleep(2000);
	}
	
	public void set17() throws Exception {
		driver.findElement(theme2).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)","");
		Thread.sleep(3000);
	}
	
	public void set18() {
		driver.findElement(label).click();
	}
	
	public void set19(String b) {
		driver.findElement(labelname).sendKeys(b);
	}
	
	public void set20() {
		driver.findElement(color).click();
		WebElement colorr=driver.findElement(color1);
		colorr.click();
		colorr.sendKeys("#0000ff");
	}
	
	public void set21() throws Exception {
		driver.findElement(create).click();
		Thread.sleep(2000);
	}
	
	public void set24() throws Exception {
		driver.findElement(about).click();
		Thread.sleep(4000);
		driver.findElement(close).click();
	}
	
	public void set22() {
		driver.navigate().to("https://www.onlinenotepad.io/blog");
	}
	
	public void set25() {
		driver.findElement(home).click();
	}
	
	public void set26(String c) {
		driver.findElement(untitled).sendKeys(c);
	}
	
	public void set23() {
		driver.findElement(settings).click();	
	}
	
	public void set28() {
		driver.findElement(search).click();
	}
	
	public void set29() throws Exception {
		driver.findElement(doc).click();
		Thread.sleep(3000);
	}
	
	public void set30(String d) throws Exception   {
		driver.findElement(doc).sendKeys(d,Keys.ENTER);
		Thread.sleep(6000);
	}
	
	public void set31() {
		driver.findElement(close1).click();
	}
	
	public void set32() throws Exception {
		driver.findElement(settings).click();
		Thread.sleep(4000);
	}
	
	public void set27() throws Exception {
		WebElement clickable = driver.findElement(openfile);
        new Actions(driver)
        .clickAndHold(clickable).click()
        .perform();
        Thread.sleep(3000);
	}
	
	public void set34() throws Exception {
		driver.findElement(settings).click();
		Thread.sleep(3000);
	}
	
	public void set33() {
		driver.findElement(label1).click();
	}
	
	public void set35() {
		driver.findElement(selectlabel).click();
	}
	
	public void set36() {
		driver.findElement(create1).click();
	}
	
	public void set37() throws Exception {
		driver.findElement(settings).click();
		Thread.sleep(3000);
	}
	
	public void set38() throws Exception {
		driver.findElement(delete).click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
	    String alert1=driver.switchTo().alert().getText();
	    System.out.println(alert1);
	    alert.accept();
		
//		Alert alert= driver.switchTo().alert();
//		Thread.sleep(3000);
//	    String alert1=driver.switchTo().alert().getText();
//	    System.out.println(alert1);
//	    alert.dismiss();
	}
	
	public void set39() throws Exception {
		driver.findElement(pop).click();
		Thread.sleep(4000);
	}
	
	public void set40() throws Exception {
		driver.findElement(settings).click();
		Thread.sleep(4000);
	}
	
	public void set41() {
		driver.findElement(label2).click();
	}
	
	public void set42() throws Exception {
		driver.findElement(done).click();
		Thread.sleep(2000);
	}
	
	public void set43() throws Exception {
		driver.findElement(label2).click();
		Thread.sleep(4000);
		
	}
	
	public void set44() throws Exception {
		driver.findElement(dissmiss).click();
		Thread.sleep(2000);
	}
	
	public void set45() {
		driver.findElement(close2).click();
	}
}
