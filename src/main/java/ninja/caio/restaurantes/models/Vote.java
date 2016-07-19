package ninja.caio.restaurantes.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vote {
	
	@ManyToOne
    @JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;

}
