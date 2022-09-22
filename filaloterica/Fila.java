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
public class Fila {
    
      private Nodo fila;

    public Fila(){
        this.fila = null;
    }
    
    public void insere (Nodo novo, int idade){
        if(fila == null){
            this.fila = novo;
        }else if(idade > 60){
            novo.setProx(this.fila);
            this.fila = novo;
        }else{
            Nodo outraFila = this.fila;
            while (outraFila.getProx() != null) {
                outraFila = outraFila.getProx();
            }
            outraFila.setProx(novo);
        }
    }

    public void remover(){ // complexidade O(1)
        if(this.fila == null){
            System.out.println("Fila vazia");;
        }else{
            this.fila = this.fila.getProx();
        }   
    }

    public void imprimir(){ // complexidade O(n)
        if(this.fila == null){
            System.out.println("fila vazia");
        }else{
            for (Nodo outraFila = this.fila; outraFila != null; outraFila = outraFila.getProx()) {
                System.out.println(outraFila);
            }
        }
    }

    
}
