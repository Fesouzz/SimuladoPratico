/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extressistemadeusuarios;

/**
 *
 * @author fesil
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Usuario u1 = new Usuario ("5839276", "gerent2000", "Gerente", true);
        u1.logar();
        u1.autenticarSenha("gerent2000");
        u1.mostraAcesso();
    }
    
}
