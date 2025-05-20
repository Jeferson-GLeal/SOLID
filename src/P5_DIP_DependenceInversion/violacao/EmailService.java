package P5_DIP_DependenceInversion.violacao;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailService {

    public static void enviar(String remetente, String destinatario, String assunto, String mensagem) {
        final String senha = "sua_senha";

        Properties propriedades = new Properties();
        propriedades.put("mail.smtp.host", "smtp.gmail.com"); // Servidor SMTP do Gmail
        propriedades.put("mail.smtp.port", "587"); // Porta correta para envio com TLS
        propriedades.put("mail.smtp.auth", "true");
        propriedades.put("mail.smtp.starttls.enable", "true");

        Session sessao = Session.getInstance(propriedades, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remetente, senha);
            }
        });

        try {
            Message email = new MimeMessage(sessao);
            email.setFrom(new InternetAddress(remetente));
            email.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            email.setSubject(assunto);
            email.setText(mensagem);

            Transport.send(email);
            System.out.println("E-mail enviado com sucesso!");
        } catch (MessagingException e) {
            System.err.println("Erro ao enviar e-mail: " + e.getMessage());
        }
    }
}