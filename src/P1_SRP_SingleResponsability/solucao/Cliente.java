package P1_SRP_SingleResponsability.solucao;

import java.time.LocalDate;

public class Cliente {

    private int clientId;
    private String nome;
    private Email email;
    private CPF cpf;
    private LocalDate dataCadastro;

    /**
     * A classe se auto valida, pois os dados que
     * a compoem precisam estar corretos
     */
    public boolean validarDados(Email email, CPF cpf) {
        return this.email.validar() && this.cpf.validar();
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
