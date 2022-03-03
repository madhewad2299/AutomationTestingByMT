package cdac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\CDAC-2021\\CDAC-2021_KH\\8_Docker\\ChromDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//How to handle Alert window with ok button
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(7000);
driver.switchTo().alert().accept();
//		
		
		  //Alert window with ok and cancle button
		
		  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click(); 
		  Thread.sleep(7000);
		  driver.switchTo().alert().accept(); //It will close the alert with ok button 
		  //driver.switchTo().alert().dismiss(); //It will close the alert with cancle button
		 
		
//		Alert window with input box
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(7000);
		Alert AlertWindow=driver.switchTo().alert();  //It will store alert in AlertWindow variable
		System.out.println("Message displayed on Alert:" +AlertWindow.getText());   //Print the text from alert window
		AlertWindow.sendKeys("Test");	//It will enter value in input box
		Thread.sleep(2000);
		AlertWindow.accept();		//It will accept the alert by clicking on ok
		 // driver.close();
		
	}

}
