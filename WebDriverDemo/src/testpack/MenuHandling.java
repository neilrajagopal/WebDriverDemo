package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\SeleniumTraining\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		WebElement pMenu=driver.findElement(By.linkText("SwitchTo"));
		Actions a=new Actions(driver);
		a.moveToElement(pMenu).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Alerts")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
