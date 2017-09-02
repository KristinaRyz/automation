package addressbook.com.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by LenovoUser on 8/13/2017.
 */
public class ApplicationManager {

    public FirefoxDriver wd;

    NavigationHelper navigationHelper;
    ContactHelper contactHelper;
    GroupHelper groupHelper;
    SesionHelper sesionHelper;

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        openAddressbook();
        sesionHelper = new SesionHelper(wd);
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sesionHelper.logIn();
    }


    public void stop() {
        wd.quit();
    }

    public void openAddressbook() {
        wd.get("http://localhost/addressbook/");
    }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SesionHelper getSesionHelper() {
        return sesionHelper;
    }
}
