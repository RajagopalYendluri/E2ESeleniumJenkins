package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Allegis - Recruitment Coordinator - RC  - Regression Automation Scripts 
//Client-required test1:"ENTAARC","Allegis - Recruitment Coordinator - RC

public class TC_003 { 
	@Test
	public void testcase1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,60);
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='ENTAARC']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='ENTAARC']")).click();
		driver.findElement(By.xpath("//input[@value='Begin Testing']")).click();	
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sivarama");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("Ganesan123");
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//option[@value='Under 40']")).click();
		driver.findElement(By.xpath("//option[@value='Caucasian']")).click();
		driver.findElement(By.xpath("//option[@value='I prefer not to answer']")).click();
		driver.findElement(By.xpath("//button[@id='btnCompleteReg']")).click();
		//driver.findElement(By.xpath(".//*[@id='btnAgree']")).click();
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click();
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		for (int i=1; i<=26 ;i++)	
				{		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			for (int j=2;j<5 & i<=26;j++)
			{
		Thread.sleep(3000);
		String val = "button"+j;
		driver.findElement(By.xpath(".//*[@id='"+val+"']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(2000);
			}
				}
	
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"find out why they have a problem with my work."));Thread.sleep(1000);
	    driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnContinue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnExitTestSession']")).click();
	}
}
		