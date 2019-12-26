package page_object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Web_Elements {
	
	@FindBy(xpath="//*[@class='header_user_info']")
	private List<WebElement> login;
	
	public List<WebElement> getlogin(){
		return login;
	}
	
	@FindBy(xpath="//input[@id='email']")
	private List<WebElement> email;

	public List<WebElement> getemail() {
		return email;
	}
	
	@FindBy(xpath="//input[@id='passwd']")
	private List<WebElement> password;
	
	public List<WebElement> getPassword() {
		return password;
		
	}

	@FindBy(xpath="//i[@class='icon-lock left']")
	private List<WebElement> signBtn;
	
	public List<WebElement> getsignBtn() {
		return signBtn;
	

	}
	
	
	
}
