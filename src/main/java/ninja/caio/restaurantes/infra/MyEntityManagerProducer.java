package ninja.caio.restaurantes.infra;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MyEntityManagerProducer {

	@PersistenceContext(unitName = "default")
	private EntityManager entityManager;

	@Produces
	public EntityManager entityManager() {
		return entityManager;
	}

}