package cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.opencart.com/");
//		driver.manage().window().maximize();
//		WebElement DesktopsMenu=driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
//		WebElement MACMenu=driver.findElement(By.xpath("//a[text()=\"Mac (1)\"]"));
//		Actions act=new Actions(driver);
//		act.moveToElement(DesktopsMenu).moveToElement(MACMenu).click().perform();
////		act.moveToElement(DesktopsMenu).moveToElement(MACMenu)
//		driver.close();
		System.setProperty("webdriver.chrome.driver","G:\\CDAC-2021\\CDAC-2021_KH\\8_Docker\\ChromDriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement NoteBooks=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		WebElement Windows=driver.findElement(By.xpath("//a[text()='Windows (0)']"));
		Actions act=new Actions(driver);
		act.moveToElement(NoteBooks).moveToElement(Windows).click().perform();
		//driver.close();
		
	}

}

