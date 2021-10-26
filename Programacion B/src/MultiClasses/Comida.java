package MultiClasses;

public class Comida {
    private String nombre;
    private String ingredientes;
    private boolean cocinada;
    private char tipo;
    private int tiempo;

    public Comida() {
        nombre = "Pablo";
        ingredientes = "Larrubia";
        tipo = 'H';
        tiempo = 29;
        cocinada = false;
    }
    
    public Comida(String nombre,
                  String ingredientes,
                  boolean cocinada,
                  char tipo,
                  int tiempo) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cocinada = cocinada;
        this.tipo = tipo;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String isCocinada() {
        if (cocinada)
            return "Sí";
        else
            return "No";
    }

    public void setCocinada(boolean cocinada) {
        this.cocinada = cocinada;
    }

    public String getTipo() {
        if (tipo == 'F')
            return "Primero";
        else if (tipo == 'S')
            return "Segundo";
        else if (tipo == 'D')
            return "Postre";
        else
            return "Para merendar";
    }

    public void setTipo(char tipo) {
        this.tipo = Character.toUpperCase(tipo);
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getAll(){
        return "Receta: " + getNombre() + "\n" +
               "Ingredientes: " + getIngredientes() +  "\n" +
               "Tiempo de preparación: " + getTiempo() + " minutos." + "\n" +
               "Plato: " + getTipo() +  "\n" +
               "Requiere ser cocinada: " + isCocinada() + "\n";
    }

}