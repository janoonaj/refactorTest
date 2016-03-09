package impresora;


/**
 * Decorates ImpresoraSinFormato
 */
public class ImpresoraHTML implements Impresora {
    private ImpresoraSinFormato impresora;

    public ImpresoraHTML(int tipo_salida) {
        impresora = new ImpresoraSinFormato(tipo_salida);
    }

    public void imprimir(String mensaje) {
        mensaje = "<html>" + mensaje + "</html>";
        impresora.imprimir(mensaje);
    }
}
