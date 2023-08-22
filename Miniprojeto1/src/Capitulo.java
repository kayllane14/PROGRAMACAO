import java.util.ArrayList;
import java.util.Scanner;
public class Capitulo {
    
    String nome;
    String texto;
    ArrayList<Escolha> escolhas;
    Personagem Personagem;
    Personagem Personagem2;
    int mudaalegria;
    Scanner escaneador;


     Capitulo (String nome,
               String texto,
               Personagem Personagem,
               Personagem Personagem2,
               int mudaalegria,
               Scanner escaneador)
    {
    this.nome = nome;
    this.texto = texto;
    this.Personagem = Personagem;
    this.Personagem2 = Personagem2;
    this.mudaalegria = mudaalegria; 
    this.escaneador = escaneador;   
    this.escolhas = new ArrayList<Escolha>();  
               }

    void mostrar()
    {

    System.out.println(this.nome);
    System.out.println(this.texto);
    this.Personagem.mudaalegria(this.mudaalegria);
    this.Personagem2.mudaalegria(this.mudaalegria);


    if(this.escolhas.size() > 0)
{
    // for (int index = 0; index < escolhas.length; index++) 
    // {
    //   System.out.println(escolhas[index]);  
    // }
    for (Escolha escolha : escolhas)
    {
        System.out.println(escolha.texto);
    } 
    System.out.println();
    
        int idEscolha = escolher();
        this.escolhas.get(idEscolha).proximo.mostrar();
}




   
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

        for (Escolha escolha : escolhas) 
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