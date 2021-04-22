package bg.pragmatic.tests.negative;

import bg.pragmatic.tests.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bg.pragmatic.core.core.App;
import enums.Password;
import enums.Username;


public class AdminLoginTest extends BaseTest {


    @Test
    public void unsuccessfulLoginTest() {
        app.adminLogin().login(Username.ADMIN_USER, Password.ADMIN_PASSWORD);

        Assert.assertTrue(app.adminLogin().getValidationError().contains("No match for Username and/or Password."));
    }

    @Test
    public void unsuccessfulLoginTest2() {
        app.adminLogin().login(Username.ADMIN_USER, Password.ADMIN_PASSWORD);

        Assert.assertTrue(app.adminLogin().getValidationError().contains("No match for Username and/or Password."));
    }


}
