/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exumcadastrodeequipamentos;

/**
 *
 * @author fesil
 */
public class Equipamentos {
    String nome;
    String modelo;
    
    public Equipamentos (String nome, String modelo){
    this.nome = nome;
    this.modelo = modelo;
    }
    
    public void exibirDados(){
    System.out.println ("---- Dados do equipamento ----");
    System.out.println("O nome do equipamento e: " + this.nome);
    System.out.println("O modelo do equipamento e: " + this.modelo);
    }
}
