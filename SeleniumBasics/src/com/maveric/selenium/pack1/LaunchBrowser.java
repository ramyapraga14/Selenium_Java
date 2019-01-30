package com.maveric.selenium.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		/*WebDriver driver1= new FirefoxDriver();
		WebDriver driver2= new InternetExplorerDriver();*/
		driver.get("https://google.com");
		/*driver1.get("https://google.com");
		driver2.get("https://google.com");*/		
		String url=driver.getCurrentUrl();
		if(url.startsWith("https://"))
			System.out.println("Secured");
		String title = driver.getTitle();
		if(title.equals("Google"))
			System.out.println("Pass");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		Dimension d = driver.manage().window().getSize();
		driver.manage().window().setSize(new Dimension(d.width/2,d.height));
		driver.manage().window().setPosition(new Point(0,0));
		
	}

}
