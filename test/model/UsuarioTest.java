package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
    
    @Test
    public void testBasic() {
        Usuario u = new Usuario("login","password","nome","email","data","endereco","telefone");
        assertEquals("login",u.getLogin());
        assertEquals("password",u.getPassword());
        assertEquals("nome",u.getNome());
        assertEquals("email",u.getEmail());
        assertEquals("data",u.getDataNascimento());
        assertEquals("endereco",u.getEndereço());
        assertEquals("telefone",u.getTelefone());
        
        assertFalse(u.getLogin().equals("log"));
        assertFalse(u.getPassword().equals("pass"));
        assertFalse(u.getEmail().equals("mail"));
        assertTrue(u.getNome().equals("nome"));
        assertFalse(u.getDataNascimento().equals("nascimento"));
        assertTrue(u.getEndereço().equals("endereco"));
        assertFalse(u.getTelefone().equals("fone"));
        
        Usuario temp = new Usuario("login","password","nome","email","data","endereco","telefon");
        assertEquals(temp,u);
        
        temp.setEmail("mail");
        
        assertFalse(temp.equals(u));
    }
}