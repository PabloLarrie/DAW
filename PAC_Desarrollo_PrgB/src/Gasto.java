public class Gasto extends Dinero {

    public Gasto(double dinero, String description){}

    @Override
    public String toString() {
        return "Gasto: " + description + ". Cantidad: " + dinero + "€";
    }
}