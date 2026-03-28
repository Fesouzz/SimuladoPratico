/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exsetecontabancaria;

/**
 *
 * @author fesil
 */
public class Conta {
   double saldo;
    
    public Conta(double saldo){
    this.saldo = saldo;
    }
    
    public void depositar(double valor){
    saldo+= valor;
    System.out.println("---- Satus de deposito ----");
    System.out.println("Deposito feito no valor de R$ " + valor);
    }
    
    public void sacar(double valor){
    if(valor<=saldo){
    saldo-=valor;
    System.out.println("---- Satus do saque ----"); 
    System.out.println("O saque foi realizado com sucesso no valor de R$" + valor); 
    }else{
        System.out.println("O saque nao foi realizado, saldo insuficiente");
    }
    }
    public void exibirSaldo(){
    System.out.println("Saldo atual: R$ " + saldo);
    }

}
