/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exdoissistemasdepagamentos;

/**
 *
 * @author fesil
 */
public class Pagamento {
    double valor;
    String status;
    
    public Pagamento (double valor, String status){
    this.valor = valor;
    this.status = status;
    }
    
    public void processarPagamento(){
    System.out.println ("---- Sistema de Pagamentos ----");
    System.out.println("O valor do pagamento e: " + this.valor);
    }
    
    public void exibirStatus(){
    System.out.println ("---- Status de Pagamentos ----");
    System.out.println("O status do pagamento e: " + this.status);
    }
}
