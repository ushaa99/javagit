package com.itlearn.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;



public class LoginTest extends BaseTest {
	
	

	@Test
	public void verifyLogin() {
		WebElement s1=driver.findElement(By.xpath("//*[@id=\"loginbox\"]"));
		  Actions act=new Actions(driver);
		  act.dragAndDropBy(s1, 308, 114).build().perform();

		  
		LoginPage lp=new LoginPage(driver);
		
		String username ="Demo12";
		String password ="Test123456$";
		lp.loginToPortal(username, password);
		
	
	
	
}}