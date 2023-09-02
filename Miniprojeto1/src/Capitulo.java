import java.util.ArrayList;
import java.util.List;

public class Capitulo {
    private String nome;
    private String texto;
    private List<Escolha> escolhas;

    public Capitulo(String nome, String texto) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTexto() {
        return texto;
    }

    public List<Escolha> getEscolhas() {
        return escolhas;
    }

    public void adicionarEscolha(Escolha escolha) {
        escolhas.add(escolha);
    }
}
