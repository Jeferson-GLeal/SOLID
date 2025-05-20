package P3_LSP_LiskovSubstitution.solucao_heranca;

public abstract class Paralelogramo {

    int altura;
    int largura;


    protected Paralelogramo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public double area() {
        int calculo = this.altura * this.largura;
        System.out.println("Cálculo da área do Retângulo:");
        System.out.println(altura + " * " + largura);
        System.out.println("Área: " + calculo);
        return calculo;
    }
}