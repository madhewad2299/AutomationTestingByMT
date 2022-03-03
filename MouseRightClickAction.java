package cdac;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\CDAC-2021\\CDAC-2021_KH\\8_Docker\\ChromDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
//		WebElement button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
//		Actions act=new Actions(driver);
//		//This method used for right click and here we are passing element on which we are going to perform right click action 
//		act.contextClick(button).perform();			//perform will complete the action
		Actions action=new Actions(driver);
		action.contextClick(button).perform();
		
	}

}

