package br.com.correios.model;

import org.apache.commons.mail.EmailException;

public interface ICorreios {
	public void enviarEmail(String emailUsuario, String assunto, String mensagemCorpo) throws EmailException;
}
