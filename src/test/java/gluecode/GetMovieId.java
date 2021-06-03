package test.java.gluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GetMovieId {
	private static ResponseOptions<Response> response;
	
	@Given("^I perform GET operation for \"([^\"]*)\"$")
	public void i_perform_GET_operation_for(String url) throws Throwable {
		response = given().contentType(ContentType.JSON).get(url);
		//System.out.println(response.getBody().asString());
		response.getBody().jsonPath().get("imdbID");
	}
	
	@Then("^I should see the status as (\\d+) and JSON result$")
	public void i_should_see_the_status_as_and_JSON_result(int statusCode) throws Throwable {
		assertThat(response.getStatusCode(), is(statusCode));
	}
	
	@Then("^Result should return imdbIDs$")
	public void result_should_return_imdbIDs() throws Throwable {
		String id = response.getBody().jsonPath().get("imdbID");
		System.out.println("Movie Id is: " + id);
	}

}
