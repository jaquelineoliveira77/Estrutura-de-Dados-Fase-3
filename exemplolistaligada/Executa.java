package exemplolistaligada;

public class Executa {
    
    public static void main(String[] args) {
        //criando a lista
        ListaLigada lista = new ListaLigada();
        
        //criando novo nodo
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        lista.insereInicio( novoNodo );
        
        //alocando um novo espaço de memória, um novo objeto
        novoNodo = new Nodo();
        novoNodo.setValor(20); //iniciar um novo nodo de acordo com o construtor
        lista.insereInicio( novoNodo ); //inserir esse novo nodo na lista
        
        //alocando um novo espaço de memória, um novo objeto
        novoNodo = new Nodo();
        novoNodo.setValor(30);
        lista.insereInicio( novoNodo );
        
        //mostrando a lista com os objetos
        lista.mostra();
        
        //removendo o objeto que está no início da lsita e depois mostrando
        lista.removeInicio();
        lista.mostra();
        
    }
    
}
