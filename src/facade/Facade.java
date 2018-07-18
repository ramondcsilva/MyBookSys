package facade;

//Para melhorar o entendimento, e organizar melhor o código.

import controller.*;
import exception.DuplicateKeyException;
import exception.DuplicateUsuarioException;
import exception.NoHasFriendsException;
import exception.UsuarioNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import model.*;

public class Facade{
    private final SistemaController sistema;

    public Facade() {
        this.sistema = new SistemaController();
    }
    
    public boolean registrarUsuario(String login, String password, String nome, String email, String dataNascimento, String endereço, String telefone) throws DuplicateUsuarioException, DuplicateKeyException {
        return this.sistema.registrarUsuario(login, password, nome, email, dataNascimento, endereço, telefone);
    }

    public Usuario getUserByEmail(String email) {
        return this.sistema.getUserByEmail(email);
    }
    
    public void verificaRegistro(String email, String password) throws UsuarioNotFoundException {
        this.sistema.verificaRegistro(email, password);
    }
    
    public void save() throws IOException {
        this.sistema.save();
    }
    
    public boolean validarAmizade(Usuario a, Usuario b) throws NoHasFriendsException {
        return this.sistema.validarAmizade(a, b);
    }
    
    public Iterator<Usuario> listUsersArray() {
        return this.sistema.listUsersArray();
    }
    
    public Iterator<Usuario> listUsersGraph(){
        return this.sistema.listUsersGraph();
    }
    
    public void listAmigos(Usuario a) throws UsuarioNotFoundException{
        this.sistema.listAmigos(a);
    }
}
