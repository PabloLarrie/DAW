package MultiClasses;

public class Main {
    public static void main (String[] args) {
        Comida cookie = new Galleta(
                "Cookies",
                "Harina, Azucar, Chocolate",
                true,
                'D',
                40,
                true,
                false,
                true
        );
        Comida cookie2 = new Galleta(
                "Protein Cookies",
                "Harina de avena, Agave, Chocolate 100%, Proteína de vainilla",
                true,
                'D',
                40,
                true,
                true,
                false
        );
        System.out.println(cookie.getAll());
        System.out.println(cookie2.getAll());
    }
}
