/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fesil
 */
public class Caminhao extends Veiculo{
    int numeroEixos;
  
    public Caminhao(String marca, String modelo, String capacidadeCarga, int numeroEixos) {
        super(marca, modelo, capacidadeCarga);
        this.numeroEixos = numeroEixos;
    }
  
    @Override
    public void exibirInfo(){
    System.out.println("---- Informacoes do veiculo ----");
    System.out.println("A marca do veiculo e: " + this.marca);
    System.out.println("O modelo do veiculo e: " + this.modelo);
    System.out.println("A capacidade de carga do veiculo e: " + this.capacidadeCarga);
    System.out.println("O numero de eixos do veiculo e: " + this.numeroEixos);
    }
   
}
