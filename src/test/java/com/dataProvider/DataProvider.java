package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	
	
	@Test(dataProvider = "datas")
	private void login(String name, String pass) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(name);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(pass);
	}
	@org.testng.annotations.DataProvider(name = "datas",parallel = true)
	private Object [][] dataTest() {
		
		Object [][] a = new Object[3][2];
		
		a[0][0]= "Karthi";
		a[0][1]= "12345";
		
		a[1][0]= "Ram";
		a[1][1]= "54321";
		
		a[2][0]= "Deva";
		a[2][1]= "5454";
		return a;		
					
	}
	
	private void sysout() {
	

	}
	
	

}
