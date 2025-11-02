package br.com.curso.screenmatch.principal;

import br.com.curso.screenmatch.modelos.Filme;
import br.com.curso.screenmatch.modelos.Serie;
import br.com.curso.screenmatch.modelos.Título;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Filme meuFilme2 = new Filme("Avatar", 2023);
        meuFilme2.avalia(6);
        Filme meuFilme3 = new Filme("Dogville", 2003);
        meuFilme3.avalia(10);
        Serie lost = new Serie("Lost",2000);

        List<Título> lista = new LinkedList<>();
        lista.add(meuFilme3);
        lista.add(meuFilme2);
        lista.add(meuFilme);
        lista.add(lost);
        for (Título item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Brad Pitt");
        buscaPorArtista.add("Johnny Depp");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenadas");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Título::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
