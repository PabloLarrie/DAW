package clasePersona;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private char genero;
    private int edad;
    private boolean nomina;

    public Persona(){
        nombre = "Pablo";
        apellido1 = "Larrubia";
        apellido2 = "Sande";
        direccion = "Calle Edasa 13";
        genero = 'H';
        edad = 29;
        nomina = false;

    }
    public Persona(String nombre, String apellido1, String apellido2, String direccion, char genero, int edad, boolean nomina) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
        this.nomina = nomina;
    }


    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = Character.toUpperCase(genero);
    }

    public String getTipoGenero() {
        if (genero == 'H'){
        return "Este trabajador ";
    }else if (genero == 'M'){
         return "Esta trabajadora ";
        }else{
            return "Este trabajadore ";
        }
    }

    public String getNombre() {
        return getTipoGenero() + "se llama " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return getTipoGenero() + "vive en " + direccion + ".";
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return getTipoGenero() + "tiene " + edad + " años.";
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String isNomina() {
        if (nomina) {
            return getTipoGenero() + "está en nómina.";
        } else {
            return getTipoGenero() + "no está en nómima.";
        }
    }

    public void setNomina(boolean nomina) {
        this.nomina = nomina;
    }

    public String getAll(){
        return getNombre() + " "
                + getApellido1() + " "
                + getApellido2() + ".\n"
                + getEdad() + "\n"
                + getDireccion() + "\n"
                + isNomina() + "\n"
                ;


    }
}
