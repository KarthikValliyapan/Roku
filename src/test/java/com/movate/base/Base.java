package com.movate.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base
	{
		public static WebDriver driver = null;
		public static Actions actions = null;

		public static void browserSetUp()
			{
				try
					{
						driver = new ChromeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					}
				catch (Exception e)
					{
						System.out.println(e.getMessage());
					}
			}

		public static void waitForPageLoad()
			{
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			}

		public static String readLogInCredentials(String key)
			{
				try
					{
						File f = new File("D:\\Roku\\Roku\\src\\test\\resources\\TestData\\config.properties");
						FileReader fr = new FileReader(f);
						Properties properties = new Properties();
						properties.load(fr);
						String value = properties.getProperty(key);
						return value;
					}
				catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}
				catch (IOException e)
					{
						e.printStackTrace();
					}
				return null;
			}
		/* Methods on Browser */

		public static void launchUrl(String url)
			{
				try
					{
						driver.get(url);
						Thread.sleep(5000);
					}
				catch (Exception e)
					{
						System.out.println("Url Launch Fails");
					}
			}

		public static void closeBrowser()
			{
				try
					{
						driver.close();
					}
				catch (Exception e)
					{
						System.out.println("Close browser Fails");
					}
			}

		public static void quitBrowser()
			{
				try
					{
						Thread.sleep(3000);
						driver.quit();
					}
				catch (InterruptedException e)
					{

					}
				catch (Exception e)
					{
						System.out.println("Quit browser Fails");
					}
			}

		public static String getPageTitle()
			{
				try
					{
						return driver.getTitle();
					}
				catch (Exception e)
					{
						System.out.println("Problem in retrieving the page title");
					}
				return null;
			}

		public static String getUrl()
			{
				try
					{
						return driver.getCurrentUrl();
					}
				catch (Exception e)
					{
						System.out.println("Problem in retrieving the current url of the page");
					}
				return null;
			}

		/* Methods on WebElement */

		public static void enterInputValue(WebElement element, String data)
			{
				try
					{
						Thread.sleep(2000);
						element.sendKeys(data);
					}

				catch (InterruptedException e)
					{

					}

				catch (Exception e)
					{
						System.out.println("Unable to send Data to the element" + e.getMessage());
					}
			}

		public static void clearValue(WebElement element)
			{
				try
					{
						element.clear();
					}
				catch (Exception e)
					{
						System.out.println("Unable to clear Data from the element");
					}
			}

		public static void clickOnElement(WebElement element)
			{
				try
					{
						Thread.sleep(2000);
						element.click();
					}

				catch (InterruptedException e)
					{

					}

				catch (Exception e)
					{
						System.out.println("Unable to click an element" + e.getMessage());
					}
			}

		/* Verification methods on web elements */

		public static boolean isElementDisplayed(WebElement element)
			{
				try
					{
						return element.isDisplayed();
					}
				catch (Exception e)
					{
						System.out.println("Unable to find the element displaying or not" + e.getMessage());
					}
				return false;
			}

		public static boolean isElementEnabled(WebElement element)
			{
				try
					{
						return element.isEnabled();
					}
				catch (Exception e)
					{
						System.out.println("Unable to find the element enabled or not" + e.getMessage());
					}
				return false;
			}

		public static boolean isElementSelected(WebElement element)
			{
				try
					{
						return element.isSelected();
					}
				catch (Exception e)
					{
						System.out.println("Unable to find the element selected or not" + e.getMessage());
					}
				return false;
			}

		/* Actions Class */

		public static void moveToElement(WebElement element)
			{
				actions = new Actions(driver);
				actions.moveToElement(element).perform();
			}

	}
