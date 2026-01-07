package P4_ISP_InterfaceSegregation.violacao;

import jdk.jshell.spi.ExecutionControl;

public class CadastroProduto implements ICadastro {

    @Override
    public void validarDados() {
        // Validar valor
    }

    @Override
    public void salvarBanco() {
        // Insert tabela Produto
    }

    @Override
    public void enviarEmail() throws ExecutionControl.NotImplementedException {
        // Produto nao tem email, o que fazer?
        throw new ExecutionControl.NotImplementedException("Esse metodo nao serve pra nada");
    }
}
