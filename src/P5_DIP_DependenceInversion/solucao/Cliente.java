package P5_DIP_DependenceInversion.solucao;

public class Cliente {

    private String nome;
    private Email email;
    private CPF cpf;

    /**
     * A classe se auto valida, pois os dados que
     * a compoem precisam estar corretos
     */
    public boolean validarDados(Email email, CPF cpf) {
        return this.email.validar() && this.cpf.validar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }


}