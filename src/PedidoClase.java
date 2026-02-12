import java.util.ArrayList;

public class PedidoClase {

    private static int contador = 1;

    private int id;
    private String cliente;
    private EstadoPedido estado;
    private ArrayList<Platos> platos;

    public PedidoClase(String cliente) {
        this.id = contador++;
        this.cliente = cliente;
        this.estado = EstadoPedido.RECIBIDO;
        this.platos = new ArrayList<>();
    }

    //-------------------------------------------------------------
    public void agregarPlato(Platos platoAgregado) {
        if (platos.size() >= 5) {
            System.out.println("No se pueden agregar más de 5 platos");
            return;
        }
        platos.add(platoAgregado);
    }

    //-------------------------------------------------------------
    public double calcularTotal() {
        double total = 0;

        for (Platos platoRecibido : platos) {
            total += platoRecibido.getSubTotal();
        }

        return total;
    }

    //---------------------------------------------------------------
    public void mostrarPedido() {
        System.out.println("\n--- Pedido ---");
        System.out.println("Id: " + id);
        System.out.println("Cliente: " + cliente);
        System.out.println("Estado: " + estado);

        for (Platos platoRecibido : platos) {
            System.out.println(platoRecibido);
        }

        System.out.println("TOTAL: " + calcularTotal() + "€");
    }

    //--------------------------------------------------------------
    public void cambiarEstado(EstadoPedido nuevo) {
        if (nuevo.ordinal() <= estado.ordinal()) {
            System.out.println("No se puede retroceder el estado");
            return;
        }

        estado = nuevo;
    }
}
