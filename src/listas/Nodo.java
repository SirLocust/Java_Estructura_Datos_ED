package listas;

public class Nodo {
    int dato;
    Nodo ref;

    public Nodo(int dato){
        this.dato = dato;
        this.ref = null;
    }

    public int getDato(){
        return this.dato;
    }

    public void setRef(Nodo ref){
        this.ref = ref;
    }

    public Nodo getRef(){
        return this.ref;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                '}';
    }
}
