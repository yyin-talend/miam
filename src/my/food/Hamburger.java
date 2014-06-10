package my.food;

import java.util.ArrayList;
import java.util.List;

public class Hamburger implements Food {

    List<String> ingredients = new ArrayList<String>();
	
		
	Hamburger() {
		// add by msjian
		ingredients.add("Hamburger");
	}

	@Override
	public String getCountryOrigin() {
		return Country.getInstance().getCountryForHmaburger();
	}

	@Override
	public Integer getCalory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getIngredients() {
		// TODO Auto-generated method stub
		return ingredients;
	}

}
