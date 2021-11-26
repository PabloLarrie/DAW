package MusicStore;

public class functions {

    static void print(Object code) {
        System.out.println(code);
    }

    static void cantar() {
        print("falalalala");
    }

    static void tipo(Object code) {
        System.out.println(((Object) code).getClass().getSimpleName());
    }
}
