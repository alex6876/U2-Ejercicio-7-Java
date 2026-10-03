public class Mozo {

    public void enviarPedidoACocina(Pedido pedido, Cocina cocina){
        cocina.recibirComanda(pedido);
        System.out.println("El mozo envió el pedido.");
    }
}
