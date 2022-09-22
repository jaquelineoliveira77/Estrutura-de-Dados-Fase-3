public class Executa {
    
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        lista.insereInicio(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(20);
        lista.insereFim(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(30);
        lista.insereFim(novoNodo);
        
        lista.mostra();
        
        Nodo nodo = lista.acesso(-2);
        System.out.println( nodo.toString() );
        
      
  
        
    }

}
