import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HamburguerTest {

    @Test
    public void testHamburguerSimples() {
        Ingrediente hamburguer = new Hamburguer();

        assertEquals("Hambúrguer simples", hamburguer.descricao());
        assertEquals(10.0f, hamburguer.preco(), 0.001);
    }

    @Test
    public void testHamburguerComQueijo() {
        Ingrediente hamburguerComQueijo = new Queijo(new Hamburguer());

        assertEquals("Hambúrguer simples, queijo", hamburguerComQueijo.descricao());
        assertEquals(12.0f, hamburguerComQueijo.preco(), 0.001);
    }

    @Test
    public void testHamburguerComBacon() {
        Ingrediente hamburguerComBacon = new Bacon(new Hamburguer());

        assertEquals("Hambúrguer simples, bacon", hamburguerComBacon.descricao());
        assertEquals(13.0f, hamburguerComBacon.preco(), 0.001);
    }

    @Test
    public void testHamburguerComOvo() {
        Ingrediente hamburguerComOvo = new Ovo(new Hamburguer());

        assertEquals("Hambúrguer simples, ovo", hamburguerComOvo.descricao());
        assertEquals(11.5f, hamburguerComOvo.preco(), 0.001);
    }

    @Test
    public void testHamburguerCompleto() {
        Ingrediente hamburguerCompleto = new Queijo(new Bacon(new Ovo(new Hamburguer())));

        assertEquals("Hambúrguer simples, ovo, bacon, queijo", hamburguerCompleto.descricao());
        assertEquals(16.5f, hamburguerCompleto.preco(), 0.001);
    }

    @Test
    public void testHamburguerDuplo() {
        Ingrediente hamburguerDuploQueijo = new Queijo(new Queijo(new Hamburguer()));

        assertEquals("Hambúrguer simples, queijo, queijo", hamburguerDuploQueijo.descricao());
        assertEquals(14.0f, hamburguerDuploQueijo.preco(), 0.001);
    }

    @Test
    public void testPedido() {
        Ingrediente hamburguerEspecial = new Bacon(new Queijo(new Hamburguer()));
        Pedido pedido = new Pedido(hamburguerEspecial);

        assertEquals("Pedido: Hambúrguer simples, queijo, bacon", pedido.descricao());
        assertEquals(15.0f, pedido.preco(), 0.001);
    }

    @Test
    public void testCombinacoesMultiplas() {
        Ingrediente combinacao1 = new Queijo(new Hamburguer());
        Ingrediente combinacao2 = new Bacon(new Ovo(new Hamburguer()));

        assertEquals("Hambúrguer simples, queijo", combinacao1.descricao());
        assertEquals(12.0f, combinacao1.preco(), 0.001);

        assertEquals("Hambúrguer simples, ovo, bacon", combinacao2.descricao());
        assertEquals(14.5f, combinacao2.preco(), 0.001);
    }
}