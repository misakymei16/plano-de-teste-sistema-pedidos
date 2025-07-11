package com.mycompany.pedido;

public class Pedido {
    private int id;
    private String aluno;
    private String tamanho;
    private String turma;

    public Pedido(int id, String aluno, String tamanho, String turma) {
        this.id = id;
        this.aluno = aluno;
        this.tamanho = tamanho;
        this.turma = turma;
    }

    public int getId() {
        return id;
    }

    public String getAluno() {
        return aluno;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTurma() {
        return turma;
    }
}