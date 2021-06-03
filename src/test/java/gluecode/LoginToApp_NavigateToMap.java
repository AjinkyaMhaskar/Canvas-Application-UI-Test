package test.java.gluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.commonFunctions.CommonUIFunctions;
import test.java.dataProviders.ConfigFileReader;
import test.java.runner.TestRunner;

public class LoginToApp_NavigateToMap {
	@Given("^I navigate to base URL$")
	public void i_navigate_to_base_URL() throws Throwable {
		CommonUIFunctions.implicitWait(10);
		TestRunner.driver.get(ConfigFileReader.getBaseURL());
	}

	@Given("^I enter correct username,password & click on LOGIN button$")
	public void i_enter_correct_username_password_click_on_LOGIN_button() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys(ConfigFileReader.getUserPass());
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(ConfigFileReader.getUserPass());
		TestRunner.driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}

	@Then("^I should successfully login the application$")
	public void i_should_successfully_login_the_application() throws Throwable {
		CommonUIFunctions.waitWithXpath("//h4[contains(text(),'autobootstrap')]");
		Assert.assertEquals(TestRunner.driver.findElement(By.xpath("//span[contains(text(),'autobootstrap')]")).getText(), "autobootstrap");
	}

	@Given("^I click on manage icon$")
	public void i_click_on_manage_icon() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/a[3]/img[1]")).click();
	}

	@Given("^On the Manage page I navigate to Maps tab$")
	public void on_the_Manage_page_I_navigate_to_Maps_tab() throws Throwable {
		CommonUIFunctions.waitWithXpath("//h1[contains(text(),'Manage')]");
		TestRunner.driver.findElement(By.xpath("//div[@id='rc-tabs-1-tab-maps']")).click();
	}

	@When("^I click on tatsumi map$")
	public void i_click_on_tatsumi_map() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		CommonUIFunctions.waitWithXpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]");
	}

	@Then("^I land on map page$")
	public void i_land_on_map_page() throws Throwable {
		Assert.assertEquals(TestRunner.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText(), "tatsumi");
		Assert.assertEquals(TestRunner.driver.findElement(By.xpath("//span[contains(text(),'Edit map')]")).getText(), "Edit map");
	}
	
	@Given("^I mouse hover the username icon on top right$")
	public void i_mouse_hover_the_username_icon_on_top_right() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/a[1]/span[1]/span[1]/*[1]")).click();
		CommonUIFunctions.waitWithXpath("//span[contains(text(),'autobootstrap')]");
		Actions actions = new Actions(TestRunner.driver);
		actions.moveToElement(TestRunner.driver.findElement(By.xpath("//span[contains(text(),'autobootstrap')]"))).perform();
	}

	@Given("^I select logout option from the list$")
	public void i_select_logout_option_from_the_list() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	}

	@Then("^I logout the application$")
	public void i_logout_the_application() throws Throwable {
		CommonUIFunctions.waitWithXpath("//h4[contains(text(),'Login To Continue')]");
		Assert.assertEquals(TestRunner.driver.findElement(By.xpath("//h4[contains(text(),'Login To Continue')]")).getText(), "LOGIN TO CONTINUE");
	}
}
