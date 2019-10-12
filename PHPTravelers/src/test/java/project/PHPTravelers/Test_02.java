package project.PHPTravelers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_02 extends LoginPage{
@Test
public static void UserLoginForm() throws IOException, InterruptedException {
	HomePage h=new HomePage();
	h.launch();
	h.driver.get(h.prop.getProperty("url"));
	
	h.Login();
	
	
	LoginPage l=new LoginPage();
	l.Email().sendKeys(h.prop.getProperty("Email"));
	l.Password().sendKeys(h.prop.getProperty("Password"));
	l.LoginButton();
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src,new File("C:\\rakshitha\\screenshots\\Loginscreenshot.png"));
	/*public void logout() throws InterruptedException {
		Thread.sleep(2000);
		WebElement navigationclick = driver.findElement(By.id("logout"));
		 WebElement logout = driver.findElement(By.xpath("//li[@class='open']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Logout')]"));
		    navigationclick.click();
		    if(logout.isEnabled() && logout.isDisplayed()) {
		        logout.click();
		    }
		    else {
		        System.out.println("Element not found");
		    }
		
		}
	//l.logout();
	//l.LoginButton();*/

	
}
}
