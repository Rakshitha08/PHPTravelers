package project.PHPTravelers;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Flight_Test extends flight {
	
	static By month= By.xpath("//div[16]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");

	@Test
	public static void flight() throws Exception{
		
		HomePage h= new HomePage();
		h.launch();
		h.Flights();
		//h.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//h.driver.get(h.prop.getProperty("url"));
		
		flight f= new flight();
		f.From_location().sendKeys(h.prop.getProperty("From_Location"));
		h.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h.prop.getProperty("From_Location")+"')]")).click();
		
		f.To_location().sendKeys(h.prop.getProperty("To_Location"));
		h.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h.prop.getProperty("To_Location")+"')]")).click();
		
		
		f.date().click();
		
		String str = h.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(h.prop.getProperty("departure_month_year"))) 
		{
			h.driver.findElement(next).click();
			str= h.driver.findElement(month).getText();
		}
		
		checkInDate(h.prop.getProperty("Ddate"));
		
		f.number_of_passengers().click();
		
		f.adultsclick().sendKeys(h.prop.getProperty("adults"));
		int val1 = Integer.parseInt(h.prop.getProperty("adults"));
		h.driver.findElement(By.xpath("//select[@id='madult']//option[@value='"+val1+"']")).click();
		
		f.childclick().sendKeys(h.prop.getProperty("child"));
		int val2 = Integer.parseInt(h.prop.getProperty("child"));
		h.driver.findElement(By.xpath("//select[@id='mchildren']//option[@value='"+val2+"']")).click();
		
		f.infantsclick().sendKeys(h.prop.getProperty("infant"));
		int val3 = Integer.parseInt(h.prop.getProperty("infant"));
		h.driver.findElement(By.xpath("//select[@id='minfant']//option[@value='"+val3+"']")).click();
		
		f.doneclick().click();
		Thread.sleep(1000);
		//h.driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		f.FlightSearchButton().click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("C:\\rakshitha\\screenshots\\Flightscreenshot.png"));
	    
	}		
	

public static void checkInDate(String date){
		
		String d;
		HomePage h1= new HomePage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	}	
}


