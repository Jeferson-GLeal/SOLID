package P2_OCP_OpenClosed.solucao;

import java.util.Random;

public abstract class DebitoConta {

    private String numeroTransacao;

    public abstract String debitar(double valor, String conta);

    public String formatarTransacao() {
        String chars = "ABCDEFG4Fj5L8M9N3Op5Q4R2S7T";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        numeroTransacao = sb.toString();
        return numeroTransacao; // Número de transação formatado
    }

    public String getNumeroTransacao() {
        return numeroTransacao;
    }

    public void setNumeroTransacao(String numeroTransacao) {
        this.numeroTransacao = numeroTransacao;
    }
}