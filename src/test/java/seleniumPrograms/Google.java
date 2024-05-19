package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//navigate to google
		driver.navigate().to("https://www.google.com/");
		//maximize the browser
		driver.manage().window().maximize();
	    Thread.sleep(5000);
		driver.findElement(By.id("input")).sendKeys("Selenium Browser Drivers");
		
		
	}

}
