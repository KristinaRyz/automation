package addressbook.com.tests;

import addressbook.com.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreationAssertList() {
        app.getNavigationHelper().goToGoupsPage();
        //save old statement

        List<GroupData> before = app.getGroupHelper().getGroupList();

        //action
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("classGroup", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        //save new statement
        List<GroupData> after = app.getGroupHelper().getGroupList();

        //compare before and after
        Assert.assertEquals(after.size(), before.size()+1);

    }
    @Test(enabled = false)
    public void testGroupCreation() {
        app.getNavigationHelper().goToGoupsPage();
        //save old statement
        int before = app.getGroupHelper().getGroupCount();

        //action
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("classGroup", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        //save new statement
        int after = app.getGroupHelper().getGroupCount();

        //compare before and after
        Assert.assertEquals(after, before+1);

    }

    @Test(enabled = false)
    public void testGroupCreation2() {
        app.getNavigationHelper().goToGoupsPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Group1", "classHeader", "ClassFooter"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();

    }

    @Test(enabled = false)
    public void testGroupCreation3() {
        app.getNavigationHelper().goToGoupsPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("123", "classHeader", "ClassFooter"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();

    }

}
