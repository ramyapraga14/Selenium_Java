package pageobjects;

import org.openqa.selenium.By;

import reusables.Reusable;

public class HomePage {
	private static String[] on_date = Reusable.date_conversion("17 may 2019");
	private static String[] re_date = Reusable.date_conversion("20 Nov 2019");
	public static By round_trip_rbtn = By.id("ctl00_mainContent_rbtnl_Trip_0");
	public static By origin_ip = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	public static By hyd = By.partialLinkText("Hyderabad");
	public static By origin_sel = By.id("ctl00_mainContent_ddl_originStation1");
	public static By dest_sel = By.id("ctl00_mainContent_ddl_destinationStation1");
	public static By start_date = By.xpath("//td[@data-month='"+on_date[1]+"' and @data-year='"+on_date[2]+"']/a[text()='"+on_date[0]+"']");
	public static By return_date = By.xpath("//td[@data-month='"+re_date[1]+"' and @data-year='"+re_date[2]+"']/a[text()='"+re_date[0]+"']");
	public static By cal_next = By.xpath("//span[text()='Next']");
}
