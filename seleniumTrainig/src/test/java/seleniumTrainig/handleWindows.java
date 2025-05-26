package seleniumTrainig;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
//		driver.switchTo().frame(0);
		driver.switchTo().frame("iframeResult");
		System.out.println("Successfully Switched to Frame");
		driver.switchTo().parentFrame();
		System.out.println("Switched back to parent frame");

	}

}
