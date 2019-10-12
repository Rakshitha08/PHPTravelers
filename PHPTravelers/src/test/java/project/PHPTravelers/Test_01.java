package project.PHPTravelers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test_01 extends RegistrationPage {
	
	
@Test
public static  void userRegistrationForm () throws IOException,InterruptedException
{
	HomePage h=new HomePage();
	h.launch();
	h.driver.get(h.prop.getProperty("url"));
	h.SignUp(); 
	
	RegistrationPage r=new RegistrationPage(); 
	r.First_Name().sendKeys(h.prop.getProperty("First_Name"));
	r.Last_Name().sendKeys(h.prop.getProperty("Last_Name"));
	r.Mobile().sendKeys(h.prop.getProperty("Mobile"));
	r.Email().sendKeys(h.prop.getProperty("Email"));
	r.Password().sendKeys(h.prop.getProperty("Password"));
	r.Confirm_Password().sendKeys(h.prop.getProperty("Confirm_Password"));
	//WebDriverWait wait= new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='cookyGotItBtnBox']"))).click();
    //driver.findElement(By.xpath("//div[@id='cookyGotItBtnBox']")).click();
	r.Submit();
	
	
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("C:\\rakshitha\\screenshots\\SignUpscreenshot.png"));
	    
}
}
