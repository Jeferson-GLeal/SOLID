package P3_LSP_LiskovSubstitution.solucao_heranca;

public class Quadrado extends Paralelogramo {

    protected Quadrado(int altura, int largura) {
        super(altura, largura);

        if (altura != largura) {
            throw new IllegalArgumentException("Os dois lados do Quadrado precisam ser iguais");
        }
    }
}