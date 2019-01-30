package package1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		WebElement sbc = driver.findElement(By.partialLinkText("Shop by"));
		Actions act = new Actions(driver);
		act.moveToElement(sbc).build().perform();
		act.pause(2000).moveToElement(driver.findElement(By.xpath("//span[text()='Amazon Prime Video']")))
		.build()
		.perform();
		act.keyDown(Keys.CONTROL)
		.pause(1000)
		.click(driver.findElement(By.partialLinkText("TV Shows")))
		.pause(1000)
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		System.out.println(driver.getWindowHandles());
		Set<String> winids = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		driver.switchTo().window(winids.toArray()[1].toString());
		driver.findElement(By.xpath("//img[@alt='Join Prime']")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.switchTo().window(parent);
		driver.close();
	}

}
