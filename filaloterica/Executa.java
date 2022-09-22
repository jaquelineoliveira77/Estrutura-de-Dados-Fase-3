/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaloterica;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Executa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fila filaAtende = new Fila();

        Nodo pessoa = new Nodo();
        pessoa.setValor("primeira inserida");
        filaAtende.insere(pessoa, 20);

        pessoa = new Nodo();
        pessoa.setValor("segunda inserida");
        filaAtende.insere(pessoa, 40);

        pessoa = new Nodo();
        pessoa.setValor("terceira inserida prioridade");
        filaAtende.insere(pessoa, 80);

        pessoa = new Nodo();
        pessoa.setValor("quarta inserida");
        filaAtende.insere(pessoa, 50);

        pessoa = new Nodo();
        pessoa.setValor("quinta inserida prioridade");
        filaAtende.insere(pessoa, 95);

        filaAtende.remover();

        filaAtende.imprimir();

    }

}
