package P4_ISP_InterfaceSegregation.violacao;

public class CadastroCliente implements ICadastro {

    @Override
    public void validarDados() {
        // Validar CPF, Email
    }

    @Override
    public void salvarBanco() {
        // Insert na tabela Cliente
    }

    @Override
    public void enviarEmail() {
        // Enviar e-mail para o cliente
    }
}
