public class Ingreso extends Dinero {

    public Ingreso(double dinero, String description){};

    @Override
    public String toString() {
        return "Ingreso: " + description + ". Cantidad: " + dinero + "€";
    }
}
