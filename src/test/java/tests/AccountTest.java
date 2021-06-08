package tests;

import constansTests.IConstansTests;
import object.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest implements IConstansTests {
    @Test(priority = 1, description = "account creation test")
    public void createAccountTest() {
        //create user precondition
        Account account1 = new Account("FirstAccount", "12300", "456", "www.tut.by",
                "Customer", "1", "Apparel", "10", "example",
                "st. Y. Kolosa", "Minsk", "Minsk", "123456", "RB");
        //Login
        loginPage.openLoginPage()
                .login(LOGIN, PASSWORD);
        //open New Account modal
        newAccountModalPage.openNewAccountPage()
                .create(account1);
        accountListPage.openAccountListPage()
                .clickAccountLink("FirstAccount");
        Assert.assertEquals(accountListPage.outDataAccount("Account Name"), "FirstAccount");
        Assert.assertEquals(accountListPage.outDataAccount("Phone"), "12300");
        Assert.assertEquals(accountListPage.outDataAccount("Fax"), "456");
        Assert.assertEquals(accountListPage.outDataAccount("Website"), "www.tut.by");
        Assert.assertEquals(accountListPage.outDataAccount("Type"), "Customer");
        Assert.assertEquals(accountListPage.outDataAccount("Employees"), "1");
        Assert.assertEquals(accountListPage.outDataAccount("Industry"), "Apparel");
        Assert.assertEquals(accountListPage.outDataAccount("Annual Revenue"), "$10");
    }
}
