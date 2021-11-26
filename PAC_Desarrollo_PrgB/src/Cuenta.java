import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private double saldo;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;

    public Cuenta() {
        saldo = 0;
        gastos = new ArrayList<>();
        ingresos = new ArrayList<>();
     }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double addIngresos(String description, double cantidad){
        this.saldo += cantidad;
        this.ingresos.add(new Ingreso(cantidad, description));
        return saldo;
    }

    public double addGastos(String description, double cantidad) throws GastoException {
        if (saldo >= cantidad) {
            this.saldo -= cantidad;
            this.gastos.add(new Gasto(cantidad, description));
        }
        else{
            throw new GastoException();
        }
        return saldo;
    }

    public List<Ingreso> getIngresos() {
        if (ingresos.size() == 0) {
            System.out.println("Todavía no has introducido ningún Ingreso.");
        }
        return ingresos;

    }

    public List<Gasto> getGastos() {
        if (gastos.size() == 0) {
            System.out.println("Todavía no has introducido ningún Gasto.");
        }
        return gastos;
    }

    @Override
    public String toString() {
        return "Cuenta de " + usuario.getNombre() +
                ". Saldo restante: " + saldo + "€";
    }
}
