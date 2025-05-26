package seleniumTrainig;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.findElement(By.xpath("(//a[contains(text(),\"Start free trial\")])[1]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		System.out.println("Switched Succesfully");
		driver.close();
	}

}
