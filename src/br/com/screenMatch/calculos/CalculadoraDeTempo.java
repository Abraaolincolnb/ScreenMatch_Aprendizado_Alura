package br.com.screenMatch.calculos;

import br.com.screenMatch.modelos.Titulos;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void inclui(Titulos titulo) {
        tempoTotal += Integer.valueOf(titulo.getDuracaoEmMinutos());
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}