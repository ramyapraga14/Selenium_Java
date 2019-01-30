package Businesslogic;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Initializing.Initializedemotours;

//import Initializing.Initializedemotours;
//import mainexecution.mainexecution;

public class Businesslogic extends Initializedemotours {

	//public static WebDriver driver;
/*public void Register(WebDriver driver)
{
	this.driver=driver;
	
}
*/
public static void demotour(WebDriver driver)
{
	driver.findElement(Register).click();
	driver.findElement(First_name).sendKeys("vidhya");
	driver.findElement(Last_name).sendKeys("kamalesh");
	driver.findElement(phone_Num).sendKeys("9791117260");
	driver.findElement(email_id).sendKeys("but@gmail.com");
	Initializedemotours id=new Initializedemotours();
	driver.findElement(id.Addre).sendKeys("No:334, 10th east");
	driver.findElement(addres2).sendKeys("mkb nagar");
	driver.findElement(cityy).sendKeys("ambattur");
	driver.findElement(State_pro).sendKeys("chennai");
	driver.findElement(postal_code).sendKeys("600053");
	driver.findElement(count).sendKeys("India");
	driver.findElement(User_name).sendKeys("vid@gmail.com");
	driver.findElement(pwd).sendKeys("ABCD1234");
	driver.findElement(Con_pwd).sendKeys("ABCD1234");
	
}

public  void Register_button(WebDriver driver)
{
	driver.findElement(sub).click();
}
}
