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
        setMudaAlegria(mudaAlegria);
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<>();
    }

    public void adicionarEscolha(String texto, Capitulo proximo) {
        escolhas.add(new Escolha(texto, proximo));
    }

    public void mostrar() {
        System.out.println(nome);
        System.out.println(texto);

        if (personagem1 != null && personagem2 != null) {
            personagem1.mudaAlegria(mudaAlegria);
            personagem2.mudaAlegria(mudaAlegria);
        }
        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println((i + 1) + ". " + escolhas.get(i).getTexto());
        }
    }

    public int escolher() {
        System.out.print("Escolha uma opção: ");
        int escolha = escaneador.nextInt();
        return escolha - 1;
    }

    public Capitulo getProximo(int escolha) {
        if (escolha >= 0 && escolha < escolhas.size()) {
            return escolhas.get(escolha).getProximo();
        }
        return proximo;
    }

    public boolean temEscolhas() {
        return !escolhas.isEmpty();
    }

    public String getNome() {
        return nome;
    }

    public String getTexto() {
        return texto;
    }

    public int getMudaAlegria() {
        return mudaAlegria;
    }

    public void setMudaAlegria(int mudaAlegria) {
        if (mudaAlegria < -10 || mudaAlegria > 10) {
            System.out.println("Erro: mudaAlegria fora do intervalo permitido (-10 a 10).");
        } else {
            this.mudaAlegria = mudaAlegria;
        }
    }

    public void setProximo(Capitulo proximo) {
        this.proximo = proximo;
    }

    public Capitulo getProximo() {
        return null;
    }
}
