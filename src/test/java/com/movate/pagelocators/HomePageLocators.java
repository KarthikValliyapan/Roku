package com.movate.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.movate.base.Base;

public class HomePageLocators extends Base
	{
		public static WebElement getLogo()
			{
				return driver.findElement(By.xpath("//div[@class = 'nav-logo']"));
			}

		public static WebElement getWhatIsRoku()
			{
				return driver.findElement(By.xpath("//li//a[text() = 'What is Roku']"));
			}

		public static WebElement getDropDownMenuForWhatIsRoku()
			{
				return driver.findElement(By.xpath("(//ul[@class = 'nav__submenu'])[1]"));
			}

		public static WebElement getWhatIsRoku_SubMenu()
			{
				return driver.findElement(By.xpath("//span[text() = 'What is Roku']"));
			}

		public static WebElement getRokuOS()
			{
				return driver.findElement(By.xpath("//span[text() = 'Roku OS']"));
			}

		public static WebElement getSignIn()
			{
				return driver.findElement(By.linkText("Sign in"));
			}

		public static WebElement getCartSymbol()
			{
				return driver.findElement(By.xpath("//div[@class = 'opt-box cart-icon']"));
			}

		public static WebElement getUserMenuIcon()
			{
				return driver.findElement(By.xpath("//a[@data-id = 'roku-user-menu']"));
			}
		
		
	}
