package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import page_object.Web_Elements;

public class Steps {
	WebDriver driver;
	Web_Elements pf;
	
	
	@Given("^open the chrome browser$")
	public void open_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver2/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   
	}

	@Given("^Enter the \"([^\"]*)\"$")
	public void enter_the(String URL) throws Throwable {
		driver.get(URL);
	    
	}

	@When("^Click on sign in$")
	public void click_on_sign_in() throws Throwable {
		pf = PageFactory.initElements(driver, Web_Elements.class);
		pf.getlogin().get(0).click();
	}

	@When("^Enter userEmail \"([^\"]*)\"$")
	public void enter_userEmail(String email) throws Throwable {
		pf.getemail().get(0).sendKeys(email);
	}

	@When("^Enter the userPass \"([^\"]*)\"$")
	public void enter_the_userPass(String password) throws Throwable {
		pf.getPassword().get(0).sendKeys(password);
		
	    
	   
	}

	@When("^Click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {
	    pf.getsignBtn().get(0).click();
	    driver.close();
	   
	}



}
