/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extressistemadeusuarios;

/**
 *
 * @author fesil
 */
public class Usuario {
    String login;
    String senha;
    String nivelAcesso;
    boolean ativo; 
    
    public Usuario (String login, String senha, String nivelAcesso, boolean ativo){
        this.login = login; 
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.ativo = ativo;
    }
    
    public void logar(){
        System.out.println("Seu login e: " + this.login);
        System.out.println("Sua senha e: " + this.senha);
    }
    
    public void autenticarSenha(String senhaInformada) {
        if (senhaInformada.equals(this.senha) && this.ativo == true){
           System.out.println("O usuario esta ativo e a senha esta correta!");
        } else {
            System.out.println("O usuario esta inativo ou a senha esta incorreta");
        }
            
    }
    
    public void desativar(){
        this.ativo = false;
        System.out.println("O usario ainda esta ativo? " + this.ativo);
    }
    
    public void mostraAcesso(){
        System.out.println("O nivel de acesso e: " + this.nivelAcesso);
    }
}
