package ninja.caio.restaurantes.infra;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import ninja.caio.restaurantes.models.Restaurant;


@RequestScoped
public class RestaurantDao  {
	
	private EntityManager entityManager;
	
	
	public RestaurantDao(){}

	@Inject
	public RestaurantDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	public void save(Restaurant restaurant) {
		System.out.println(" blalbalb"+entityManager);
		entityManager.persist(restaurant);
	}
}
