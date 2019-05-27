package qeemtee.admin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qeemtee.Utils.TestUtil;
import com.qeemtee.admin.base.Testbase;

public class MerchantPage extends Testbase {
	
	@FindBy(xpath="//img[@class='img-fluid' and @src='/static/media/plus.2166cc9c.svg']")
	WebElement addIcon;

	@FindBy(xpath = "//input[@id='Merchant Name*']")
	WebElement MerchantName;

	@FindBy(xpath = "//input[@id='Registered Name*']")
	WebElement RegisteredName;

	@FindBy(xpath = "//input[@id='Display Name*']")
	WebElement DisplayName;
 
	@FindBy(xpath = "//input[@id='rect_upload_photo']")
	WebElement MerchantImage;

	@FindBy(xpath = "//div[contains(@class,'react-inputs-validation__select__dropdown-name___3hghL react-inputs-validation__ellipsis___3-Api')][contains(text(),'Mr/Ms')]")
	WebElement Title;

	@FindBy(xpath = "//div[@class=\" react-inputs-validation__select__options-container___d54qE false react-inputs-validation__show___2NI3u undefined false;\"]//div[2]")
	WebElement MRtitle;

	@FindBy(xpath = "//input[@placeholder=\"Enter First Name\"]")
	WebElement FirstNamefield;

	@FindBy(xpath = "//input[@placeholder='Enter Last Name']")
	WebElement LastNamefield;

	@FindBy(xpath ="//div[@class='react-inputs-validation__select__dropdown-name___3hghL react-inputs-validation__ellipsis___3-Api'][contains(text(),'Select a designation')]")
	WebElement Designationfield;

    @FindBy(xpath="//div[contains(text(),'Owner')]")
    WebElement ownerField;

	
	@FindBy(xpath = "//input[@placeholder=\"Address Line 1\" and @tabindex=\"1\"]")
	WebElement Addressfield;

	@FindBy(xpath = "//input[@placeholder=\"City\" ]")
	WebElement Cityfield;

	@FindBy(xpath = "//input[@placeholder=\"Zip Code\" ]")
	WebElement zipcodefield;

	@FindBy(xpath = "//input[@placeholder=\"Country\" ]")
	WebElement countryfield;

	@FindBy(xpath = "//div[@class=\"toggle-btn\" ]")
	WebElement toggleButton;

	@FindBy(xpath = "//input[@placeholder=\"+66\" ]")
	WebElement countrycode;

	@FindBy(xpath = "//input[@placeholder=\"code*\" ]")
	WebElement Pincode;

	@FindBy(xpath = "//input[@placeholder=\"Enter Contact Phone Number\"]")
	WebElement contactPhonenumber;

	@FindBy(xpath = "//input[@placeholder=\"Enter registered email address \" ]")
	WebElement EmailField;
	
	@FindBy(xpath="//input[@placeholder=\"Search Categories\"]")
	WebElement category;
	
	@FindBy(xpath="//button[contains(text(),\"Next\")]")
	WebElement nextButton;

//	public void categorySelect(int num) {
//	driver.findElement(By.xpath("//div[@id='categories']//div[num])").click();
//
//	}

	@FindBy(xpath = "//div[contains(@class,'notranslate public-DraftEditor-content')]")
	WebElement AboutCompany;

	public MerchantPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void CreateMerchant() throws InterruptedException {
		
		TestUtil.visibilitywait(menubar.merchantTab);
		menubar.gotoMerchantTab();
		TestUtil.visibilitywait(addIcon);
		addIcon.click();
		
		MerchantName.sendKeys("Merchant Name");
		RegisteredName.sendKeys("registeredName");
		DisplayName.sendKeys("Display Name");
		MerchantImage.sendKeys("C:\\Users\\Saurabh bhandari\\eclipse-workspace\\qeemtee.admin\\com.qeemtee.resources\\automation.jpg");
	    Thread.sleep(2000);
		
     	TestUtil.scrollintoview(Title);
		
		Thread.sleep(1000);
		Title.click();
		
//		TestUtil.scrollintoview(MRtitle);
		
		MRtitle.click();
		
		FirstNamefield.sendKeys("Saurabh");
		LastNamefield.sendKeys("Singh");
		
		Designationfield.click();
		
		Thread.sleep(3000);
		System.out.println("Going to click ");
		ownerField.click();
	
		TestUtil.scrollintoview(Addressfield);
		Addressfield.sendKeys("Mahipal pur");
		Cityfield.sendKeys("Delhi");
		zipcodefield.sendKeys("110037");
		countryfield.sendKeys("India");
		toggleButton.click();
		countrycode.sendKeys("+91");
		Pincode.sendKeys("011");
		contactPhonenumber.sendKeys("89932398229");
		RegisteredName.sendKeys("automationresgiter@gmail.com");
		category.click();	
		AboutCompany.sendKeys("About the company automation script is running");
		nextButton.click();
	}

}
