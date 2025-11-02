package br.com.curso.screenmatch.principal;

import br.com.curso.screenmatch.calculos.CalculadoraDeTempo;
import br.com.curso.screenmatch.calculos.FiltroRecomendacao;
import br.com.curso.screenmatch.modelos.Episodio;
import br.com.curso.screenmatch.modelos.Filme;
import br.com.curso.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        //meuFilme.setNome("O Poderoso Chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost",2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme("Avatar", 2023);
        //meuFilme2.setNome("Avatar");
        //meuFilme2.setAnoDeLancamento(2023);
        meuFilme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(meuFilme2);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme meuFilme3 = new Filme("Dogville", 2003);
        //meuFilme3.setNome("Dogville");
        //meuFilme3.setAnoDeLancamento(2003);
        meuFilme3.setDuracaoEmMinutos(200);
        meuFilme3.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(meuFilme3);
        listaDeFilme.add(meuFilme2);
        listaDeFilme.add(meuFilme);
        System.out.println("Tamanho da lista " + listaDeFilme.size());
        System.out.println("Primeiro filme " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme " + listaDeFilme.get(0).toString());


    }
}
