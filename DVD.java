package cairo.ufscar.aa2_1;

/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */

public class DVD extends Midia {

    private String diretor;
    private final int TAMANHO_MAXIMO_ARTISTA = 5;

    private Artista[] artistas = new Artista[TAMANHO_MAXIMO_ARTISTA]; //vetor para artista

    /* Criação de uma variável global da classe, para controlar a posicao do vetor */
    private int posicao;


    public DVD(String titulo, int anoCriacao, String diretor) {
        super(titulo, anoCriacao);
        this.diretor = diretor;
    }

    /*
        Método implementado da super-classe Midia
    */
    @Override
    public int getTipo() {
       return 2;
    }

    public void adicionaArtista(String nome, String papel) {
        artistas[posicao++] = new Artista(nome, papel);
    }

    public void imprimiFicha() {
        System.out.println(
                String.format("Título: %s \nAno: %d \nTipo: Filme em DVD\nDiretor: %s",
                        super.getTitulo(), super.getAnoCriacao(), getDiretor())
        );

        for(int i=0; i < artistas.length; i++) {
            if (artistas[i] != null) // Caso o objeto não for nulo
                    System.out.println(
                            String.format("Artista %d: %s , papel: %s", i + 1,artistas[i].getNome(), artistas[i].getPapel())
                    );
        }



    }

    /*
    Manipulação de dados por meio de método
    */
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


}
