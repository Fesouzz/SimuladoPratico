/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Notificacao {
    String mensagem;
    String destinatario;
    
    public Notificacao (String mensagem, String destinatario){
    this.mensagem = mensagem;
    this.destinatario = destinatario;
    }
    
    public void exibirConteudo(){
    System.out.println ("---- Conteudo da mensagem enviada ----");
    System.out.println("O conteudo da sua mensagem e: " + this.mensagem);
    }
    
    public void enviar(){
    System.out.println ("---- Notificacao de envio----");
    System.out.println("A suamensagem foi enviada para: " + this.destinatario);
    }
}
