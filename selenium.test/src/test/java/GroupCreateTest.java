import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class GroupCreateTest extends TestBase{

    @Test
    public void groupCreateTest() {

//        Go to groups page
        goToGroupsPage();
//        Fill group form
        fillGroupForm();
//        Submit group creation
        submitGroupCreation();
//        Return to groups page
        returnToGroupsPage();
    }

}
