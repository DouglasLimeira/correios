package br.com.resources;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.correios.bo.CorreiosBO;

@Path("/correios")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class CorreiosResource {

	@Inject CorreiosBO correiosBO;
	
	@GET
	@Path("/enviarMailBemVindo/{email}")
	public void enviarMailBemVindo(@PathParam("email") String email){
		correiosBO.enviarEmailBoasVindas(email);
	}
	
	@GET
	@Path("/enviarEmailCadastroAceito/{email}")
	public void enviarEmailCadastroAceito(@PathParam("email") String email){
		correiosBO.enviarEmailCadastroAceito(email);
	}
	
	@GET
	@Path("/enviarEmailCadastroRecusado/{email}")
	public void enviarEmailCadastroRecusado(@PathParam("email") String email){
		correiosBO.enviarEmailCadastroRecusado(email);
	}
	
	@GET
	@Path("/enviarEmailCadastroRecusadoCorretor/{email}")
	public void enviarEmailCadastroRecusadoCorretor(@PathParam("email") String email){
		correiosBO.enviarEmailCadastroRecusadoCorretor(email);
	}
}
