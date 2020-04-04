public class Vetores {

    private Aluno[] alunos = new Aluno[100];

    private int Talunos = 0;

    public void adiciona(Aluno aluno){
        /*for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i] == null){
                this.alunos[i] = aluno;
                break;
            }
        }*/
        this.garantaespaco();
        this.alunos[this.Talunos] = aluno;
        this.Talunos++;
    }

    private boolean posicaoValida (int posicao){
        return posicao >= 0 && posicao < this.Talunos;
    }

    public void adiciona(int posicao, Aluno aluno){//em qualquer posição;
        this.garantaespaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição negada");
        }

        for(int i = this.Talunos - 1; i >= posicao; i-=1){//i--
            this.alunos[i + 1] = this.alunos[i];
        }

        this.alunos[posicao] = aluno;
        this.Talunos++;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao <= this.Talunos;
    }

    public Aluno pega(int posicao){//busca
       // return this.alunos[posicao];
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição negada");
        }
        return this.alunos[posicao];
       /* if(!(posicao >=0 && posicao < tamanho())){

            throw new IllegalArgumentException("posição negada");
        }
        return this.alunos[posicao];*/
    }

   

    public void remove(int posicao){
       
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição negada");
        }

        for(int i = 0; i < this.Talunos - 1; i++){
            this.alunos[i] = this.alunos[i + 1];
        }

        this.Talunos--;
    }


    public boolean contem(Aluno aluno){//busca
        
        /*for(int i = 0; i < this.alunos.length; i++){
            if (aluno == this.alunos[i]) {
                return true;
            }
        }*/
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
       // return Arrays.toString(alunos);
    
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
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for(int i = 0; i < this.alunos.length; i++){
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }

    public void indeceDe(Object indice){
        
        
    }
}