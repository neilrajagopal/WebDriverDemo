package testpack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\SeleniumTraining\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(driver.getTitle());
		Set<String> winIds=driver.getWindowHandles();
		Iterator<String> wIds=winIds.iterator();
		String pWin=wIds.next();
		String cWin=wIds.next();
		
		System.out.println("Parent Window Id - "+pWin);
		System.out.println("Child Window Id - "+cWin);
		
		driver.switchTo().window(cWin);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(pWin);
		Thread.sleep(2000);
		driver.close();
	}

}
