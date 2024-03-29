package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("mksingh98");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement lastnameElement = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element);
        lastnameElement.sendKeys("Singh");
        
        WebElement phoneNumberElement = driver.findElement(By.id("phoneNumber"));  // Check if ID "phone" is correct
        System.out.println("Found element: " + lastnameElement);
        phoneNumberElement.sendKeys("1234567890");
        
        WebElement emailElement = driver.findElement(By.id("email"));
        System.out.println("Found element: " + emailElement);
        emailElement.sendKeys("mksingh@example.com");
        
        WebElement passwordElement = driver.findElement(By.id("password"));  // Check if ID "password" is correct
        passwordElement.sendKeys("mksingh98"); 
        
        WebElement confirmPasswordElement = driver.findElement(By.id("confirmPassword"));  // Check if ID "password" is correct
        confirmPasswordElement.sendKeys("mksingh98"); 
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
        WebElement accountActionButton = driver.findElement(By.cssSelector("button[data-testid='account-action-btn']"));
        accountActionButton.click();
       
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Specify the path where you want to save the screenshot
        String screenshotPath = "C:\\Users\\Zaina\\OneDrive\\Documents\\deakin\\software testing\\week 2\\2.1P-resources\\task2_1P\\src\\images\\screenshot.png";

        // Move the screenshot file to the specified path
        try {
            if (screenshotFile.renameTo(new File(screenshotPath))) {
                System.out.println("Screenshot saved at: " + screenshotPath);
            } else {
                System.out.println("Failed to save screenshot.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }	
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void BigW_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		 WebElement firstNameElement = driver.findElement(By.id("login__firstName"));
		    firstNameElement.sendKeys("mksingh98");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code

		    WebElement lastNameElement = driver.findElement(By.id("login__lastName"));
		    lastNameElement.sendKeys("Singh");

		    WebElement emailElement = driver.findElement(By.id("login__email"));
		    emailElement.sendKeys("mksingh@example.com");
        
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
        WebElement signUpButton = driver.findElement(By.cssSelector("button.Button.variant-primary.Button_Button__PCUpW.Button_variantPrimary__wuVF4"));
        signUpButton.click();
       
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Specify the path where you want to save the screenshot
        String screenshotPath = "C:\\Users\\Mukul\\OneDrive\\Documents\\deakin\\software testing\\week 2\\2.1P-resources\\task2_1P\\src\\images\\alternativeScreenshot.png";

        // Move the screenshot file to the specified path
        try {
            if (screenshotFile.renameTo(new File(screenshotPath))) {
                System.out.println("Screenshot saved at: " + screenshotPath);
            } else {
                System.out.println("Failed to save screenshot.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }	
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
}
