package com.maveric.selenium.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MavericConnect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://connect.maveric-systems.com");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		if(title.equals("Maveric Systems Ltd. - Login"))
		{
			System.out.println("Pass");
		}
	driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys("ramyas");
	driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys("Praga@2017");
	driver.findElement(By.xpath("//input[@name='yt0']")).click();
	Actions actions = new Actions(driver);
	WebElement menu = driver.findElement(By.xpath("(//img[@src='/assets/f2273210/down.gif'])[2]"));
	actions.moveToElement(menu).build().perform();
	Thread.sleep(1000);
	WebElement submenu = driver.findElement(By.xpath("(//img[@src='/assets/10e2a9a/right.gif'])[1]"));
	actions.moveToElement(submenu).build().perform();
	Thread.sleep(1000);
//	WebElement submenu1 = driver.findElement(By.linkText("Human Resource"));
	WebElement submenu1 = driver.findElement(By.linkText("Human Resource"));
	actions.moveToElement(submenu1);
	actions.click().build().perform();
	System.out.println("Action performed");
		/*driver.findElement(By.xpath("(//img[@src='/assets/f2273210/down.gif'])[2]")).click();
	//WebElement submenu = driver.findElement(By.linkText("Organization QMS Policies"));
	WebElement submenu = driver.findElement(By.xpath("(//img[@src='/assets/10e2a9a/right.gif'])[1]"));
	actions.moveToElement(submenu);
	actions.click().build().perform();
	driver.findElement(By.xpath("(//img[@src='/assets/10e2a9a/right.gif'])[1]")).click();*/
	driver.findElement(By.xpath("//div[@class='hitarea expandable-hitarea lastExpandable-hitarea']")).click();
	driver.findElement(By.xpath("//li[@id='18']//div[@class='hitarea expandable-hitarea lastExpandable-hitarea']")).click();
	driver.findElement(By.xpath("//a[contains(text(),\"Holiday Calendar List - 2019 - India\")]")).click();
	
	}

}
