import java.util.Arrays;

public class Genics<T> {

    private T[] alunos = (T[])new Object[100];

    private int Talunos = 0;

    public void adiciona(T aluno){
        
        this.garantaespaco();
        this.alunos[this.Talunos] = aluno;
        this.Talunos++;
    }

    private boolean posicaoValida (int posicao){
        return posicao >= 0 && posicao < this.Talunos;
    }

    public void adiciona(int posicao, T aluno){
        this.garantaespaco();
      
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição negada");
        }

        for(int i = this.Talunos - 1; i >= posicao; i-=1){
            this.alunos[i + 1] = this.alunos[i];
        }
        
        this.alunos[posicao] = aluno;
        this.Talunos++;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao <= this.Talunos;
    }

    public Object pega(int posicao){
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição negada");
        }
        return this.alunos[posicao];
      
    }

   

    public void remove(int posicao){
       
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição negada");
        }

        for(int i = posicao; i < this.Talunos - 1; i++){
            this.alunos[i] = this.alunos[i + 1];
        }

        this.Talunos--;
    }


    public boolean contem(T aluno){
    
       for(int i = 0; i < this.Talunos; i++){
            if(aluno.equals(this.alunos[i]) ){
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.Talunos;
    }

    public String toString(){
      
        if(this.Talunos == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for(int i = 0; i < this.Talunos-1; i++){
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        builder.append(this.alunos[this.Talunos - 1]);
        builder.append("]");

        return builder.toString();
    }

    private void garantaespaco(){
        if(this.Talunos == this.alunos.length){
            T[] novaArray = (T[])new Object[this.alunos.length * 2];
            for(int i = 0; i < this.alunos.length; i++){
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }

    public void indeceDe(Object indice){
        for(int i = 0; i < this.Talunos; i++){
            if(this.alunos[i].equals(indice)) {
                System.out.println(i);
            }
        }
    }

    public void ultimoIndiceDe(Object ultimo){  
            for (int i = 0; i < this.Talunos; i++){
                if (ultimo.equals(this.alunos[i])){
                    System.err.println(i);
                }
            }
    }

    public void limpa(){

        for (int i = 0; i< this.Talunos; i++){
            //this.alunos[i] = null;
             this.Talunos = 0;
        }
    }
 
    public void copia(Object dest){
        try{
             Genics<T> foi = (Genics<T>)super.clone();
          foi.alunos = Arrays.copyOf((T[])dest, this.Talunos);
         foi.Talunos = 0;
         for(int g =0; g < foi.Talunos; g++){
            System.out.println(foi);
         }
        }catch(Exception e){
            throw new InternalError("falha na copia");
        }
    }

    public void remover(Object nome){

        for(int i = 0; i <= this.Talunos - 1; i++){
            
           if( nome.equals(this.alunos[i]) ) {
               for(int j = i; j < this.Talunos -1; j++) {
                   this.alunos[j] = this.alunos[j +1];
               }
               this.Talunos--;
            } 
        }
    }
    /*
    7°) É mais eficiente dobrar o números de posições, pois ao tentar adicionar uma string qualquer
        ele apresentará um erro de copilação, pois o vetor principal está cheio. Para evitar nós aplicamos uma nova arry com o dobro do tamanho; 
    */ 
}