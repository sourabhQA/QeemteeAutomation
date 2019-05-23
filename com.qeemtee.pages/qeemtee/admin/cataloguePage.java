package qeemtee.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qeemtee.admin.base.Testbase;

public class cataloguePage extends Testbase{
	

	
	Actions action = new Actions(driver);
	
	@FindBy(xpath="//img[@class='img-fluid' and @src='/static/media/plus.2166cc9c.svg']")
	WebElement addIconButton;
	
	@FindBy(xpath="//input[@tabindex=1]")
	WebElement categoryName;
	
	@FindBy(xpath="//input[@name=\"photo\"]")
	WebElement CategoryImage;
	
	@FindBy(xpath="//input[@placeholder=\"Min. 5%\"]")
	WebElement QeemteeCommission;
	
	@FindBy(xpath="//input[@placeholder=\"Min. 10%\"]")
	WebElement HostCommission;
	
	
	@FindBy(xpath="//button[@class=\"primary-btn py-4 px-10\"]")
	WebElement saveButton;
	
	//h2[@class="swal2-title" and contains(text(),"Saved Successfully")]
	
	@FindBy(xpath="//h2[@class=\"swal2-title\" and contains(text(),\"Saved Successfully\")]")
	WebElement successAlert;
	
	
	public void categorytype(String categoryType) {
		/* Half Day Tour,Full Day Tour,Multiple Days,Custom Date,Session
		   */
		driver.findElement(By.xpath("//div[contains(text(),"+categoryType+") and @class=\"cursor-pointer w-1/5 h-8 flex flex-row border text-blue text-12 border-opacity-color-border justify-center mr-2 p-2 rounded-6\"]")).click();
	
	}
	
	public cataloguePage() {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		
	}
	
	
	
	
	public boolean creatCategory() throws Exception {
		
		Thread.sleep(4000);
		menubar.gotoCatalogueTab();
		System.out.println("Thread sleep");
		Thread.sleep(2000);
		System.out.println(addIconButton);
		action.moveToElement(addIconButton).build().perform();
		addIconButton.click();
		categoryName.sendKeys("TestAutomatio");
		CategoryImage.sendKeys("C:\\Users\\Saurabh bhandari\\eclipse-workspace\\qeemtee.admin\\com.qeemtee.resources\\automation.jpg");
		Thread.sleep(4000);
		QeemteeCommission.sendKeys("5");
		HostCommission.sendKeys("10");
		saveButton.click();
		return successAlert.isDisplayed();
		 
	}
	
	
	
	
}