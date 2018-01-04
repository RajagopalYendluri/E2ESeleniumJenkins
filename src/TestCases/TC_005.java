package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Talent Acquisition - Guest Service Profile- Regression Automation Scripts 
//"ENTAGSP","Talent Acquisition - Guest Service Profile"

public class TC_005 {
	@Test
	public void testcase1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "/");
//		FirefoxDriver driver  = new FirefoxDriver();
		ChromeDriver driver  = new ChromeDriver();

		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='ENTAGSP']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='ENTAGSP']")).click();
		driver.findElement(By.xpath("//input[@value='Begin Testing']")).click();	
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sivarama");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("Ganesan123");
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//option[@value='Under 40']")).click();
		driver.findElement(By.xpath("//option[@value='Caucasian']")).click();
		driver.findElement(By.xpath("//option[@value='I prefer not to answer']")).click();
		driver.findElement(By.xpath("//button[@id='btnCompleteReg']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='estimatedTimeLabel']"),"Estimated Time:"));
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"A fast learner"));
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"Tell your supervisor about the argument and let her resolve the situation"));
	    driver.findElement(By.xpath(".//*[@id='button3']")).click();
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		
		if (driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).isDisplayed());
		{
			//new Actions(driver).keyDown(Keys.COMMAND).sendKeys(String.valueOf('\u0078')).perform();
			Thread.sleep(2000);
			WebElement elem = driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']"));
			 Actions drag11=new Actions(driver);
			 drag11.click(elem).perform();
		}
		for (int i=1; i<=13 ;i++)	
				{		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			for (int j=2;j<6 & i<=13;j++)
			{
		Thread.sleep(3000);
		String val = "button"+j;
		driver.findElement(By.xpath(".//*[@id='"+val+"']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(3000);
			}
				}
		driver.findElement(By.xpath(".//*[@id='btnContinue']")).click();Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btnExitTestSession']")).click();
	}
}
		