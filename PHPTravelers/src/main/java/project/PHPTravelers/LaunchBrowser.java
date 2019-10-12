package project.PHPTravelers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {
	
	public static WebDriver driver;
     public static Properties prop=new Properties(); 
	public  void launch() throws IOException { 
		// TODO Auto-generated method stub
      
       FileInputStream fs=new FileInputStream("C:\\New folder\\PHPTravelers\\src\\main\\java\\file\\base.properties");
		prop.load(fs);
		System.setProperty("webdriver.chrome.driver", "C:\\rakshitha\\chromedriver.exe"); 
				 driver = new ChromeDriver(); 
				//driver.get("https://www.phptravels.net");
				//System.out.println(driver.getTitle());
				driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			   driver.get(prop.getProperty("url"));
		
		
	}

}
