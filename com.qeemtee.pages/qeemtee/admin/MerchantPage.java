package qeemtee.admin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qeemtee.admin.base.Testbase;

public class MerchantPage extends Testbase {
	
	@FindBy(xpath="@FindBy(xpath=\"//img[@class='img-fluid' and @src='/static/media/plus.2166cc9c.svg']\")\r\n" + 
			"	WebElement addIconButton;")
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

	@FindBy(xpath = "//div[@class=\"react-inputs-validation__select__options-item-show-cursor___1ZT3b hover:bg-black react-inputs-validation__select__options-item___30yY4 false undefined false; react-inputs-validation__active___3eZBB      \"  and contains(text(),\"Ms\")]")
	WebElement MRtitle;

	@FindBy(xpath = "//input[@placeholder=\"Enter First Name\"]")
	WebElement FirstNamefield;

	@FindBy(xpath = "//input[@placeholder=\"Enter last name\"]")
	WebElement LastNamefield;

	@FindBy(xpath = "//div[@class=\"react-inputs-validation__select__dropdown___11yDr\" and @xpath=\"1\"]")
	WebElement Designationfield;

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

	@FindBy(xpath = "//input[@placeholder=\"Enter contact phone number\" ]")
	WebElement contactPhonenumber;

	@FindBy(xpath = "//input[@placeholder=\"Enter registered email address \" ]")
	WebElement EmailField;

	public void categorySelect(int num) {
//		driver.findElement(By.xpath("//div[@id='categories']//div[num])").click();

	}

	@FindBy(xpath = "//div[contains(@class,'notranslate public-DraftEditor-content')]")
	WebElement AboutCompany;

	public MerchantPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void CreateMerchant() {
		
		
		menubar.gotoMerchantTab();
		addIcon.click();
		
		MerchantName.sendKeys("Merchant Name");
		RegisteredName.sendKeys("registeredName");
		DisplayName.sendKeys("Display Name");
		MerchantImage.sendKeys(
				"C:\\Users\\Saurabh bhandari\\eclipse-workspace\\qeemtee.admin\\com.qeemtee.resources\\automation.jpg");
		Title.click();
		MRtitle.click();
		FirstNamefield.sendKeys("Saurabh");
		LastNamefield.sendKeys("Singh");
		Designationfield.sendKeys("Manager");
		Designationfield.sendKeys(Keys.ENTER);
		Addressfield.sendKeys("Mahipal pur");
		Cityfield.sendKeys("Delhi");
		zipcodefield.sendKeys("110037");
		countryfield.sendKeys("India");
		toggleButton.click();
		countrycode.sendKeys("+91");
		Pincode.sendKeys("011");
		contactPhonenumber.sendKeys("89932398229");
		RegisteredName.sendKeys("automationresgiter@gmail.com");
	}

}
