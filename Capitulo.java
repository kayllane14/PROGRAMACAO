import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Capitulo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String texto;
    private List<Personagem> personagens;
    private int mudaAlegria;
    private List<Escolha> escolhas;

    public Capitulo(String nome, String texto, List<Personagem> personagens, int mudaAlegria) {
        this.nome = nome;
        this.texto = texto;
        this.personagens = personagens;
        this.mudaAlegria = mudaAlegria;
        this.escolhas = new ArrayList<>(); // Inicializa a lista de escolhas vazia
    }

    public String getNome() {
        return nome;
    }

    public String getTexto() {
        return texto;
    }

    public List<Personagem> getPersonagens() {
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
        System.out.println(texto);
        for (Personagem personagem : personagens) {
            System.out.println(personagem.getNome() + ": " + personagem.getAlegria());
        }
    }

    public void adicionarEscolha(int escolhaNumero, String escolhaTexto) {
        Escolha escolha = new Escolha(escolhaTexto);
        if (escolhas == null) {
            escolhas = new ArrayList<>();
        }
        escolhas.add(escolha);
    }

    public void adicionarEscolha(int escolhaNumero, String escolhaTexto, String escolhaDestino) {
        Escolha escolha = new Escolha(escolhaTexto, escolhaDestino);
        if (escolhas == null) {
            escolhas = new ArrayList<>();
        }
        escolhas.add(escolha);
    }

    public void adicionarEscolha(Escolha escolha) {
        if (escolhas == null) {
            escolhas = new ArrayList<>();
        }
        escolhas.add(escolha);
    }
}
