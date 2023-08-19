import java.util.Scanner;

public class miniprojetokayllane {
        public static void main(String[] args) throws Exception {
                Scanner escolhas = new Scanner(System.in);

                System.out.println("Bem-vindo, leitor!");
                System.out.println("Prepardo para decidir o caminho dessa historia?");
                System.out.println("Título:" + "A Escolha Real: Vestidos e Destinos");
               

                Personagem Eadlyn = new Personagem ( "Eadlyn",10);
                
                Personagem Celeste = new Personagem ("Celeste",10);
                


                // Capítulo 1
                Capitulo capitulo1 = new Capitulo("Capitulo 1:" + "O Convite Real", 
                   "No Reino Encantado, um convite real chegou às mãos" +
                                "das princesas Eadlyn e Celeste. Elas foram convidadas para um baile" +
                                "majestoso no Palácio de Cristal, onde a moda e a elegância seriam celebradas." +
                                "As princesas aceitaram o convite?",
                "1. Sim.", 
                "2. Não.", 
                Eadlyn, Celeste, 
                0);


          

                int escolha1 = escolhas.nextInt();

                if (escolha1 == 1) {

                        System.out.println(
                                        "Decididas e animadas a ir para o baile, as princesas começam a pensar no que vestir"
                                                        +
                                                        "para essa noite tão magica.");

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
                                        "A modista aceita o desafio de criar vestidos exuberantes para essas princesas?",

                 "1. Sim, ela aceita!",
                 "2. Não, ela recusa!",
                 Eadlyn, Celeste,
                 15);
           
        

                        int escolha2 = escolhas.nextInt();

                        if (escolha2 == 1) {

                                Eadlyn.mudaalegria(+15);
                                Celeste.mudaalegria(+15);

                                System.out.println(
                                                "As princesas ficam muito animadas e ansiosas, pois sabem que ela é a melhor estilista "
                                                                +
                                                                "do pais e que estão em boas mãos");



                                // Capitulo 3

                                Capitulo capitulo3 = new Capitulo (
                                "Capítulo 3:" + "A Escolha Difícil",
                                 "A modista com toda a sua habilidade, juntas suas ideias e escolhe as melhores maneiras de"
                                                +
                               "tentar agradar as princesas"+"Qual opção Srta. Judete escolheu?",
                                
                               "1. A Fusão de Estilos: A modista decidiu criar um vestido que misturasse"
                                                +
                                "os dois estilos de maneira harmoniosa. O vestido tinha uma base estruturada com"+
                                 "detalhes delicados e toques"
                                                +
                                 "de cores vivas e efeitos dourados.",
                                  "2. A Elegância Tradicional: A modista optou por criar dois vestidos separados,"
                                                +
                                  "cada um representando os estilos únicos das princesas." +
                                   "Eadlyn vestia um elegante traje de veludo com detalhes de pérolas. Celeste estava deslumbrante em seu vestido"
                                                +
                                    "repleto de cores vibrantes e detalhes dourados.",
                                  Eadlyn, Celeste,
                                 11);

                              
                                int escolha3 = escolhas.nextInt();

                                if (escolha3 == 1) {

                                        Eadlyn.mudaalegria(-10);
                                        Celeste.mudaalegria(-10);

                                        System.out.println(
                                                        "As princesas ficaram decepcionadas com os vestidos, sentiram-se feias e acabaram não indo a o"
                                                                        +
                                                                        "baile");
                                        System.out.println("Fim da história!");
                                }

                                if (escolha3 == 2) {
                                        Eadlyn.mudaalegria(+11);
                                        Celeste.mudaalegria(+11);

                                        System.out.println(
                                                        "As princesas amaram seus vestidos. No baile, destacaram-se e brilharam com suas escolhas"
                                                                        +
                                                                        "individuais e foram admiradas por sua elegância tradicional");
                                        System.out.println("Fim da história!");
                                }
                        }

                        if (escolha2 == 2) {
                                Eadlyn.mudaalegria(-12);
                                Celeste.mudaalegria(-12);

                                System.out.println(
                                                "As princesas ficaram desapontadas, e decidiram não mais ir ao baile, sabem que não tem"
                                                                +
                                                                "outra modista tão boa quanto Srta. Judete");

                                System.out.println("Fim da história!");
                        }
                }

                if (escolha1 == 2) {
                        Eadlyn.mudaalegria(-11);
                        Celeste.mudaalegria(-11);
                        System.out.println(
                                        "As princesas não gostaram da ideia do baile, acharam tosco e optaram por ficar no"
                                                        +
                                                        "próprio castelo.");
                        System.out.println("Fim da história!");
                }

        }

}
