package br.com.dio.Fila;

public class NoFila<T> {

    private T object;
    private NoFila<T> refNo;

    public NoFila() {
    }

    public NoFila(T object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoFila getRefNo() {
        return refNo;
    }

    public void setRefNo(NoFila refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoFila{" +
                "object=" + object +
                '}';
    }
}
