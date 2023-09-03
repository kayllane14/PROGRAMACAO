import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LeitorDeCarregamento {
    public HashMap<String, Personagem> lerPersonagens(String caminhoArquivoPersonagens) {
        HashMap<String, Personagem> personagens = new HashMap<>();
        File arquivoPersonagens = new File(caminhoArquivoPersonagens);

        try {
            Scanner scanner = new Scanner(arquivoPersonagens);

            while (scanner.hasNextLine()) {
                String tipo = scanner.nextLine();

                if (tipo.equals("PERSONAGEM")) {
                    String nomePersonagem = scanner.nextLine();
                    int alegriaPersonagem = Integer.parseInt(scanner.nextLine());

                    Personagem personagem = new Personagem(nomePersonagem, alegriaPersonagem);
                    personagens.put(nomePersonagem, personagem);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return personagens;
    }

    // Método para carregar capítulos na classe Capitulo
    public List<Capitulo> lerCapitulos(String caminhoArquivoCapitulos, HashMap<String, Personagem> personagens) {
        List<Capitulo> capitulos = new ArrayList<>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);

        try {
            Scanner scanner = new Scanner(arquivoCapitulos);

            while (scanner.hasNextLine()) {
                String tipo = scanner.nextLine();

                if (tipo.equals("CAPITULO") || tipo.equals("CAPITULO_COM_IMAGEM")) {
                    capitulos.add(new Capitulo(scanner, personagens));
                } else if (tipo.equals("ESCOLHA")) {
                    String nomeCapituloOrigem = scanner.nextLine();
                    String textoEscolha = scanner.nextLine();
                    String nomeCapituloDestino = scanner.nextLine();

                    for (Capitulo c : capitulos) {
                        if (c.getNome().equals(nomeCapituloOrigem)) {
                            Escolha escolha = new Escolha(textoEscolha, nomeCapituloDestino);
                            c.adicionarEscolha(escolha);
                            break;
                        }
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return capitulos;
    }
}
