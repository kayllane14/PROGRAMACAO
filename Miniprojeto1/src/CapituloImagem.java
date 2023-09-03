
import java.util.List;

public class CapituloImagem extends Capitulo {
    private String imagemAscii;

    public CapituloImagem(String nome, String texto, List<Personagem> personagens, int mudaAlegria, String imagemAscii) {
        super(nome, texto, personagens, mudaAlegria);
        this.imagemAscii = imagemAscii;
    }

    public void mostrarTexto() {
        System.out.println(getTexto());
        for (Personagem personagem : getPersonagens()) {
            System.out.println(personagem.getNome() + ": " + personagem.getAlegria());
        }
        System.out.println(imagemAscii); // Exibe a imagem ASCII
    }
}
