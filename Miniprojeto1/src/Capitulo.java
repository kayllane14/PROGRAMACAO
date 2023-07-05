import java.util.Scanner;

public class Capitulo {
    String nome, texto, escolha1, escolha2;
    PersonagemHumano personagemhumano;
    int saudehumana;
    PersonagemAnimal personagemanimal;
    int saudeanimal;

    Capitulo(String nome,
            String texto,
            String escolha1,
            String escolha2,
            PersonagemHumano personagemhumano,
            int saudehumana,
            PersonagemAnimal personagemanimal,
            int saudeanimal) {

        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagemhumano = personagemhumano;
        this.saudehumana = saudehumana;
        this.personagemanimal = personagemanimal;
        this.saudeanimal = saudeanimal;
    }

    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println(" - " + this.escolha1);
        System.out.println(" - " + this.escolha2);
    }

    int escolher() {

        int escolha = -1;
        if (escolha1 != null || escolha2 != null) {

            Scanner escaneador = new Scanner(System.in);
            int escolhaDigitada = escaneador.nextInt();

            if (escolhaDigitada == 1) {

                escolha = 1;
            } else if (escolhaDigitada == 2) {
                escolha = 2;
            }

        }
        return escolha;
    }

}
