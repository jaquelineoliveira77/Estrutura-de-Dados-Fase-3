package exemplolistaligada;

  //Atividade prática 1
//Implementar uma lista linear, usando alocação dinâmica, com
//as seguintes operações básicas:
//Criação de uma lista
//Inserção no fim de um nodo
//Remoção no início

  //Atividade prática 2
//Refine a sua implementação:
//Inserção: início, meio e fim
//Remoção início, meio e fim
//Pesquisa por um nodo, informando uma chave de pesquis


public class ListaLigada {
    
    //lista que permite chegar ao primeiro bloco de memória
    private Nodo lista;
    
    public ListaLigada() { // criação da lista
        
        //inicialmente a lista está vazia, não está apontado para nada
        this.lista = null;
    }
    //enviar um novo nodo com parametro do construtor
    public void insereInicio(Nodo novoNodo) {
        if ( this.lista == null ) { // lista vazia
            this.lista = novoNodo; //recebendo um novo nodo
        } else {
            novoNodo.setProx( this.lista ); //atualizando o campo proxi do novo nodo com o endereço da lista
            this.lista = novoNodo; //minha lista está apontando para o novo nodo, inserção no início da lista
        }
    }
    
    public void insereFinal(Nodo novoNodo) {
        if ( this.lista == null ) {
            this.lista = novoNodo;
        } else {
            //salva endereço inicial
            Nodo aux = this.lista;
            
            // navegar ate o final
            // guardar pos penultimo
            // fazer atualizacao dos ponteiros
        }
        
    }
    
    public void insereMeio(Nodo novoNodo) {
        // total elementos lista div 2 3 div 2 = 1 (depois 1 insere)
    }
    
    public void removeInicio() {
        if ( this.lista != null ) {
           this.lista = this.lista.getProx(); //endereço inicial da lista está apontando para
        } else {                               // o que a lista está apontando no campo get.proxi, ou seja segundo elemento
           System.out.println("Lista vazia!!"); 
        }
    }
    
    public void removeFinal() {
        
    }
    
    public void removeMeio() {
        // total elementos lista div 2 3 div 2 = 1 (depois 1 que remove)
        
    }
    
    public Nodo acessar(int posicao) {
        Nodo nodoRetornado = null;
        
        if (this.lista != null) {
            // navegar até posicao
            // return nodo 
        } else {
            System.out.println("Lista vazia!!"); 
        }
        
        return nodoRetornado;
    }
    
    public void mostra() {
        if (this.lista == null) { //lista vazia, nada para mostrar
            System.out.println("Lista vazia!!");
        } else {
            Nodo aux = this.lista; // salva endereço inicial da lista no aux
            while ( aux != null ) { //enquanto o aux não estiver apontando para um endereço null
                System.out.println( aux.toString() ); //mostrando conteúdo
                aux = aux.getProx(); //ligação, navegação do próximo elemento
            }                       // lista recebe lista no campo proxi
        }
    }

}
