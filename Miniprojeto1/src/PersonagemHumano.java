public class PersonagemHumano {
    String nome;
    int vida;

    PersonagemHumano(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    void saudehumana(int alteraçao) {
        this.vida = this.vida + alteraçao;
        System.out.println("Após essa ação, sua vida se totaliza em: " + this.vida);

        if (this.vida > 100) {
            this.vida = 100;
            System.out.println("Que saúde, ein?!");
        }

        else if (this.vida <= 0) {
            this.vida = 0;
            System.out.println("Tudo o que aconteceu foi razão das suas decisões. Sinto muito, esse é o fim!");
        }
    }
}
