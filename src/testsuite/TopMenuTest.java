package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

        //Click on Computer menu
       clickOnElement(By.linkText("Computers"));

        // This is text from requirement
        String expectedMessage = "Computers";

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
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        //Click on Electronics menu
        clickOnElement(By.linkText("Electronics"));

        // This is text from requirement
        String expectedMessage = "Electronics";

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
    public void userShouldNavigateToApparelPageSuccessfull(){

        //Click on Apparel menu
        clickOnElement(By.linkText("Apparel"));

        // This is text from requirement
        String expectedMessage = "Apparel";

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
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){

        //Click on Digital downloads menu
        clickOnElement(By.linkText("Digital downloads"));

        // This is text from requirement
        String expectedMessage = "Digital downloads";

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
    public void userShouldNavigateToBooksPageSuccessfully(){

        //Click on Books menu
        clickOnElement(By.linkText("Books"));

        // This is text from requirement
        String expectedMessage = "Books";

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
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //Click on Jewelry menu
        clickOnElement(By.linkText("Jewelry"));

        // This is text from requirement
        String expectedMessage = "Jewelry";

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
    public void userShouldNavigateToGiftCardsPageSuccessfull(){

        //Click on Gift Cards menu
        clickOnElement(By.linkText("Gift Cards"));

        // This is text from requirement
        String expectedMessage = "Gift Cards";

        // find the expected message element
        String actualMessage = getTextFromElement(By.xpath("//div/h1"));

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
