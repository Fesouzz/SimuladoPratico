/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Veiculo {
    String marca;
    String modelo;
    String capacidadeCarga;
    
    public Veiculo (String marca, String modelo, String capacidadeCarga){
    this.marca = marca;
     this.modelo = modelo;
    this.capacidadeCarga = capacidadeCarga;
    }
    
    public void exibirInfo(){
    System.out.println("---- Informacoes do veiculo ----");
    System.out.println("A marca do veiculo e: " + this.marca);
    System.out.println("O modelo do veiculo e: " + this.modelo);
    System.out.println("A capacidade de carga do veiculo e: " + this.capacidadeCarga);
    }
}
