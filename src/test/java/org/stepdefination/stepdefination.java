package org.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefination {
	
	@Given("User havef to enter ticket booking home page")
	public void user_havef_to_enter_ticket_booking_home_page() {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/trains");
	
	driver.manage().window().maximize();
		
	  
	}

	@When("user have to enter from station")
	public void user_have_to_enter_from_station() {
		
		WebDriver driver=new ChromeDriver();
		
		WebElement frst = driver.findElement(By.xpath("//input[@id='from_station']"));
		
		frst.sendKeys("chidambaram");

		
		
	  
		
	}

}
