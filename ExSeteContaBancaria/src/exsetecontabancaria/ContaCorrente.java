/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exsetecontabancaria;

/**
 *
 * @author fesil
 */
public class ContaCorrente extends Conta {
   double limite;
   
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }
    
   @Override
    public void depositar(double valor){
    saldo+=valor;
    System.out.println("---- Satus de deposito ----");
    System.out.println("Deposito feito no valor de R$ " + valor);
    }
    
   @Override
    public void exibirSaldo(){
    System.out.println("Saldo atual: R$ " + saldo);
    }
    
    public void exibirLimite() {
    System.out.println("Limite disponivel: R$ " + limite); 
    }
    
   @Override
    public void sacar(double valor) { 
    if (valor <= saldo + limite) 
    { saldo -= valor;
    System.out.println("---- Satus do saque ----"); 
    System.out.println("O saque foi realizado com sucesso no valor de R$" + valor); 
    } else { 
    System.out.println("O saque nao foi realizado, limite atingido"); 
    } 
    }  
}
