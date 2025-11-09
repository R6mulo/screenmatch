package br.com.curso.screenmatch.modelos;

import br.com.curso.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Título implements Comparable<Título> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Título(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Título(TítuloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    @Override
    public int compareTo(Título outroTítulo) {
        return this.getNome().compareTo(outroTítulo.getNome());

    }

    @Override
    public String toString() {
        return "(nome = " + nome +
                ", anoDeLancamento = " + anoDeLancamento + ',' +
                "Duração = " + duracaoEmMinutos + ")";
    }
}
