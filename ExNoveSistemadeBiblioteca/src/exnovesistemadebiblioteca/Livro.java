/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exnovesistemadebiblioteca;

/**
 *
 * @author fesil
 */
public class Livro extends ItemBiblioteca {
    int numPaginas;
    
    public Livro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }
    
    @Override
     public void exibirDetalhes(){
    System.out.println("---- Informacoes do Livro ----");
    System.out.println("O titulo do livro e: " + this.titulo);
    System.out.println("A autora do livro e: " + this.autor);
    System.out.println("O numero de paginas do livro e: " + this.numPaginas);
    }
}
