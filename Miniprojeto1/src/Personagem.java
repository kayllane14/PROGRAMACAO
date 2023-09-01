public class Personagem {
    private String nome;
    private int alegria;

    public Personagem(String nome, int alegria) {
        this.nome = nome;
        setAlegria(alegria);
    }

    public void mudaAlegria(int altera) {
        setAlegria(this.alegria + altera);
    }

    public String getNome() {
        return nome;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        if (alegria < 0) {
            System.out.println(this.nome + " não tem ânimo suficiente para ir ao baile.");
        } else if (alegria > 10) {
            System.out.println(this.nome + " está animada para ir ao baile.");
            this.alegria = 10;
        } else {
            this.alegria = alegria;
        }
    }
}
