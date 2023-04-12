package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class User extends AppUtils
{
	public boolean addUser(String role,String name,String id, String pw) throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		Select cls=new Select(driver.findElement(By.id("systemUser_userType")));
		cls.selectByVisibleText(role);
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(name);
		driver.findElement(By.id("systemUser_userName")).sendKeys(id);
		driver.findElement(By.id("systemUser_password")).sendKeys(pw);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(id);
		driver.findElement(By.id("searchBtn")).click();
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows,cols;
		rows=table.findElements(By.tagName("tr"));
		boolean result=false;
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(id))
			{
				result=true;
			}
		}
		if(result)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}

}
