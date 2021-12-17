package br.com.dio.Fila;

public class Fila {

    private NoFila refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(NoFila novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila= novoNo;
    }

    public NoFila first(){
        if (!this.isEmpty()){
            NoFila primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
        }
        return null;
    }

    public NoFila dequeue(){
        if (!this.isEmpty()){
            NoFila primeiroNo = refNoEntradaFila;
            NoFila noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]---->";
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
