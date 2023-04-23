package br.edu.fescfafic.biblioteca.Model;

public class Acervo {

    public String tipo;
    public String codigoIdentificador;
    public String autor;
    public String ano;
    public boolean disponivel;

    public Acervo(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel){
        this.tipo = tipo;
        this.codigoIdentificador = codigoIdentificador;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public void adicionarAoAcervo(Acervo acervo){
    }


}
