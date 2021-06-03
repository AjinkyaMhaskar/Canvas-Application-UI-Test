package test.java.gluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.commonFunctions.CommonUIFunctions;
import test.java.runner.TestRunner;

public class EditMap {

	@Given("^I am on tatsumi map page$")
	public void i_am_on_tatsumi_map_page() throws Throwable {
		CommonUIFunctions.waitWithXpath("//span[contains(text(),'Edit map')]");
		Assert.assertEquals(TestRunner.driver.findElement(By.xpath("//span[contains(text(),'Edit map')]")).getText(), "Edit map");
	}
	
	@And("^then click on edit map button$")
	public void then_click_on_edit_map_button() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//span[contains(text(),'Edit map')]")).click();
		CommonUIFunctions.waitWithXpath("//p[contains(text(),'Exit Map Editor')]");
		System.out.println("Edit map clicked");
	}
	
	@And("^I click on Zoom to fit button$")
	public void i_click_on_Zoom_to_fit_button() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//span[contains(text(),'Zoom to fit')]")).click();
	}
	
	@Then("^I land on edit map page$")
	public void i_land_on_edit_map_page() throws Throwable {
		Assert.assertEquals(TestRunner.driver.findElement(By.xpath("//p[contains(text(),'Exit Map Editor')]")).getText(), "Exit Map Editor");
	}
	
	@Given("^I click on node icon$")
	public void i_click_on_node_icon() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/img[1]")).click();
		System.out.println("Node button clicked");
	}

	@And("^I click on canvas at x, y location at location one to create a node$")
	public void i_click_on_canvas_at_x_y_location_at_location_one_to_create_a_node() throws Throwable {
		Actions action = new Actions(TestRunner.driver);
		action.moveToElement(TestRunner.driver.findElement(By.tagName("canvas")), 0, 0);
		action.moveByOffset(170,10).click().build().perform();
		CommonUIFunctions.implicitWait(3000);
		System.out.println("Selected node 1");
	}

	@And("^I click on canvas at x, y location at location two to create a node$")
	public void i_click_on_canvas_at_x_y_location_at_location_two_to_create_a_node() throws Throwable {
		Actions action = new Actions(TestRunner.driver);
		action.moveToElement(TestRunner.driver.findElement(By.tagName("canvas")), 0, 0);
		action.moveByOffset(170,40).click().build().perform();
		CommonUIFunctions.implicitWait(3000);
		System.out.println("Selected node 2");
	}
	
	@Given("^I click on Edge Icon$")
	public void i_click_on_Edge_Icon() throws Throwable {
		CommonUIFunctions.implicitWait(5000);
		CommonUIFunctions.waitWithXpath("//span[contains(text(),'autobootstrap')]");
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]/img[1]")).click();
	}
	
	@And("^I select the added node one$")
	public void i_select_the_added_node_one() throws Throwable {
		Actions actions = new Actions(TestRunner.driver);
		actions.moveToElement(TestRunner.driver.findElement(By.tagName("canvas")), 0, 0);
		actions.moveByOffset(170,10).click().build().perform();
		CommonUIFunctions.implicitWait(3000);
	}

	@And("^I select the added node two$")
	public void i_select_the_added_node_two() throws Throwable {
		Actions actions = new Actions(TestRunner.driver);
		actions.moveToElement(TestRunner.driver.findElement(By.tagName("canvas")), 0, 0);
		actions.moveByOffset(170,40).click().build().perform();
		CommonUIFunctions.implicitWait(3000);
	}
	
	@When("^I click on select icon$")
	public void i_click_on_select_icon() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
	}
	
	@Then("^I save the map$")
	public void i_save_the_map() throws Throwable {
		CommonUIFunctions.implicitWait(5000);
		CommonUIFunctions.waitWithXpath("//span[contains(text(),'autobootstrap')]");
		TestRunner.driver.findElement(By.xpath("//span[contains(text(),'Save changes')]")).click();
		CommonUIFunctions.implicitWait(5000);
	}

	@Then("^I delete the node$")
	public void i_delete_the_node() throws Throwable {
		CommonUIFunctions.implicitWait(5000);
		Actions act = new Actions(TestRunner.driver);
		act.sendKeys(Keys.DELETE).build().perform();
		System.out.println("Deleted node");
	}

	@Then("^Exit map editor$")
	public void exit_map_editor() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//p[contains(text(),'Exit Map Editor')]")).click();
		CommonUIFunctions.implicitWait(5000);
		System.out.println("Exit Map");
	}
}


