package qeemtee.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class menubarPage {
	
	
	
	@FindBy(xpath="//a[@href=\"/merchants\"]")
	WebElement merchantTab;
	

	@FindBy(xpath="//a[@href=\"/hosts\"]")
	WebElement hostsTab;

	@FindBy(xpath="//a[@href=\"/catalogue\"]")
	WebElement catalogueTab;

	@FindBy(xpath="//a[@href=\"/bookings\"]")
	WebElement bookingsTab;

	@FindBy(xpath="//a[@href=\"/approvals\"]")
	WebElement approvalsTab;

	
	
	public menubarPage(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

		public  void gotoMerchantTab() {
		merchantTab.click();
		}
	
		public void gotoCatalogueTab() {
			catalogueTab.click();
		}
		
		public void gotoBookingsTab() {
			bookingsTab.click();
		}
		
		public void gotoapprovalsTab() {
			approvalsTab.click();
		}
		
		
		
	
	
}
