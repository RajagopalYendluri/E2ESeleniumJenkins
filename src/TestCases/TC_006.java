package TestCases;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

//Typing Test -  Regression Automation Scripts 
//"Flash-based typing engine: "EN_TYPSS","Typing Test

public class TC_006 { 
	@Test
	public void testcase1() throws InterruptedException
	{

		System.out.println("\n\n\n\n >>> User Directory " + System.getProperty("user.dir")  +"\n\n\n\n ");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver/chromedriver");
//		FirefoxDriver driver  = new FirefoxDriver();
		ChromeDriver driver  = new ChromeDriver();

		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,70);
		
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='EN_TYPSS']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='EN_TYPSS']")).click();
		driver.findElement(By.xpath("//input[@value='Begin Testing']")).click();	
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sivarama");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("Ganesan123");
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//option[@value='Under 40']")).click();
		driver.findElement(By.xpath("//option[@value='Caucasian']")).click();
		driver.findElement(By.xpath("//option[@value='I prefer not to answer']")).click();
		driver.findElement(By.xpath("//button[@id='btnCompleteReg']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='btnBeginTest']"),"START"));Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='page1_btn1']"),"Skip Warm Up"));Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='page1_btn1']")).click();	
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='page2_btn0']"),"Start Typing Test"));Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='page2_btn0']")).click();	
		// typing form 
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).click();		
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("As a company, we constantly strive to improve our products, as well as our customer satisfaction.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("In that spirit, we are looking to implement one of two possible plans to ensure that these objectives are being met.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys(" One plan is to form a company review committee consisting of production managers, production-line workers,");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("inspectors, and a consultant in quality control. This council would brainstorm ways to increase the quality");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("of production and inspection methods. The committee could also make suggestions on the steps necessary to achieve the desired");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("results through new training methods and the purchase of additional equipment.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("A possible timeline would begin with the committee convening early in September");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("to draft ideas for improvements. At that time, they could also designate teams to investigate different methods for accomplishing the plans.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys(" The committee could meet again in October to report back on their findings and decide upon new procedures");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("for our manufacturing and inspection. Their recommended changes could be implemented in November.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("Once the changes are made, a future meeting could be scheduled to determine whether or not the changes are effective.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("At that time, we might want to establish the committee as part of our company. They could meet every month or so to");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("ensure that we are maintaining the highest standards in the quality of our products and the satisfaction of our customers."); 
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("If necessary, we could maintain the consultant or hire a full-time quality-control person to see that the recommendations of the committee are implemented");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("promptly and effectively. An alternative plan calls for a");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("select committee of executives to survey methods of quality control used at companies most similar to our own.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("Such companies could include Ajax Manufacturing, the Leviathan Corporation and Olympus Industries.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("Under this plan, the executive committee could compile a list of methods used by our rivals to achieve high quality. After all of");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("the data are compiled, the executive committee would determine which methods would best be adopted to maintain top-notch quality in our products.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("Once the new techniques are determined, the executives could purchase any necessary equipment. In addition, they may also decide upon additional");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("training for managers, workers and inspectors in order");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys(" to put the new methods into effect. By presenting employees with a completed plan, rather than asking for suggestions and recommendations,");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys(" we can save needed time and the cost of hiring an outside consultant. Under this plan,");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("the executive committee could meet with managers and inspectors weekly to see that the new methods are being properly");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys(" implemented and that the quality of our products is improving. Once the initial recommendations are implemented,");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("it might be wise to begin rotating the membership of this committee so all executives could become involved in the drive for higher quality.");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("Rotating the membership would also allow executives to bring their special expertise");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("to the problem and offer some fresh insights and suggestions. Please consider the two possible plans and bring your thoughts to our staff meeting next week.");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='typingform_rtx0']"),""));Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.SPACE).perform();Thread.sleep(2000);
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='testcomplete_btn0']"),"OK"));
		driver.findElement(By.xpath(".//*[@id='testcomplete_btn0']")).click();Thread.sleep(4000);
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5c']"),"Test Complete!"));
		driver.findElement(By.xpath(".//*[@id='btnContinue']")).click();Thread.sleep(4000);
		//wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5']']"),"Finished!"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='btnExitTestSession']")).click();
	
		
	}
	
	
}

	
		