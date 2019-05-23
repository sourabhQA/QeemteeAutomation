package qeemtee.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qeemtee.admin.base.Testbase;

public class loginPage extends Testbase {

	@FindBy(xpath = "//input[contains(@placeholder,'Email')]")
	WebElement Emailfield;

	@FindBy(xpath = "//input[contains(@placeholder,'Password')]")
	WebElement Password;

	@FindBy(xpath = "//button[contains(@class,'primary-btn py-3 px-8')]")
	WebElement signinButton;

	@FindBy(xpath = "//p[contains(text(),\"Welcome\")]")
	WebElement userdropdown;

	@FindBy(xpath = "//h2[contains(text(),\"Incorrect Email ID/Password\")]")
	WebElement alertPopUp;

	public loginPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		
	}

	public MerchantPage adminlogin() {
		Emailfield.sendKeys("admin@grappus.com");
		Password.sendKeys("admin1234");
		signinButton.click();
	    userdropdown.isDisplayed();
	    return new MerchantPage();
	    
	  
	}

	public boolean adminWronglogin() {
		Emailfield.sendKeys("admin@grappus.com");
		Password.sendKeys("admin12345");
		signinButton.click();
		return alertPopUp.isDisplayed();
	}

}
