package testr;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classtow {
WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setUp  () {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test()
	public void myTest() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(4000);
		 List<WebElement> addToCartButtons =driver.findElements(By.className("btn"));
		
		 for(int i =0; i<addToCartButtons.size();i++) {
//		addToCartButtons.get(i).click(); // to Add all items to cart
			 
			if (i%2==0) {
				addToCartButtons.get(i).click();
				
				
			}
				 
				 
				 
				 
			 
			 
		
		 
			 
		 }
		
	}
	
	
	
	@AfterTest
	
	public void postTest () {
		
		
		
		
	}
}
