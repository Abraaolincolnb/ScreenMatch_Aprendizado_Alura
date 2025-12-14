package br.com.screenMatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificar c){
        if (c.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        } else if (c.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        }else{
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
