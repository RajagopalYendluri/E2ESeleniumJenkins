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

//PowerPoint 2013 - Standard - Regression Automation Scripts 
//"EN_P5F_ST_F","PowerPoint 2013 - Standard

public class TC_001 { 
	@Test
	public void testcase1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "");
		//FirefoxDriver driver  = new FirefoxDriver();
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='EN_P5F_ST_F']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='EN_P5F_ST_F']")).click();
		driver.findElement(By.xpath("//input[@value='Begin Testing']")).click();	
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sivarama");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("Ganesan123");
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//option[@value='Under 40']")).click();
		driver.findElement(By.xpath("//option[@value='Caucasian']")).click();
		driver.findElement(By.xpath("//option[@value='I prefer not to answer']")).click();
		driver.findElement(By.xpath("//button[@id='btnCompleteReg']")).click(); Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click(); Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(7000);	
		WebElement elemnt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='tutorial1_btn0']")));
		elemnt.click(); Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='tutorial1_btn0']")).click(); Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='tutorial1_btn0']")).click(); Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='tutorial1_btn0']")).click(); Thread.sleep(1000);
        WebElement hometab = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hometab_rtm_tr1")));
        hometab.click(); Thread.sleep(1000);
        WebElement infobv2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='infobv2_003_rtm_tr23']")));
        infobv2.click(); Thread.sleep(1000);
        WebElement openbv1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='openbv1_003_rtm_tr20']")));
        openbv1.click();Thread.sleep(1000);
        WebElement openbv2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("openbv2_003_rtm_tr21")));
        openbv2.click(); Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("003opendb_tr11"))); Thread.sleep(1000);
	    Actions act = new Actions(driver); Thread.sleep(1000);
	    act.doubleClick(driver.findElement(By.xpath(".//*[@id='003opendb_tr11']"))).build().perform(); Thread.sleep(1000);
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click(); Thread.sleep(1000);
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click(); Thread.sleep(1000);
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click(); Thread.sleep(1000);
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(".//*[@id='tutorial12_btn0']")).click(); Thread.sleep(1000);

	    // Question 1
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
	    driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr1']")).click();
	    driver.findElement(By.xpath(".//*[@id='infobv_rtm_tr20']")).click();
	    driver.findElement(By.xpath(".//*[@id='saveasbv_rtm_tr22']")).click();
	    driver.findElement(By.xpath(".//*[@id='okcboxtype_btn2']")).click();
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
	    driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();Thread.sleep(1000);
	    // Question 2
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("title_rtm_tr0"))).click();
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
	    driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
	    // Question 3
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("begin_tr11")));
	    driver.findElement(By.xpath(".//*[@id='begin_tr11']")).click();
	    new Actions(driver).sendKeys(Keys.DELETE).perform();
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
	    driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
	    // Question 4
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
	    driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr2']")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='inserttab_rtm_tr37']")).click();Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='pnewslide_page_1_tr7']")).click();Thread.sleep(2000);
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
	    driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
	    // Question 5
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
	    WebElement testt = driver.findElement(By.xpath(".//*[@id='begin_tr10']"));
		new Actions(driver).contextClick(testt).perform();Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='prightpane_page_1_tr2']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='prightpane_page_2_tr1']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(2000);
		// Question 6
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
		// Question 7
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr3']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='designtab_rtm_tr6']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pthemes_page_1_tr6']")).click(); Thread.sleep(2000);	
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 8
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr4']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='transitionstab_rtm_tr23']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ptransition_page_1_tr30']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 9
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);	    
		// Question 10
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);	
		// Question 11
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr1']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='infobv_rtm_tr21']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='printbv_rtm_tr13']")).click(); Thread.sleep(2000);	
		driver.findElement(By.xpath(".//*[@id='pprintlayout_page_1_tr1']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='printbv_rtm_tr10']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(2000);
		// Question 12
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr6']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='slideshowtab_rtm_tr10']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='slideshow_tr2']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 13
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='begin_tr2']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ppointer_page_1_tr1']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 14
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		WebElement testt1 = driver.findElement(By.xpath(".//*[@id='begin_tr10']"));
	    new Actions(driver).contextClick(testt1).perform();Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='ppicture_page_1_tr0']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pministyle_page_1_tr6']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 15
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		WebElement testt2 = driver.findElement(By.xpath(".//*[@id='begin_tr10']"));Thread.sleep(2000);
	    new Actions(driver).contextClick(testt2).perform();Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ppicture_page_1_tr14']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='fppane1_tr9']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 16
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);	
		// Question 17
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr2']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='inserttab_rtm_tr11']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='picturedb_tr4']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='picturedb_btn2']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(2000);
		// Question 18 note
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr50']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pshapes_page_1_tr42']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='begin_tr12']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 19
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
		// Question 20
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
		// Question 21
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr5']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='animationstab_rtm_tr8']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='applied_tr19']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='peffectoptions2_page_1_tr2']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 22
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
		// Question 23
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		WebElement testt3 = driver.findElement(By.xpath(".//*[@id='begin_tr14']"));Thread.sleep(2000);
	    new Actions(driver).contextClick(testt3).perform();Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ptext_page_1_tr26']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ptext_page_4_tr0']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 24
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		WebElement testt4 = driver.findElement(By.xpath(".//*[@id='begin_tr13']"));Thread.sleep(2000);
	    new Actions(driver).contextClick(testt4).perform();Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pdraw_page_1_tr0']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pshapestyle_page_1_tr5']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(2000);
		// Question 25
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
		// Question 26
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr8']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='viewtab_rtm_tr16']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='zoomdb_spn0_input']")).clear();Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='zoomdb_spn0_input']")).sendKeys("70");Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='zoomdb_btn1']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(2000);
		// Question 27
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr2']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='inserttab_rtm_tr25']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='paudio_page_1_tr0']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='insertdb_txt0']")).sendKeys("Children");Thread.sleep(3000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath(".//*[@id='searchdb_tr3']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='searchdb_btn1']")).click();Thread.sleep(3000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(3000);
		// Question 28
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr2']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='inserttab_rtm_tr37']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='pnewslide_page_1_tr1']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='newslide_tr11']")).click(); Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='newslide_tr11']")).click(); 
		Thread.sleep(3000);
		new Actions(driver).sendKeys(String.valueOf('\u0052')).perform();
		Thread.sleep(300);
	 	new Actions(driver).sendKeys(String.valueOf('\u004F')).perform();
		Thread.sleep(300);
	 	new Actions(driver).sendKeys(String.valueOf('\u0044')).perform();
	 	Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='newslide_tr11']")).sendKeys("COMMUNITY SERVICE"); Thread.sleep(1000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(3000);
		// Question 29 Create new document using the online
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
	    driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
		// Question 30
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
	    driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr6']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='slideshowtab_rtm_tr17']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
		// Question 31
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(8000);
		WebElement  sourcelocator1 = driver.findElement(By.xpath(".//*[@id='begin_gr2_orig']"));
		WebElement destinationlocator1 =driver.findElement(By.xpath(".//*[@id='begin_gr4_orig']"));
	    Actions drag11=new Actions(driver);
	    drag11.dragAndDrop(sourcelocator1,destinationlocator1).perform(); Thread.sleep(1000);
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
	    // Question 32
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
		// Question 33
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click(); Thread.sleep(1000);
	    //Click on review btn
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5c']"),"Test Complete!"));Thread.sleep(6000);
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='btnReview']"),"REVIEW"));Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='btnReview']")).click(); Thread.sleep(2000);
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5d']"),"Review"));Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='lblSecondCell12']/u/i")).click(); Thread.sleep(2000);
		// Answer the Question 32 in review 
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));Thread.sleep(6000);
	    driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr22']")).click(); Thread.sleep(2000);
		//new Actions(driver).sendKeys(Keys.ENTER).perform();
		wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(2000);
		// Click on Exit button 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5d']"),"Review"));Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='btn5cExit']")).click(); 
		wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='headerDataScreen5']"),"Finished!"));Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='btnExitTestSession']")).click();
	    
	}
	
}
	


	
		