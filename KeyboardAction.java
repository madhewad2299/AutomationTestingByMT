package cdac;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\CDAC-2021\\CDAC-2021_KH\\8_Docker\\ChromDriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		System.out.println("Message displayed on Cosole : Its Working Successfully...... ");   //Print the text from alert window
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		//act.sendKeys(Keys.CANCEL).perform();
	}

}
