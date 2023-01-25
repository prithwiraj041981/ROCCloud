package ROCLogin;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogintoappROC {
     
         
    public static final long TIMEOUT = 30;
	
    WebDriver driver=null;
     
	
		
    @Given("^User is on ROCLogin page on \\\"(.*)\\\"$")
    public void user_is_on_roc_login_page(String url) {
    	System.out.println("0");
    	//WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		System.out.println("1");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    	System.out.println("2");
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	driver.manage().window().maximize();
    	System.out.println("3");
        // Write code here that turns the phrase above into concrete actions
        
    }
    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String userName1, String passWord1) {
    	System.out.println("4");
    	
    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys(userName1);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/form/div[2]/button")).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys(passWord1);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[4]/button")).click();
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("5");
    }
   
	    
    @Then("User should be able to login sucessfully to landlord and new Homepage open")
    public void user_should_be_able_to_login_sucessfully_to_landlord_and_new_page_open() {
    	System.out.println("6");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	String homePageHeading = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/main/div[1]/div/div[1]/h2")).getText();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	Assert.assertEquals(homePageHeading,"Home");
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("7");
    	System.out.println("User has successfully logged in");
    }
    
    @After
    public void teardown() {
  
        driver.quit();
    }
         
}
     
    