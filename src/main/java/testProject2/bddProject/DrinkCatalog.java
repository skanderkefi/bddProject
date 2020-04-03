package testProject2.bddProject;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {
	
	Map<String, String> drinkCategories = new HashMap<String, String>();

	public void addDrink(String drink, String category) {
		drinkCategories.put(drink, category);
	}

	public String getCategoryOf(String drink) {
		// TODO Auto-generated method stub
		return drinkCategories.get(drink);
	}

}
