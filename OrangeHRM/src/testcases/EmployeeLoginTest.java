package testcases;

import library.LoginPage;
import utils.AppUtils;

public class EmployeeLoginTest {

	public static void main(String[] args)
	{
		AppUtils.launchApp();
		LoginPage lp=new LoginPage();
		lp.Login("Autotest", "Testing@1234!@#$");
		boolean res=lp.isEmpDisplayed();
		if(res)
		{
			System.out.println("Employee login testcase pass");
		}
		else
		{
			System.out.println("Employee login testcase fail");
		}
		AppUtils.closeapp();
			
	}

}
