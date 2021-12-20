package br.com.dio.ListasEncadeadas;

public class ListaEncadeadas<T> {

    NoListasEncadeadas<T> referenciaEntrada;

    public ListaEncadeadas(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        NoListasEncadeadas<T> novoNo = new NoListasEncadeadas<>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        NoListasEncadeadas<T> noAuxiliar = referenciaEntrada;
        for ( int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private NoListasEncadeadas<T> getNo(int index){
        validaIndice(index);
        NoListasEncadeadas<T> noAuxiliar = referenciaEntrada;
        NoListasEncadeadas<T> noRetorno = null;

        for ( int i = 0; i < this.size()-1; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index){
       return getNo(index).getConteudo();
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

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não exite conteúdo no índice  " + index + " dessa lista. Esta lista só" +
                    "vai até o índice " + ultimoIndice + '.' );
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

}
