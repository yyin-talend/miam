package my.food;

import java.util.ArrayList;
import java.util.List;

public class DanDanMian implements Food {
	List<String> ingredients = new ArrayList<String>();

	String noodle = "Noodle";
	/* Exercise 1: implement Constructor */
	public DanDanMian(){
		ingredients.add(noodle);
		ingredients.add("spices");
		ingredients.add("peanuts");
	}
	
	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		return "CHINA";
	}

	@Override
	public Integer getCalory() {
		// TODO Auto-generated method stub
		return null;
	}

}
