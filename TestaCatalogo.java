package cairo.ufscar.aa2_1;
/**
 Desenvolvimento de programa para fazer a gestão de mídias. 
 UFSCAR_POO2_AA2.1
 @author Cairo Faleiros de Figueiredo
 Date: out/2015
 */


public class TestaCatalogo { // Esta classe foi retirada do material do professor Dr.Delano Medeiros Beder

    private static CD cd1, cd2;
    private static DVD dvd1, dvd2;
    private static Jogo jogo1, jogo2;

    private static boolean contains(Midia[] cjto, Midia m) {
        boolean achou = false;

        for (int i = 0; i < cjto.length && !achou; i++) {
            achou = cjto[i].equals(m);
        }

        return achou;
    }

    private static boolean ehIgual(Midia[] a, Midia[] b) {
        boolean ehIgual = a.length == b.length;

        for (int i = 0; i < b.length && ehIgual; i++) {
            ehIgual = contains(a, b[i]);
        }
        return ehIgual;
    }

    private static void inicializaVariaveis() {

        cd1 = new CD("X & Y", 2005, "Coletanea");
        cd1.adicionaFaixa("Samba a dois", 287); // 4:47
        cd1.adicionaFaixa("Garota de Ipanema", 297); // 4:57
        cd1.adicionaFaixa("Shadows Blues", 328); // 5:28
        cd1.adicionaFaixa("Linger", 294); // 4:54
        cd1.adicionaFaixa("Baby i'm gonna leave you", 311); // 5:11
        cd1.adicionaFaixa("Blues travelers mix", 274); // 4:34

        dvd1 = new DVD("Star Wars: Episode VII - The Force Awakens", 2015,
                " J.J. Abrams");
        dvd1.adicionaArtista("Daisy Ridley", "Rey");
        dvd1.adicionaArtista("Carrie Fisher", "Leia");
        dvd1.adicionaArtista("Mark Hamill", "Luke Skywalker");
        dvd1.adicionaArtista("Adam Driver", "Kylo Ren");
        dvd1.adicionaArtista("Harrison Ford", "Han Solo");

        jogo1 = new Jogo("Call of Duty", 2005, "RPG");

        cd2 = new CD("Under the table and Dreaming", 1994,
                "Dave Matthews");
        cd2.adicionaFaixa("The best of what's around", 512); // 5:32
        cd2.adicionaFaixa("What would you say", 389); // 7:29
        cd2.adicionaFaixa("Satellite", 324); // 5:55
        cd2.adicionaFaixa("Typical situation", 284); // 4:58

        dvd2 = new DVD("Man in Black", 1997, "Barry Sonnenfeld");
        dvd2.adicionaArtista("Tommy Lee Jones", "Kay");
        dvd2.adicionaArtista("Will Smith", "Jay");
        dvd2.adicionaArtista("Linda Fiorentino", "Laurel");
        dvd2.adicionaArtista("Vincent D'Onofrio", "Edgar");
        dvd2.adicionaArtista("Rip Torn", "Zed");

        jogo2 = new Jogo("World of Warcraft", 2010, "Estrategia");
    }

    private static void testaRecuperacao(Catalogo catalogo) {

        assert (jogo2.equals(catalogo.obtemMidia("World of Warcraft")));
        assert (dvd2.equals(catalogo.obtemMidia("Man in Black")));
        assert (cd1.equals(catalogo.obtemMidia("Linger")));
        assert (jogo1.equals(catalogo.obtemMidia("Call of Duty")));
        assert (dvd1.equals(catalogo.obtemMidia("Star Wars: Episode VII - The Force Awakens")));
        assert (cd2.equals(catalogo.obtemMidia("Under the Table and Dreaming")));

        // Catalogo cheio
        assert (catalogo.adicionaMidia(jogo2) == false);

        // Verificando lista (todos)

        assert (catalogo.quantidadeDeMidias() == 6);

        assert (catalogo.quantidadeDeMidias() == catalogo.quantidadeMaximaDeMidias());

        assert (ehIgual(catalogo.colecao(), new Midia[]{cd2, jogo2, dvd2,
                  jogo1, dvd1, cd1}));

        // Verificando lista (seleciona pelo tipo - CD de música - implementada
        // pela classe CD)

        assert (catalogo.quantidadeDeCDs() == 2);

        assert (ehIgual(catalogo.colecaoPorTipo(1), new Midia[]{cd2, cd1}));

        // Verificando lista (seleciona pelo tipo - DVD de filme - implementada
        // pela classe DVD)

        assert (catalogo.quantidadeDeDVDs() == 2);

        assert (ehIgual(catalogo.colecaoPorTipo(2), new Midia[]{dvd2, dvd1}));

        // Verificando lista (seleciona pelo tipo - Jogo Eletrônico -
        // implementada pela classe Jogo)

        assert (catalogo.quantidadeDeJogos() == 2);

        assert (ehIgual(catalogo.colecaoPorTipo(3), new Midia[]{jogo1, jogo2}));
    }

    private static void realizaTestes() {

        inicializaVariaveis();


        int a = 0;
        assert (a++ == 0);
        if (a == 0) {
            System.out.println("Assertions desabilitados. O programa não foi testado!");
            System.exit(-1);
        }

        // Criar uma classe cadastro e tenta buscar uma midia na lista vazia
        Catalogo catalogo = new Catalogo(6);

        assert (catalogo.obtemMidia("Senhor dos Aneis") == null);

        // adiciona 6 midias

        assert (catalogo.adicionaMidia(cd1));
        assert (catalogo.adicionaMidia(dvd1));
        assert (catalogo.adicionaMidia(jogo1));
        assert (catalogo.adicionaMidia(cd2));
        assert (catalogo.adicionaMidia(dvd2));
        assert (catalogo.adicionaMidia(jogo2));

        // Tenta recuperar cadastros

        testaRecuperacao(catalogo);

        System.out.println("Testes executados com sucesso !!");
    }

    public static void main(String[] args) {

        try {
            realizaTestes();
        } catch (AssertionError e) {

            System.out.println("Erros durante os testes!!");
        }
    }
}


