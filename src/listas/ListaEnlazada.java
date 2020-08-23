package listas;

public class ListaEnlazada {
        protected  Nodo primero;


        public ListaEnlazada(){
            primero = null;
        }

        public ListaEnlazada agregarI(int dato){
            Nodo nuevo;
            nuevo = new Nodo(dato);
            nuevo.ref = this.primero;
            this.primero = nuevo;
            return this;


        }

        public void agregar(int dato){
            Nodo nuevo = new Nodo(dato);
//            if(primero.getRef() == null){
//                primero.setRef(nuevo);
//                nuevo.setRef(null);
//            }
            Nodo last = primero;
            while (last != null){
                if(last.ref == null){
                    last.setRef(nuevo);
                    break;
//                  nuevo.setRef(null);
                }else{

                    last = last.ref;
                }
            }

        }
        public void eliminar(int dato){
            Nodo delete = this.buscar(dato);
            Nodo before = primero;

            while (before != null && delete != null){
                if(before.getRef() != null && before.getRef().equals(delete) ){
                    before.setRef(delete.getRef());
                    delete.setRef(null);
                    break;


                }
                else if(before == primero){
                    primero = null;
                }
                before  = before.getRef();
            }

        }


        public Nodo buscar(int d){
            Nodo last = primero;
            while (last != null){
                if(last.getDato() == d){
//                    System.out.println(last.getDato());
                    return last;
//                  nuevo.setRef(null);
                }else{

                    last = last.ref;
                }
            }
            return last;
        }

        public void ver(){
            Nodo nodo;

            nodo = primero;
            while (nodo != null){
                System.out.println(nodo.dato);
                nodo = nodo.ref;

            }
        }

    public static void main(String[] args) {
        ListaEnlazada  lista = new ListaEnlazada();
        lista.agregarI(3);
        lista.eliminar(3);

        lista.ver();


    }





}
