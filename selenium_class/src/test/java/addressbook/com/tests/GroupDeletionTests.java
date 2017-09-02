package addressbook.com.tests;

import addressbook.com.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class GroupDeletionTests extends TestBase {
    @Test()
    public void testGroupDeletionList() {
        app.getNavigationHelper().goToGoupsPage();
        if(!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("classGroup", null, null));
        }

        List<GroupData> before = app.getGroupHelper().getGroupList();



//        app.getGroupHelper().selectFirstGroup();
        app.getGroupHelper().selectGroupByIndex(before.size()-1);

        app.getGroupHelper().clickOnDeleteGroupButton();
        app.getGroupHelper().returnToGroupPage();

        List<GroupData> after = app.getGroupHelper().getGroupList();

      //  assertEquals(after.size(), before.size() -1);

       // before.remove(before.size()-1);
        for(int i=0; i< after.size(); i++){
            Assert.assertEquals(before.get(i), after.get(i));
        }
    }


    @Test(enabled=false)
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGoupsPage();
        if(!app.getGroupHelper().isThereAGroup()){
           app.getGroupHelper().createGroup(new GroupData("classGroup", null, null));
        }

        int before = app.getGroupHelper().getGroupCount();

//        app.getGroupHelper().selectFirstGroup();
        app.getGroupHelper().selectGroupByIndex(before-1);

        app.getGroupHelper().clickOnDeleteGroupButton();
        app.getGroupHelper().returnToGroupPage();

        int after = app.getGroupHelper().getGroupCount();

        assertEquals(after, before -1);
    }


}

