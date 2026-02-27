public class Pilha<T> {
    private int topo;
    private T[] elementos;
    
    public Pilha(int capacidade){
        this.topo = -1;
        this.elementos = (T[]) new Object[capacidade];
    }

    public boolean isFull(){
        return this.elementos.length-1 == this.topo;
    }

    public boolean push(T elemento){
            if(!this.isFull()){
                this.topo++;
                this.elementos[topo] = elemento;
                return true;
            }
            return false;
    }

    //isEmpty topo==-1

    //pop 
    // se nao estiver vazio, remover
    // T elementoRetorno = elementos[topo];
    // topo --
    // return elementoRetorno




}
