/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exnovesistemadebiblioteca;

/**
 *
 * @author fesil
 */
public class ItemBiblioteca {
    String titulo;
    String autor;
    
    public ItemBiblioteca (String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    }
    
    public void exibirDetalhes(){
    System.out.println("---- Informacoes do Livro ----");
    System.out.println("O titulo do livro e: " + this.titulo);
    System.out.println("O autor do livro e: " + this.autor);
    }
}
