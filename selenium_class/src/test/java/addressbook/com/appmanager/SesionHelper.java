package addressbook.com.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by LenovoUser on 8/23/2017.
 */
public class SesionHelper extends HelperBase{
    public SesionHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void logIn() {
        type(By.name("user"), "admin");
        type(By.name("pass"), "secret");
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
