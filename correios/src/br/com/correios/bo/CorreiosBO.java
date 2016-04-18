package br.com.correios.bo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import br.com.correios.model.ICorreios;
import br.com.correios.util.FotoUtil;

public class CorreiosBO implements ICorreios{
	private static final String HOST_NAME = "mail.imobiliariapp.com.br";
	private static final int SMTP_PORT = 587;
	private static final String MAIL_CONTATO = "messages-noreply@imobiliariapp.com.br";
	private static final String USER_PASS = "maM126bBM0";

	public void enviarEmail(String emailUsuario, String assunto, 
			String mensagemCorpo) throws EmailException {
		
		HtmlEmail htmlEmail = new HtmlEmail();
		htmlEmail.setHostName(HOST_NAME);
		htmlEmail.setSmtpPort(SMTP_PORT);
		htmlEmail.setAuthenticator(new DefaultAuthenticator(MAIL_CONTATO, USER_PASS));
		htmlEmail.setSSLOnConnect(false);
		htmlEmail.setFrom(MAIL_CONTATO, "Contato iMobili�riapp");
		htmlEmail.setSubject(assunto);
		htmlEmail.setHtmlMsg(mensagemCorpo);
		htmlEmail.addTo(emailUsuario);
		htmlEmail.send();
	}
	
	public void enviarEmailBoasVindas(String emailParaEnvio) {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName(HOST_NAME);
			email.setSmtpPort(SMTP_PORT);
			email.setAuthenticator(new DefaultAuthenticator(MAIL_CONTATO, USER_PASS));
			email.setSSLOnConnect(false);
			email.setFrom(MAIL_CONTATO, "Contato iMobili�riapp");
			email.setSubject("Bem vindo ao iMobili�riapp");

			String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
			String caminhoPastaBemVindoMail = FotoUtil.getCaminhoPastaBemVindoMail();
			
			StringBuilder htmlMsg = new StringBuilder();
			htmlMsg.append("<html><body><div style=\"width: 800px; margin:auto;\">");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "topo.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "ola.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaBemVindoMail + "bem_vindo_msg.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "footer.jpg\" style=\"width:800px;\"/>");
			htmlMsg.append("</div></body></html>");

			email.setHtmlMsg(htmlMsg.toString());
			email.setTextMsg("Ol�, recebemos suas informa��es e estamos fazendo a an�lise. Aguarde, em breve receber�  o e-mail de resposta");
			email.addTo(emailParaEnvio);
			email.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
