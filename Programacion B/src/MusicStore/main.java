package MusicStore;

import static MusicStore.functions.*;

public class main {
    public static void main (String[] args){
        Instrumento guitarra = new Instrumento();
        print(guitarra.getAll());
        cantar();
        String fuel = guitarra.getPrecio() == 400 ? "yas!" : "no!";
        print(fuel);
        print(guitarra.getPrecio());
        print(guitarra.getTipo() == "Cuerda" ? "Ten corda" : "Nao cordea");
        if (guitarra.getPrecio() == 400) {
            print("molt be");
        }
        int ff = 3;
        String dd = "ffff";
        char kk = 'f';
        tipo(ff);
        tipo(dd);
        tipo(kk);
    }



}
