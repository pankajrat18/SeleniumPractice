package AutomationSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSel {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text() = 'Components']")).click();

		By inputfields = By.tagName("input");

		List<WebElement> place = driver.findElements(inputfields);
		List<String> addplaceholder = new ArrayList<String>();
		int totalplaceholder = place.size();

		System.out.println(totalplaceholder);

		for (WebElement e : place) {
			String details = e.getAttribute("placeholder");
			if (!details.isEmpty()) {
				addplaceholder.add(details);
			}

		}
		System.out.println(addplaceholder);
		Thread.sleep(5000);

		driver.quit();
	}

}
