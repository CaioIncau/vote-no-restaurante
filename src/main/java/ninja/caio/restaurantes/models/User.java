package ninja.caio.restaurantes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id @GeneratedValue
	private long id;
	
	private String name;
	
	private String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	/**
	 * @deprecated hibernate eyes onlys
	 */
	public User(){
		
	}


	public String getName() {
		return name;
	}
	
	
	
}
