package util;

import controller.*;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class GraphTests {
    SistemaController system = new SistemaController();
    
    @Test
    public void testVertice() {
        Usuario p1 = new Usuario("a");
        Usuario p2 = new Usuario("b");
        Usuario p3 = new Usuario("c");
        Usuario p4 = new Usuario("d");

        Assert.assertFalse(p1.equals(p2));
        Assert.assertFalse(p2.equals(p1));
        Assert.assertFalse(p1.equals(p3));
        Assert.assertFalse(p3.equals(p1));
        Assert.assertFalse(p1.equals(p4));
        Assert.assertFalse(p4.equals(p1));

        Assert.assertFalse(p1.equals(p4) && p1.hashCode()== p4.hashCode());
        Assert.assertFalse(p4.equals(p1) && p4.hashCode()== p1.hashCode());
    }
    
    @Test
    public void testAresta() {
        Usuario p1 = new Usuario("a");
        Usuario p2 = new Usuario("b");
        Usuario p3 = new Usuario("c");
        Usuario p4 = new Usuario("d");

        Aresta<Usuario> e1 = new Aresta<>(p1,p2,1);
        Aresta<Usuario> e2 = new Aresta<>(p2,p1,1);
        Aresta<Usuario> e3 = new Aresta<>(p1,p2,2);
        Aresta<Usuario> e4 = new Aresta<>(p1,p3,1);
        Aresta<Usuario> e5 = new Aresta<>(p4,p2,1);
        
        System.out.println(e1);
        System.out.println(e2);
        
        Assert.assertFalse(e1.equals(e2));
        Assert.assertFalse(e2.equals(e1));
        Assert.assertTrue(e1.equals(e3));
        Assert.assertTrue(e3.equals(e1));
        Assert.assertFalse(e2.equals(e3));
        Assert.assertFalse(e3.equals(e2));
        Assert.assertFalse(e1.equals(e4));
        Assert.assertFalse(e4.equals(e1));

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e5.hashCode());
        
        Assert.assertFalse(e1.equals(e3) && e1.hashCode()== e3.hashCode());
        Assert.assertFalse(e3.equals(e1) && e3.hashCode()== e1.hashCode());
    }
    @Test
    public void testGraph() {
        final List<Usuario> vertices = new ArrayList<>();
        Usuario p1 = new Usuario("a");
        vertices.add(p1);
        Usuario p2 = new Usuario("b");
        vertices.add(p2);
        Usuario p3 = new Usuario("c");
        vertices.add(p3);
        Usuario p4 = new Usuario("d");
        vertices.add(p4);

        final List<Aresta<Usuario>> arestas = new ArrayList<>();
        final Aresta<Usuario> e1 = new Aresta<>(p1,p2,1);
        arestas.add(e1);
        final Aresta<Usuario> e2 = new Aresta<>(p2,p1,1);
        arestas.add(e2);
        final Aresta<Usuario> e3 = new Aresta<>(p1,p2,2);
        arestas.add(e3);
        final Aresta<Usuario> e4 = new Aresta<>(p1,p3,1);
        arestas.add(e4);
        final Aresta<Usuario> e5 = new Aresta<>(p4,p2,1);
        arestas.add(e5);

        final Graph<Usuario> graph = new Graph<>();
        final Graph<Usuario> clone = new Graph<>();

        Assert.assertFalse(graph.equals(clone) && graph.hashCode()==clone.hashCode());
    }
}    