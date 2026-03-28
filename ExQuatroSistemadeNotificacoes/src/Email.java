/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Email extends Notificacao{
    
    public Email(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }
    
    @Override
    public void exibirConteudo(){
    System.out.println ("---- Conteudo da mensagem enviada ----");
    System.out.println("O conteudo da sua mensagem e: " + this.mensagem);
    }
    
    @Override
    public void enviar(){
    System.out.println ("---- Notificacao de envio----");
    System.out.println("O seu E-mail foi enviado para: " + this.destinatario);
    }
}
