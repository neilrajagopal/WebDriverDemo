package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo {

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

		Select from=new Select(driver.findElement(By.name("fromPort")));
		List<WebElement> fOptions=from.getOptions();
		System.out.println(fOptions.size());
		for(WebElement f:fOptions)
		{
			System.out.println(f.getText()+" --> "+f.getAttribute("value"));
			
		}
		
		from.selectByValue("Paris");
		System.out.println(from.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		driver.close();
	}

}
