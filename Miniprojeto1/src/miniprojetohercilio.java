import java.io.Console;
import java.util.Scanner;

public class miniprojetohercilio {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, seja bem vindo ao Dungeons! " +
                "Para iniciarmos nossa aventura, escolha o seu nome de usuário:");
        Scanner escaneador = new Scanner(System.in);
        String usuario = escaneador.nextLine();

        String escolhas = "Bem-vindo, " + usuario + "! Escolha, através da sua numeração, sua vocação:";

        escolhas += System.lineSeparator()
                + "1. Knight: Mestre de combate corpo a corpo, possuindo resistência imensa.";
        escolhas += System.lineSeparator() + "2. Paladin: Mestre de luta à distância, domínio leve da artes mágicas.";
        escolhas += System.lineSeparator() + "3. Druid: Mestre da arte da cura e suporte.";
        escolhas += System.lineSeparator() + "4. Sorcerer: Mestre das artes mágicas, agressivas e ofensivas.";

        System.out.println(escolhas);
        int escolha = escaneador.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("Parabéns, você se tornou um Knight! Suas características são:" +
                        " Rápidos em avanço de fist, sword, club e axe fighting, shielding. Avanços muito lentos na magia.");
                break;

            case 2:
                System.out.println("Parabéns, você se tornou um Paladin! Suas características são:" +
                        " Rápidos em avanço de distance fighting, razoável com qualquer outra habilidade.");
                break;

            case 3:
                System.out.println("Parabéns, você se tornou um Druid! Suas características são:" +
                        " Rápidos em avanço de magic level e ligeiramente melhor com melee do que os sorcerers.");
                break;

            case 4:
                System.out.println("Parabéns, você se tornou um Paladin! Suas características são:" +
                        " Rápidos em avanço de magic level.");
                break;

            default:
                System.out.println("Essa opção não existe, tente novamente!");
        }

        System.out.println("Agora que você já sabe qual sua vocação, vamos iniciar nossa jornada." +
                " Digite 1 para entrar na Dungeon!");
        int entrada = escaneador.nextInt();

        String inicio = "Ao entrar na Dungeon, você deu de cara com um Ghost." +
                " O que deseja fazer?";
        inicio += System.lineSeparator() + "1. Habilidade básica";
        inicio += System.lineSeparator() + "2. Habilidade especial";

        System.out.println(inicio);

        int fase1 = escaneador.nextInt();
        if (fase1 == 1) {
            System.out.println("Mesmo sofrendo um pouco, você conseguiu vencer o Ghost! Pode seguir sua jornada.");
        } else if (fase1 == 2) {
            System.out.println("Você aniquilou o Ghost!! Pode seguir sua jornada.");
        } else {
            System.out.println("Você não possui essa habilidade.");
        }

        System.out.println("Parabéns por passar da primeira fase! Digite 1 para" +
                " seguirmos para o próximo nível.");
        int entrada2 = escaneador.nextInt();

        String meio = "Enquanto explorava o novo andar da Dungeon, você foi atacado por um" +
                " Carniphilas enquanto estava desatento. Por estar ferido, você está limitado nessa batalha, o que irá fazer?";
        meio += System.lineSeparator() + "1. Tentar fugir do Carniphilas.";
        meio += System.lineSeparator() + "2. Usar sua habilidade especial para e evaporá-lo.";

        System.out.println(meio);

        int fase2 = escaneador.nextInt();
        if (fase2 == 1) {
            System.out.println("Você conseguiu fugir mas esta muito debilitado, todo cuidado será pouco" +
                    " a partir de agora. Digite 1 para continuar:");
            int seguir = escaneador.nextInt();

            String potion = "Você está chegando a fase final da Dugeon quando encontra uma feiticeira." +
                    " Ela te oferece uma poção e promete que irá te curar.";
            potion += System.lineSeparator() + "1. Aceitar";
            potion += System.lineSeparator() + "2. Recusar";

            System.out.println(potion);

            int escolha2 = escaneador.nextInt();
            if (escolha2 == 1) {
                System.out.println("Você acreditou na feiticeira e foi envenenado." +
                        " Sua ingenuidade acabou com sua passagem por Dundgeons.");
                System.out.println("Você fracassou!");
            } else if (escolha2 == 2) {
                System.out.println("Graças a essa decisão, você seguirá vivo e ao passar pela escada" +
                        "da ultima fase da Dungeon, será curado.");
                System.out.println("Digite 1 para subir a escada e seguir sua jornada:");
                int subirescada = escaneador.nextInt();

                System.out.println(
                        "Você está quase lá, agora só falta derrotar o poderoso Spectral. Digite 1 quando estiver pronto!");
                int chefe = escaneador.nextInt();

                String chefao = "O Spectral te ataca e você consegue desviar, o que fará agora?";
                chefao += System.lineSeparator() + "1. Usar sua habilidade especial e tentar acabar" +
                        " com a lutar de uma vez por todas.";
                chefao += System.lineSeparator() + "2. Esperar que ele ataque novamente para ficar mais exposto";

                System.out.println(chefao);

                int escolhafinal = escaneador.nextInt();

                if (escolhafinal == 1) {
                    System.out.println("Sua habilidade acertou em cheio o Spectral. Parabéns, você concluiu a Dungeon" +
                            " e entrará na lista dos poucos nomes que conseguiram finalizar Dundgeons.");
                    System.out.println("Obrigado por ler Dudgeons!");
                } else {
                    System.out.println("Você não conseguiu desviar do segundo ataque do Spectral" +
                            ", o ataque acertou você em um ponto vital e você acabou morrendo." +
                            " Sinto muito, sua jornada acaba aqui!");
                    System.out.println("Obrigado por ler Dudgeons!");
                }

            }

        } else if (fase2 == 2) {
            System.out.println("Além de estar ferido, você acabou gastando muita energia." +
                    " Agora, você está totalmente debilitado e não irá conseguir seguir sua jornada.");
            System.out.println("Você fracassou na 2ª Fase de Dudgeons.");
            System.out.println("Obrigado por ler Dudgeons!");
        }

    }

}
