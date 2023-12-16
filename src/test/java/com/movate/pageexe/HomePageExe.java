package com.movate.pageexe;

import com.movate.pagelocators.HomePageLocators;
import com.movate.pagelocators.SignInPageLocators;

public class HomePageExe extends SignInPageLocators
	{
		public static boolean validateRokuLogo()
			{
				return isElementDisplayed(getLogo());
			}

		public static void mouseHoverOnWhatIsRoku()
			{
				moveToElement(getWhatIsRoku());
			}

		public static boolean validateDropDownMenuForWhatIsRoku()
			{
				return isElementDisplayed(getDropDownMenuForWhatIsRoku());
			}

		public static void clickOnWhatIsRoku()
			{
				clickOnElement(getWhatIsRoku_SubMenu());
			}

		public static void clickOnRokuOS()
			{
				clickOnElement(getRokuOS());
			}

		public static String getCurrentPageTitle()
			{
				return getPageTitle();
			}

		public static String getCurrentPageUrl()
			{
				return getUrl();
			}

		public static void clickOnSignIn()
			{
				clickOnElement(HomePageLocators.getSignIn());
			}

		public static void clickOnCart()
			{
				clickOnElement(getCartSymbol());
			}
		
		public static boolean validateUserMenuIcon()
			{
				return isElementDisplayed(getUserMenuIcon());
			}
	}
