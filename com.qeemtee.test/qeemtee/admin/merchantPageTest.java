package qeemtee.admin;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qeemtee.admin.base.Testbase;

public class merchantPageTest extends Testbase {

	loginPage loginpage;
    MerchantPage Merchantpage;
	
	
	@BeforeMethod
	public void setup() {

		setupBrowser();
		 loginpage = new loginPage();
		 Merchantpage = loginpage.adminlogin();
		 Merchantpage = new MerchantPage();
	}
	
	@Test
	public void addCategory() throws Exception {
	Merchantpage.CreateMerchant();
		
	
	}
	

	@AfterMethod
	public void browserclose() {
	  teardown(); 
	}
	
	
	
	
	
}
