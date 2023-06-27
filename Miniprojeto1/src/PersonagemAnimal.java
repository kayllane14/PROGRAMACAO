
public class PersonagemAnimal {
    String nome;
    int vida;

    PersonagemAnimal(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    void saudeanimal(int alteraçao) {
        this.vida = this.vida + alteraçao;
        System.out.println("Após essa ação, a vida do seu companheiro totaliza em: " + this.vida);

        if (this.vida > 100) {
            this.vida = 100;
            System.out.println("Companheiro feliz = Tutor feliz!");
        }

        else if (this.vida <= 0) {
            this.vida = 0;
            System.out.println("Seu companheiro se foi e essa jornada não faz mas sentindo, assim como sua vida."+
            " Esse é o fim!");
        }
    }

}



