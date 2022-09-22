public class Pilha extends ListaEncadeada {
    private Nodo pilha;
    
    public Pilha() {
        this.pilha = null;
    }
    
    public void push(Nodo novoNodo){
        super.insereFim(novoNodo);
    }
    
    public void pop(){
        super.removeFim();
    }
    
    public void mostra(){
        super.mostra();
    }

}
