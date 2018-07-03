package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void testgithublogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b7c.06.13\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("RajnishkumarSingh");
		driver.findElement(By.id("password")).sendKeys("Rajnish13");
		driver.findElement(By.name("commit")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "GitHub");
		
		System.out.println("Welcome to Continue with code..");
		System.out.println("Welcome to Continue with code..");
		
	}
	
}
