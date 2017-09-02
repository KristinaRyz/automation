package addressbook.com.appmanager;

import addressbook.com.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by LenovoUser on 8/20/2017.
 */
public class ContactHelper extends HelperBase{


    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void confirmAlert(){
       wd.switchTo().alert().accept();
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void initContactDeletion() {
        click(By.cssSelector("input[value='Delete']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }



    public void confirmContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contact) {
        type(By.xpath("//*[@name='firstname']"), contact.getFirstName());
        type(By.name("lastname"), contact.getLastName());
        type(By.name("address"), contact.getAddress());
        type(By.name("home"), contact.getHomePhone());
        type(By.name("email"), contact.getEmail());
    }

    public void confirmContactModification() {
        click(By.name("update"));

    }

    public void initContactModification() {
       click(By.xpath(".//*[@title='Edit']"));
    }

    public int getContactsCount() {
       return wd.findElements(By.xpath(".//*[@title='Edit']")).size();
    }
}
