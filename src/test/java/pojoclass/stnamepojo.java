package pojoclass;

import org.BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stnamepojo extends Baseclass{
	
	public stnamepojo() {
		  
			PageFactory.initElements(driver, this);
	
	}
	
	@FindAll({
		@FindBy(xpath="//input[@id='from_station']"),
		@FindBy(xpath="//input[@name='from_station']")
	})
	
	 private WebElement from;
	
	@FindAll({
		@FindBy(xpath="//input[@name='to_station']"),
		@FindBy(xpath="//input[@id='to_station']")
	})
	
	private WebElement To;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return To;
	}
	
	
	
	
}
