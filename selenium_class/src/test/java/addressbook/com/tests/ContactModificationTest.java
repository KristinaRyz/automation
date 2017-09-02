package addressbook.com.tests;

import addressbook.com.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by LenovoUser on 8/13/2017.
 */
public class ContactModificationTest extends TestBase{
    @Test
    public void contactModificationTest(){
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("fName", "lName", "Tel-Aviv", "77777777777777", "ghjhghj@jkljkjlkjl.com"));
        app.getContactHelper().confirmContactModification();
    }



}
