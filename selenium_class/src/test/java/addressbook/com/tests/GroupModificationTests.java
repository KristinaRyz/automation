package addressbook.com.tests;

import addressbook.com.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by LenovoUser on 7/23/2017.
 */
public class GroupModificationTests extends TestBase{
    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGoupsPage();

        int before = app.getGroupHelper().getGroupCount();

        app.getGroupHelper().selectFirstGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("classGroup", null, "ClassFooter"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

        int after = app.getGroupHelper().getGroupCount();

        assertEquals(after, before);

    }


}
