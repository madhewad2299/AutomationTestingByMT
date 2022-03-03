package cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_End_To_End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\CDAC-2021\\CDAC-2021_KH\\8_Docker\\ChromDriver\\chromedriver.exe");
			WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");  //Enter URL
		
		//Search T-shirt
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
		
		//Click on printed dress
		driver.findElement(By.linkText("Printed Dress")).click();
		driver.findElement(By.id("add_to_cart")).click();
//		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"clearfix\"]//a[@title='Proceed to checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Proceed to checkout\"]")).click();
		driver.findElement(By.id("email")).sendKeys("cdac@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Cdac@1234");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cgv")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.partialLinkText("Pay by check")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
	}

}
