package br.com.dio.ListasEncadeadas;

public class ListaEncadeadas<T> {

    NoListasEncadeadas<T> referenciaEntrada;

    public ListaEncadeadas(){
        this.referenciaEntrada = null;
    }

    public  int size(){
        int tamanhoLista = 0;
        NoListasEncadeadas<T> referenciaAux =referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

}
