package addressbook.com.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by LenovoUser on 8/20/2017.
 */
public class NavigationHelper extends HelperBase{


    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void goToGoupsPage() {
        click(By.xpath("//*[@href='group.php']"));
    }


    public void goToContactsPage() {
        click(By.xpath(".//*[@href='./']"));
    }
}
