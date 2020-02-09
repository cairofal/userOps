package cairo.ufscar.aa2_1;

/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */

public class Artista {

    private String nome;
    private String papel;

    public Artista(String nome, String papel){
        this.nome = nome;
        this.papel = papel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

}
