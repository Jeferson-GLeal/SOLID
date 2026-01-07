package P4_ISP_InterfaceSegregation.violacao;

import jdk.jshell.spi.ExecutionControl;

public interface ICadastro {

    void validarDados();
    void salvarBanco();
    void enviarEmail() throws ExecutionControl.NotImplementedException;
}
