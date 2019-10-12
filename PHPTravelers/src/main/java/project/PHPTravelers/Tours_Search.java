package project.PHPTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Tours_Search extends LaunchBrowser{
	 By City_Click=By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	 By City=By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	 By Date=By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	 By Guests=By.xpath("//select[@id='adults']");
	// By Adults=By.xpath("");
	 By Select=By.xpath("//select[@id='tourtype']");
	 By pri=By.xpath("//option[contains(text(),'Private')]");
	 
	 By Cookie=By.xpath("//*[@id='cookyGotItBtn']");
	
	 By Search_Tour_Button=By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	
	public WebElement City()
	{
		driver.findElement(City_Click).click();
	    return driver.findElement(City);
	}
	
	public WebElement Date() throws InterruptedException
	{
		// Thread.sleep(3000);
		 //driver.findElement(Cookie).click();
		driver.findElement(Date).click();
		return driver.findElement(Date);
	}
	
	public void Guests()
	{
		driver.findElement(Guests).click();
		driver.findElement(Guests).sendKeys((Keys.DOWN));
		
	}
	 
	public void Select()
	{
		driver.findElement(Select).click();
		driver.findElement(Select).sendKeys((Keys.DOWN));
		driver.findElement(pri).click();
	}
	
	
	public WebElement Search_Tour_Button()
	{
		return driver.findElement(Search_Tour_Button);
	}
	
	
	
	
	
	

}
