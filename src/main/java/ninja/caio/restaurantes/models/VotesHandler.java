package ninja.caio.restaurantes.models;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import ninja.caio.restaurantes.infra.RestaurantDao;

@SessionScoped
public class VotesHandler implements Serializable {

	private Restaurant currentVoted;
	

	private RestaurantDao restaurants;
	
	private int count = 1;
	private ArrayList<Restaurant> all = new ArrayList<>();


	/**
	 * @deprecated cdi eyes only
	 */
	public VotesHandler(){
		this(null);
	}
	
	@Inject
	public VotesHandler(RestaurantDao restaurants){
		this.restaurants = restaurants;
	}
	@PostConstruct
	public void setUp() {
		ArrayList<Restaurant> all = (ArrayList<Restaurant>) restaurants.all();
		all.sort((r1,r2) -> r1.getName().compareTo(r2.getName()));
		this.currentVoted = all.get(0);
		this.all  = all;
	}
	
	public void voteOn(Restaurant voted){
		currentVoted = voted;
		count++;
	}
	
	public boolean hasNext(){
		return count<5;
	}

	public Restaurant getCurrentVoted() {
		return currentVoted;
	}
	
	public Restaurant getNext() {
		return all.get(count);
	}

}
