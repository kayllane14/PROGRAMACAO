public class Personagem {
    private String nome;
    private int alegria;

    public Personagem(String nome, int alegria) {
        this.nome = nome;
        this.alegria = alegria;
    }

    public void mudaAlegria(int altera) {
        this.alegria = this.alegria + altera;

        if (this.alegria > 10) {
            this.alegria = 10;
            System.out.println(this.nome + " está animada para ir ao baile.");
        } else if (this.alegria < 0) {
            this.alegria = 0;
            System.out.println(this.nome + " não está feliz o suficiente para ir ao baile.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getAlegria() {
        return alegria;
    }
}
