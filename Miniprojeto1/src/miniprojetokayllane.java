import java.util.Scanner;

public class miniprojetokayllane {
        public static void main(String[] args) throws Exception { 
        Scanner escaneador = new Scanner (System.in);
               

                Personagem Eadlyn = new Personagem ( "Eadlyn",10);
                
                Personagem Celeste = new Personagem ("Celeste",10);
                


// CAPITULO 1
                Capitulo capitulo1 = new Capitulo("O Convite Real",
                 "No Reino Encantado, um convite real chegou às mãos" +
                                "das princesas Eadlyn e Celeste. Elas foram convidadas para um baile" +
                                "majestoso no Palácio de Cristal, onde a moda e a elegância seriam celebradas." +
                                "As princesas aceitaram o convite?" +
                                "Digite 1 para 'SIM' e 2 para 'NÃO' ",
                                 Celeste, Eadlyn, 0, escaneador);


//CAPITULO 2

                 Capitulo capitulo2 = new Capitulo("Capítulo 2:" + "O Encontro com a Modista",
                  "As princesas, empolgadas com o baile, decidiram visitar a renomada modista"
                                        +
                                        "do reino, a Srta. Judete. Ela era famosa por criar roupas que eram verdadeiras obras de arte."
                                        +
                                        " Ao conhecer as princesas, a modista sentiu que tinha um desafio intrigante pela frente: combinar"
                                        +
                                        " os estilos e desejos das duas princesas distintas em pouco tempo." +
                                        "Cada princesa descreveu o que desejava em seus respectivos vestidos:" +
                                        "Eadlyn prefere trajes mais seguros e elegantes, com cores sólidas e tecidos luxuosos."
                                        +
                                        "Celeste desejava um vestido brilhante e exuberante, cheio de cores vivas e enfeites dourados."+
                                        "A modista aceita o desafio de criar vestidos exuberantes para essas princesas?" +
                                        "Digite 1 para 'Sim, ela aceita!' e 2 para 'Não, ela recusa!' ",

                
                 Eadlyn, Celeste,
                 15, escaneador);

//CAPITULO 3

                 Capitulo capitulo3 = new Capitulo("A Decisão!", "As princesas não gostaram da ideia do baile "+
                 "acharam tosco e optaram por ficar no próprio castelo.",
                  Eadlyn, Celeste, -11, escaneador);

//CAPITULO 4


                                Capitulo capitulo4 = new Capitulo (
                                "Capítulo 3:" + "A Escolha Difícil",
                                 "A modista com toda a sua habilidade, juntas suas ideias e escolhe as melhores maneiras de"
                                                +
                               "tentar agradar as princesas"+"Qual opção Srta. Judete escolheu?" +
                               "1. A Fusão de Estilos: A modista decidiu criar um vestido que misturasse"
                                                +
                                "os dois estilos de maneira harmoniosa. O vestido tinha uma base estruturada com"+
                                 "detalhes delicados e toques"
                                                +
                                 "de cores vivas e efeitos dourados." +
                                  "2. A Elegância Tradicional: A modista optou por criar dois vestidos separados,"
                                                +
                                  "cada um representando os estilos únicos das princesas." +
                                   "Eadlyn vestia um elegante traje de veludo com detalhes de pérolas. Celeste estava deslumbrante em seu vestido"
                                                +
                                    "repleto de cores vibrantes e detalhes dourados." +
                                    "Digite 1 para 'Fusão de Estilos' e 2 para 'A Elegância Tradicional'",
                                
                               
                                  Eadlyn, Celeste,
                                 11, escaneador);

//CAPITULO 5

                                Capitulo capitulo5 = new Capitulo("Desapontamento...",
                                 "As princesas ficaram desapontadas, e decidiram não ir mais ao baile, "+
                                 "sabem que não existe outra modista tão boa quanto Srta. Judete.", Eadlyn, Celeste, -12, escaneador);



//CAPITULO 6

                               Capitulo capitulo6 = new Capitulo("Sem auto-estima.",
                                "As princesas ficaram decepcionadas com os vestidos, sentiram-se feias "+
                                "e acabaram não indo ao baile.", Eadlyn, Celeste, -10, escaneador);


//CAPITULO 7

                              Capitulo capitulo7 = new Capitulo("Stars!",
                               "As princesas amaram seus vestidos. No baile, destacaram-se e brilharam com suas escolhas "+
                               "individuais e foram admiradas por sua elegância tradicional.", Eadlyn, Celeste, 0, escaneador);


System.out.println("Bem-vindo, leitor!"); 
                System.out.println("Prepardo para decidir o caminho dessa historia?");
                System.out.println("Título:" + "A Escolha Real: Vestidos e Destinos");

                
                capitulo1.mostrar();
                int escolha = capitulo1.escolher();



if (escolha == 0){
                        System.out.println(
                                        "Decididas e animadas a ir para o baile, as princesas começam a pensar no que vestir"
                                                        +
                                                        "para essa noite tão magica.");
                        capitulo2.mostrar();
                        escolha = capitulo2.escolher();}
       //Escolhas
       capitulo1.escolhas.add(new Escolha(1, capitulo2));
       capitulo1.escolhas.add(new Escolha(1, capitulo3));

if (escolha == 0){
                                                        Eadlyn.mudaalegria(+15);
                                Celeste.mudaalegria(+15);

                                System.out.println(
                                                "As princesas ficam muito animadas e ansiosas, pois sabem que ela é a melhor estilista "
                                                                +
                                                                "do pais e que estão em boas mãos");}
       capitulo2.escolhas.add(new Escolha(1, capitulo4));
       capitulo2.escolhas.add(new Escolha(2, capitulo5));
       capitulo4.escolhas.add(new Escolha(1,  capitulo6));
       capitulo4.escolhas.add(new Escolha(2, capitulo7));

        
       //  new int[]{1, 2}, //cap1
       //  new int[]{1, 2}, //cap2
      //   new int[]{1, 2}, //cap

}
                }
               

                        
