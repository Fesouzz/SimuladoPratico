/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadefuncionarios;

/**
 *
 * @author Admin
 */
public class Gerente extends Funcionario{
    String departamento;
    
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
   
    @Override
    public void exibirDados () {
        System.out.println("Informacoes do Funcionario");
        System.out.println("O nome do gerente é: " + this.nome);
        System.out.println("A idade do gerente é: " + this.salario);
        System.out.println("O departamento do gerente é: " + this.departamento);
    }
}
