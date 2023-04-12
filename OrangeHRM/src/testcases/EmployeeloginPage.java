package testcases;

import library.EmployeeLogin;
import library.LoginPage;
import utils.AppUtils;

public class EmployeeloginPage {

	public static void main(String[] args) 
	{
		AppUtils.launchApp();
		LoginPage lp=new LoginPage();
		lp.Login("Admin", "Qedge123!@#");
		EmployeeLogin lo=new EmployeeLogin();
		boolean res=lo.EmpLogin("def", "xyz");
		if(res)
		{
			System.out.println("Employee login successful");
		}
		else
		{
			System.out.println("Employee login failed");
		}
		AppUtils.closeapp();
		
		
	}

}
