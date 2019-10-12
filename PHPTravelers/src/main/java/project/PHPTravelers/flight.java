package project.PHPTravelers;
//package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class flight extends LaunchBrowser {
	By From_locationclick = By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
	By From_location = By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
	By To_locationclick = By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
	By To_location = By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
	By Date = By.xpath("//input[@id='departure']");
	By Return_Date = By.xpath("");
	By adults = By.xpath("//select[@id='madult']");
	By child = By.xpath("//select[@id='mchildren']");
	By infant = By.xpath("//select[@id='minfant']");
	By done = By.xpath("//button[@id='sumManualPassenger']");
	By one_way = By.xpath("//div[@class='tab-content shad RTL_shad search-form']//div[1]//div[1]//div[1]//ins[1]");
	//By Return_Trip = By.xpath("");
	By FlightSearchButton = By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
	By  number_of_passengers= By.xpath("//input[@name='totalManualPassenger']");
	

	public WebElement From_location() {
		driver.findElement(From_locationclick).click();
		return driver.findElement(From_location);
	}
	
	public WebElement To_location() {
		driver.findElement(To_locationclick).click();
		return driver.findElement(To_location);
	}
	public WebElement date() {
		return driver.findElement(Date);
	}
	
	public WebElement return_Date() {
		return driver.findElement(Return_Date);
	}
	public WebElement number_of_passengers() {
		return driver.findElement(number_of_passengers);
	}
	public WebElement adultsclick() {
		driver.findElement(adults).click();
		return driver.findElement(adults);
	}
	public WebElement childclick() {
		driver.findElement(child).click();
		return driver.findElement(child);

}
	public WebElement infantsclick() {
		driver.findElement(infant).click();
		return driver.findElement(infant);
	}
	public WebElement doneclick() {
		return driver.findElement(done);
	}
	public WebElement oneway() {
		return driver.findElement(one_way);
	}
	public WebElement returntrip() {
		return driver.findElement(Return_Date);
	}
	public WebElement FlightSearchButton() {
		return driver.findElement(FlightSearchButton);
	}
}

