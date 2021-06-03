package test.java.gluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import test.java.commonFunctions.CommonUIFunctions;
import test.java.runner.TestRunner;

public class Region {
	@Given("^I click on region icon$")
	public void i_click_on_canvas_at_x_y_location_at_location_one() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/a[1]/img[1]")).click();
	}

	@And("^I click on canvas at x, y location and drag to p, q location$")
	public void i_click_on_canvas_at_x_y_location_at_location_two() throws Throwable {
		Actions action = new Actions(TestRunner.driver);
		action.moveToElement(TestRunner.driver.findElement(By.tagName("canvas")), 0, 0);
		action.moveByOffset(150, 10).clickAndHold().moveByOffset(190, 40).release().build().perform();
		CommonUIFunctions.implicitWait(3000);	
		System.out.println("Region Added");
	}

	@Then("^I select the region$")
	public void i_select_the_region() throws Throwable {
		Actions action = new Actions(TestRunner.driver);
		action.moveToElement(TestRunner.driver.findElement(By.tagName("canvas")), 0, 0);
		action.moveByOffset(180,40).click().build().perform();
		CommonUIFunctions.implicitWait(3000);
		System.out.println("Region Selected");
	}
	
	@Then("^I name the region$")
	public void i_name_the_region() throws Throwable {
		TestRunner.driver.findElement(By.xpath("//input[@id='root_name']")).sendKeys("test1");
		System.out.println("Region Named");
	}
	
	@Then("^I move the region$")
	public void i_move_the_region() throws Throwable {
		Actions action = new Actions(TestRunner.driver);
		action.moveToElement(TestRunner.driver.findElement(By.tagName("canvas")), 0, 0);
		action.moveByOffset(180,40).clickAndHold().moveByOffset(190, 40).release().build().perform();
		CommonUIFunctions.implicitWait(3000);
	}

	@And("^Click on sumbit button$")
	public void click_on_submit_button() throws Throwable {
		Actions act = new Actions(TestRunner.driver);
		for(int i=0;i<5;i++)
		{
			act.sendKeys(Keys.TAB).build().perform();
		}
		
		CommonUIFunctions.waitWithXpath("//label[contains(text(),'height')]");
		act.sendKeys(Keys.ENTER).build().perform();
	}

	@Then("^I delete the region$")
	public void i_delete_the_region() throws Throwable {
		CommonUIFunctions.implicitWait(5000);
		Actions act = new Actions(TestRunner.driver);
		act.sendKeys(Keys.DELETE).build().perform();
		System.out.println("Region deleted");
	}
}
