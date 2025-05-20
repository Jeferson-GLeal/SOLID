package P3_LSP_LiskovSubstitution.violacao;

public class Principal {

    public static void main(String[] args) {

        Quadrado quad = new Quadrado();
        quad.setAltura(10.0);
        quad.setLargura(5.0);

        obterAreaRetangulo(quad);

    }
    private static void obterAreaRetangulo(Retangulo ret) {
        System.out.println("Cálculo da área do Retângulo:");
        System.out.println(ret.getAltura() + " * " + ret.getLargura());
        System.out.println("Área: " + ret.getArea());
    }
}