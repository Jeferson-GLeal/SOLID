package P4_ISP_InterfaceSegregation.solucao;

public class CadastroCliente implements ICdastroCliente{
    @Override
    public void validarDados() {
        // Validar CPF, Email
    }

    @Override
    public void salvarBanco() {
        // Insert na tabela cliente
    }

    @Override
    public void enviarEmail() {
        // Enviar email para o cliente
    }
}
