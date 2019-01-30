package com.maveric.selenium.pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
		WebElement sb =driver.findElement(By.name("q"));
		sb.clear();
		sb.sendKeys("selenium");
		System.out.println(sb.getAttribute("maxlength"));
		System.out.println(sb.getCssValue("background-color"));
		//driver.findElement(By.className("sbtc")).click();
		driver.findElement(By.xpath("//span[text()='selenium']")).click();
		List<WebElement> results = driver.findElements(By.tagName("h3"));
		for (WebElement result:results)
			System.out.println(result.getText());
		results.get(3).click();
		
	}

}
