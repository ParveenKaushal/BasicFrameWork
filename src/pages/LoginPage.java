package pages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	WebDriver driver;
	
    
    
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver(); 
	}

	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void openLoginPager()
	{
     driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=v0J_FXN7d00&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoidjBKX0ZYTjdkMDAiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0ODkxNTI4NSwiaWF0IjoxNjQ4OTE0MDg1LCJqdGkiOiI1MjJhNDcwZS0xOWU4LTQ0MzAtYTBiZi1jZTI3ODU0OWM2MDEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.gu8bMfqJq01SNU5UUt2Z_n1YsT-Bz-BQhDzi_Dx0q1jiVpfEDPaJ_FAkeu2N1mB5i-O2mj-dlVOVXC8BP8ZRt1Rqz2t5jltCbHv9WyJjHFCA6iohFNHaJWsGGSi7KxqO5zTZfDFXbG5x2ti6RdnTqLemrwHaC9jPzoib0RNYPUPyc6Hy2KwLj5twrdsh1r5GxzkvYRIcbFcThOcsYmDozeFpfIuxEYfEL0fpXTZHT7bF56WLW-kJxCOXrN3lc05WncrQsQGKrkD7xCccO-3TH-7rejcm1RyFoYnGRLYl3hch1tXJZ3pbSmO3sLE1YTGEyuGfBCqrRQYzBc1lhT7v6g&preferred_environment=");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void  login(String username, String password) throws InterruptedException
	{
		driver.findElement(By.id("usernameInput-input")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
		
	}
	
	public String readError()
	{
		String actual = driver.findElement(By.id("globalError")).getText();
		System.out.println(actual);
		return(actual);
	}
	
	public String readEmailError()
	{
		String actual = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actual);
		return(actual);
	}
	public String readPasswordError()
	{
		String actual = driver.findElement(By.id("PasswordTextField__errors-password")).getText();
		System.out.println(actual);
		return(actual);
	}

	
	
	
	
	
}
