package cairo.ufscar.aa2_1;

/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */

public class Faixa {

    private int numero;
    private String nome;
    private int duracao;

    public Faixa(){}
    public Faixa(int numero, String nome, int duracao) {
        this.numero = numero;
        this.nome = nome;
        this.duracao = duracao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }



}
