package seleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(500);
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(500);
		//navigate to google
		driver.navigate().to("https://google.com/");
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".truncate")).sendKeys("Selenium Browser Driver");
		
	}

}
