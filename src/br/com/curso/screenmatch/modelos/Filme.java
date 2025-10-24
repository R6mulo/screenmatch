package br.com.curso.screenmatch.modelos;

import br.com.curso.screenmatch.calculos.Classíficavel;

public class Filme extends Título implements Classíficavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
