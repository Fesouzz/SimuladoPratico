/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exdoissistemasdepagamentos;

/**
 *
 * @author fesil
 */
public class PagamentoCartao extends Pagamento{
    String numeroCartao;
    
    public PagamentoCartao(double valor, String status, String numeroCartao) {
        super(valor, status);
        this.numeroCartao = numeroCartao;
    }
    
    @Override
     public void processarPagamento(){
    System.out.println ("---- Sistema de Pagamentos ----");
    System.out.println("O valor do pagamento e: " + this.valor);
    System.out.println("O numero do cartao e: " + this.numeroCartao);
    }
    
    @Override
    public void exibirStatus(){
    System.out.println ("---- Status de Pagamentos ----");
    System.out.println("O status do pagamento e: " + this.status);
    }
}
