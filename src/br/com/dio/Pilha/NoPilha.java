package br.com.dio.Pilha;

public class NoPilha {

    private int dado;
    private NoPilha refNo = null;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getRefNo() {
        return refNo;
    }

    public void setRefNo(NoPilha reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
