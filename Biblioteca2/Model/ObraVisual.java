package br.edu.fescfafic.biblioteca.Model;

import java.util.ArrayList;

public class ObraVisual extends Acervo {
    public boolean exposto;

    public ArrayList<Acervo> listaAcervoPermanente = new ArrayList<>();

    public ObraVisual(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel, boolean exposto){
        super(tipo, codigoIdentificador, autor, ano, disponivel);
        this.exposto = exposto;
    }

    public void setDisponivel(boolean status){
        this.disponivel = status;
    }

    public void getDisponivel(){
        System.out.println(this.disponivel);
    }

    public void setExposto(boolean status){
        this.exposto = status;
    }

    public void getExposto(){
        System.out.println(this.exposto);
    }

    public void adicionarAoAcervo(Acervo Visual){
        this.listaAcervoPermanente.add(Visual);
    }
}
