package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import ROCLogin.LoginlandlordtoappROC;

public class DashboardLandlordROC extends LoginlandlordtoappROC{
	
	public DashboardLandlordROC() {
		System.out.println("6");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	
    	String homePageHeading = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/main/div[1]/div/div[1]/h2")).getText();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	
    	Assert.assertEquals(homePageHeading,"Home");
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("7");
    	System.out.println("User has successfully logged in");
	}
	}

