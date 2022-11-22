package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        //Find log in link and click on login link
        clickOnElement(By.partialLinkText("Log in"));

        // This is text from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // find the expected message element
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // verifying actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    public void sendTextToElement(By by, String text){
        // Find by element
        WebElement emailField = driver.findElement(by);

        // Type email to email field element
        emailField.sendKeys(text);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // Find login element for input valid credential
        clickOnElement(By.partialLinkText("Log in"));

        // Input email to email field element
        sendTextToElement(By.id("Email"), "rakesh.roshan1@gmail.com");

        // Input password to password field element
        sendTextToElement(By.name("Password"), "Rakesh@123");

        // find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        // This is text from requirement
        String expectedMessage = "Log out";

        // find the expected message element
        String actualMessage = getTextFromElement(By.partialLinkText("Log out"));

        // verifying actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);

        // Print to be sure expecting write message or not
        System.out.println("Expected Message : "+ expectedMessage);

        // Print to be sure about Actual message
        System.out.println("Actual Message : " + actualMessage );

    }

    @Test
    public void verifyTheErrorMessage(){
        // Find login element for input valid credential
        clickOnElement(By.partialLinkText("Log in"));

        // Input email to email field element
        sendTextToElement(By.id("Email"), "ABC123@GMAIL.COM");

        // Input password to password field element
        sendTextToElement(By.name("Password"), "Abc@1234");

        // find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        // This is text from requirement
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        // find the expected message element
        String actualMessage = getTextFromElement(By.xpath("//div[@class ='message-error validation-summary-errors']"));

        // verifying actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);

        // Print to be sure expecting write message or not
        System.out.println("Expected Message : "+ expectedMessage);

        // Print to be sure about Actual message
        System.out.println("Actual Message : " + actualMessage );

    }


    @After
    public void testDown(){
        closeBrowser();
    }
}
