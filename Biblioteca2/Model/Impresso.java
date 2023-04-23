package br.edu.fescfafic.biblioteca.Model;

import java.util.ArrayList;

public class Impresso extends Acervo {

    public String edicao;
    public String genero;
    public String nomeDaObra;
    public String quantidadeDePaginas;
    public ArrayList<Acervo> listaAcervoFisico = new ArrayList<>();

    public Impresso(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel, String edicao,
                    String genero, String nomeDaObra, String quantidadeDePaginas) {
        super(tipo, codigoIdentificador, autor, ano, disponivel);
        this.edicao = edicao;
        this.genero = genero;
        this.nomeDaObra = nomeDaObra;
        this.quantidadeDePaginas = quantidadeDePaginas;

    }
    public void adicionarAoAcervo(Acervo impresso){
        this.listaAcervoFisico.add(impresso);
    }

}
