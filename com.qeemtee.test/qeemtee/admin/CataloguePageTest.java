package qeemtee.admin;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qeemtee.admin.base.Testbase;

public class CataloguePageTest extends Testbase{

	
	
	loginPage loginpage;
	 
	 MerchantPage Merchantpage;
	 cataloguePage cataloguepage;
	
	@BeforeMethod
	public void setup() {

		setupBrowser();
		loginpage = new loginPage();
		cataloguepage = new cataloguePage();
       Merchantpage = loginpage.adminlogin();
	
	}
	
	@Test
	public void addCategory() throws Exception {
	Assert.assertTrue(cataloguepage.creatCategory());
	}
	

	@AfterMethod
	public void browserclose() {
	  teardown(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
