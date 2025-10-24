package br.com.curso.screenmatch.calculos;

import br.com.curso.screenmatch.modelos.Filme;
import br.com.curso.screenmatch.modelos.Serie;
import br.com.curso.screenmatch.modelos.Título;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Título título){
        this.tempoTotal += título.getDuracaoEmMinutos();
    }

}
