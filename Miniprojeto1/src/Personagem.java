public class Personagem {

    String nome;
    int alegria;




    Personagem(String nome, int alegria)
    {
         this.nome = nome;

         this.alegria = 10; 
    }



    void mudaalegria(int altera)

    {
     this.alegria = this.alegria + altera;
    
     if(this.alegria > 10)
     {
        this.alegria = 10;

        System.out.println(this.nome + ",está animada para ir ao baile");
        }
     else if (this.alegria < 0) 
     {
        this.alegria = 0;

        System.out.println(this.nome + ",Não está feliz o suficiente para ir ao baile.");}



}

}
