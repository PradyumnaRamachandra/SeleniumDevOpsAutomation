package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_subscribeTC {
	
	@Test
	public void subscribeTC() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("newsletter-email")).sendKeys("aaa@test.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.close();
		
	}

}
