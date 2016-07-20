package ninja.caio.restaurantes.infra;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import ninja.caio.restaurantes.infra.RestaurantDao;
import ninja.caio.restaurantes.models.VotesHandler;

public class VotesHandlerTest extends BaseTest {


	
	@Test
	public void should_init_sorted() {
		RestaurantDao mockDao = Mockito.mock(RestaurantDao.class);
		VotesHandler handler = new VotesHandler(mockDao);
		Mockito.when(mockDao.all()).thenReturn(getRestaurants());
		handler.setUp();
		assertEquals(handler.getCurrentVoted(), benihana);
	}

	@Test
	public void should_change_voted() {
		VotesHandler handler = new VotesHandler();
		handler.voteOn(starbucks);
		assertEquals(handler.getCurrentVoted(), starbucks);
	}
	
	@Test
	public void should_stop_when_reach_five() {
		VotesHandler handler = new VotesHandler();
		handler.voteOn(starbucks);
		handler.voteOn(starbucks);
		handler.voteOn(starbucks);
		assertTrue(handler.hasNext());
		handler.voteOn(starbucks);
		assertFalse(handler.hasNext());
	}
	
}
