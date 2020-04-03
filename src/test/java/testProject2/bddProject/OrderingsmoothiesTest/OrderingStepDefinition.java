package testProject2.bddProject.OrderingsmoothiesTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Locale.Category;
import java.util.Map;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testProject2.bddProject.DrinkCatalog;
import testProject2.bddProject.MorningFreshnessMember;
import testProject2.bddProject.SuperSmoothiesSchema;

public class OrderingStepDefinition {
	
	private DrinkCatalog drinkCatalog = new DrinkCatalog();
	private SuperSmoothiesSchema superSmoothiesSchema = new SuperSmoothiesSchema(drinkCatalog);
	private MorningFreshnessMember michael;
	
	@Given("the following drink categories:")
	public void the_following_drink_categories(List<Map<String, String>> drinkCategories) {
	drinkCategories.stream().forEach(
			drinkCategory -> {
				String drink = drinkCategory.get("Drink");
				String category = drinkCategory.get("Category");
				Integer points = Integer.parseInt(drinkCategory.get("Points"));
				
				drinkCatalog.addDrink(drink, category);
				superSmoothiesSchema.setPointPerCategory(category, points);
			});
	}
	
	@Given("^(.*) is a Morning Freshness Member$")
	public void michael_is_a_Morning_Freshness_Member(String name) {
		michael = new MorningFreshnessMember(name,superSmoothiesSchema);
	}
	
	@When("^(.*) purchases (\\d+) (.*) drinks?")
		public void michael_purchases_Banana_drinks(String name,Integer amount,String drink) {
			michael.orders(amount, drink);
	}
	
	@Then("he should earn {int} points")
		public void he_should_earn_points(Integer expectedPoints) {
		assertThat(michael.getPoints()).isEqualTo(expectedPoints)	;
	}
	
}
