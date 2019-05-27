package com.qeemtee.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qeemtee.admin.base.Testbase;





public class TestUtil extends Testbase {

	
	 
	
	
	
	 

	public static void scrollintoview(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void normalscroll() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000)");
	}

	
	public static void visibilitywait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 12);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

//	public static String takescreen(WebDriver Driver , String name) {
//		String finaldestination = null;
//		
//	TakesScreenshot scrShot =(TakesScreenshot)Driver;
//
//		File scrFile = 	scrShot.getScreenshotAs(OutputType.FILE); 
//		try {
//			 finaldestination = currentdir + "\\SCREENSHOTS\\"+name + System.currentTimeMillis() + ".png";
//			File destination = new File(finaldestination);
//			
//			
//		    FileUtils.copyFile(scrFile, destination);
//			//FileUtils.copyFile(scrFile, new File(("C:\\Users\\Saurabh\\eclipse-workspace\\freecrmnew\\target"+filename+".png")));
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	return finaldestination;
//	
	}
	
	
	
	
	
	
	
	
	
	
	

