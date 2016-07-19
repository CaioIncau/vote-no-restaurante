package ninja.caio.restaurantes.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	
	@Id @GeneratedValue
	private long id;
	
	private String name;
	
	private String logoUrl;
	
	@OneToMany
    private List<Vote> votes;

	public Restaurant(String name, String logoUrl) {
		this.name = name;
		this.logoUrl = logoUrl;
	}
	
	
}
