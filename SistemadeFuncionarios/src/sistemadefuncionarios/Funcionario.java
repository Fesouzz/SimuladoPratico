/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadefuncionarios;

/**
 *
 * @author Admin
 */
public class Funcionario{
    String nome;
    double salario;
    
    public Funcionario (String nome, double salario){
    this.nome = nome;
    this.salario = salario;
    }
    
     public void exibirDados () {
        System.out.println("Informacoes do Funcionario");
        System.out.println("O nome do funcionario é: " + this.nome);
        System.out.println("A idade do funcionario é: " + this.salario);
    }
    
    
}
