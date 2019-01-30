package HandsOnExp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String departure_date = "15 May 2019";
		String date = departure_date.split(" ")[0];
		String month = departure_date.split(" ")[1].toLowerCase();
		String year = departure_date.split(" ")[2];
		/*String r_date = departure_date.split(" ")[0];
		 * String return_date = "10 Jun 2019";
		String r_month = departure_date.split(" ")[1].toLowerCase();
		String r_year = departure_date.split(" ")[2];*/
		switch(month)
		{
		case "january": case "jan": case "1" : case "01":
			month="0";
			break;
		case "february": case "feb": case "2": case "02":
			month="1";
			break;
		case "March": case "Mar": case "3" :case "03":
			month="2";
			break;
		case "april": case "apr": case "4": case "04":
			month="3";
			break;
		case "may": case "5": case "05":
			month="4";
			break;
		case "June": case "jun": case "6": case "06":
			month="5";
			break;
		case "july": case "jul": case "7": case "07":
			month="6";
			break;
		case "august": case "aug": case "8" : case "08":
			month="7";
			break;
		case "septemper": case "sep": case "9" :case "09":
			month="8";
			break;
		case "october": case "oct": case "10":
			month="9";
			break;
		case "movember": case "nov": case "11":
			month="10";
			break;
		case "december": case "dec": case "12":
			month="11";
			break;
			
		}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://spicejet.com");
		Thread.sleep(5000);
		if(!driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected())
		{
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		}
		if (driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).isDisplayed())
		{
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("MAA");
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		}
		else
		{
			Select origin_select= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
			origin_select.selectByValue("MAA");
			Select dest_select= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")));
			dest_select.selectByVisibleText("Hyderabad (HYD)");
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		while(driver.findElements(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+date+"']")).size()==0)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		driver.findElement(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+date+"']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).submit();
		//driver.findElement(By.xpath("//td[@data-month=\"1\"and @data-year=\"2019\"]/a[text()=\"14\"]")).click();
		
	}

}
