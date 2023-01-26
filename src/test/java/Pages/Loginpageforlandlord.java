
  package Pages;
  
  import java.time.Duration;
  
  import org.openqa.selenium.By;
  
  import ROCLogin.LoginlandlordtoappROC;
  
  public class Loginpageforlandlord extends LoginlandlordtoappROC{
  
  
  
	  

public Loginpageforlandlord(String userName1, String passWord1) {
	 


	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys(userName1);
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/form/div[2]/button")).
	  click();
	  
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys(passWord1);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[4]/button")).click(); // Write code here that turns the phrase above into concrete actions
	  System.out.println("5");
	// TODO Auto-generated constructor stub
}
  }
  
  
  
 