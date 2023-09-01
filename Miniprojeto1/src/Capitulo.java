import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas;
    private Personagem personagem1;
    private Personagem personagem2;
    private int mudaAlegria;
    private Capitulo proximo;
    private Scanner escaneador;

    public Capitulo(String nome, String texto, Personagem personagem1, Personagem personagem2,
                    int mudaAlegria, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudaAlegria = mudaAlegria;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<>();
    }

    public void adicionarEscolha(String texto, Capitulo proximo) {
        escolhas.add(new Escolha(texto, proximo));
    }

    public void mostrar() {
        System.out.println(nome);
        System.out.println(texto);
        personagem1.mudaAlegria(mudaAlegria);
        personagem2.mudaAlegria(mudaAlegria);

        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println((i + 1) + ". " + escolhas.get(i).texto);
        }
    }

    public int escolher() {
        System.out.print("Escolha uma opção: ");
        int escolha = escaneador.nextInt();
        return escolha - 1; // Ajustar para índice base 0
    }

    public Capitulo getProximo(int escolha) {
        if (escolha >= 0 && escolha < escolhas.size()) {
            return escolhas.get(escolha).proximo;
        }
        return proximo;
    }

    public ArrayList<Escolha> getEscolhas() {
        return escolhas;
    }
}
