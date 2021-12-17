package br.com.dio.Pilha;

public class Pilha {

    private NoPilha refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }

    public void push(NoPilha novoNo){

        NoPilha refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public NoPilha Po(){
        if (!this.isEmpty()){
            NoPilha noPoped
        }
    }

    public NoPilha top(){

        return  refNoEntradaPilha;
    }

    public boolean isEmpty(){

       // if (refNoEntradaPilha == null){
       //     return true;
       // }
       // return false;

        return refNoEntradaPilha == null ? true : false;
    }
}
