
public class ListaEncadeada {

    private Nodo lista;
    private int nrElementos;

    public ListaEncadeada() {
        this.lista = null;
        this.nrElementos = 0;
    }

    public void insereInicio(Nodo novoNodo) {
        if (this.lista == null) {
            this.lista = novoNodo;
        } else {
            novoNodo.setProx(this.lista);
            this.lista = novoNodo;
        }
        this.nrElementos++;
    }
    
    public void insereMeio(Nodo novoNodo) {
        if (this.lista == null) {
            insereInicio(novoNodo);
        } else {
            if (this.nrElementos == 1) {
                insereFim(novoNodo);
            } else {
                int meio = this.nrElementos / 2;
                // navegar até a posicao de inserção
                // atualizar os ponteiros
                this.nrElementos++;
            }
        }
    }
   

    public void insereFim(Nodo novoNodo) {
        if (this.lista == null) {
            this.lista = novoNodo;
        } else {
            Nodo aux = this.lista;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNodo);
        }
        this.nrElementos++;
    }

    public void removeInicio() {
        if (this.lista == null) {
            System.out.println("Lista vazia!");
            this.nrElementos = 0;
        } else {
            this.lista = this.lista.getProx();
            this.nrElementos--;
        }
    }
    
     public void removeMeio() {
        if (this.lista == null) {
            System.out.println("Lista vazia!");
            this.nrElementos = 0;
        } else {
            if (this.nrElementos == 2) {
                removeInicio();
            } else {
                int meio = this.nrElementos / 2;
                // navegar até chegar no elemento a ser removido
                // atualizar os ponteiros
                this.nrElementos--;
            }
        }
    }

    public void removeFim() {
        if (this.lista == null) {
            System.out.println("Lista vazia!");
            this.nrElementos = 0;
        } else {
            if (this.lista.getProx() == null) { // 1 bloco ou elemento ou objeto
                this.lista = null;
                this.nrElementos = 0;
            } else {
                Nodo aux = this.lista;
                Nodo anterior = aux;
                while (aux.getProx() != null) {
                    anterior = aux;
                    aux = aux.getProx();
                }
                anterior.setProx(null);
                this.nrElementos--;
            }
        }
    }

    public Nodo acesso(int posicao) {

        if (this.lista == null) {
            return null;
        } else {
            Nodo aux = this.lista;
            for (int i = 1; i < posicao; i++) {
                aux = aux.getProx();
            }
            return aux;
        }
    }

    public int pesquisa(int chaveBusca){
        // pesquisa em cada nodo para ver nodo.getValor == chaveBusca
        // -1 se nao encontrar
        // posicao se encontrar
        return -1;
    }

    public void mostra() {
        if (this.lista == null) {
            System.out.println("Lista vazia!");
        } else {
            Nodo aux = this.lista;
            while ( aux != null ) {
                System.out.println( aux.toString() );
                aux = aux.getProx();
            }
        }
    }

}
