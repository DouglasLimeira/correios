package br.com.correios.bo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;

import br.com.correios.util.FotoUtil;

public class CorreiosBO {
	private static final String HOST_NAME = "mail.imobiliariapp.com.br";
	private static final int SMTP_PORT = 587;
	private static final String MAIL_CONTATO = "messages-noreply@imobiliariapp.com.br";
	private static final String USER_PASS = "maM126bBM0";

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
	
	public void enviarEmailCadastroAceito(String emailParaEnvio) {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName(HOST_NAME);
			email.setSmtpPort(SMTP_PORT);
			email.setAuthenticator(new DefaultAuthenticator(MAIL_CONTATO, USER_PASS));
			email.setSSLOnConnect(false);
			email.setFrom(MAIL_CONTATO, "Contato iMobili�riapp");
			email.setSubject("Cadastro Aceito iMobili�riapp");

			String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
			String caminhoPastaCadastroAceito = FotoUtil.getCaminhoPastaCadastroAceitoMail();
			
			StringBuilder htmlMsg = new StringBuilder();
			htmlMsg.append("<html><body><div style=\"width: 800px; margin:auto;\">");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "topo.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "ola.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaCadastroAceito + "cadastro_aceito_msg.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "footer.jpg\" style=\"width:800px;\"/>");
			htmlMsg.append("</div></body></html>");

			email.setHtmlMsg(htmlMsg.toString());
			email.setTextMsg("Ol�, seu cadastro foi realizado com sucesso, obrigado por utilizar o iMobili�riapp. O que est� esperando? Comece a anunciar seus im�veis");
			email.addTo(emailParaEnvio);
			email.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enviarEmailCadastroRecusado(String emailParaEnvio) {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName(HOST_NAME);
			email.setSmtpPort(SMTP_PORT);
			email.setAuthenticator(new DefaultAuthenticator(MAIL_CONTATO, USER_PASS));
			email.setSSLOnConnect(false);
			email.setFrom(MAIL_CONTATO, "Contato iMobili�riapp");
			email.setSubject("Cadastro Recusado iMobili�riapp");

			String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
			String caminhoPastaCadastroRecusado = FotoUtil.getCaminhoPastaCadastroRecusadoMail();
			
			StringBuilder htmlMsg = new StringBuilder();
			htmlMsg.append("<html><body><div style=\"width: 800px; margin:auto;\">");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "topo.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "ola.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaCadastroRecusado + "cadastro_aceito_msg.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "footer.jpg\" style=\"width:800px;\"/>");
			htmlMsg.append("</div></body></html>");

			email.setHtmlMsg(htmlMsg.toString());
			email.setTextMsg("Ol�, de acordo com an�lise de seu cadastro, infelizmente n�o poderemos aprovar a utiliza��o dos nossos servi�os neste momento");
			email.addTo(emailParaEnvio);
			email.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enviarEmailCadastroRecusadoCorretor(String emailParaEnvio) {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName(HOST_NAME);
			email.setSmtpPort(SMTP_PORT);
			email.setAuthenticator(new DefaultAuthenticator(MAIL_CONTATO, USER_PASS));
			email.setSSLOnConnect(false);
			email.setFrom(MAIL_CONTATO, "Contato iMobili�riapp");
			email.setSubject("Cadastro Recusado iMobili�riapp");

			String caminhoPastaComum = FotoUtil.getCaminhoPastaComum();
			String caminhoPastaCadastroRecusado = FotoUtil.getCaminhoPastaCadastroRecusadoMail();
			
			StringBuilder htmlMsg = new StringBuilder();
			htmlMsg.append("<html><body><div style=\"width: 800px; margin:auto;\">");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "topo.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "ola.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaCadastroRecusado + "cadastro_aceito_msg.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaCadastroRecusado + "cadastro_aceito_msgcorretor.jpg\" style=\"width:800px;\"/> </br>");
			htmlMsg.append("<img src=\""+ caminhoPastaComum + "footer.jpg\" style=\"width:800px;\"/>");
			htmlMsg.append("</div></body></html>");

			email.setHtmlMsg(htmlMsg.toString());
			email.setTextMsg("Ol�, de acordo com an�lise de seu cadastro, infelizmente n�o poderemos aprovar a utiliza��o dos nossos servi�os neste momento. Favor entar em contato com o CRECI");
			email.addTo(emailParaEnvio);
			email.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
