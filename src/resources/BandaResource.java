package resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import service.BandaService;
import beans.Banda;

@Path("/bandas")
public class BandaResource {

	BandaService service = new BandaService();

	@GET
	@Produces("text/xml")
	public ArrayList<Banda> getBandas() {
		return service.getAll();
	}
	
	@GET
	@Path("{id}")
	@Produces("text/xml")
	public Banda getBanda(@PathParam("id") int id) {
		return service.getBanda(id);
	}

	@POST
	@Consumes("text/xml")
	@Produces("text/plain")
	public String adicionaBanda(Banda banda) {
		service.addBanda( banda );
		return banda.getNome() + " adicionada.";
	}
	
	@PUT
	@Consumes("text/xml")
	@Produces("text/plain")
	public String updateBanda( Banda banda ) {
		return service.updateBanda( banda ) == true ? banda.getNome() + " Atualizada." : "Banda nao encontrada.";
	}
	
	@DELETE
	@Path("{id}")
	@Produces("text/plain")
	public String deleteBanda( @PathParam("id")  int id ) {
		return service.deleteBanda( id ) == true ? "Banda removida." : "Banda nao encontrada.";
	}

}