package ecz_loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-eshipz.herokuapp.com/login");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("madhuraki27@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("madhulyf011");
		//WebElement ele =driver.findElement(By.id("login-submit"));
		//ele.click();
	//	driver.findElement(By.id("login-submit")).click();
  	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		//driver.findElement(By.xpath("//button[@class='col s12 btn btn-large waves-effect grey darken-3']")).click();
	//	driver.findElement(By.xpath("//form[@class='col s12']"));
		//driver.findElement(By.xpath("//div[@class='z-depth-1 white lighten-4 row']")).click();
		//"http://eshipz-qa.herokuapp.com/login"
		
	}
}