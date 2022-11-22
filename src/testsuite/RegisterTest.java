package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.security.util.Password;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){

        //Click on Computer menu
        clickOnElement(By.linkText("Register"));

        // This is text from requirement
        String expectedMessage = "Register";

        // find the expected message element
        String actualMessage = getTextFromElement(By.xpath("//div/h1"));

        // verifying actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);

        // Print to be sure expecting write message or not
        System.out.println("Expected Message : "+ expectedMessage);

        // Print to be sure about Actual message
        System.out.println("Actual Message : " + actualMessage );
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //Click on Computer menu
        clickOnElement(By.linkText("Register"));

        //select gender
        clickOnElement(By.id("gender-male"));

        //  Enter First name
        sendTextToElement(By.id("FirstName"), "Harshid");
        //Enter Last name
        sendTextToElement(By.id("LastName"), "Viramgama");
        // Select Day Month and Year
        sendTextToElement(By.name("DateOfBirthDay"), "10");
        sendTextToElement(By.name("DateOfBirthMonth"), "November");
        sendTextToElement(By.name("DateOfBirthYear"), "1991");
        // Enter Email address
        sendTextToElement(By.id("Email"), "abcd127@gmail.com");
        //Enter Password
        sendTextToElement(By.id("Password"), "Abcd@1234");
        //Enter Confirm password
        sendTextToElement(By.id("ConfirmPassword"), "Abcd@1234");
        //Click on REGISTER button
        clickOnElement(By.id("register-button"));

        // This is text from requirement
        String expectedMessage = "Your registration completed";

        // find the expected message element
        String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));

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
