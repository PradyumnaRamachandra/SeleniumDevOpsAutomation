package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_RegisterTC {
	
	@Test
	public void registerTC() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Pradyumna");
		
		driver.findElement(By.id("LastName")).sendKeys("R");
		
		driver.findElement(By.id("Email")).sendKeys("aaaa@test.com");
		
		driver.findElement(By.id("Password")).sendKeys("password");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
		
		driver.findElement(By.id("register-button")).click();
		
		
		driver.close();
		
		
		
		
		
	}

}
