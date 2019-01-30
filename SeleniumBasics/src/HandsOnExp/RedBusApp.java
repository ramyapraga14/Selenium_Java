package HandsOnExp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		driver.findElement(By.id("signin-block")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.xpath("//div[@class='signin-screen' and text()='SIGN IN using Email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='otpOtherSignIn mainSignIn' and text()='Try other ways to sign in'])[2]")).click();
		driver.findElement(By.className("abcRioButtonContentWrapper")).click();
		Thread.sleep(2000);
		Set<String> window_id = driver.getWindowHandles();
		driver.switchTo().window(window_id.toArray()[1].toString());
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("ramya.sethu20@gmail.com");
		
				

	}

}
