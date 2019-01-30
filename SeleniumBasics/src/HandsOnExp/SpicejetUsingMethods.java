package HandsOnExp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Reusables.Re_usable_methods;

public class SpicejetUsingMethods {
	
			public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			By round_trip = By.id("ctl00_mainContent_rbtnl_Trip_1");
			By origin_stn = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
			By dest_stn = By.linkText("Hyderabad (HYD)");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://spicejet.com");
			Thread.sleep(5000);
			if(!driver.findElement(round_trip).isSelected())
			{
				Thread.sleep(2000);
				driver.findElement(round_trip).click();
			}
			if (driver.findElement(origin_stn).isDisplayed())
			{
			Thread.sleep(2000);
			driver.findElement(origin_stn).sendKeys("MAA");
			driver.findElement(dest_stn).click();
			}
			else
			{
				Select origin_select= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
				origin_select.selectByValue("MAA");
				Select dest_select= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")));
				dest_select.selectByVisibleText("Hyderabad (HYD)");
			}
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String[] date = Re_usable_methods.date_conversion("14 Feb 2019");
			while(driver.findElements(By.xpath("//td[@data-month='"+date[1]+"' and @data-year='"+date[2]+"']/a[text()='"+date[0]+"']")).size()==0)
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			driver.findElement(By.xpath("//td[@data-month='"+date[1]+"' and @data-year='"+date[2]+"']/a[text()='"+date[0]+"']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).submit();
			//driver.findElement(By.xpath("//td[@data-month=\"1\"and @data-year=\"2019\"]/a[text()=\"14\"]")).click();
			

	}
		
			


}
