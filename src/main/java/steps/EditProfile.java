package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProfile {
	@When("User cick on My Profile button")
	public void user_cick_on_my_profile_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User click on Profile Information button")
	public void user_click_on_profile_information_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on Edit button")
	public void click_on_edit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Enter Profile Information as <First Name>, <Last Name>, <Gender>, <Email> and <Mobile>")
	public void enter_profile_information_as_first_name_last_name_gender_email_and_mobile(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@When("Click on Save button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Profile information get update")
	public void profile_information_get_update() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
