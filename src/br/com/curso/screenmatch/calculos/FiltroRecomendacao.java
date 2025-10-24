package br.com.curso.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classíficavel classíficavel){
        if (classíficavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classíficavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
