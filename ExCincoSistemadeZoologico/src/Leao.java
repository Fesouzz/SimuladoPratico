/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Leao extends Animal {
    
    public Leao(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }
    
    @Override
     public void exibirInfo () {
        System.out.println("Informacoes do Animal");
        System.out.println("O nome do Leao e: " + this.nome);
        System.out.println("A idade do Leao e: " + this.idade);
        System.out.println("O habitat do Leao e: " + this.habitat);
     }
     
    @Override
     public void emitirSom() {
        System.out.println("O leao esta rugindo");
    }
}
