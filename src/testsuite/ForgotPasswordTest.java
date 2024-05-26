package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

   /*
    Write down the following test into
‘ForgotPasswordTest’ class
1. userShouldNavigateToForgotPasswordPageSuccessfully
* click on the ‘Forgot your password’ link
* Verify the text ‘Reset Password’
    */

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.className("orangehrm-login-forgot")).click();
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div[1]/div/form/h6")).getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @After
    public void tearDown() {
         closeBrowser();
    }

}
