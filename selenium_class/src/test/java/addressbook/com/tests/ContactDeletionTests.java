package addressbook.com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by LenovoUser on 8/12/2017.
 */
public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion(){
      //  app.getNavigationHelper().goToContactsPage();
        int before = app.getContactHelper().getContactsCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactDeletion();
        app.getContactHelper().confirmAlert();

        int after = app.getContactHelper().getContactsCount();

        Assert.assertEquals(after, before-1);


    }



}
