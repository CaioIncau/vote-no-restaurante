package ninja.caio.restaurantes.models;

import java.util.List;

public class VotesHandler {

	private Restaurant currentVoted;
	
	private List<Restaurant> all;

	public VotesHandler(List<Restaurant> all) {
		this.currentVoted = all.get(0);
		this.all = all;
	}
	
	public void vote(Restaurant voted,Restaurant other){
		currentVoted = voted;
		all.remove(other);
	}
	
	public boolean hasNext(){
		return !all.isEmpty();
	}

	public Restaurant getCurrentVoted() {
		return currentVoted;
	}
	
}
