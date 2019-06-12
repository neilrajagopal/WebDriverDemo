package testpack;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.TestSteps;
import objectrepository.ObjectRepository;
import testdata.TestDataa;

public class WebDriverTestNG {
	WebDriver driver;
	ObjectRepository or;
	TestSteps ts;
	  @Test(dataProvider = "dp", dataProviderClass = TestDataa.class)
	  public void f(String un, String pwd, String winTitle,String fPort) throws InterruptedException {
			String actTitle = driver.getTitle();
			assertEquals(winTitle, actTitle);
			ts.typeTextByName(or.txtUserName, un);
			ts.typeTextByName(or.txtPassword, pwd);
			//ts.clickByName(or.btnLogin);
			ts.clickByXpath(or.btnLoginxPath);
			ts.selectRadioOptionByUsingName(or.radTripType, "oneway");
			ts.selectDropDownByName(or.selFromPortl, fPort);
			ts.clickByLinkText(or.lnkSignOff);

			//driver.findElement(By.name(or.txtUserName)).sendKeys(un);
			//driver.findElement(By.name(or.txtPassword)).sendKeys(pwd);
			//driver.findElement(By.name(or.btnLogin)).click();
			/*List<WebElement> trip=driver.findElements(By.name(or.radTripType));
			String tData="oneway";
			for(WebElement t:trip)
			{
				if(t.getAttribute("value").equals(tData))
				{
					t.click();
				}
			}*/
			//driver.findElement(By.linkText(or.lnkSignOff)).click();
	  }
	 
	  @BeforeMethod
	  public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\SeleniumTraining\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			ts = new TestSteps(driver);
	  }

	  @AfterMethod
	  public void afterMethod() {
			driver.close();
	  }


}
