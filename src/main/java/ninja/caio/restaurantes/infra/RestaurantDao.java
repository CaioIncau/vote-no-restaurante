package ninja.caio.restaurantes.infra;

import static java.util.Collections.reverse;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ninja.caio.restaurantes.models.Restaurant;
import ninja.caio.restaurantes.models.Vote;


@RequestScoped
public class RestaurantDao  {
	
	
	@Inject
	private EntityManager entityManager;
	
	
	public void save(Restaurant restaurant) {
		entityManager.persist(restaurant);
	}


	@SuppressWarnings("unchecked")
	public List<Restaurant> all() {
		return entityManager.createQuery("from Restaurant").getResultList();
	}


	public Restaurant load(Long otherId) {
		return entityManager.find(Restaurant.class, otherId);
	}
	
	public void saveWithVote(Restaurant restaurant) {
		Vote vote = new Vote(restaurant);
		entityManager.persist(vote);
		restaurant.vote();
		entityManager.merge(restaurant);
	}


	public List<Restaurant> allSortedByVotes() {
		List<Restaurant> all = all();
		all.sort(Comparator.comparingInt(r -> r.getVotes().size()));
		reverse(all);
		return all;
	}

}
