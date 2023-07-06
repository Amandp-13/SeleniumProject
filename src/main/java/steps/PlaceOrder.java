package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder {
	@When("Click on Buy Now button")
	public void click_on_buy_now_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on Add New Address button")
	public void click_on_add_new_address_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Enter Address as <Name>,<Mobile>,<Pincode>,<Locality>,<Address>,<City>,<State> and <Address Type>")
	public void enter_address_as_name_mobile_pincode_locality_address_city_state_and_address_type(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@When("Click on Save and Deliver here button")
	public void click_on_save_and_deliver_here_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on Continue button on Order Summary")
	public void click_on_continue_button_on_order_summary() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on Cash on Delivery button")
	public void click_on_cash_on_delivery_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The order is placed")
	public void the_order_is_placed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
