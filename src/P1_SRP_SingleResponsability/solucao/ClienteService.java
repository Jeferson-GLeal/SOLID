package P1_SRP_SingleResponsability.solucao;

public class ClienteService {

    public String adicionarCliente(Cliente cliente) {
        if (!cliente.validarDados(cliente.getEmail(), cliente.getCpf())){
            return "Dados invalidos";
        }

        var repo = new ClienteRepository();
        repo.adicionarCliente(cliente);

        EmailService.enviar("jeferson@teste.com", cliente.getEmail().getEndereco(), "Bem vindo", "Teste");
        return "Cliente cadastrado com sucesso";
    }
}
