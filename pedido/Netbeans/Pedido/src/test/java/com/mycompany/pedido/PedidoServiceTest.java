package com.mycompany.pedido;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoServiceTest {

    @Test
    public void testJoao() {
        PedidoService service = new PedidoService();
        Pedido pedido = new Pedido(1, "João Silva", "M", "Preto");
        service.adicionarPedido(pedido);

        assertEquals(1, service.getQuantidadePedidos());
        assertEquals("João Silva", service.getPedidos().get(0).getAluno());
        assertEquals("M", service.getPedidos().get(0).getTamanho());
        assertEquals("Preto", service.getPedidos().get(0).getTurma());
    }

    @Test
    public void testDoisPedidos() {
    PedidoService service = new PedidoService();

    Pedido pedido1 = new Pedido(1, "João", "M", "Preto");
    Pedido pedido2 = new Pedido(2, "Mariana", "P", "Branco");

    service.adicionarPedido(pedido1);
    service.adicionarPedido(pedido2);

    assertEquals(2, service.getQuantidadePedidos());

    assertEquals("João", service.getPedidos().get(0).getAluno());
    assertEquals("M", service.getPedidos().get(0).getTamanho());
    assertEquals("Preto", service.getPedidos().get(0).getTurma());

    assertEquals("Mariana", service.getPedidos().get(1).getAluno());
    assertEquals("P", service.getPedidos().get(1).getTamanho());
    assertEquals("Branco", service.getPedidos().get(1).getTurma());
}

    @Test
    public void testAlunoEmBranco() {
        PedidoService service = new PedidoService();
        Pedido pedido = new Pedido(1, "", "PP", "Branco");
        service.adicionarPedido(pedido);

        // Teste propositalmente errado — sistema ainda aceita nome em branco
        assertEquals(0, service.getQuantidadePedidos());
    }
}