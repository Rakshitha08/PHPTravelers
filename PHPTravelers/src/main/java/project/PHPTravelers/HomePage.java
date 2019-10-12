package project.PHPTravelers;

import org.openqa.selenium.By;

public class HomePage extends LaunchBrowser {
	By MyAccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By Login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	By SignUp=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	
	By Hotel=By.xpath("//span[contains(text(),'Hotels')]");
	By Flights=By.xpath("//span[contains(text(),'Flights')]");
	By Tours=By.xpath("//span[contains(text(),'Tours')]");
	By Cars=By.xpath("//span[contains(text(),'Cars')]");
	
	public void MyAccount()
	{
		driver.findElement(MyAccount).click(); 
	}
    
	public void Login()
	{
		driver.findElement(MyAccount).click();
		driver.findElement(Login).click();
	}
	public void SignUp()
	{
		driver.findElement(MyAccount).click();
		driver.findElement(SignUp).click();
	}
	
	public void Hotels()
	{
		driver.findElement(Hotel).click();
	}
	public void Flights()
	{
		driver.findElement(Flights).click();
	}
    public void Tours()
    {
    	driver.findElement(Tours).click();
    }
	public void Cars()
	{
		driver.findElement(Cars).click();
	}
		
		
	}

