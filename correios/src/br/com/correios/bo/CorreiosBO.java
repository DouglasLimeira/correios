package br.com.correios.bo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import br.com.correios.model.ICorreios;

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
		htmlEmail.setFrom(MAIL_CONTATO, "Contato iMobiliáriapp");
		htmlEmail.setSubject(assunto);
		htmlEmail.setHtmlMsg(mensagemCorpo);
		htmlEmail.addTo(emailUsuario);
		htmlEmail.send();
	}
}
