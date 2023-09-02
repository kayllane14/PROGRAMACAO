import java.util.List;
import java.util.Map;

public class miniprojetokayllane {
    public static void main(String[] args) {
        Map<String, Personagem> personagens = LEReCARREGAR.lerPERSONAGENS("C:/Users/Kayllane/Documents/PROGRAMACAO/Miniprojeto1/rsc/PERSONAGENS");
        List<Capitulo> capitulos = LEReCARREGAR.lerCAPITULOS("C:/Users/Kayllane/Documents/PROGRAMACAO/Miniprojeto1/rsc/CAPITULOS", personagens);

        // Iniciar a história com o primeiro capítulo
        if (!capitulos.isEmpty()) {
            Capitulo capituloAtual = capitulos.get(0);
            while (capituloAtual != null) {
                System.out.println(capituloAtual.getTexto());

                if (!capituloAtual.getEscolhas().isEmpty()) {
                    System.out.println("Escolhas:");
                    int i = 1;
                    for (Escolha escolha : capituloAtual.getEscolhas()) {
                        System.out.println(i + ". " + escolha.getTexto());
                        i++;
                    }

                    int escolhaUsuario = LerInput.lerEscolha();
                    if (escolhaUsuario >= 1 && escolhaUsuario <= capituloAtual.getEscolhas().size()) {
                        capituloAtual = capituloAtual.getEscolhas().get(escolhaUsuario - 1).getCapituloDestino();
                    } else {
                        System.out.println("Escolha inválida. Por favor, escolha uma opção válida.");
                    }
                } else {
                    System.out.println("Fim da história.");
                    capituloAtual = null; // Se não houver escolhas, sair do loop
                }
            }
        } else {
            System.out.println("Não há capítulos para ler.");
        }
    }
}
