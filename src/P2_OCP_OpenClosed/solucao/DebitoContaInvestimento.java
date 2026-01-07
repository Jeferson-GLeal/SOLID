package P2_OCP_OpenClosed.solucao;

public class DebitoContaInvestimento extends DebitoConta {

    @Override
    public String debitar(double valor, String conta) {
        //Debita Cointa investimento
        //Isentar Taxas
        return formatarTransacao();
    }
}
