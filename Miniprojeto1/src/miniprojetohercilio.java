import java.io.Console;
import java.util.Scanner;

public class miniprojetohercilio {
        public static void main(String[] args) throws Exception {

                // MENSAGEM DE BOAS VINDAS.
                System.out.println("Olá, seja bem vindo a Nômades! " +
                                "Para iniciarmos nossa aventura, escolha o seu nome de usuário:");
                Scanner escaneador = new Scanner(System.in);
                String usuario = escaneador.nextLine();

                // CRIAÇÃO DO PRIMEIRO PERSONAGEM (usuário) ATRAVÉS DA NOSSA CLASSE CRIADA.
                PersonagemHumano nome = new PersonagemHumano(usuario, 100);

                System.out.println("Olá, " + usuario
                                + ". Seja BEM-VINDO! Que tal um parceiro? Vamos dar um nome ao seu companheiro:");
                String companheiro = escaneador.nextLine();

                // CRIAÇÃO DO SEGUNDO PERSONAGEM (lobo) ATRAVÉS DA NOSSA CLASSE.
                PersonagemAnimal dog = new PersonagemAnimal(companheiro, 100);

                // INICIO DA HISTÓRIA.
                System.out.println("Agora que podemos nos comunicar com você, vamos iniciar!");
                System.out.println();
                System.out.println(usuario + " decidiu se tornar nômade após ver que estava cansado da rotina" +
                                " de trabalho cansativa e repetitiva. Ele decidiu que iria viajar pelo mundo e que, estava pronto para novas aventuras!");
                System.out.println("Junto a ele, obvio que não iria faltar o seu fiel e leal companheiro: "
                                + companheiro +
                                ", que estará com ele nessa jornada onde visitará vários países em seu MotorHome: o Mate!");

                // CAPITULO 1 -> PARIS
                System.out.println("Ao trancos e barrancos, " + usuario
                                + " conseguiu chegar a Paris, seu primeiro destino. Lá, ele vê " +
                                "que seus mantimentos estão acabando, e precisa ir no mercado. No caminho, nota que uma luz estranha acende no painel "
                                +
                                "do Mate.");
                System.out.println("Vamos a sua primeira decisão!");
                String decisao1 = "1. Parar na oficina mais próxima e resolver o problema do Mate";
                decisao1 += System.lineSeparator() + "2. Deixar para resolver depois e seguir até o mercado";

                System.out.println(decisao1);

                int escolha1 = escaneador.nextInt();

                if (escolha1 == 1) {
                        System.out.println(usuario + " conseguiu chegar a oficina antes que o problema se agravasse." +
                                        " Em poucas horas já havia consertado o Mate e ido até o mercado repor os mantimentos. Agora só curtir a cidade Luz.");
                } else {
                        System.out.println(
                                        "Mate acabou não aguentando o caminho até o mercado e parou em um bairro perigoso. "
                                                        + usuario +
                                                        " notou alguém se aproximava e decidiu pedir ajuda.");
                        System.out.println("Infelizmente, as intenções daquele que se aproximava não eram boas." +
                                        " O rapaz veio até a direção do " + usuario
                                        + " com uma faca na mão e, ao notar o comportamento, " + companheiro +
                                        " saltou em cima do possível ladrão. Ele conseguiu salvar os dois mas acabou saindo ferido...");
                        dog.saudeanimal(-30);
                }

                System.out.println("Obvio que apesar dos desafios, " + usuario + " e " + companheiro
                                + " não iriam deixar de visitar a famosa" +
                                " Torre Eiffel.");
                System.out.println();
                System.out.println(
                                "Chegando lá, notam uma multidão indo até uma barraca e, curiosos, vão até lá. Acontece que "
                                                +
                                                "uma grande emissora francesa, estava fazendo um jogo de perguntas e respostas e quem acertasse mais, levaria um "
                                                +
                                                "prêmio de $20.000,00 para casa!");

                String decisao2 = "1. Participar e utilizar seus conhecimentos que buscou antes de virar nômade.";
                decisao2 += System.lineSeparator()
                                + "2. Achar que é perda de tempo e ir aproveitar a bela vista da Torre para algumas fotos.";

                System.out.println(decisao2);

                int escolha2 = escaneador.nextInt();

                if (escolha2 == 1) {
                        System.out.println(usuario + " sai incredulo e saltitante. COM $20.000,00 NA CONTA!.");
                        System.out.println("Em meio a comemoração, " + usuario
                                        + " percebe uma inquietação do seu companheiro " + companheiro +
                                        " . Acontece que sua ferida está infeccionada.");
                        System.out.println(
                                        "Chegando no veterinário, descobre que o problema é maior do que imaginava..." +
                                                        " Será necessária uma cirurgia e o valor não é um problema graças aquela premiação.");
                        System.out.println();
                        System.out.println("Após algum tempo de espera, " + usuario
                                        + " já pode ir ver seu companheiro novamente." +
                                        " Ele se emociona ao ver seu amigo bem e nem imagina o que iria fazer se o pior tivesse acontecido.");
                        dog.saudeanimal(+30);
                } else {
                        System.out.println("Durante as fotos, " + usuario
                                        + " percebe uma inquietação do seu companheiro " + companheiro +
                                        " . Acontece que sua ferida está infeccionada.");
                        System.out.println(
                                        "Chegando no veterinário, descobre que o problema é maior do que imaginava..." +
                                                        " Será necessária uma cirurgia e o valor é absurdo, infelizmente não pode pagar.");
                        dog.saudeanimal(-100);
                }

        }

}
