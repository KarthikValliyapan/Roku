package com.movate.pageexe;

import com.movate.pagelocators.SignInPageLocators;

public class SignInPageExe extends HomePageExe
	{
		public static void enterEmailID()
			{
				enterInputValue(getEmail(), readLogInCredentials("Email"));
			}

		public static void enterPassword()
			{
				enterInputValue(getPassword(), readLogInCredentials("Password"));
			}

		public static void clickOnRememberMe()
			{
				clickOnElement(getRememberMe());
			}

		public static void clickOnSignIn()
			{
				clickOnElement(SignInPageLocators.getSignIn());
			}
		
	}
