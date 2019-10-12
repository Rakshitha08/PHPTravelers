package project.PHPTravelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

public class LoginPage extends LaunchBrowser{
	
	By Email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By Remember=By.xpath("//input[@id='remember-me']");
	By LoginButton=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	By SignUpButton=By.xpath("//a[@class='btn btn-default br25 btn-block form-group']");
	By ForgetPassword=By.xpath("//a[@class='btn btn-default br25 btn-block']");

	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public void Remember()
	{
		driver.findElement(Remember).click();
	}
	
	public void LoginButton()
	{ 
		driver.findElement( LoginButton).click();
	}
	
	
	public void SignUpButton()
	{
		driver.findElement(SignUpButton).click();
	}
	
	public void ForgetPassword()
	{
		driver.findElement(ForgetPassword).click();
	}
	
	
	
}
