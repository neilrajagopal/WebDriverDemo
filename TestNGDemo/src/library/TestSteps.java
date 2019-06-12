package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestSteps {


	WebDriver driver;

	public TestSteps(WebDriver driver)
	{
		this.driver=driver;
	}

	/*Function Description: Identify object by using Name and Type Text
	  Input : Name of the object and Test Data
	  ReturnType :Void
	  Date: 06/04/2019
	 */
	public void typeTextByName(String objectName,String testData)
	{
		if(driver.findElements(By.name(objectName)).size() ==1)
		{
			driver.findElement(By.name(objectName)).sendKeys(testData);
			//reports - pass
		}else
		{
			//Fail the test case
			System.out.println(objectName +"- is not available");
		}
	}

	/*Function Description: Click object by using Name Property
	  Input : Name of the object
	  ReturnType :Void
	  Date: 06/04/2019
	 */
	public void clickByName(String objectName)
	{
		if(driver.findElements(By.name(objectName)).size() ==1)
		{
			driver.findElement(By.name(objectName)).click();
		}else
		{
			System.out.println(objectName +"- is not available");
		}
	}

	/*Function Description: Click object by using xpath Property
	  Input : Name of the object
	  ReturnType :Void
	  Date: 06/04/2019
	 */
	public void clickByXpath(String objectName)
	{
		if(driver.findElements(By.xpath(objectName)).size() ==1)
		{
			driver.findElement(By.xpath(objectName)).click();
		}else
		{
			System.out.println(objectName +"- is not available");
		}
	}

	
	/*Function Description: Click object by using linkText Property
	  Input : LinkText of the object
	  ReturnType :Void
	  Date: 06/04/2019
	 */
	public void clickByLinkText(String objectName)
	{
		if(driver.findElements(By.linkText(objectName)).size() ==1)
		{
			driver.findElement(By.linkText(objectName)).click();
		}else
		{
			System.out.println(objectName +"- is not available");
		}
	}

	public void selectRadioOptionByUsingName(String objectName, String testData)
	{
		if(driver.findElements(By.name(objectName)).size() > 1)
		{
			List<WebElement> trip=driver.findElements(By.name(objectName));
			for(WebElement t:trip)
			{
				if(t.getAttribute("value").equals(testData))
				{
					t.click();
				}
			}
		}else
		{
			System.out.println(objectName +"- is not available");

		}

	}
	
	
	//Select by Visible Text
	public void selectDropDownByName(String objectName, String testData) throws InterruptedException
	{
		if(driver.findElements(By.name(objectName)).size()==1)
		{
			WebElement fPort=driver.findElement(By.name(objectName));
			Select s = new Select(fPort);
			s.selectByVisibleText(testData);
			Thread.sleep(3000);
		}else
		{
			System.out.println(objectName +"- is not available");
		}
	}
}
