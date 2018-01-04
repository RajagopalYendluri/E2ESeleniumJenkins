package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Accounting - Financial Statements - - Regression Automation Scripts
//"EN_ACCIN","Accounting - Financial Statements

public class TC_004 { 
	@Test
	public void testcase1() throws InterruptedException
	{

		System.setProperty("webdriver.firefox.driver", "/usr/bin/chrome");
//		FirefoxDriver driver  = new FirefoxDriver();
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='EN_ACCIN']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='EN_ACCIN']")).click();
		driver.findElement(By.xpath("//input[@value='Begin Testing']")).click();	
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sivarama");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("Ganesan123");
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//option[@value='Under 40']")).click();
		driver.findElement(By.xpath("//option[@value='Caucasian']")).click();
		driver.findElement(By.xpath("//option[@value='I prefer not to answer']")).click();
		driver.findElement(By.xpath("//button[@id='btnCompleteReg']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='btnBeginTest']"),"START"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click();
		//CONTINUE TEST
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='btnAnswerComplete']"),"CONTINUE"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//NEXT CLICK 
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='btnAnswerComplete']"),"NEXT"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//CLICK START TEST BUTTON
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='btnAnswerComplete']"),"START TEST"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
        // question number 01
        wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"reviewed"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 02
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='options_rtx0']"),"Acid Test"));Thread.sleep(1000);   
        driver.findElement(By.xpath(".//*[@id='options_btn0']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
        // question number 03
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='options_rtx0']"),"Gross Profit Ratio"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='options_btn0']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 04
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text2']"),"Days of Inventory on Hand"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 05
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"Return on Tangible Assets"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 06
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"Both companies yielded the same return on investment."));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button4']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 07
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text2']"),"False"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 08
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"$96.00"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 09
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text2']"),"False"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 10
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"Net Asset Value Per Share"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 11
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='text3']"),"Checking account balance of $100"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// question number 12
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the amount of Working Capital. (Round the answer to the nearest dollar.)"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$8000");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// SKIP 13 question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Current Ratio. (Express the answer as a decimal, rounded to the nearest tenth.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click();
		// SKIP 14 question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Quick Net Assets. (Round the answer to the nearest dollar.)"));Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$9909");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// SKIP 15 question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Quick Ratio. (Express the answer as a decimal, rounded to the nearest tenth.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click();
		//  16 question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Gross Profit. (Round the answer to the nearest dollar.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$25500");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	     //  17 question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Gross Profit Percentage. (Express the answer as a percentage, rounded to the nearest tenth.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$56745");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  18 question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Average Day Sales. (Round the answer to the nearest dollar.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$34006");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  19 question
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the number of day sales in Accounts Receivable. (Round the answer to the nearest whole number.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$5,000,000");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	    //  20 question
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Total Debt. (Round the answer to the nearest dollar.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$200,900");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		 //  21 question
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Total Equity. (Round the answer to the nearest dollar.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$400,500");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  22 question
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Debt to Equity. (Express the answer as a percentage, rounded to the nearest tenth.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$700,700");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	   //  23 question
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Net Profit. (Round the answer to the nearest dollar.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$4040,300");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  24 question
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Return on Net Sales (Profit Margin). (Express the answer as a percentage, rounded to the nearest tenth.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$300,000");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// SKIP 25 question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"If Working Capital is $2,550,000 and Total Assets are $5,000,000, calculate the ratio of Working Capital to Total Assets. (Express the answer as a percentage, rounded to the nearest whole number.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click();
		//click Review button
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='btnReview']"),"REVIEW"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnReview']")).click();
		//Click on Review question 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5d']"),"Review"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='lblSecondCell1']/u/i")).click();
	    // answer review question 15th question
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='stem_rtx0']"),"Using the information displayed above, calculate the Quick Ratio. (Express the answer as a decimal, rounded to the nearest tenth.)"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("$400.00");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//Click on Exit button 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5d']"),"Review"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btn5cExit']")).click();
		//Click on Exit/finish button 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5']"),"Finished!"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnExitTestSession']")).click();
		
	}
	
}

	
		