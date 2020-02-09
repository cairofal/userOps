package cairo.ufscar.aa2_1;

/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */
 
 public class CD extends Midia {

    private String artista;

    private final int TAMANHO_MAXIMO_FAIXA = 15;
    private Faixa[] faixas = new Faixa[TAMANHO_MAXIMO_FAIXA]; // alocação de tamanho maximo de 15 posicoes

    /*  declaração de variavel global para controlar o vetor de faixas */

    private int posicao;

    public CD(String titulo, int anoCriacao, String artista) {
        super(titulo, anoCriacao);
        this.artista = artista;
    }

    public void adicionaFaixa(String faixa, int duracao) {
        /* é adicionado ao vetor "faixas", um objeto do tipo "Faixa" utilizando uma variavel global para controlar o indice do vetor */

        faixas[posicao++] = new Faixa(posicao, faixa, duracao);
    }

    @Override
    public int getTipo() {
        return 1;
    }

    @Override
    public void imprimiFicha() {
        System.out.println(
                String.format("Titulo: %s \nAno: %d \nTipo: CD de música", super.getTitulo(), super.getAnoCriacao())
        );
        for(int i=0; i < faixas.length; i++) {
            if (faixas[i] != null) // Se o objeto do tipo faixa não for nulo
                    System.out.println(
                            String.format("Faixa %d: %s, duracao: %s", i + 1,faixas[i].getNome(), faixas[i].getDuracao())
                    );
        }
    }


}
