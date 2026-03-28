/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exsetecontabancaria;

/**
 *
 * @author fesil
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente (150.00, 400.00);
        cc1.exibirSaldo();
        cc1.exibirLimite();
        System.out.println("Fulana vai tentar sacar 60 R$ de sua conta");
        cc1.sacar(60.00);
        cc1.exibirSaldo();
    }
    
}
