package project.PHPTravelers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends LaunchBrowser{
	
	//By SignUp =By.xpath("//button[@class='go-text-right']");
	
	By First_Name=By.xpath("//input[@placeholder='First Name']");
	By Last_Name=By.xpath("//input[@placeholder='Last Name']");
	By Mobile=By.xpath("//input[@placeholder='Mobile Number']");
	By Email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By Confirm_Password=By.xpath("//input[@placeholder='Confirm Password']");
	By Submit=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	By Cookie=By.xpath("//*[@id='cookyGotItBtn']");
	
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	public WebElement First_Name()
	{
		return driver.findElement(First_Name);
	}

	 public WebElement Last_Name() {
		 return driver.findElement(Last_Name);
	 }
	 
	 public WebElement Mobile() {
		 return driver.findElement(Mobile);	 
		 }
	 
	 public WebElement Email() {
		 return driver.findElement(Email);
	 }
	 public WebElement Password() {
		 return driver.findElement(Password);
		 
	 }
	 public WebElement Confirm_Password() {
		 return driver.findElement(Confirm_Password);
	 }
	 
	
	public void Submit() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverWait wait= new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='cookyGotItBtnBox']"))).click();
		driver.findElement(Cookie).click();
		driver.findElement(Submit).click();
	}
	   
}



