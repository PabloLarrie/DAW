public class GastoException extends Throwable {

        public GastoException() {
            super("La cantidad introducida es mayor que el total de saldo disponible.");
        }
}
