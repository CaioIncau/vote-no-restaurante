package ninja.caio.restaurantes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vote {
	
	public Vote(Restaurant restaurant2) {
		this.restaurant = restaurant2;
	}

	
	/**
	 * @deprecated hibernate eyes only
	 */
	public Vote() {
	}

	@Id @GeneratedValue
	private long id;
	
	
	@ManyToOne
    @JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	

}
