import java.util.*;

public class miniprojetokayllane {
    public static void main(String[] args) {
       LeitorDeCarregamento leitor = new LeitorDeCarregamento();

        // Carregando os personagens do arquivo
        Map<String, Personagem> personagens = leitor.lerPersonagens("C:/Users/Kayllane/Documents/PROGRAMACAO/Miniprojeto1/rsc/personagens");

        // Carregando os capítulos do arquivo
        List<Capitulo> capitulos = leitor.lerCapitulos("C:/Users/Kayllane/Documents/PROGRAMACAO/Miniprojeto1/rsc/capitulos", new HashMap<>(personagens));

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
                        Escolha escolhaSelecionada = capituloAtual.getEscolhas().get(escolhaUsuario - 1);
                        String nomeCapituloDestino = escolhaSelecionada.getCapituloDestino();

                        Capitulo capitulo = null; // Inicialize com null
                        for (Capitulo c : capitulos) {
                            if (c.getNome().equals(nomeCapituloDestino)) {
                                capitulo = c;
                                break;
                            }
                        }

                        if (capitulo != null) {
                            capituloAtual = capitulo;
                        } else {
                            System.out.println("Capítulo de destino não encontrado.");
                        }
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
