package Serathiuk.Alura.Api;

public class Error {
    private String mensagem;

    public Error(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
