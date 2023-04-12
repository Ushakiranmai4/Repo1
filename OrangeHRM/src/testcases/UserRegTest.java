package testcases;

import library.LoginPage;
import library.User;
import utils.AppUtils;

public class UserRegTest {

	public static void main(String[] args) throws InterruptedException {
		AppUtils.launchApp();
		LoginPage lp=new LoginPage();
		lp.Login("Admin", "Qedge123!@#");
		User us=new User();
		boolean res=us.addUser("ESS", "Autotest demo", "Autotest", "Testing@1234!@#$");
		if(res)
		{
			System.out.println("User reg successful");
		}
		else
		{
			System.out.println("User reg failed");
		}
		AppUtils.closeapp();
		
	}

}
