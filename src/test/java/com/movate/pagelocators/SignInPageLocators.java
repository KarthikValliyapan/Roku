package com.movate.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInPageLocators extends HomePageLocators
	{
		public static WebElement getEmail()
			{
				return driver.findElement(By.cssSelector("#email"));
			}

		public static WebElement getPassword()
			{
				return driver.findElement(By.cssSelector("#password"));
			}

		public static WebElement getRememberMe()
			{
				return driver.findElement(By.name("rememberMe"));
			}

		public static WebElement getSignIn()
			{
				return driver.findElement(By.xpath("//button[text() = 'Sign in']"));
			}

	

	}
