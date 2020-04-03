package testProject2.bddProject;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothiesSchema {
	
	private Map<String, Integer> pointsPerCategory = new HashMap<String, Integer>();
	private DrinkCatalog catalog;
	
	public SuperSmoothiesSchema(DrinkCatalog catalog) {
		this.catalog=catalog;
	}
	public void setPointPerCategory(String category, Integer points) {
		pointsPerCategory.put(category, points);
	}

	public int getPointsFor(String drink) {
		return pointsPerCategory.get(categoryOf(drink));
	}

	private String categoryOf(String drink) {
		// TODO Auto-generated method stub
		return catalog.getCategoryOf(drink);
	}

}
