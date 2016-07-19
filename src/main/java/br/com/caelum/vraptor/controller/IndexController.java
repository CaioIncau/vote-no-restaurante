package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import ninja.caio.restaurantes.infra.RestaurantDao;
import ninja.caio.restaurantes.models.Restaurant;

@Controller
public class IndexController {

	private final Result result;
	private final RestaurantDao restaurants;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null, null);
	}
	
	@Inject
	public IndexController(Result result,RestaurantDao restaurants) {
		this.result = result;
		this.restaurants = restaurants;
	}

	@Path("/")
	public void index() {
		this.restaurants.save(new Restaurant("Outback","http://freevectorlogo.net/wp-content/uploads/2012/12/outback-steakhouse-vector-logo.png"));
		result.include("variable", "VRaptor!");
	}
}