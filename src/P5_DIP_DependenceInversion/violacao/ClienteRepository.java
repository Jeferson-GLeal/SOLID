package P5_DIP_DependenceInversion.violacao;

import java.sql.*;

public class ClienteRepository {


    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public void adicionarCliente(Cliente cliente) {
        String sql = "INSERT INTO CLIENTE (NOME, EMAIL, CPF, DATACADASTRO) VALUES (?, ?, ?, ?)";

        try (Connection cn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement cmd = cn.prepareStatement(sql)) {

            cmd.setString(1, cliente.getNome());
            cmd.setString(2, cliente.getEmail().getEndereco());
            cmd.setString(3, cliente.getCpf().getNumero());
            cmd.setTimestamp(4, Timestamp.valueOf(cliente.getDataCadastro().atStartOfDay()));

            cmd.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
}
