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

    public List<Capitulo> lerCapitulos(String caminhoArquivoCapitulos, HashMap<String, Personagem> personagens) {
        List<Capitulo> capitulos = new ArrayList<>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);

        try {
            Scanner scanner = new Scanner(arquivoCapitulos);
            Capitulo capitulo = null; // Inicialize com null

            while (scanner.hasNextLine()) {
                String tipo = scanner.nextLine();

                if (tipo.equals("CAPITULO") || tipo.equals("CAPITULO_COM_IMAGEM")) {
                    String nomeCapitulo = scanner.nextLine();
                    String textoCapitulo = scanner.nextLine();
                    String nomesPersonagens = scanner.nextLine();
                    String[] nomesPersonagensArray = nomesPersonagens.split(", "); 
                    List<String> listaNomesPersonagens = new ArrayList<>();

                    for (String nomePersonagem : nomesPersonagensArray) {
                        listaNomesPersonagens.add(nomePersonagem);
                    }

                    int alteracaoVida = Integer.parseInt(scanner.nextLine());

                    // Crie uma lista de personagens associados a este capítulo
                    List<Personagem> personagensAssociados = new ArrayList<>();
                    for (String nomePersonagem : listaNomesPersonagens) {
                        if (personagens.containsKey(nomePersonagem)) {
                            personagensAssociados.add(personagens.get(nomePersonagem));
                        }
                    }

                    if (tipo.equals("CAPITULO")) {
                        capitulo = new Capitulo(nomeCapitulo, textoCapitulo, personagensAssociados, alteracaoVida);
                        capitulos.add(capitulo); // Adicione o capítulo à lista
                    } else {
                        // Lógica para lidar com "CAPITULO_COM_IMAGEM" (se necessário)
                    }
                } else if (tipo.equals("ESCOLHA")) {
                    String nomeCapituloOrigem = scanner.nextLine();
                    String textoEscolha = scanner.nextLine();
                    String nomeCapituloDestino = scanner.nextLine();

                    for (Capitulo c : capitulos) {
                        if (c.getNome().equals(nomeCapituloOrigem)) {
                            capitulo = c;
                            break;
                        }
                    }

                    if (capitulo != null) {
                        Escolha escolha = new Escolha(textoEscolha, nomeCapituloDestino);
                        capitulo.adicionarEscolha(escolha);
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
