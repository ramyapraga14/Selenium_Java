package com.maveric.selenium.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.findElement(By.name("B1")).click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		WebDriver driver1= new FirefoxDriver();
		driver1.get("http://www.echoecho.com/javascript4.htm");
		driver1.findElement(By.name("B3")).click();
		Thread.sleep(5000);
		Alert b = driver1.switchTo().alert();
		System.out.println(b.getText());
		b.sendKeys("input");
		b.dismiss();
	}

}
