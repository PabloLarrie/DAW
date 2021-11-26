public class Usuario {

    private String nombre;
    private int edad;
    private String dni;

    public  Usuario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
            this.edad = edad;
    }

    public String getDNI() {
        return dni;
    }

    public boolean setDNI(String dni) {
        String strs;
        boolean flag = false;
        int counter = 0;


        if (dni.length() == 9 || dni.length() == 10) {
            strs = dni.replace("-", "");
            for (char car : strs.toCharArray()) {
                int ems = Character.getNumericValue(car);
                if (ems >= 0 && ems <= 9) {
                    counter++;
                } else {
                    if (strs.length() == 9 && counter == 8 && ems >= 10 && ems <= 35) {
                        flag = true;
                    } else {
                        break;
                    }
                }
            }
        }
        if (flag) {
            this.dni = dni;
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ". Edad: " + edad +
                ". Dni: " + dni.toUpperCase() +
                ".";
    }
}
