package P5_DIP_DependenceInversion.solucao;

public interface IEmailService {
    void enviar(String de, String para, String assunto, String mensagem);
}
