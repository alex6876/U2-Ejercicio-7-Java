public class Cocina {
    Pedido pedidoPendiente;

    public void recibirComanda(Pedido pedido) {
        pedidoPendiente = pedido;
        System.out.println("Pedido recibido en cocina");
    }

    public void mostrarEstado() {
        System.out.println("Estado de cocina: Pedido Pendiente");

        pedidoPendiente.mostrarPedido();
    }

}
