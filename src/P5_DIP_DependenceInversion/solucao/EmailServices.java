package P5_DIP_DependenceInversion.solucao;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailServices implements IEmailService {
    @Override
    public void enviar(String remetente, String destinatario, String assunto, String mensagem) {
        final String senha = "sua_senha"; // ⚠️ Não exponha credenciais no código!

        // Configuração do servidor SMTP
        Properties propriedades = new Properties();
        propriedades.put("mail.smtp.host", "smtp.gmail.com"); // Servidor SMTP do Gmail
        propriedades.put("mail.smtp.port", "587"); // Porta correta para envio com TLS
        propriedades.put("mail.smtp.auth", "true");
        propriedades.put("mail.smtp.starttls.enable", "true");

        // Autenticação
        Session sessao = Session.getInstance(propriedades, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remetente, senha);
            }
        });

        try {
            // Criando a mensagem de e-mail
            Message email = new MimeMessage(sessao);
            email.setFrom(new InternetAddress(remetente));
            email.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            email.setSubject(assunto);
            email.setText(mensagem);

            // Enviando o e-mail
            Transport.send(email);
            System.out.println("E-mail enviado com sucesso!");

        } catch (MessagingException e) {
            System.err.println("Erro ao enviar e-mail: " + e.getMessage());
        }
    }
}