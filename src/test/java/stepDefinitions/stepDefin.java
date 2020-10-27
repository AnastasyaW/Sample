package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefin {
	@Given("^User is on NetBank landing page$")
	public void user_is_on_NetBank_landing_page() {
		System.out.println("User on landing page");
	}
	@When("^User Log in into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_Log_in_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
		System.out.print(arg1 + " ");System.out.println(arg2);
	}
	@When("^User enters user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_user_and_password(String arg1, String arg2) throws Throwable {
		System.out.print(arg1 + " ");System.out.println(arg2);
	}
	@Then("^Home page is populated$")
	public void user_on_home_page() {
		System.out.println("User on home page");
	}
	@Then("^Credit cards displayed \"([^\"]*)\"$")
	public void credit_cards_displayed(String arg1) throws Throwable {
		System.out.println(arg1);
	}
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.out.println("user on home page");
	}
	@When("^User clicks on add to card button$")
	public void user_clicks_on_add_to_card_button() throws Throwable {
        System.out.println("User clicks on add to card button");
	}
	@Then("^Item is added to card$")
	public void item_is_added_to_card() throws Throwable {
		System.out.println("Item is added to card");
	}
	@Then("^Count of item in the card increases$")
	public void count_of_item_in_the_card_increases() throws Throwable {
		System.out.println("Count increases"); }}
	