import java.util.Scanner;

public class miniprojetokayllane {
        public static void main(String[] args) throws Exception {
                Scanner escolhas = new Scanner(System.in);

                System.out.println("Bem-vindo, leitor!");
                System.out.println("Prepardo para decidir o caminho dessa historia?");
                System.out.println("Título:" + "A Escolha Real: Vestidos e Destinos");
                System.out.println("Capitulo 1:" + "O Convite Real");

                // Capítulo 1
                String capitulo1 = "No Reino Encantado, um convite real chegou às mãos" +
                                "das princesas Eadlyn e Celeste. Elas foram convidadas para um baile" +
                                "majestoso no Palácio de Cristal, onde a moda e a elegância seriam celebradas.";

                System.out.println(capitulo1);

                String interacao1 = "As princesas aceitaram o convite?";
                interacao1 += System.lineSeparator() + "1. Sim.";
                interacao1 += System.lineSeparator() + "2. Não.";

                System.out.println(interacao1);

                int escolha1 = escolhas.nextInt();

                if (escolha1 == 1) {

                        System.out.println(
                                        "Decididas e animadas a ir para o baile, as princesas começam a pensar no que vestir"
                                                        +
                                                        "para essa noite tão magica.");

                        System.out.println("Capítulo 2:" + "O Encontro com a Modista");

                        String capitulo2 = "As princesas, empolgadas com o baile, decidiram visitar a renomada modista"
                                        +
                                        "do reino, a Srta. Judete. Ela era famosa por criar roupas que eram verdadeiras obras de arte."
                                        +
                                        " Ao conhecer as princesas, a modista sentiu que tinha um desafio intrigante pela frente: combinar"
                                        +
                                        " os estilos e desejos das duas princesas distintas em pouco tempo." +
                                        "Cada princesa descreveu o que desejava em seus respectivos vestidos:" +
                                        "Eadlyn prefere trajes mais seguros e elegantes, com cores sólidas e tecidos luxuosos."
                                        +
                                        "Celeste desejava um vestido brilhante e exuberante, cheio de cores vivas e enfeites dourados.";

                        // Capitulo 2
                        System.out.println(capitulo2);

                        String interacao2 = "A modista aceita o desafio de criar vestidos exuberantes para essas princesas?";
                        interacao2 += System.lineSeparator() + "1. Sim, ela aceita!";
                        interacao2 += System.lineSeparator() + "2. Não, ela recusa!";

                        System.out.println(interacao2);

                        int escolha2 = escolhas.nextInt();

                        if (escolha2 == 1) {

                                System.out.println(
                                                "As princesas ficam muito animadas e ansiosas, pois sabem que ela é a melhor estilista "
                                                                +
                                                                "do pais e que estão em boas mãos");

                                // Capitulo 3

                                System.out.println("Capítulo 3:" + "A Escolha Difícil");

                                String capitulo3 = "A modista com toda a sua habilidade, juntas suas ideias e escolhe as melhores maneiras de"
                                                +
                                                "tentar agradar as princesas";

                                System.out.println(capitulo3);

                                String interacao3 = "Qual opção Srta. Judete escolheu?";

                                interacao3 += System.lineSeparator()
                                                + "1. A Fusão de Estilos: A modista decidiu criar um vestido que misturasse"
                                                +
                                                "os dois estilos de maneira harmoniosa. O vestido tinha uma base estruturada com detalhes delicados e toques"
                                                +
                                                "de cores vivas e efeitos dourados.";

                                interacao3 += System.lineSeparator()
                                                + "2. A Elegância Tradicional: A modista optou por criar dois vestidos separados,"
                                                +
                                                "cada um representando os estilos únicos das princesas." +
                                                "Eadlyn vestia um elegante traje de veludo com detalhes de pérolas. Celeste estava deslumbrante em seu vestido"
                                                +
                                                "repleto de cores vibrantes e detalhes dourados.";

                                System.out.println(interacao3);

                                int escolha3 = escolhas.nextInt();

                                if (escolha3 == 1) {

                                        System.out.println(
                                                        "As princesas ficaram decepcionadas com os vestidos, sentiram-se feias e acabaram não indo a o"
                                                                        +
                                                                        "baile");
                                        System.out.println("Fim da história!");
                                }

                                if (escolha3 == 2) {

                                        System.out.println(
                                                        "As princesas amaram seus vestidos. No baile, destacaram-se e brilharam com suas escolhas"
                                                                        +
                                                                        "individuais e foram admiradas por sua elegância tradicional");
                                        System.out.println("Fim da história!");
                                }
                        }

                        if (escolha2 == 2) {
                                System.out.println(
                                                "As princesas ficaram desapontadas, e decidiram não mais ir ao baile, sabem que não tem"
                                                                +
                                                                "outra modista tão boa quanto Srta. Judete");
                                System.out.println("Fim da história!");
                        }
                }

                if (escolha1 == 2) {
                        System.out.println(
                                        "As princesas não gostaram da ideia do baile, acharam tosco e optaram por ficar no"
                                                        +
                                                        "próprio castelo.");
                        System.out.println("Fim da história!");
                }

        }

}
