import org.testng.annotations.Test;

public class GroupCreationClass extends TestBase {

    @Test
    public void groupCreationClass() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupForm();
        submitGroupCreation();
        returnToGroupPage();
    }

}
