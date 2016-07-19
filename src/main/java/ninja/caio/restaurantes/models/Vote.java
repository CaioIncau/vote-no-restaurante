package ninja.caio.restaurantes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vote {
	
	@Id @GeneratedValue
	private long id;
	
	
	@ManyToOne
    @JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;

}
