package com.maveric.selenium.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascriptcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("--No-Notifications");
		opt.setBinary("Location of chrome");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.magento.com/customer/account/create/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementsByClassName(\"recaptcha-checkbox-checkmark\")[0].click()");
		js.executeScript("document.getElementById(\"agree_terms\").scrollIntoView()");
		js.executeScript("document.getElementById(\"agree_terms\").click()");
	}

}
