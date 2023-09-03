public class Escolha {
    private String texto;
    private String capituloDestino;

    public Escolha(String texto, String capituloDestino) {
        this.texto = texto;
        this.capituloDestino = capituloDestino;
    }

    public Escolha(String textoEscolha, Capitulo capituloDestino2) {
    }

    public Escolha(String escolhaTexto) {
    }

    public String getTexto() {
        return texto;
    }

    public String getCapituloDestino() {
        return capituloDestino;
    }
}
