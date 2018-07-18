package controller;

import exception.*;
import java.io.IOException;
import model.*;

abstract public class UsuarioController {
    private final Sessao sessao;
    
    public UsuarioController(){
        this.sessao = Sessao.getIntance();
    }
    
    abstract public boolean registrarUsuario(String login, String password, String nome, String email, String dataNascimento, String endereço, String telefone) throws DuplicateUsuarioException,DuplicateKeyException;
    abstract public void verificaRegistro(String email, String password) throws UsuarioNotFoundException;
    abstract public void save() throws IOException;    
    abstract public boolean validarAmizade(Usuario a, Usuario b)throws NoHasFriendsException;
    abstract public void listAmigos(Usuario a) throws UsuarioNotFoundException;
    
    public Sessao getSessao() {
        return this.sessao;
    }
}