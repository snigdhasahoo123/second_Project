package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {

	private WebDriver driver;

	// Inspecting the webelements

	@FindBy(xpath = "//*[@id=\"username\"]")
	WebElement user;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	public By login = By.xpath("//*[@id=\\\"login\\\"]/span[1]");

	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/span[1]")
	WebElement LearningManagementSystemlogo;
	// @FindBy(xpath="//*[@id=\"login\"]/span[1]")
	// constructor of the page class

	public Login_page(WebDriver driver) {
		this.driver = driver;

	}

	// page actions

	public String getloginpagetitle() {
		return driver.getTitle();
	}

	public boolean Logotest() {
		return LearningManagementSystemlogo.isDisplayed();

	}

	public void logincred(String un, String pwd) {

		driver.navigate().to("https://lms-frontend-phase2.herokuapp.com/login");
		user.clear();
		user.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		((WebElement) login).click();

	}

}
