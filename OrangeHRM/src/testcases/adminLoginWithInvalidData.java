package testcases;

import library.LoginPage;
import utils.AppUtils;

public class adminLoginWithInvalidData 
{
	public static void main(String[] args)
	{
		AppUtils.launchApp();
		LoginPage lp=new LoginPage();
		lp.Login("xyz", "123");
		boolean res=lp.isErrorDisplayed();
		if(res)
		{
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase failed");
				
		}
		lp.Logout();
		AppUtils.closeapp();
	}

}
