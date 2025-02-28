import java.util.ArrayList;
public class menuRestaurante {
    private String nombre;
    private double precio;

    public menuRestaurante(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}

class Orden {
    private ArrayList<menuRestaurante> items;
    private double total;

    public Orden() {
        this.items = new ArrayList<>();
        this.total = 0;
    }
    public void agregarItem(menuRestaurante item) {
        items.add(item);
        total += item.getPrecio();
    }
    public void mostrarOrden() {
        System.out.println("\n📝 Resumen de su pedido:");
        for (menuRestaurante item : items) {
            System.out.println("- " + item.getNombre() + " - $" + item.getPrecio());
        }
        System.out.println("Subtotal: $" + total);
    }
    public double calcularTotalConDescuento(String metodoPago) {
        double descuento = 0;
        switch (metodoPago.toLowerCase()) {
            case "efectivo":
                descuento = total * 0.10; // 10% de descuento
                break;
            case "tarjeta":
                descuento = total * 0.05; // 5% de descuento
                break;
            case "cheque":
                descuento = total * 0.02; // 2% de descuento
                break;
            default:
                System.out.println("⚠ Método de pago no válido, sin descuento aplicado.");
                break;
        }
        return total - descuento;
    }
}
