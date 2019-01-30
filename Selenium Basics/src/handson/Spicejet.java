package handson;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.HomePage;


public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Dimension d = driver.manage().window().getSize();
		driver.manage().window().setSize(new Dimension(d.width/2,d.height));
		driver.get("http://spicejet.com");
		if(!driver.findElement(HomePage.round_trip_rbtn).isSelected())
		{
			driver.findElement(HomePage.round_trip_rbtn).click();
		}
		if(driver.findElement(HomePage.origin_ip).isDisplayed())
		{
		driver.findElement(HomePage.origin_ip).sendKeys("chen");
		driver.findElement(HomePage.hyd).click();
		}
		else
		{
			Select origin_select = new Select(driver.findElement(HomePage.origin_sel));
			origin_select.selectByValue("MAA");
			Select dest_select = new Select(driver.findElement(HomePage.dest_sel));
			dest_select.selectByVisibleText("Hyderabad (HYD)");
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		while(driver.findElements(HomePage.start_date).size()==0)
		{
			driver.findElement(HomePage.cal_next).click();
		}
		driver.findElement(HomePage.start_date).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(HomePage.round_trip_rbtn).submit();
	}
	
}
