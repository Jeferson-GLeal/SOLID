package P3_LSP_LiskovSubstitution.solucao_interface;

public class Quadrado implements Forma {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public int getArea() { return lado * lado;}
}