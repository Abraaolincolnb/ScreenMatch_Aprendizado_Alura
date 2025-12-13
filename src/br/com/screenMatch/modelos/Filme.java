package br.com.screenMatch.modelos;

import br.com.screenMatch.calculos.Classificar;

public class Filme extends Titulos implements Classificar {
    //Variaveis
    private String diretor;

    // Setters e Getters
    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
