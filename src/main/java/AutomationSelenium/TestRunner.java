package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/");

		driver.manage().window().maximize();

		ElementUtility ev = new ElementUtility(driver);

		By search = By.id("search_query_top");

		By suggListLocator = By.xpath("//div[@class='ac_results']//li[contains(@class, 'ac')]");

		ev.performSearch(search, "Dress", suggListLocator, "Printed Summer Dress");
		System.out.println("PASS");
		Thread.sleep(3000);
		driver.quit();

	}

}
