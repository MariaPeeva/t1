package bg.pragmatic.tests.positive;

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
    public void successfulLoginTest() {
        app.adminLogin().login(Username.ADMIN_USER, Password.ADMIN_PASSWORD);

        Assert.assertEquals(app.adminDashboard().isLogoutButtonDisplayed(), true, "The loggout button is not displayed");
    }
    

}
