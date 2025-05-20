package P2_OCP_OpenClosed.solucao;

public class DebitoContaCorrente extends DebitoConta {

    @Override
    public String debitar(double valor, String conta) {
        // Debitar Conta Corrente
        return formatarTransacao();
    }
}
