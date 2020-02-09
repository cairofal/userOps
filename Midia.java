package cairo.ufscar.aa2_1;

/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */

public abstract class Midia {

    private String titulo;
    private int anoCriacao;

    public Midia(String titulo, int anoCriacao) {
        this.titulo = titulo;
        this.anoCriacao = anoCriacao;
    }

    public abstract int getTipo();
    public abstract void imprimiFicha();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

}
