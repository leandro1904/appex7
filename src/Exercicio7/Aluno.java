package Exercicio7;

public class Aluno {

    public String Nome;
    public int[] Notas;


    public Aluno() {
    }

    public Aluno(String nome, int[] notas) {

        this.Nome = nome;
        this.Notas = notas;
    }

    public double Media() {
        double total = 0;
        for (int i = 0; i < Notas.length; i++)
            total += Notas[i];
        return (total / Notas.length);
    }

    public int NNegativas() {
        int nneg = 0;
        for (int i = 0; i < Notas.length; i++)
            if (Notas[i] < 10)
                nneg++;
        return nneg;
    }

        public String getNome(){
            return (this.Nome);
        }

        public int[] getNotas () {
            return this.Notas;
        }

        public void setNotas ( int[] notas){
            this.Notas = notas;
        }

    public void setNome (String nome){
        this.Nome = nome;
    }
    }


