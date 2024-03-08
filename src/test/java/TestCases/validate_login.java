package TestCases;
import java.io.ByteArrayInputStream;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestallureListeners;
import Pages.LoginPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.model.Status;



public class validate_login extends TestBase {

	//static WebDriver driver;
	/*
	 * @BeforeMethod public static WebElement before_method() throws IOException {
	 * System.out.println("This method will be invoked before every test method");
	 * base_url bum= new base_url(); WebDriver driver=bum.Base_url(); return
	 * (WebElement) driver; }
	 * 
	 * 
	 */ 
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		
		TestBase tbase= new TestBase();
    	tbase.Base_url();
		
	}
	
	
   @Test(description="This is login validate")
   @Description("This is login test validation")
   @Severity(SeverityLevel.NORMAL)
   @Story("THis is logintest")
   @Feature("validate login")
   
	public void Validate() throws IOException {
		
		
		// TODO Auto-generated method stub
		
	//login log=new login();
	//log.Loginpageforlandlord(driver);
	//log.DashboardLandlordROC(driver);
    	
    	//before_method();
    	//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[2]/button")).click();
    	
    	 
    	LoginPage log= new LoginPage(driver);	
    	
    	
    	
	
	log.Loginpageforlandlord();
	log.DashboardLandlordROC();	
		

	}


@AfterTest
public void Closebrowser()  {
	//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
//Assert.assertFalse(true);
	Allure.step("Login", Status.FAILED);
	Assert.assertEquals(false, true);
	//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[2]/button")).click();
	Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

	driver.quit();
	
}



}



	
	
	
	