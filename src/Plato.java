public class Plato {
    String nombre;
    double precio;
    int tiempoEstimado;

    public Plato(String nombre, double precio, int tiempoEstimado) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoEstimado = tiempoEstimado;
    }

    public void mostrarPlato() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Tiempo Estimado: " + tiempoEstimado+ " Minutos");
    }

}
