import java.io.Serializable;
import java.util.List;

public class Capitulo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String texto;
    private List<String> personagens;
    private int mudaAlegria;
    private List<Escolha> escolhas;

    public Capitulo(String nome, String texto, List<String> personagens, int mudaAlegria) {
        this.nome = nome;
        this.texto = texto;
        this.personagens = personagens;
        this.mudaAlegria = mudaAlegria;
    }

    public String getNome() {
        return nome;
    }

    public String getTexto() {
        return texto;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public int getMudaAlegria() {
        return mudaAlegria;
    }

    public List<Escolha> getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(List<Escolha> escolhas) {
        this.escolhas = escolhas;
    }

    public boolean temEscolhas() {
        return escolhas != null && !escolhas.isEmpty();
    }

    public void mostrarTexto() {
    }

    public void adicionarEscolha(int escolhaNumero, String escolhaTexto) {
    }

    public void adicionarEscolha(int escolhaNumero, String escolhaTexto, String escolhaDestino) {
    }
}
