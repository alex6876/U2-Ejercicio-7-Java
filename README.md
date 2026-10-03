# 🍽️ Simulación de Pedidos en Restaurante (POO en Java)

Este proyecto es una simulación en Java que modela el flujo de trabajo dentro de un restaurante: desde la creación de los platos y la comanda por parte del mozo hasta la recepción e inspección del pedido en la cocina. Se enfoca en poner en práctica la interacción entre objetos y la composición en memoria (sin uso de bases de datos).

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema está modelado en 5 clases principales:

*   **`Plato`**: Representa un ítem del menú con su `nombre`, `precio` y `tiempoEstimado` de preparación en minutos. Cuenta con el método `mostrarPlato()` para imprimir sus detalles.
*   **`Pedido`**: Agrupa hasta 3 objetos de tipo `Plato` asignados a un `numeroMesa`. Su método `mostrarPedido()` delega la impresión de cada plato a sus respectivas instancias.
*   **`Mozo`**: Actúa como la entidad encargada de interactuar con el cliente y trasladar el pedido. Su método `enviarPedidoACocina()` conecta la comanda con el área de preparación.
*   **`Cocina`**: Recibe y almacena la referencia del `pedidoPendiente`. Permite consultar el estado actual de las comandas recibidas.
*   **`Main`**: Punto de entrada de la aplicación. Crea las instancias de los platos, arma el pedido, simula la acción del mozo y muestra el estado final de la cocina.

---

## ⚙️ Flujo de Operación

1. **Creación de Entidades:** Se instancian los platos (`p1`, `p2`, `p3`) con sus respectivos atributos de costo y tiempo.
2. **Asociación en Comanda:** Se construye el objeto `Pedido` vinculando la mesa asignada con las referencias de los 3 platos.
3. **Paso de Mensajes Inter-Clases:** El `Mozo` invoca el método `recibirComanda()` de la `Cocina`, transfiriendo la referencia del pedido.
4. **Delegación de Métodos:** La `Cocina` invoca `mostrarPedido()`, la cual a su vez ejecuta `mostrarPlato()` en cada uno de los objetos `Plato` contenidos.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Pedido recibido en cocina
El mozo envió el pedido.
----- ESTADO DE COCINA -----
Estado de cocina: Pedido Pendiente
Mesa: 6
Nombre: Pizza
Precio: $12500.0
Tiempo Estimado: 23 Minutos
Nombre: Hamburguesa
Precio: $9500.0
Tiempo Estimado: 30 Minutos
Nombre: Papa fritas
Precio: $4500.0
Tiempo Estimado: 12 Minutos
