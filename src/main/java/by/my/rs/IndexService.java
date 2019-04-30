package by.my.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/test")
public class IndexService {

    @GET
    @Produces(value = "text/plain")
    public Response index() {
        return Response.ok("hello").build();
    }
}
