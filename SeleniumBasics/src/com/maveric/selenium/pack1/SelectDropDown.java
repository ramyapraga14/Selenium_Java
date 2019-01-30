package com.maveric.selenium.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://account.magento.com/customer/account/create/");
		Select country_select = new Select(driver.findElement(By.id("country")));
		country_select.selectByVisibleText("India");
		for(WebElement c:country_select.getOptions())
		{
			System.out.println(c.getText());
		}
		driver.findElement(By.id("agree_terms")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role=\"presentation\"]")));
		driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		driver.switchTo().defaultContent();
	}

}
