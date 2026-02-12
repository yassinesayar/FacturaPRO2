import java.util.Scanner;

public class main {


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.println("Nombre del cliente");
        String nombre = sc.nextLine();

        PedidoClase pedido = new PedidoClase(nombre);

        int opcion;

        do {
            System.out.println("=======================================");
            System.out.println("                 Menu                  ");
            System.out.println(" 1º    ---   Añadir plato   ---        ");
            System.out.println(" 2º    ---  Cambiar estado  ---        ");
            System.out.println(" 3º    ---  Mostrar pedido  ---        ");
            System.out.println(" 4º    ---       Salir      ---        ");
            System.out.println("=======================================");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre del plato");
                    String y = sc.nextLine();

                    System.out.println("Precio: ");
                    double precio = sc.nextInt();

                    System.out.println("Cantidad :");
                    int cantidad = sc.nextInt();

                    pedido.agregarPlato(new Platos(String nombre,double precio,int cantidad));

                    break;

                case 2:
                    System.out.println ("0 RECIBIDO");
                    System.out.println("1 EN_PREPARACION");
                    System.out.println("2 LISTO");
                    System.out.println("3 ENTREGADO");
                    int e = sc.nextInt();
                    pedido.cambiarEstado(EstadoPedido.values()[e]);
                    break;

                case 3:
                    pedido.mostrarPedido();
                    break;
            }
        } while ( opcion != 4);




    }
}
