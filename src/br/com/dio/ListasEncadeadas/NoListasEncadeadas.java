package br.com.dio.ListasEncadeadas;

public class NoListasEncadeadas<T> {

    private T conteudo;
    private NoListasEncadeadas proximoNo;

    public NoListasEncadeadas() {
        this.proximoNo = null;
    }

    public NoListasEncadeadas(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public NoListasEncadeadas(T conteudo, NoListasEncadeadas proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListasEncadeadas getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListasEncadeadas proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoListasEncadeadas{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado() {
        String str = "NoListasEncadeadas{" +
                "conteudo=" + conteudo +
                '}';
        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        }else {
            str += "->null";
        }
        return str;
    }
}
