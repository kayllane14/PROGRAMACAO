import java.util.Scanner;

public class miniprojetokayllane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        Personagem eadlyn = new Personagem("Eadlyn", 10);
        Personagem celeste = new Personagem("Celeste", 10);

        // Criando capítulos
        Capitulo capitulo1 = new Capitulo("O Convite Real",
                "No Reino Encantado, um convite real chegou às mãos das princesas Eadlyn e Celeste..."
                , celeste, eadlyn, 0, scanner);

        Capitulo capitulo2 = new Capitulo("O Encontro com a Modista",
                "As princesas, empolgadas com o baile, decidiram visitar a renomada modista, Srta. Judete, ela aceita fazer os vestidos das princesas?"
                , eadlyn, celeste, 15, scanner);

        Capitulo capitulo3 = new Capitulo("Fim da História",
                "As princesas optaram por não participar do baile e a história chegou ao fim."
                , eadlyn, celeste, -10, scanner);

        Capitulo capitulo4 = new Capitulo("Decisão de Estilos",
                "A modista propõe duas opções de estilo para os vestidos das princesas...\n" +
                        "1. A Fusão de Estilos: Um vestido harmonioso com toques de cores vivas e detalhes dourados.\n" +
                        "2. A Elegância Tradicional: Dois vestidos separados, um de veludo com pérolas e outro vibrante com detalhes dourados."
                , eadlyn, celeste, 0, scanner);

        Capitulo capitulo5 = new Capitulo("Desapontamento",
                "As princesas ficaram desapontadas e decidiram não ir mais ao baile, pois não confiam em outra modista..."
                , eadlyn, celeste, -12, scanner);

        Capitulo capitulo6 = new Capitulo("Sem Autoestima",
                "As princesas ficaram decepcionadas com os vestidos e optaram por não ir ao baile..."
                , eadlyn, celeste, -10, scanner);

        Capitulo capitulo7 = new Capitulo("Estrelas",
                "As princesas amaram os vestidos. No baile, destacaram-se com suas escolhas e foram admiradas por sua elegância..."
                , eadlyn, celeste, 0, scanner);

        // Adicionando escolhas aos capítulos
        capitulo1.adicionarEscolha("Aceitar o convite e ir ao baile.", capitulo2);
        capitulo1.adicionarEscolha("Recusar o convite e não ir ao baile.", capitulo3);
        capitulo2.adicionarEscolha("Ela aceita.", capitulo4);
        capitulo2.adicionarEscolha("Ela resusa!",capitulo5);
        capitulo4.adicionarEscolha("Escolher a Fusão de Estilos.", capitulo7);
        capitulo4.adicionarEscolha("Escolher a Elegância Tradicional.", capitulo6);



        // Capítulo 7 não precisa de escolhas, é o final da história

        // Começando a história
        System.out.println("Bem-vindo, leitor!");
        System.out.println("Preparado para decidir o caminho dessa história?");
        System.out.println("Título: A Escolha Real: Vestidos e Destinos");

        Capitulo capituloAtual = capitulo1;

        while (capituloAtual != null) {
            capituloAtual.mostrar();

            if (!capituloAtual.getEscolhas().isEmpty()) {
                int escolha = capituloAtual.escolher();
                capituloAtual = capituloAtual.getProximo(escolha);
            } else {
                capituloAtual = capituloAtual.proximo;
            }
        }
    
            System.out.println("Fim da história.");

    
            scanner.close();
    }
}
