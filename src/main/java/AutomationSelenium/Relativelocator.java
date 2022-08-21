package AutomationSelenium;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativelocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scores/38321/eng-vs-ind-3rd-odi-india-tour-of-england-2022");

		driver.manage().window().maximize();

		WebElement cric = driver.findElement(By.xpath("//a[contains(@ng-href,'/profiles/6557/ben-stokes')]"));

		String score = driver.findElement(with(By.xpath("//div[contains(@ng-bind,'batsmen.batRuns')]")).toRightOf(cric))
				.getText();

		System.out.println(score);

	}

}
