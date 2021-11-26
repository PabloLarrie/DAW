package MusicStore;

public class Instrumento {
    private String nombre;
    private String tipo;
    private int precio;

    public Instrumento() {
        nombre = "Guitarra";
        tipo = "Cuerda";
        precio = 400;
    }

    public Instrumento(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAll() {
        return getNombre() + getPrecio() + getTipo();
    }
}
