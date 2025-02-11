package br.edu.unichristus.funcionario;
import br.edu.unichristus.pessoa.Pessoa;

public class Funcionario extends Pessoa {
    private Double salario;
    private String cargo;
    private Integer cargaHoraria;

    @Override
    public void salvarPessoa() {
        System.out.println("Criado FUNCIONÁRIO com sucesso!");
    }
}
