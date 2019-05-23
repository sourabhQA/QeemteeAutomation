package qeemtee.admin;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qeemtee.admin.base.Testbase;

public class loginPageTest extends Testbase {

	loginPage loginpage;
	MerchantPage Merchantpage;
	

	@BeforeMethod
	public void setup() {

		setupBrowser();
		loginpage = new loginPage();

	}

	@AfterMethod
	public void browserclose() {
	  teardown(); 
	}
	
	@Test
	public void loginTest() {
		Merchantpage =	loginpage.adminlogin();
	
	}
	@Test
	public void WrongloginTest() {
	Assert.assertTrue(loginpage.adminWronglogin());
	}
	

}
