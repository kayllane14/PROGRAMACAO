public class Escolha {
    private String texto;
    private Capitulo capituloDestino;

    public Escolha(String texto, Capitulo capituloDestino) {
        this.texto = texto;
        this.capituloDestino = capituloDestino;
    }

    public String getTexto() {
        return texto;
    }

    public Capitulo getCapituloDestino() {
        return capituloDestino;
    }
}
