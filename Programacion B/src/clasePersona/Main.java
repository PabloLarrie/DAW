package clasePersona;

public class Main {
    public static void main (String[] args) {
        Persona trabajador1 = new Persona();     // Instanciar una clase
        Persona trabajador2 = new Persona();
        trabajador2.setGenero('N');
        Persona trabajador3 = new Persona(
                "Paulo",
                "Dis",
                "IsEsparta",
                "Calle bulo",
                'M',
                32,
                true);
        System.out.println(trabajador1.getAll());
        System.out.println(trabajador2.getAll());
        System.out.println(trabajador3.getAll());

    }
}
