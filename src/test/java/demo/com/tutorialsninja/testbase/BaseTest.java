package demo.com.tutorialsninja.testbase;

import demo.com.tutorialsninja.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = "Chrome";

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void cutOff() {
        closeBrowser();
    }
}
