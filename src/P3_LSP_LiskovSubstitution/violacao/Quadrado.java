package P3_LSP_LiskovSubstitution.violacao;

public class Quadrado extends Retangulo {

    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
    }

    @Override
    public void setLargura(double largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }
}