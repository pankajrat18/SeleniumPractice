package AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtils {
	private WebDriver driver;

	public WebDriver intiDriver(String browsername) {

		System.out.println("Brower name is " + browsername);

		if (browsername.equalsIgnoreCase("chrome")) {
			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			// WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			// WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("Incorrect browser name " + browsername);
		}
		return driver;

	}

	public void launchUrl(String url) {
		if (url == null) {

			System.out.println("url is null....");
			return;
		}
		if (url.indexOf("http") == -1) {
			System.out.println("url is not having http");
		}
		if (url.indexOf("https") == -1) {
			System.out.println("url is not having https");
		}
		driver.get(url);

	}

	public String getTitle() {

		String title = driver.getTitle();
		System.out.println("Page Title is " + title);
		return title;
	}

	public String getUrl() {

		String url = driver.getCurrentUrl();
		System.out.println("Current url is " + url);
		return url;

	}

	public String Pagesource() {
		String pagedetails = driver.getPageSource();
		System.out.println("Page source is " + pagedetails);
		return pagedetails;

	}

	public boolean getPageDetails(String info) {
		if (Pagesource().contains(info)) {
			return true;
		}
		return false;

	}

	public void closeBrowser() {
		driver.close();

	}

	public void quitBrowser() {
		driver.quit();
	}

}
