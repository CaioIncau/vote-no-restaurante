package ninja.caio.restaurantes.infra;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ninja.caio.restaurantes.models.Restaurant;
import ninja.caio.restaurantes.models.User;


@RequestScoped
public class UserDao {
	
	@Inject
	private EntityManager entityManager;
	
	
	public void save(User user) {
		entityManager.persist(user);
	}


}
