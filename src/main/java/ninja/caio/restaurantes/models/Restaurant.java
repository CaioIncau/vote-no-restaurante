package ninja.caio.restaurantes.models;

import java.util.ArrayList;
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
    private List<Vote> votes = new ArrayList<>();

	public Restaurant(String name, String logoUrl) {
		this.name = name;
		this.logoUrl = logoUrl;
	}
	
	/**
	 * @deprecated hibernate eyes only
	 */
	public Restaurant() {
	}

	public String getName() {
		return name;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public List<Vote> getVotes() {
		return votes;
	}

	public long getId() {
		return id;
	}

	public void vote() {
		this.votes.add(new Vote(this));
	}
	
}
