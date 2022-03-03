package cdac;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	//Precondition annotations--Start with @Before
	@BeforeSuite			//1
	public void SetupBrowser() {
		System.out.println("Setup browser");
	}
	@BeforeTest				//2
	public void LaunchBrowser() {
		System.out.println("Launch chrome browser");
	}
	@BeforeClass			//3
	public void EnterURL() {
		System.out.println("Enter URL");
	}
	@BeforeMethod			//4
	public void Login() {
		System.out.println("Login into application");
	}
	
	//Test Cases annotations---Start with Test
	@Test(priority = 1, groups="Inbox",enabled=true,dependsOnMethods = "CreateMail")			//5	
	public void SendMail() {
		System.out.println("Check whether able to send mail");
	}
	@Test(priority=3,groups="Inbox",enabled = true)	
	public void SaveAsDraft() {
		System.out.println("Check whether able to save as draft");
	}
	
	@Test(priority=4,groups="Test",enabled = true)	
	public void DeleteMail() {
	System.out.println("Check whether able to delete a mail");
	}
	
	@Test(priority = 1,groups="Test",enabled = true)	
	public void CreateMail() {
	System.out.println("Check whether able to create a mail");
	}
	
	//Postcondition annotations---Start with @After
	@AfterMethod			//6
	public void Logout() {
		System.out.println("Logout from application");
	}
	@AfterClass				//7	
	public void DeleteAllCookies() {
	System.out.println("Delete All Cookied");	
	}
	@AfterTest				//8
	public void CloseBrowser() {
		System.out.println("Close the browser");
	}
	
}
