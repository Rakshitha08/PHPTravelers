package project.PHPTravelers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Tour_05 extends Tours_Search{
	static By month= By.xpath("//div[11]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[11]//div[1]//tr[1]//th[3]");
	
	@Test
	public void Tour_Details() throws IOException, InterruptedException
	{
		HomePage h1= new HomePage();
		h1.launch();
		
	
		h1.Tours();
		Tours_Search t=new Tours_Search();
		
		//City
		t.City().sendKeys(h1.prop.getProperty("location"));
		h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("location")+"')]")).click();
		
		//Departure date
		t.Date();
		String str = t.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(h1.prop.getProperty("Depature_month_year"))) {
			t.driver.findElement(next).click();
			str= t.driver.findElement(month).getText();
		}
		 Date(h1.prop.getProperty("Depature_Date"));
		
		t.Guests();
		t.Select();
		t.Search_Tour_Button().click();
		//t.Guests().clear();
		//t.adults().sendKeys(h1.prop.getProperty("adults"));
	 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\rakshitha\\screenshots\\Tourscreenshot.png"));
		
	}
	
	 public static void Date(String date){
			
			String d;
			HomePage h1= new HomePage();
			for(int i=1; i<=6;i++){
				for(int j=1; j<=7; j++){
					 d = h1.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
					//div[16]//tr[4]//td[5]
					if(d.equals(date))
						h1.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).click();
					
				}
			}
		}
	
}
