package ninja.caio.restaurantes.infra;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ninja.caio.restaurantes.models.Restaurant;


@RequestScoped
public class RestaurantDao  {
	
	
	@Inject
	private EntityManager entityManager;
	
	
	public void save(Restaurant restaurant) {
		entityManager.persist(restaurant);
	}
}
