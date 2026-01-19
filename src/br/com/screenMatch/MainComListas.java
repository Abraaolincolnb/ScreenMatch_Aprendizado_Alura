package br.com.screenMatch;

import br.com.screenMatch.modelos.Filme;
import br.com.screenMatch.modelos.Serie;
import br.com.screenMatch.modelos.Titulos;

import java.util.ArrayList;

public class MainComListas {
    static void main() {
        Filme JohnWick1 = new Filme("John Wick", 2014);
        JohnWick1.avalia(9);
        Filme Matrix = new Filme("The Matrix", 1999);
        Matrix.avalia(7);
        Serie LaCasaDePapel = new Serie("La Casa de Papel", 2017);


        ArrayList<Titulos> lista = new ArrayList<>();
        lista.add(Matrix);
        lista.add(JohnWick1);
        lista.add(LaCasaDePapel);

        for (Titulos item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classifição: " + filme.getClassificacao());
            }
        }
    }
}
