public class Capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem Personagem;
    Personagem Personagem2;
    int mudaalegria;


     Capitulo (String nome,
               String texto,
               String escolha1,
               String escolha2,
               Personagem Personagem,
               Personagem Personagem2,
               int mudaalegria)
    {
    this.nome = nome;
    this.texto = texto;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.Personagem = Personagem;
    this.Personagem2 = Personagem2;
    this.mudaalegria = mudaalegria;      
               }

    void mostrar()
    {

    System.out.println(this.nome);
    System.out.println(this.texto);
    System.out.println(this.escolha1);
    System.out.println(this.escolha2);
   
}

}
