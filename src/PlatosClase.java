public class PlatosClase {
    public class Platos {
        String nombre;
        double precio;
        int cantidad;

        public Platos (String nombre, double precio, int cantidad){
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public double getSubTotal(){
            return cantidad * precio;
        }
    }
}
