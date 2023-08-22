import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    ArrayList<Escolha> escolhas;
    Personagem personagem1;
    Personagem personagem2;
    int mudaalegria;
    Capitulo proximo;
    Scanner escaneador;

    Capitulo(String nome, String texto, Personagem personagem1, Personagem personagem2,
             int mudaalegria, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
        this.mudaalegria = mudaalegria;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<Escolha>();
    }

    public void adicionarEscolha(String texto, Capitulo proximo) {
        escolhas.add(new Escolha(texto, proximo));
    }

    void mostrar() {
        System.out.println(nome);
        System.out.println(texto);
        personagem1.mudaalegria(mudaalegria);
        personagem2.mudaalegria(mudaalegria);

        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println((i + 1) + ". " + escolhas.get(i).texto);
        }
    }

    int escolher() {
        System.out.print("Escolha uma opção: ");
        int escolha = escaneador.nextInt();
        return escolha - 1; // Ajustar para índice base 0
    }

    Capitulo getProximo(int escolha) {
        if (escolha >= 0 && escolha < escolhas.size()) {
            return escolhas.get(escolha).proximo;
        }
        return proximo;
    }

    ArrayList<Escolha> getEscolhas() {
        return escolhas;
    }
}
