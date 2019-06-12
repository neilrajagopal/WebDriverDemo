package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentifyDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\SeleniumTraining\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String ethoName="mercury";
		WebElement txtUserName=driver.findElement(By.name("userName"));
		txtUserName.sendKeys(ethoName);
		//driver.findElement(By.name("userName")).sendKeys(ethoName);
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		List<WebElement> trip=driver.findElements(By.name("tripType"));
		String tData="oneway";
		System.out.println(trip.size());
	/*	for(int i=0;i<trip.size();i++)
		{
			System.out.println(trip.get(i).getAttribute("value"));
			
			if(trip.get(i).getAttribute("value").equals(tData))
			{
				trip.get(i).click();
				Thread.sleep(3000);
			}
		}
		*/
		
		for(WebElement t:trip)
		{
			if(t.getAttribute("value").equals(tData))
			{
				t.click();
				Thread.sleep(3000);

			}
		}
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();
		
		
	}

}
