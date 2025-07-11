package com.mycompany.pedido;


import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos;
    private static final double VALOR_CAMISA = 50.00;

    public PedidoService() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double calcularTotal() {
        return pedidos.size() * VALOR_CAMISA;
    }

    public int getQuantidadePedidos() {
        return pedidos.size();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void limparPedidos() {
        pedidos.clear();
    }
}