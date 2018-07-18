package controller;

import exception.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import model.Usuario;
import util.Graph;

public class SistemaController extends UsuarioController {
    private static Graph<Usuario> rSocial = new Graph<>();
    private static ArrayList<Usuario> arrayUsuarios = new ArrayList<>();

    public SistemaController() {
    }

    @Override
    public boolean registrarUsuario(String login, String password, String nome, String email, String dataNascimento, String endereço, String telefone) throws DuplicateUsuarioException, DuplicateKeyException {
        if (this.getUserByEmail(email) == null) {
            Usuario u = new Usuario(login, password, nome, email, dataNascimento, endereço, telefone);
            SistemaController.rSocial.addVertice(u);
            SistemaController.arrayUsuarios.add(u);
        }
        return false;
    }

    public Usuario getUserByEmail(String email) {
        Iterator<Usuario> userIterator = arrayUsuarios.iterator();
        while (userIterator.hasNext()) {
            Usuario user = userIterator.next();
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void verificaRegistro(String email, String password) throws UsuarioNotFoundException {
        Usuario user = this.getUserByEmail(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                this.getSessao().setUser(user);
            }
        }
    }

    //Perguntar a tinin
    @Override
    public void save() throws IOException {
        File file = new File("files/system_files/usuarios.data");
        ObjectOutputStream fos;

        fos = new ObjectOutputStream(new FileOutputStream(file));
        fos.writeObject(SistemaController.arrayUsuarios);
        fos.close();
    }

    @Override
    public boolean validarAmizade(Usuario a, Usuario b) throws NoHasFriendsException {
        if(a != null && b != null && !rSocial.containsAresta(a, b)){
            SistemaController.rSocial.addAresta(a, b, 1);
        }
        return false;
    }

    public Iterator<Usuario> listUsersArray() {
        return SistemaController.arrayUsuarios.iterator();
    }

    @SuppressWarnings("unchecked")
    public Iterator<Usuario> listUsersGraph() {
        return rSocial.vertices();
    }

    @Override
    public void listAmigos(Usuario a) throws UsuarioNotFoundException {
        if(SistemaController.arrayUsuarios.contains(a)){
            SistemaController.rSocial.getAdjacentes(a);
        }
    }
    
}