public class ExecutaPilha {
    
    public static void main(String[] args) {
        Pilha pilhaDinamica = new Pilha();
        
        pilhaDinamica.mostra();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        pilhaDinamica.push(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(20);
        pilhaDinamica.push(novoNodo);
        
        pilhaDinamica.mostra();
        
        pilhaDinamica.pop();
        
        pilhaDinamica.mostra();
        
    }

}
