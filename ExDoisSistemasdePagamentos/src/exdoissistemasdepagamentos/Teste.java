/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exdoissistemasdepagamentos;

/**
 *
 * @author fesil
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pagamento p1 = new Pagamento (690.00, "PENDENTE");
    p1.processarPagamento();
    p1.exibirStatus();   
    
    PagamentoCartao pc1 = new PagamentoCartao (690.00, "CONCLUIDO", "************9357");
    pc1.processarPagamento();
    pc1.exibirStatus();
    }
    
}
