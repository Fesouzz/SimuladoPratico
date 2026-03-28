/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Animal {
    String nome;
    int idade;
    String habitat;
    
    public Animal (String nome, int idade, String habitat){
    this.nome = nome;
    this.idade = idade;
    this.habitat = habitat;}
    
    public void exibirInfo () {
        System.out.println("---- Informacoes do Animal ----");
        System.out.println("O nome do animal e: " + this.nome);
        System.out.println("A idade do animal e: " + this.idade);
        System.out.println("O habitat do animal e: " + this.habitat);
    }
    
    public void emitirSom() {
        System.out.println("O animal esta emitindo som");
    }
}
