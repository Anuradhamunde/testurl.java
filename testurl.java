package URLTEST;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testurl {
	private WebDriver driver;
	
	@Test
	public void anu() throws InterruptedException
	{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver =new ChromeDriver(options);
        System.out.println("chromedriver opened successfully");
         driver=new ChromeDriver();
        driver.get("https://play.google.com/store/apps/details?id=com.keyutech.mypursu&pli=1");
        driver.manage().window().maximize();
        Thread.sleep(5000);
     String android=driver.findElement(By.xpath("//span[contains(text(),'MyPursu')]")).getText();
       System.out.println(android);
       driver.navigate().back();
	/*}
	@Test
	public void anu2() throws InterruptedException
	{
       
        driver.get("https://apps.apple.com/us/app/mypursu/id1486315789");
        String apple=driver.findElement(By.xpath("//span[contains(text(),'MyPursu')]")).getText();
        System.out.println(apple);
        Thread.sleep(2000);
       driver.close();*/
       
       
        
        
	
		
	}

}
