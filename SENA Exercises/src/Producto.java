class Producto {
    private char tipo;
    private int cantidad;
    private double precioBase;
    private double descuento;

    // Constructor
    public Producto(char tipo, int cantidad) {
        this.tipo = Character.toUpperCase(tipo);
        this.cantidad = cantidad;
        this.precioBase = obtenerPrecioBase();
        this.descuento = obtenerDescuento();
    }

    // Método para asignar el precio base según el tipo de producto
    private double obtenerPrecioBase() {
        switch (tipo) {
            case 'A': return 5000; // Precio de alimentos
            case 'V': return 20000; // Precio de vestimenta
            case 'E': return 100000; // Precio de electrónicos
            default: return 0;
        }
    }

    // Método para asignar el porcentaje de descuento
    private double obtenerDescuento() {
        switch (tipo) {
            case 'A': return 0.10; // 10% para alimentos
            case 'V': return 0.05; // 5% para vestimenta
            case 'E': return 0.0;  // 0% para electrónicos
            default: return 0.0;
        }
    }

    // Método para calcular el total sin descuento
    public double calcularTotalSinDescuento() {
        return precioBase * cantidad;
    }

    // Método para calcular el total con descuento aplicado
    public double calcularTotalConDescuento() {
        return calcularTotalSinDescuento() * (1 - descuento);
    }

    // Método para mostrar la información de la compra
    public void mostrarFactura() {
        System.out.println("Tipo de producto: " + tipo);
        System.out.println("Cantidad de unidades: " + cantidad);
        System.out.println("Precio base por unidad: $" + precioBase);
        System.out.println("Total sin descuento: $" + calcularTotalSinDescuento());
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total con descuento: $" + calcularTotalConDescuento());
    }
}
