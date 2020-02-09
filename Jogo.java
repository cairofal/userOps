package cairo.ufscar.aa2_1;

/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */

public class Jogo extends Midia {

    private String genero;

    public Jogo(String titulo, int anoCriacao, String genero) {
        super(titulo, anoCriacao);
        this.genero = genero;
    }

    @Override
    public int getTipo() {
        return 3;
    }

    @Override
    public void imprimiFicha() {
        System.out.println(
                String.format("Título: %s \nAno: %d \nTipo: Jogo Eletrônico \nGenero: %s",
                        super.getTitulo(), super.getAnoCriacao(), getGenero())
        );
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
