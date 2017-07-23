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

public class GroupDeletedTest extends TestBase{

    @Test
    public void groupDeletedTest() {
        //        Go to groups page
        goToGroupsPage();
//Select group
        selectGroup();
        //Delete group
        deleteGroup();
//Return to group page
        returnToGroupPage();
    }

}
