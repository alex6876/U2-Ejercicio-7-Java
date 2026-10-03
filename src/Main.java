public class Main {
    public static void main(String[] args) {
        Plato p1 = new Plato("Pizza", 12500,23);
        Plato p2 = new Plato("Hamburguesa", 9500,30);
        Plato p3 = new Plato("Papa fritas", 4500,12);

        Pedido pedido = new Pedido(6,p1,p2,p3);

        Cocina cocina = new Cocina();
        Mozo mozo = new Mozo();

        mozo.enviarPedidoACocina(pedido,cocina);

        System.out.println("----- ESTADO DE COCINA -----");
        cocina.mostrarEstado();
    }
}