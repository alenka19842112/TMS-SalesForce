import elements.Buttons;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {
    @Test(priority = 1, description = "account creation test")
    public void createAccountTest() {
        //Login
        loginPage.openLoginPage()
                .login();
        //open New Account modal
        newAccountModalPage.openNewAccountPage()
                .inputAccountInformation("FirstAccount","123","456", "www.tut.by")
                .inputAdditionalInformation("Customer","1","Apparel", "10",
                        "example","st. Y.Kolosa","Minsk","Minsk","123456",
                        "RB")
                .clickCheckboxOnNewAccountPage()
                .clickSaveButton();
        Assert.assertEquals(accountListPage.outDataAccount("Account Name"),"FirstAccount");
        Assert.assertEquals(accountListPage.outDataAccount("Phone"),"123");
        Assert.assertEquals(accountListPage.outDataAccount("Fax"),"456");
        Assert.assertEquals(accountListPage.outDataAccount("Website"),"www.tut.by");
        Assert.assertEquals(accountListPage.outDataAccount("Type"),"Customer");
        Assert.assertEquals(accountListPage.outDataAccount("Employees"),"1");
        Assert.assertEquals(accountListPage.outDataAccount("Industry"),"Apparel");
        Assert.assertEquals(accountListPage.outDataAccount("Annual Revenue"),"$10");
    }
}
