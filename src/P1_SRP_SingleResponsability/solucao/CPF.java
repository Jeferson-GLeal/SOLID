package P1_SRP_SingleResponsability.solucao;

public class CPF {

    private String numero;

    /**
     * valida sua propria variavel
     */
    public boolean validar() {
        return this.numero.length() == 11;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
