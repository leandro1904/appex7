package Exercicio7;

public class Turma {
    public String Designacao;
    public Aluno[] Alunos;

    public Turma() {}

    public Turma(String design, Aluno[] alunos){

        this.Designacao=design;
        this.Alunos=alunos;
    }

    public void setAlunos(Aluno[] alunos){

        this.Alunos = alunos;
    }

    public double MediaTurma()
    {
        int total=0;
        for(int i=0; i<Alunos.length; i++){

            total += Alunos[i].Media();
        }

        return (total/Alunos.length);
    }

    public int Mais3Negativas() {
        int totalAlunos=0;
        for(int i=0; i<Alunos.length; i++)
            if(Alunos[i].NNegativas()>=3)
                totalAlunos++;
            return totalAlunos;
    }

    public double MediaMaisAlta(){
        double mediaMaisAlta=0;
        for(int i=0; i<Alunos.length;i++)
            if(Alunos[i].Media()>mediaMaisAlta)
                mediaMaisAlta=Alunos[i].Media();
            return mediaMaisAlta;
    }

    public void setDesignacao(String designacao) {this.Designacao = designacao;}

    public String getDesignacao(){ return this.Designacao;}

    public Aluno[] getAlunos(){return this.Alunos;}

}
