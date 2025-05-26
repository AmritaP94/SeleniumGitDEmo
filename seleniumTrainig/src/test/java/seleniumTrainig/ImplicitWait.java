package seleniumTrainig;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));

		Actions action = new Actions(driver);
		action.moveToElement(electronics).perform();
		//Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
//		WebElement apple = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
		//Explicit wait is from WebDriverWait class.
		
		//Fluent wait
		Wait<ChromeDriver> wait1 = new FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.withMessage("XYZ").ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
		
		//With Fluent wait we can add custom message.
		//inherits from Wait interface which is implemented by FluentWait class.
		
	}

}
