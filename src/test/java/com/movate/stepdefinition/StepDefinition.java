package com.movate.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.validator.ValidateWith;
import org.openqa.selenium.WebElement;

import com.movate.base.Base;
import com.movate.pageexe.HomePageExe;
import com.movate.pageexe.SignInPageExe;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition
	{

		@Before
		public static void setUpAction()
			{
				Base.browserSetUp();
			}

		@After
		public static void tearDownAction()
			{
				Base.quitBrowser();
			}

		@Given("user is on roku homepage")
		public void user_is_on_roku_homepage()
			{
				Base.launchUrl("https://www.roku.com/");
			}

		@When("the page is loaded")
		public void the_page_is_loaded()
			{
				Base.waitForPageLoad();
			}

		@Then("user should see the Roku Logo")
		public void user_should_see_the_Roku_Logo()
			{
				boolean b = HomePageExe.validateRokuLogo();
				Assert.assertTrue(b);
			}

		@When("user mouse hover the navigation item  - What is Roku")
		public void user_mouse_hover_the_navigation_item_What_is_Roku()
			{
				HomePageExe.mouseHoverOnWhatIsRoku();
			}

		@Then("user should see a dopdown menu items")
		public void user_should_see_a_dopdown_menu_items()
			{
				boolean b = HomePageExe.validateDropDownMenuForWhatIsRoku();
				System.out.println(b);
				Assert.assertTrue(b);
			}

		@Then("user click on sub menu - What is Roku")
		public void user_click_on_sub_menu_What_is_Roku()
			{
				HomePageExe.clickOnWhatIsRoku();
			}

		@Then("user should be redirected to the Roku Intro page")
		public void user_should_be_redirected_to_the_Roku_Intro_page()
			{
				String url = HomePageExe.getCurrentPageUrl();
				boolean b = url.contains("what");
				Assert.assertTrue(b);
			}

		@Then("user click on sub menu - Roku OS")
		public void user_click_on_sub_menu_Roku_OS()
			{
				HomePageExe.clickOnRokuOS();
			}

		@Then("user should be redirected to the Roku OS page")
		public void user_should_be_redirected_to_the_Roku_OS_page()
			{
				String title = HomePageExe.getCurrentPageTitle();
				boolean b = title.contains("OS");
				Assert.assertTrue(b);
			}

		@When("user clicks on signin")
		public void user_clicks_on_signin()
			{
				HomePageExe.clickOnSignIn();
			}

		@Then("the page should be redirected to the sign in page")
		public void the_page_should_be_redirected_to_the_sign_in_page()
			{
				String title = HomePageExe.getCurrentPageTitle();
				boolean b = title.contains("Signin");
				Assert.assertTrue(b);
			}

		@When("user clicks on cart symbol")
		public void user_clicks_on_cart_symbol()
			{
				HomePageExe.clickOnCart();
			}

		@Then("the page should be directed to the checkout page")
		public void the_page_should_be_directed_to_the_checkout_page()
			{
				String title = HomePageExe.getCurrentPageTitle();
				boolean b = title.contains("Check");
				Assert.assertTrue(b);
			}
		
		@When("user clicks on sign-in from the home page")
		public void user_clicks_on_sign_in_from_the_home_page()
			{
				HomePageExe.clickOnSignIn();
			}

		@When("user should be redirected to the sign-in page")
		public void user_should_be_redirected_to_the_sign_in_page()
			{
				try
					{
						Thread.sleep(4000);
						String title = HomePageExe.getCurrentPageTitle();
						boolean b = title.contains("Signin");
						Assert.assertTrue(b);
					}
				catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}

		@When("user enter the email ID")
		public void user_enter_the_email_ID()
			{
				SignInPageExe.enterEmailID();
			}

		@When("user enter the password")
		public void user_enter_the_password() 
			{
				SignInPageExe.enterPassword();
			}

		@When("user click the Remember me option")
		public void user_click_the_Remember_me_option() 
			{
				SignInPageExe.clickOnRememberMe();
			}

		@When("user click on sign-in button")
		public void user_click_on_sign_in_button() 
			{
				SignInPageExe.clickOnSignIn();
			}

		@Then("user should be redirected to home page")
		public void user_should_be_redirected_to_homepage()
			{
				try
					{
						Thread.sleep(3000);
						String title = HomePageExe.getCurrentPageTitle();
						boolean b = title.contains("Streaming");
						Assert.assertTrue(b);
					}
				catch (InterruptedException e)
					{
						
					}
			}

		
		@Then("user able to see the user-menu icon")
		public void user_should_be_seetheMenuIcon()
			{
				try
					{
						Thread.sleep(3000);
						boolean b = HomePageExe.validateUserMenuIcon();
						Assert.assertTrue(b);
					}
				catch (InterruptedException e)
					{
						
					}
			}
		
		
	
		
		
		
	}
