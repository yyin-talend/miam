package my.stomach;

import java.util.ArrayList;
import java.util.List;

import my.food.ChaShaoBao;
import my.food.DanDanMian;
import my.food.Food;
import my.food.Pizza;

public class Stomach {

	List<Food> foodsInside = new ArrayList<Food>();
	boolean a = true;
	
	//add String
	String b = "the 5th time";
	
	public Stomach() {
		foodsInside.add(new Pizza());

		/* Exercise 2 : add your food */
		//second time add
		foodsInside.add(new DanDanMian());

		//add another food
		foodsInside.add(new ChaShaoBao());

		foodsInside.add(new Pizza()); //want more Pizza


		// delete the last commit msjian
		foodsInside.add(new ChaShaoBao());

		foodsInside.add(new DanDanMian());
		//add 3rd time
		foodsInside.add(new DanDanMian());
		foodsInside.add(new Pizza());

		/* Exercise 2 : add food by msjian*/
		foodsInside.add(new ChaShaoBao());

		/*Add more food by TOM */
		foodsInside.add(new DanDanMian());
		foodsInside.add(new Pizza());
		
		//I'm hacker
		foodsInside.add(new Pizza()); // I like Pizza
		foodsInside.add(new Pizza());
		foodsInside.add(new Pizza());
		
		//Tom and Jerry are not afraid
		foodsInside.add(new DanDanMian());
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("My stomach contains " + foodsInside.size() + " food(s):\n\n");
		for (Food food : foodsInside) {
			sb.append(foodsInside.indexOf(food) + 1 + ")");
		
			/* Display the name of the food object */
			sb.append(food.getClass().getSimpleName() + ":");
			sb.append("\n");
			
			/* Display the list of ingredients */
			sb.append(food.getIngredients());
			sb.append("\n\n");
			
			/* Exercise 3: Display the country of origin see class Country */ 
			sb.append(food.getCountryOrigin());
			sb.append("\n\n");
			
		}
		return sb.toString();
	}
}
