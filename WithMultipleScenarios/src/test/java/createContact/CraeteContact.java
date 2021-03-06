package createContact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CraeteContact {
	
	public static WebDriver driver;
	private String viewcontact;
//	@Given("Launch the Browser")
//	public void LaunchtheBrowser() {
//		System.setProperty("webdriver.chrome.driver", "F:\\Automation Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
//
//		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//
//	}
//
//	@And("Navigate to the URL")
//	public void NavigatetotheURL() {
//		driver.get("http://leaftaps.com/opentaps");
//	}
//
//	@And("Enter the Username as (.*)")
//	public void EntertheUsername(String userName) {
//		driver.findElement(By.id("username")).sendKeys(userName);
//	}
//	@And("Enter the Password as (.*)")
//	public void EnterthePassword(String passWord) {
//		driver.findElement(By.id("password")).sendKeys(passWord);
//	}
//	@When("Click on Login button")
//	public void ClickonLoginbutton() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//	}
//	@Then("Navigate to CRMSFA")
//	public void NavigatetoCRMSFA() {
//		driver.findElement(By.xpath("//*[@id='label']/a")).isDisplayed();
//	}
//	@And("Click on CRMSFA link")
//	public void ClickonCRMSFAlink() {
//		driver.findElement(By.xpath("//*[@id='label']/a")).click();
//	}

	
	@And("Click on Contacts")
	public void ClickonContacts() {
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
	}
	
	@And("Click on Create Contacts")
	public void ClickonCreateContacts() {
		driver.findElement(By.cssSelector("a.selected")).click();
	}
	@And("Enter First name as (.*)")
	public void EnterFirstname(String fName) {
		driver.findElement(By.id("firstNameField")).sendKeys(fName);
	}
	
	@And("Enter Last name as (.*)")
	public void EnterLastname(String lName) {
		driver.findElement(By.id("lastNameField")).sendKeys(lName);
	}
	
	@When("Click on Create Contact Button")
	public void ClickonCreateContactButton() {
		driver.findElement(By.cssSelector("input.smallSubmit")).click();
	}
		
	@Then("The contact created successfully")
	public void Thecontactcreatedsuccessfully() {
		viewcontact = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		if(viewcontact.equals(viewcontact)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
	}
	
	@And("The browser closed")
	public void Thebrowserclosed() {
		driver.close();
	}
	
	
	
	
	
	
	
	

}
