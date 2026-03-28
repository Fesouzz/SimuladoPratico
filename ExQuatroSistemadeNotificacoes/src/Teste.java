/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Email e1 = new Email ("Arquivos de reuniao", "Amanda");
     e1.exibirConteudo();
     e1.enviar();
     
     
     SMS s1 = new SMS ("Amiga, to sem whatsapp, vamos falar por aqui?", "amiga");
     s1.exibirConteudo();
     s1.enviar();
    }
    
}
