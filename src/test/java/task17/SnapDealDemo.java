package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealDemo {
	
	
		String ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ url="https://www.snapdeal.com/";
	String signInXpath = "//span[text()='Sign In']";
	String loginXpath = "//a[text()='login']";
	String emailFeildID = "userName";
	
	
	public void launchSnapDeal() {
		
		driver.get(url);
		driver.findElement(By.xpath(signInXpath)).click();
		driver.findElement(By.xpath(loginXpath)).click();
		//Elements inside the iframe can be found using findElement and findElements method but can't be interacted with
		WebElement element = driver.findElement(By.name("iframeLogin"));
		driver.switchTo().frame(element);
		driver.findElement(By.id(emailFeildID)).sendKeys("swathijat17@test.com");
				
	}
	
    public void launchSnapDealAndMouseHover() {
		
		driver.get(url);
		WebElement element = driver.findElement(By.xpath(signInXpath));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		SnapDealDemo snap=new SnapDealDemo();
		snap.launchSnapDeal();
	    snap.launchSnapDealAndMouseHover();
				
		

	}

}
