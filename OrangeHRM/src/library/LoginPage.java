package library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils
{
	public void Login(String id,String pw)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(id);
		driver.findElement(By.id("txtPassword")).sendKeys(pw);
		driver.findElement(By.id("btnLogin")).click();
	}
	public boolean isAdminDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void Logout() 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	public boolean isErrorDisplayed()
	{
		String err=driver.findElement(By.id("spanMessage")).getText();
		if(err.contains("Invalid"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isEmpDisplayed()
	{
		try
		{
			driver.findElement(By.linkText("Admin")).isDisplayed();
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return true;
		}
		
	}
}
