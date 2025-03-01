class Factura {
    private String nombreCliente;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private boolean esEstudiante;
    private char tipoCliente;

    // Constructor para inicializar la factura
    public Factura(String nombreCliente, String producto, int cantidad, double precioUnitario, boolean esEstudiante, char tipoCliente) {
        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.esEstudiante = esEstudiante;
        this.tipoCliente = tipoCliente;
    }

    // Método para calcular el subtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    // Método para calcular el impuesto
    public double calcularImpuesto() {
        double tasaImpuesto = esEstudiante ? 0.05 : 0.13; // 5% si es estudiante, 13% si no lo es
        return calcularSubtotal() * tasaImpuesto;
    }

    // Método para calcular el total
    public double calcularTotal() {
        return calcularSubtotal() + calcularImpuesto();
    }

    // Método para mostrar la factura
    public void mostrarFactura() {
        System.out.println("===== FACTURA =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Impuesto: $" + calcularImpuesto());
        System.out.println("Total a Pagar: $" + calcularTotal());
        System.out.println("===================");
    }
}
