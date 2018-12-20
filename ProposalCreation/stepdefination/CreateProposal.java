package stepdefination;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateProposal {
public WebDriver driver;
public String Browser = "Chrome";
Properties prop = new Properties();
WebElement wait;
	

	//Open a browser according to browser string

	@Given("^Open a Browser with URL$")
	public void open_a_Browser_with_URL() throws Throwable {
		//Chrome
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ppatel13\\Softwares\\Selenium Drivers\\chromedriver.exe");
			driver=new ChromeDriver(); //OpenBrowser
			
		 	
		//firefox	
		}else if (Browser.equalsIgnoreCase("firefox")){ 
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\ppatel13\\Softwares\\Selenium Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
		//IE	
		}else if(Browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\ppatel13\\Softwares\\Selenium Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		FileInputStream fip = new FileInputStream(".\\GlobalVariables.properties");
		prop.load(fip);
		
		driver.get(prop.getProperty("URL"));   //Enter URL
		driver.manage().window().maximize();  //Maximize the window		
				
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Locaters.username))); //Explicit Wait
		
	}
	
		
	
	// Enter the credentials to login on portal
		@When("^Enter User Name & Password$")
		public void enter_User_Name_Password() throws Throwable {
		driver.findElement(By.xpath(Locaters.username)).sendKeys(prop.getProperty("UserName"));	//User Name
		driver.findElement(By.xpath(Locaters.password)).sendKeys(prop.getProperty("Password"));	//Password	
		driver.findElement(By.xpath(Locaters.Login)).click();	//Login Button
		
		wait= (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Locaters.proposalStatus1))); //Explicit Wait
		
	}

		@Then("^Create a new proposal$")
		public void create_a_new_proposal() throws Throwable {
			driver.findElement(By.xpath(Locaters.proposalStatus1)).click();	//Pending Proposals
			wait= (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(Locaters.NewProposal))); //Explicit Wait
			driver.findElement(By.xpath(Locaters.LocateProposal)).click();		//Click on proposal 
	//Dados Dados do produtor			
			driver.findElement(By.xpath(Locaters.Vincular)).click();			//Vincular button click?
			driver.findElement(By.xpath(Locaters.corretor)).sendKeys(prop.getProperty("corretor"));	//Enter corretor number
			driver.findElement(By.xpath(Locaters.corretorVerificar)).click();	//Verificar button click?
			wait= (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locaters.lebelcorretor))); //Explicit Wait
	}

	@Then("^Gerar Proposta$")
	public void gerar_Proposta() throws Throwable {
		driver.findElement(By.xpath(Locaters.Gerar)).click();		//SelectProduct Button click
		
	}

	
	
	
	
	
	
	
}
