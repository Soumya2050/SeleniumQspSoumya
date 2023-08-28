package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoActitimeLoginPage {
		//Declaration
		@FindBy(xpath ="//div[@class='atLogoImg']")
		private WebElement logo;
		@FindBy(id="username")
		private WebElement usernameTf;
		@FindBy(name="pwd")
		private WebElement passwordTf;
		@FindBy(id="loginButton")
		private WebElement loginButton;
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement keepLoggedInCheckBox;
		@FindBy(id="toPasswordRecoveryPageLink")
		private WebElement forgotpassword;
		
		//intialization
		public DemoActitimeLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilization
		
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
		public void clickloginButton()
		{
			loginButton.click();
		}
		public void clickkeepLoggedInCheckBox()
		{
			keepLoggedInCheckBox.click();
		}
		public void clickforgotpassword()
		{
			forgotpassword.click();
		}
		
	}


