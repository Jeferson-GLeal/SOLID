package P1_SRP_SingleResponsability.violacao;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;

public class Cliente {
    private int clientId;
    private String nome;
    private String email;
    private String cpf;
    private Date dataCadastro;

    /*
     * violacao 1
     * A Classe esta tendo a responsabilidade de
     * saber como se conectar ao banco de dados
     */
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public Date getDataCadastro() { return dataCadastro; }

    /*
     * violacao 2
     * A Classe esta tendo a responsabilidade de
     * saber como adicionar ao banco de dados
     */
    // Método para adicionar cliente ao banco de dados
    public String adicionarCliente() {
        String error = validarDados();
        if (error != null) {
            return error;
        }

        if (salvarNoBanco()) {
            enviarEmail();
            return "Cliente cadastrado com sucesso!";
        } else {
            return "Erro ao cadastrar cliente no banco.";
        }
    }

    /*
     * violacao 3
     * A Classe esta tendo a responsabilidade de
     * saber como validar os dados
     */
    private String validarDados() {
        if (!email.contains("@")) {
            return "Cliente com email inválido";
        }
        if (cpf.length() != 11) {
            return "Cliente com CPF inválido";
        }
        return null;
    }

    /*
     * violacao 4
     * A Classe esta tendo a responsabilidade de
     * saber como salvar no banco de dados
     */
    private boolean salvarNoBanco() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement("INSERT INTO clientes (nome, email, cpf, dataCadastro) VALUES (?, ?, ?, ?)")) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, cpf);
            stmt.setDate(4, new java.sql.Date(dataCadastro.getTime()));
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao salvar no banco: " + e.getMessage());
            return false;
        }
    }

    /*
     * violacao 5
     * A Classe esta tendo a responsabilidade de
     * saber como enviar emails
     */
    private void enviarEmail() {
        final String remetente = "jeferson@teste.com";
        final String senha = "sua_senha"; // Evite expor credenciais diretamente no código

        Properties propriedades = new Properties();
        propriedades.put("mail.smtp.host", "smtp.google.com");
        propriedades.put("mail.smtp.port", "25");
        propriedades.put("mail.smtp.auth", "true");
        propriedades.put("mail.smtp.starttls.enable", "true");

        Session sessao = Session.getInstance(propriedades, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remetente, senha);
            }
        });

        try {
            Message mensagem = new MimeMessage(sessao);
            mensagem.setFrom(new InternetAddress(remetente));
            mensagem.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            mensagem.setSubject("Bem-vindo.");
            mensagem.setText("Parabéns! Você está cadastrado.");

            Transport.send(mensagem);
            System.out.println("E-mail enviado com sucesso!");
        } catch (MessagingException e) {
            System.err.println("Erro ao enviar e-mail: " + e.getMessage());
        }
    }

    // Construtor
    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = new Date();
    }

    // Getters e Setters
    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }


}
