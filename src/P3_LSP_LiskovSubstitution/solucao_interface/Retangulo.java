package P3_LSP_LiskovSubstitution.solucao_interface;

public class Retangulo  implements Forma {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    @Override
    public int getArea() { return largura * altura; }
}