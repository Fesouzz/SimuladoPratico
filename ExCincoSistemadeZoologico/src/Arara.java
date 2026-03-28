/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Arara extends Animal {
    
    public Arara(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }
    
    @Override
    public void exibirInfo () {
        System.out.println("---- Informacoes do Animal ----");
        System.out.println("O nome da Arara e: " + this.nome);
        System.out.println("A idade da Arara e: " + this.idade);
        System.out.println("O habitat da Arara e: " + this.habitat);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("A arara esta cantando");
    }
}
