package ninja.caio.restaurantes.infra;

import java.util.ArrayList;
import java.util.List;

import ninja.caio.restaurantes.models.Restaurant;

public class BaseTest {

	protected Restaurant starbucks;
	protected Restaurant benihana;
	private ArrayList<Restaurant> restaurants = new ArrayList<>();

	public List<Restaurant> getRestaurants(){
		this.restaurants.add(new Restaurant("Outback","http://freevectorlogo.net/wp-content/uploads/2012/12/outback-steakhouse-vector-logo.png"));
		this.restaurants.add(new Restaurant("KFC","https://upload.wikimedia.org/wikipedia/en/thumb/b/bf/KFC_logo.svg/300px-KFC_logo.svg.png"));
		this.restaurants.add(new Restaurant("PizzaHut","https://upload.wikimedia.org/wikipedia/en/thumb/d/d2/Pizza_Hut_logo.svg/1088px-Pizza_Hut_logo.svg.png"));
		starbucks = new Restaurant("Starbucks","https://upload.wikimedia.org/wikipedia/en/thumb/3/35/Starbucks_Coffee_Logo.svg/1024px-Starbucks_Coffee_Logo.svg.png");
		this.restaurants.add(starbucks);
		benihana = new Restaurant("Benihana","https://upload.wikimedia.org/wikipedia/en/2/2c/Benihana_logo.svg");
		this.restaurants.add(benihana);
		return restaurants;
	}
}
