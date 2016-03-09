import impresora.Impresora;
import impresora.ImpresoraFactory;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        ImpresoraFactory impresoraFactory = new ImpresoraFactory(args);
		Impresora impresora = impresoraFactory.build();
		impresora.imprimir("Hola mundo");
	}

}
