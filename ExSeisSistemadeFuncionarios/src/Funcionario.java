/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Funcionario {
    String nome;
    double salario;
    
    public Funcionario (String nome, double salario){
    this.nome = nome;
    this.salario = salario;
    }
    
     public void exibirDados () {
        System.out.println("---- Dados do Funcionario ----");
        System.out.println("O nome do funcionario e: " + this.nome);
        System.out.println("O salario do funcionario e: " + this.salario);
    }
    
}
