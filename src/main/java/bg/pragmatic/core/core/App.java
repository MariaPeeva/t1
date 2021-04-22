package bg.pragmatic.core.core;

import bg.pragmatic.core.pages.AdminLogin;
import bg.pragmatic.core.pages.AdminCategories;
import bg.pragmatic.core.pages.AdminDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class App {
	private WebDriver driver;

	private AdminLogin adminLogin;
	private AdminDashboard adminDashboard;
	private AdminCategories adminCategories;

	public void startBrowser(String pageToOpen) {
		//initialization of the webdriver instance
		String driverPath = null;
		driverPath = Paths.get("chromedriver.exe").toAbsolutePath().toString();
		System.out.println("The taken driver path is: " + driverPath);

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//open the desired page
		driver.get(pageToOpen);
	}
	// LAZY Instances
	public AdminLogin adminLogin() {
		if (adminLogin == null) {
			adminLogin = new AdminLogin(driver);
		}
		return adminLogin;
	}

	public AdminDashboard adminDashboard() {
		if (adminDashboard == null) {
			adminDashboard = new AdminDashboard(driver);
		}
		return adminDashboard;
	}

	public AdminCategories adminCategories() {
		if (adminCategories == null) {
			adminCategories = new AdminCategories(driver);
		}
		return adminCategories;
	}


	public void quit() {
		driver.quit();
	}
}
