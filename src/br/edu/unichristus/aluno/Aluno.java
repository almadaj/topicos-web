package br.edu.unichristus.aluno;

import br.edu.unichristus.pessoa.Pessoa;

public class Aluno extends Pessoa {
    private String disciplina;
    private Double ira;

    @Override
    public void salvarPessoa() {
        System.out.println("Criado ALUNO com sucesso!");
    }
}
