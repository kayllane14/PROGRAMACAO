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

                // CRIAÇÃO DO SEGUNDO PERSONAGEM ATRAVÉS DA NOSSA CLASSE.
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

                Capitulo capitulo1 = new Capitulo("Paris",
                                "Aos trancos e barrancos, ele conseguiu chegar a Paris, seu primeiro destino. " +
                                                "Lá, ele vê que seus mantimentos estão acabando e precisa ir no mercado. "
                                                +
                                                "No caminho, nota que uma luz acendeu no painel do Mate.",
                                "1. Parar na oficina mais próxima e resolver o problema do Mate",
                                "2. Deixar para resolver depois e seguir até o mercado",
                                nome,
                                0,
                                dog,
                                0);

                capitulo1.mostrar();
                int escolha = capitulo1.escolher();

                if (escolha == 1) {
                        System.out.println(usuario + " conseguiu chegar a oficina antes que o problema se agravasse." +
                                        " Em poucas horas já havia consertado o Mate e ido até o mercado repor os mantimentos. Agora só curtir a cidade Luz.");
                } else if (escolha == 2) {
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
        }

}
