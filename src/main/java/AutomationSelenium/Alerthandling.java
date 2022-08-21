package AutomationSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		// driver.switchTo().alert().accept();

		// Thread.sleep(2000);

		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert ale = driver.switchTo().alert();

		ale.sendKeys("Pankaj");

		ale.accept();

		Thread.sleep(3000);

		driver.close();
	}

}
