package ninja.caio.restaurantes.controller;

import java.util.List;
import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import ninja.caio.restaurantes.infra.RestaurantDao;
import ninja.caio.restaurantes.models.Restaurant;
import ninja.caio.restaurantes.models.VotesHandler;

@Controller
public class IndexController {

	private final Result result;
	private final RestaurantDao restaurants;
	private VotesHandler handler;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null, null, null);
	}
	
	@Inject
	public IndexController(Result result,RestaurantDao restaurants,VotesHandler handler) {
		this.result = result;
		this.restaurants = restaurants;
		this.handler = handler;
	}

	@Get("/")
	public void index() {
		result.include("handler", handler);
	}
	@Get("/ranking")
	public void ranking() {
		 List<Restaurant> all = restaurants.allSortedByVotes();
		result.include("all", all);
	}
	
	@Post("/vote")
	public void index(Long current, Long selected) {
		Restaurant restaurantSelected = this.restaurants.load(selected);
		restaurants.saveWithVote(restaurantSelected);
		handler.voteOn(restaurantSelected);
		result.include("handler", handler);
		if(handler.hasNext()){
			result.redirectTo(this).index();
			return;
		}
		result.redirectTo(this).ranking();
	}
	

	@Path("/hash1940dandjada1daff80514affag941")
	public void ok() {
		this.restaurants.save(new Restaurant("Outback","http://freevectorlogo.net/wp-content/uploads/2012/12/outback-steakhouse-vector-logo.png"));
		this.restaurants.save(new Restaurant("KFC","https://upload.wikimedia.org/wikipedia/en/thumb/b/bf/KFC_logo.svg/300px-KFC_logo.svg.png"));
		this.restaurants.save(new Restaurant("PizzaHut","https://upload.wikimedia.org/wikipedia/en/thumb/d/d2/Pizza_Hut_logo.svg/1088px-Pizza_Hut_logo.svg.png"));
		this.restaurants.save(new Restaurant("Starbucks","https://upload.wikimedia.org/wikipedia/en/thumb/3/35/Starbucks_Coffee_Logo.svg/1024px-Starbucks_Coffee_Logo.svg.png"));
		this.restaurants.save(new Restaurant("Benihana","https://upload.wikimedia.org/wikipedia/en/2/2c/Benihana_logo.svg"));
		System.out.println(" TESTE "+this.restaurants.all().size());
		result.nothing();
	}
}