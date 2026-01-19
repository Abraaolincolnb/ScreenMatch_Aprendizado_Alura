import br.com.screenMatch.calculos.CalculadoraDeTempo;
import br.com.screenMatch.calculos.FiltroRecomendacao;
import br.com.screenMatch.modelos.Filme;
import br.com.screenMatch.modelos.Serie;
import br.com.screenMatch.modelos.Titulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Filme Matrix = new Filme("The Matrix", 1999);
        Matrix.setAnoDeLancamento(1999);
        Matrix.setDuracaoEmMinutos(135);
        Matrix.setIncluidoNoPlano(true);

        Filme JohnWick1 = new Filme("John Wick", 2014);
        JohnWick1.setDuracaoEmMinutos(101);
        JohnWick1.setIncluidoNoPlano(true);

        Serie LaCasaDePapel = new Serie("La Casa de Papel", 2017);
        LaCasaDePapel.setIncluidoNoPlano(true);
        LaCasaDePapel.setAtiva(true);
        LaCasaDePapel.setTemporadas(5);
        LaCasaDePapel.setEpisodiosPorTemporada(10);
        LaCasaDePapel.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(Matrix);
        calculadora.inclui(JohnWick1);
        calculadora.inclui(LaCasaDePapel);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(Matrix);

        ArrayList<Titulos> lista = new ArrayList<>();
        lista.add(Matrix);
        lista.add(JohnWick1);
        lista.add(LaCasaDePapel);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulos::getDuracaoEmMinutos));
        System.out.println(lista);



        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jucelino Cudecheque");
        buscaPorArtista.add("Andre Guedes");
        buscaPorArtista.add("Bruna Marquesine");
        buscaPorArtista.add("Scarlet Jhohancen");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("ordenei");
        System.out.println(buscaPorArtista);

    }
}
