import java.util.Scanner;
public class Capitulo {
    
    String nome;
    String texto;
    int[] escolhas;
    Personagem Personagem;
    Personagem Personagem2;
    int mudaalegria;
    Scanner escaneador;


     Capitulo (String nome,
               String texto,
               int[] escolhas,
               Personagem Personagem,
               Personagem Personagem2,
               int mudaalegria,
               Scanner escaneador)
    {
    this.nome = nome;
    this.texto = texto;
    this.escolhas = escolhas;
    this.Personagem = Personagem;
    this.Personagem2 = Personagem2;
    this.mudaalegria = mudaalegria; 
    this.escaneador = escaneador;     
               }

    void mostrar()
    {

    System.out.println(this.nome);
    System.out.println(this.texto);
    this.Personagem.mudaalegria(this.mudaalegria);
    this.Personagem2.mudaalegria(this.mudaalegria);


    if(this.escolhas != null)
{
    // for (int index = 0; index < escolhas.length; index++) 
    // {
    //   System.out.println(escolhas[index]);  
    // }
    for (int escolha : escolhas)
    {
        System.out.println(escolha);
    }
}

    System.out.println();
}

int escolher()  
{
    int idEscolha = -1;
    if(escolhas != null )
    { 
        while (idEscolha == -1)
        
        {

        System.out.println("Digite sua escolha:");
        int escolhaPreferida = escaneador.nextInt();

        int idAtual = 0;

        for (int escolha : escolhas) 
        {
            if(escolhaPreferida == escolha)
      {
        idEscolha = idAtual;
     }
        idAtual++;
        }
    

    }

}   
return idEscolha;  



}

}