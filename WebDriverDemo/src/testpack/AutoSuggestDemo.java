package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\SeleniumTraining\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium");
		int i=1;
		while(driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li["+i+"]/div/div[1]/div/span")).size() > 0)
		{
			//System.out.println("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li["+i+"]/div/div[1]/div/span");
			
			System.out.println(driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li["+i+"]/div/div[1]/div/span")).getText());
			
			i++;
			System.out.println(driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li["+i+"]/div/div[1]/div/span")).size());
		}
		driver.close();
	}

}
