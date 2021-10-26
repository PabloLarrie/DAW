package MultiClasses;

public class Galleta extends Comida{
    private boolean gluten;
    private boolean healthy;
    private boolean azucar;

    public Galleta(
            String nombre,
            String ingredientes,
            boolean cocinada,
            char tipo,
            int tiempo,
            boolean gluten,
            boolean healthy,
            boolean azucar) {
        super(nombre, ingredientes, cocinada, tipo, tiempo);
        this.gluten = gluten;
        this.healthy = healthy;
        this.azucar = azucar;
    }

    public String isGluten() {
        if (gluten)
            return "Sí";
        else
            return "No";
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public String isHealthy() {
        if (healthy)
            return "Sí";
        else
            return "No";
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String isAzucar() {
        if (azucar)
            return "Sí";
        else
            return "No";
    }

    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }

    public String getAll() {
        return super.getAll() +
                "Gluten: " + isGluten() + "\n" +
                "Es healthy: " + isHealthy() +  "\n" +
                "Lleva azucar: " + isAzucar() + "\n";
    }
}
