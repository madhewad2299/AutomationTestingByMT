package cdac;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\CDAC-2021\\CDAC-2021_KH\\8_Docker\\ChromDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		//id locator
//		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		//name locator
//		driver.findElement(By.name("submit_search")).click();
		//linktext
//		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		//partial link text
//		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		WebElement element = driver.findElement(By.id("search_query_top"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
//		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
	}

}
