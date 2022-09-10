package org.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	}
	
	public static void loadurl(String url) {
		driver.get(url);
	}
	
	public static void windowmax() {
		
		driver.manage().window().maximize();
	}
	
	public static void fill(WebElement element,String stname) {
		
		element.sendKeys(stname);

	}
	public static void toquit() {
		driver.quit();
	}
	

}
