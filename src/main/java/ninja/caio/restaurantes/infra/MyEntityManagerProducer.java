package ninja.caio.restaurantes.infra;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class MyEntityManagerProducer {

//	@PersistenceContext(unitName = "default")
//	private EntityManager entityManager;
//
//	@Produces
//	public EntityManager entityManager() {
//		return entityManager;
//	}

}