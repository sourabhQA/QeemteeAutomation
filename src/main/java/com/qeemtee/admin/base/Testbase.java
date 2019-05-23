package com.qeemtee.admin.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qeemtee.admin.menubarPage;

public class Testbase {


	public static Properties prop;
	public static WebDriver driver;
	protected static String currentdir = System.getProperty("user.dir");
	public static FileInputStream ip;
	public static menubarPage menubar;
	

	public static void setupBrowser() {

		System.out.println(currentdir);
		prop = new Properties();

		try {
			System.out.println(currentdir + "qeemtee.admin\\com.qeemtee.resources\\config.properties");
			ip = new FileInputStream(currentdir + "\\com.qeemtee.resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saurabh bhandari\\eclipse-workspace\\qeemtee.admin\\com.qeemtee.resources\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		
		
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		 menubar = new menubarPage(driver);
	

	}
	
	
	
	public void teardown() {
		driver.quit();
	}


	
	
	
	
	

}
