package addressbook.com.tests;

import addressbook.com.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends  TestBase{

    
    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("fName", "lName", "Tel-Aviv", "77777777777777", "ghjhghj@jkljkjlkjl.com"));
        app.getContactHelper().confirmContactCreation();
    }


}
