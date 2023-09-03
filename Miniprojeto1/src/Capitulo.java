
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
        this.escolhas = new ArrayList<>();
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

    public void adicionarEscolha(Escolha escolha) {
        escolhas.add(escolha);
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
}
