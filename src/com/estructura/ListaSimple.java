package com.estructura;

public class ListaSimple {
    private NodoSimple inicio;
    private NodoSimple fin;

    public ListaSimple(){
        inicio = null;
        fin = null;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public void insertarInicio(Object valor){
        NodoSimple nuevo = new NodoSimple(valor);
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }


    public void recorrerLista(){
        NodoSimple aux = inicio;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }


    public void eliminarElemento(Object valor){
        NodoSimple aux = inicio;
        NodoSimple ant = null;
        while(aux!=null){
            if(aux.getDato().equals(valor)){
                if(ant!=null){
                    ant.setSiguiente(aux.getSiguiente());
                }else{
                    inicio = aux.getSiguiente();
                }
            }
            ant = aux;
            aux = aux.getSiguiente();
        }
    }


}
