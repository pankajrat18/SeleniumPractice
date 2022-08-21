package AutomationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/contact-sales/");

		driver.manage().window().maximize();

		By drop = By.xpath("//select[contains(@name,'NoOfEmployees')]/option");
//Without select class
		List<WebElement> values = driver.findElements(drop);

		System.out.println(values.size());

		for (WebElement e : values) {

			String names = e.getText();
			System.out.println(names);
			if (names.contains("india")) {
				e.click();
				break;
			}

		}

		// BY select class
		By drop1 = By.xpath("//select[contains(@name,'NoOfEmployees')]");
		Select select = new Select(driver.findElement(drop1));

		select.selectByIndex(1);

	}

}
