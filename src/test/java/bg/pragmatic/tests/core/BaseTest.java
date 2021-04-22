package bg.pragmatic.tests.core;

import bg.pragmatic.core.core.App;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected App app;

    @BeforeMethod
    public void setup() {
        app = new App();
        app.startBrowser("http://shop.pragmatic.bg/admin");
    }



    @AfterMethod
    public void tearDown(){
        app.quit();
    }

}
