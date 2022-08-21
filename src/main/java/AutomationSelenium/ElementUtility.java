package AutomationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {

	private WebDriver driver;

	public ElementUtility(WebDriver driver) {
		this.driver = driver;

	}

	// find Element
	public WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	// find Elements
	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);
	}

	// Send Keys
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	// Perform Search
	public void performSearch(By search, String searchKey, By suggListLocator, String suggName)
			throws InterruptedException {
		doSendKeys(search, searchKey);
		Thread.sleep(5000);

		List<WebElement> suggList = getElements(suggListLocator);

		System.out.println("Total Suggestion : " + suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();

			System.out.println(text);

			if (text.contains(suggName))

				e.click();
			break;

		}

	}

}
