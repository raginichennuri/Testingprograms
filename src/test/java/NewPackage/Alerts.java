package NewPackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;


public class Alerts {

	public WebDriver driver;

	@Test
	public void handlingalerts() throws Exception  {
		
		
		//click on click me button
		driver.findElement(By.id("alertButton")).click();
		
        String str = driver.switchTo().alert().getText();
		
		System.out.println(str);
		
	Thread.sleep(4000);
		
	     //handling alert
		 driver.switchTo().alert().accept();
	
		
		

	}

	@BeforeTest
	public void openurl() throws Exception {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		  driver.get("https://demoqa.com/alerts");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  
				 
	}

	@AfterTest
	public void afterTest() {

	}

}
