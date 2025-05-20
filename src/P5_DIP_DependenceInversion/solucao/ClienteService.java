package P5_DIP_DependenceInversion.solucao;

public class ClienteService implements IClienteService {

    private final IClienteRepository clienteRepository;
    private final IEmailService emailService;

    public ClienteService(IClienteRepository clienteRepository, IEmailService emailService) {
        this.clienteRepository = clienteRepository;
        this.emailService = emailService;
    }

    @Override
    public String adicionarCliente(Cliente cliente) {
        if (!cliente.validarDados(cliente.getEmail(), cliente.getCpf())) {
            return "DadosInvalidos";
        }
        clienteRepository.adicionarCliente(cliente);
        emailService.enviar("empresasa@empresa.com", cliente.getEmail().getEndereco(), "Teste", "Seja bem vindo!");

        return "Cliente Cadastrado com sucesso!";
    }
}
