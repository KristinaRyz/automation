package addressbook.com.tests;

import addressbook.com.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by LenovoUser on 7/19/2017.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();


    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }



}
