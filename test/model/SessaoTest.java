/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class SessaoTest {
    
    @Test
    public void testBasic() {
        Sessao s = new Sessao();
        Usuario u = new Usuario("email");
        
        s.setUser(u);
        
        assertEquals(u.getEmail(),"email");
        assertEquals(s.getUser(),u);
        
        s.finaliza();

        assertTrue(u.equals(s.getUser()));
    }
}