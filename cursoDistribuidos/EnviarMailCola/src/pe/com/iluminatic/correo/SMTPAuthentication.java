package pe.com.iluminatic.correo;

import javax.mail.PasswordAuthentication;

public class SMTPAuthentication extends javax.mail.Authenticator  {

	private PasswordAuthentication authentication;

    public SMTPAuthentication() {
        String username = "calificado@alicorp.com.pe";
        String password = "Prueba1";
        authentication = new PasswordAuthentication(username, password);
    }

    public SMTPAuthentication(String username, String password) {
        authentication = new PasswordAuthentication(username, password);
    }

    public PasswordAuthentication getPasswordAuthentication() {
        /*String username = "asesoriatecnicanicovita@alicorp.com.pe";
         String password = "MARKETING1";*/
        return authentication;
    }
	
	
}
