/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Gerente extends Funcionario{
    String departamento;
    
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    @Override
    public void exibirDados () {
        System.out.println("---- Dados do Funcionario ----");
        System.out.println("O nome do gerente e: " + this.nome);
        System.out.println("O salario do gerente e: " + this.salario);
        System.out.println("O departamento do gerente e: " + this.departamento);
    }
}
