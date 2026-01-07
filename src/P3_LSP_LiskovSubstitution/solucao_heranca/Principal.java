package P3_LSP_LiskovSubstitution.solucao_heranca;

public class Principal {
    public static void main(String[] args) {
        var quad = new Quadrado(10,10);
        quad.area();

        var ret = new Retangulo(10,5);
        ret.area();

    }
}