package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//navigate to google
		driver.navigate().to("https://www.Wikipedia.org/");
		//maximize the browser
		driver.manage().window().maximize();
		//search for query
	driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
	Thread.sleep(2000);
	driver.findElement(By.id("searchInput")).click();
	
		
		
		
		
		
				
		
	}

}
