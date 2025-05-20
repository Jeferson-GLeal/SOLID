package P1_SRP_SingleResponsability.solucao;

public class Email {

    private String endereco;

    /**
     * valida sua propria variavel
     */
    public boolean validar() {
        return this.endereco.contains("@");
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
