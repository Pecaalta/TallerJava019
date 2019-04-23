package API;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("store")
@Produces("application/json")
@Consumes("application/json")
public class api {
/*
	@Inject
    private StoreService storeService;*/

	
    @GET
    public String hi() {
        return "Hola mundo";
    }
}
