package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoOrangeHrmLogin {
	
	//Declaration
	
	@FindBy(xpath="//div[@class='orangehrm-login-logo']")
	private WebElement logo;
	@FindBy(name="username")
	private WebElement usernameTf;
	@FindBy(name="password")
	private WebElement passwordTf;
	@FindBy(xpath = "//button[.=' Login ']")
	private WebElement loginbutton;
	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	private WebElement forgotpassword;
	@FindBy(xpath="//span[.='Admin']")
	private WebElement admin;
	
	//Intialization
	
	public DemoOrangeHrmLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getlogo()
	{
		return logo;
	}
	public void setusernameTf(String username)
	{
		usernameTf.sendKeys(username);
	}
	public void setpasswordTf(String password)
	{
		passwordTf.sendKeys(password);
	}
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	public void clickforgotpassword()
	{
		forgotpassword.click();
	}
	public void clickadmin()
	{
		admin.click();
	}
	
	
	
}
