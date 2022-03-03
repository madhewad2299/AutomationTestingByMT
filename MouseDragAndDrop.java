package cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\CDAC-2021\\CDAC-2021_KH\\8_Docker\\ChromDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement Rome=driver.findElement(By.id("box6"));
		WebElement Italy=driver.findElement(By.id("box106"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Rome, Italy).perform();
	}

}
