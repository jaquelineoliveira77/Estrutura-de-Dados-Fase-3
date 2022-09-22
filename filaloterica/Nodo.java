/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaqueline Oliveira
 */
public class Nodo {
    
    private String valor;
    private Nodo prox;

    public Nodo(){
        this.valor = null;
        this.prox = null;
    }

    public String getValor(){
        return this.valor;
    }
    public Nodo getProx(){
        return this.prox;
    }

    public void setValor(String valor){
        this.valor = valor;
    }
    public void setProx(Nodo prox){
        this.prox = prox;
    }

    @Override
    public String toString(){
        return "Pessoa = "+ valor;
    }
    
}
