package qaselenium;
import java.util.concurrent.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
public class search {
	private static FirefoxDriver driver;
	WebElement element;
	@BeforeClass
	public static void openBrowser(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SANDEEP BHATULA\\Documents\\geckodriver-v0.14.0-win64\\geckodriver.exe" );
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void validate_credentials(){
		System.out.println("Starting test");
		driver.get("https://github.com/");
		driver.findElementByXPath("//a[contains(text(),'Sign in')]").click();
		driver.findElement(By.id("login_field")).sendKeys("");//Put in the username required
		driver.findElement(By.id("password")).sendKeys("");//Put in the Password required.
		driver.findElementByXPath("//input[@value='Sign in']").click();
		System.out.println("ENding test");
	}
	//In order to retain the browser please comment the below function or else it will close the browser.
	@AfterClass
	public static void closeBrowser(){
		 driver.quit();
	 }
}
