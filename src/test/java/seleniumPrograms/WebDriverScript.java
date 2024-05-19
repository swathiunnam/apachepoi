package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//navigate to google
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("input")).sendKeys("Selenium Browser Drivers");
		
	}

}
