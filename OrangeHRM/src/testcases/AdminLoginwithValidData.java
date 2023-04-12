package testcases;

import library.LoginPage;
import utils.AppUtils;

public class AdminLoginwithValidData {

	public static void main(String[] args) throws InterruptedException
	{
		AppUtils.launchApp();
		LoginPage lp=new LoginPage();
		lp.Login("Admin", "Qedge123!@#");
		boolean res=lp.isAdminDisplayed();
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
