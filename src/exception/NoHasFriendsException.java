/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author ramon
 */
public class NoHasFriendsException extends Exception{
    public NoHasFriendsException(String mensagem){
        //Acessa o contrutor de Exception (Classe Pai)
        super(mensagem);
    }
    
    public NoHasFriendsException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
