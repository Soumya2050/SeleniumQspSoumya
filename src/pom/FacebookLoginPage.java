package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	//Declaration
	@FindBy(xpath="//img[@class='fb_logo _8ilh img']")
	private WebElement logo;
	@FindBy(id="email")
	private WebElement usernameTf;
	@FindBy(id="pass")
	private WebElement passwordTf;
	@FindBy(name="login")
	private WebElement loginbutton;
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotpassword;
	@FindBy(id="u_0_0_to")
	private WebElement createnewaccount;
	@FindBy(xpath="//a[text()='Create a Page']")
	private WebElement createanewpage;
	
	//intialization
	public FacebookLoginPage(WebDriver driver)
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
	public void clickcreatenewaccount()
	{
		createnewaccount.click();
	}
	public void clickcreateanewpage()
	{
		createanewpage.click();
	}
	
	
	
	
	
}
