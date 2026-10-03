public class Pedido {
    Plato plato1;
    Plato plato2;
    Plato plato3;
    int numeroMesa;

    public Pedido(int numeroMesa, Plato plato1, Plato plato2, Plato plato3) {
        this.numeroMesa = numeroMesa;
        this.plato1 = plato1;
        this.plato2 = plato2;
        this.plato3 = plato3;
    }

    public void mostrarPedido(){
        System.out.println("Mesa: " + numeroMesa);

        plato1.mostrarPlato();
        plato2.mostrarPlato();
        plato3.mostrarPlato();
    }




}
