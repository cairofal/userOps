package cairo.ufscar.aa2_1;

/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */
 
public class Catalogo implements ColecaoMidia {

    private final int LIMITE_MAXIMO_MIDIAS = 6;
    private Midia[] midias;
    private int posicao;

    public Catalogo(int tamMax) {
        /* Alocação de um vetor com o tamanho maximo informado */
        if (LIMITE_MAXIMO_MIDIAS >= tamMax)
            midias = new Midia[tamMax];
    }

    public boolean adicionaMidia(Midia midia) {

       try {

            midias[posicao++] = midia;
            return true;

        } catch(ArrayIndexOutOfBoundsException e) { /* Essa exceção verifica se esta sendo adicionada um elemento fora do tamanho do vetor, um indice invalido*/

            return false;
        }

    }

    public Midia obtemMidia(String titulo){
        Midia m = null;
        for (Midia midia:midias){
            if( midia != null && titulo.equals( midia.getTitulo() ) ){
                m = midia;
            }
        }
        return m;
    }


    /*
        Implementando o método da interface "ColecaoMidia"
        que retorna o nosso vetor do tipo Midia
    */
    @Override
    public Midia[] colecao() {
        return this.midias;
    }

    /*
        Implementando o método da interface "ColecaoMidia"
        Retorna a midia conforme o tipo informado
    */
    @Override
    public Midia[] colecaoPorTipo(int tipo) {

        if (tipo != 1 && tipo != 2 && tipo != 3)
            throw new IllegalArgumentException("Tipo de parametro informado invalido");

        Midia[] listaMidias = null;
        switch (tipo) {
            case 1:
                listaMidias = new Midia[quantidadeDeCDs()];
                break;
            case 2:
                listaMidias = new Midia[quantidadeDeDVDs()];
                break;
            case 3:
                listaMidias = new Midia[quantidadeDeJogos()];
                break;
        }

        int pos = 0;
        for (Midia m:midias){
            if(m != null && tipo == m.getTipo()){
                listaMidias[pos++] = m;
            }
        }

        return listaMidias;
    }

    public void imprimeColecao(){
        for(Midia m:midias){
            if (m != null)
                m.imprimiFicha();
        }
    }

    public int quantidadeMaximaDeMidias() {
        return this.LIMITE_MAXIMO_MIDIAS;
    }

    /* Retorna variavel de controle posicao do vetor de midias */
    public int quantidadeDeMidias() {
        return midias.length;
    }

    public int quantidadeDeCDs(){
        int q = 0;
        for (Midia m:midias){
            if(m != null && 1 ==  m.getTipo() ){
               q++;
            }
        }
        return q;
    }

    public int quantidadeDeDVDs(){
        int q = 0;
        for (Midia m:midias){
            if(m != null &&  2 ==  m.getTipo() ){
               q++;
            }
        }
        return q;
    }

    public int quantidadeDeJogos(){
        int q = 0;
        for (Midia m:midias){
            if(m != null &&  3 ==  m.getTipo() ){
               q++;
            }
        }
        return q;
    }


}
