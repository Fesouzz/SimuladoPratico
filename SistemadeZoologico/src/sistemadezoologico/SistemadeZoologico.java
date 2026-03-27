/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadezoologico;

/**
 *
 * @author Admin
 */
public class SistemadeZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Leao l1 = new Leao ("Djonga", 5, "Savana");
     l1.emitirSom();
     l1.exibirInfo();
     
     Arara a1 = new Arara ("Jade", 2, "Amazonia");
     a1.emitirSom();
     a1.exibirInfo();
    }
    
}
