import impresora.Impresora;
import impresora.ImpresoraHTML;
import impresora.ImpresoraSinFormato;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Impresora impresora;

        int tipo_formato = 0;
        int tipo_salida = 0;
        if(args.length > 0) {
            tipo_formato = Integer.parseInt(args[0]);
        }
        if(args.length > 1) {
            tipo_salida = Integer.parseInt(args[0]);
        }

        if(tipo_formato == 0) {
            impresora = new ImpresoraSinFormato(tipo_salida);
        } else {
            impresora = new ImpresoraHTML(tipo_salida);
        }
		
		impresora.imprimir("Hola mundo");
		
	}

}
