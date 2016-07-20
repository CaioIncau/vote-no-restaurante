package ninja.caio.restaurantes.infra;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ninja.caio.restaurantes.models.Restaurant;
import ninja.caio.restaurantes.models.Vote;

public class RestaurantDaoTest extends BaseTest {
	
	
	@Test
	public void should_return_sorted() {
		RestaurantDao restaurantDao = mock(RestaurantDao.class);
		List<Restaurant> restaurantsList = getRestaurants();
		starbucks.vote();
		starbucks.vote();
		benihana.vote();
		when(restaurantDao.all()).thenReturn(restaurantsList);
		when(restaurantDao.allSortedByVotes()).thenCallRealMethod();
		List<Restaurant> allSortedByVotes = restaurantDao.allSortedByVotes();
		assertEquals(benihana, allSortedByVotes.get(1));
		assertEquals(1, allSortedByVotes.get(1).getVotes().size());
		assertEquals(starbucks, allSortedByVotes.get(0));
		assertEquals(2, allSortedByVotes.get(0).getVotes().size());
	}

}
