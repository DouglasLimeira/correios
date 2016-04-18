package br.com.resources;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.mail.EmailException;

import br.com.correios.bo.CorreiosBO;
import br.com.correios.util.FotoUtil;

@Path("/correios")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class CorreiosResource {

	@Inject CorreiosBO correiosBO;
	
	@GET
	@Path("/enviarMailBemVindo/{email}")
	public Response enviarMailBemVindo(@PathParam("email") String email){
		
		Response response = null;
		
		String assunto = "Bem vindo ao iMobiliáriapp";
		String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
		String caminhoPastaBemVindoMail = FotoUtil.getCaminhoPastaBemVindoMail();
		
		StringBuilder htmlMsg = new StringBuilder();
		htmlMsg.append("<html><head><style type=\"text/css\">");
		htmlMsg.append("img {float:left;}");
		htmlMsg.append("a {text-decoration: none;}");
		htmlMsg.append("a:visited {text-decoration: none;}");
		htmlMsg.append("</style></head><body>");
		htmlMsg.append("<div style=\"width: 806px; margin:auto;\">");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "logo.jpg\"></a> ");
		htmlMsg.append("<a href=\"mailto:contato@imobiliariapp.com.br\"><img src=\""+ caminhoPastaComum + "topo-contato.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaBemVindoMail + "boasvindas-parte1.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaBemVindoMail + "boasvindas-parte2.jpg\"> </a> </br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaBemVindoMail + "boasvindas-parte3.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://migre.me/txHmt\"><img src=\""+ caminhoPastaComum + "footer-facebook.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://migre.me/txHpk\"><img src=\""+ caminhoPastaComum + "footer-linkedin.jpg\"> </a> </ br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "footer-copyright.jpg\"> </a> </ br>");
		htmlMsg.append("</div></body></html>");
		
		try {
			
			correiosBO.enviarEmail(email, assunto, htmlMsg.toString());
			response = Response.status(Status.OK).build();
		} catch (EmailException e) {
			
			response = Response.status(Status.BAD_REQUEST).build(); 
			e.printStackTrace();
		}
		
		return response;
	}
	
	@GET
	@Path("/enviarMailMsgConstrutorCivil/{email}")
	public Response enviarMailMsgConstrutorCivil(@PathParam("email") String email){
		
		Response response = null;
		
		String assunto = "Olá Construtor Civil";
		String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
		String caminhoPastaConstrutor = FotoUtil.getCaminhoPastaConstrutor();
		
		StringBuilder htmlMsg = new StringBuilder();
		htmlMsg.append("<html><head><style type=\"text/css\">");
		htmlMsg.append("img {float:left;}");
		htmlMsg.append("a {text-decoration: none;}");
		htmlMsg.append("a:visited {text-decoration: none;}");
		htmlMsg.append("</style></head><body>");
		htmlMsg.append("<div style=\"width: 806px; margin:auto;\">");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "logo.jpg\"></a> ");
		htmlMsg.append("<a href=\"mailto:contato@imobiliariapp.com.br\"><img src=\""+ caminhoPastaComum + "topo-contato.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaConstrutor + "construtormsg-parte1.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaConstrutor + "construtormsg-parte2.jpg\"> </a> </br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaConstrutor + "construtormsg-parte3.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://migre.me/txHmt\"><img src=\""+ caminhoPastaComum + "footer-facebook.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://migre.me/txHpk\"><img src=\""+ caminhoPastaComum + "footer-linkedin.jpg\"> </a> </ br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "footer-copyright.jpg\"> </a> </ br>");
		htmlMsg.append("</div></body></html>");
		
		try {
			
			correiosBO.enviarEmail(email, assunto, htmlMsg.toString());
			response = Response.status(Status.OK).build();
		} catch (EmailException e) {
			
			response = Response.status(Status.BAD_REQUEST).build(); 
			e.printStackTrace();
		}
		
		return response;
	}
	
	@GET
	@Path("/enviarMailMsgConstrutora/{email}")
	public Response enviarMailMsgConstrutora(@PathParam("email") String email){
		
		Response response = null;
		
		String assunto = "Olá Construtora";
		String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
		String caminhoPastaConstrutor = FotoUtil.getCaminhoPastaConstrutor();
		
		StringBuilder htmlMsg = new StringBuilder();
		htmlMsg.append("<html><head><style type=\"text/css\">");
		htmlMsg.append("img {float:left;}");
		htmlMsg.append("a {text-decoration: none;}");
		htmlMsg.append("a:visited {text-decoration: none;}");
		htmlMsg.append("</style></head><body>");
		htmlMsg.append("<div style=\"width: 806px; margin:auto;\">");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "logo.jpg\"></a> ");
		htmlMsg.append("<a href=\"mailto:contato@imobiliariapp.com.br\"><img src=\""+ caminhoPastaComum + "topo-contato.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaConstrutor + "construtoramsg-parte1.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaConstrutor + "construtoramsg-parte2.jpg\"> </a> </br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaConstrutor + "construtoramsg-parte3.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://migre.me/txHmt\"><img src=\""+ caminhoPastaComum + "footer-facebook.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://migre.me/txHpk\"><img src=\""+ caminhoPastaComum + "footer-linkedin.jpg\"> </a> </ br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "footer-copyright.jpg\"> </a> </ br>");
		htmlMsg.append("</div></body></html>");
		
		try {
			
			correiosBO.enviarEmail(email, assunto, htmlMsg.toString());
			response = Response.status(Status.OK).build();
		} catch (EmailException e) {
			
			response = Response.status(Status.BAD_REQUEST).build(); 
			e.printStackTrace();
		}
		
		return response;
	}
	
	@GET
	@Path("/enviarMailMsgCorretor/{email}")
	public Response enviarMailMsgCorretor(@PathParam("email") String email){
		
		Response response = null;
		
		String assunto = "Olá Corretor";
		String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
		String caminhoPastaCorretor = FotoUtil.getCaminhoPastaCorretor();
		
		StringBuilder htmlMsg = new StringBuilder();
		htmlMsg.append("<html><head><style type=\"text/css\">");
		htmlMsg.append("img {float:left;}");
		htmlMsg.append("a {text-decoration: none;}");
		htmlMsg.append("a:visited {text-decoration: none;}");
		htmlMsg.append("</style></head><body>");
		htmlMsg.append("<div style=\"width: 806px; margin:auto;\">");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "logo.jpg\"></a> ");
		htmlMsg.append("<a href=\"mailto:contato@imobiliariapp.com.br\"><img src=\""+ caminhoPastaComum + "topo-contato.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaCorretor + "corretormsg-parte1.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaCorretor + "corretormsg-parte2.jpg\"> </a> </br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaCorretor + "corretormsg-parte3.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://migre.me/txHmt\"><img src=\""+ caminhoPastaComum + "footer-facebook.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://migre.me/txHpk\"><img src=\""+ caminhoPastaComum + "footer-linkedin.jpg\"> </a> </ br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "footer-copyright.jpg\"> </a> </ br>");
		htmlMsg.append("</div></body></html>");
		
		try {
			
			correiosBO.enviarEmail(email, assunto, htmlMsg.toString());
			response = Response.status(Status.OK).build();
		} catch (EmailException e) {
			
			response = Response.status(Status.BAD_REQUEST).build(); 
			e.printStackTrace();
		}
		
		return response;
	}
	
	@GET
	@Path("/enviarMailMsgProprietario/{email}")
	public Response enviarMailMsgProprietario(@PathParam("email") String email){
		
		Response response = null;
		
		String assunto = "Olá Proprietário";
		String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
		String caminhoPastaProprietario = FotoUtil.getCaminhoPastaProprietario();
		
		StringBuilder htmlMsg = new StringBuilder();
		htmlMsg.append("<html><head><style type=\"text/css\">");
		htmlMsg.append("img {float:left;}");
		htmlMsg.append("a {text-decoration: none;}");
		htmlMsg.append("a:visited {text-decoration: none;}");
		htmlMsg.append("</style></head><body>");
		htmlMsg.append("<div style=\"width: 806px; margin:auto;\">");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "logo.jpg\"></a> ");
		htmlMsg.append("<a href=\"mailto:contato@imobiliariapp.com.br\"><img src=\""+ caminhoPastaComum + "topo-contato.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaProprietario + "proprietariomsg-parte1.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaProprietario + "proprietariomsg-parte2.jpg\"> </a> </br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaProprietario + "proprietariomsg-parte3.jpg\"> </a> </br>");
		
		htmlMsg.append("<a href=\"http://migre.me/txHmt\"><img src=\""+ caminhoPastaComum + "footer-facebook.jpg\"> </a>");
		htmlMsg.append("<a href=\"http://migre.me/txHpk\"><img src=\""+ caminhoPastaComum + "footer-linkedin.jpg\"> </a> </ br>");
		htmlMsg.append("<a href=\"http://imobiliariapp.com.br/\"><img src=\""+ caminhoPastaComum + "footer-copyright.jpg\"> </a> </ br>");
		htmlMsg.append("</div></body></html>");
		
		try {
			
			correiosBO.enviarEmail(email, assunto, htmlMsg.toString());
			response = Response.status(Status.OK).build();
		} catch (EmailException e) {
			
			response = Response.status(Status.BAD_REQUEST).build(); 
			e.printStackTrace();
		}
		
		return response;
	}
}
