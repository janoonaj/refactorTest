package impresora;

import salida.Salida;
import salida.SalidaConsola;
import salida.SalidaImpresora;

public class ImpresoraSinFormato implements Impresora {;
    private Salida salida;

    public ImpresoraSinFormato(int tipo_salida) {
        if (tipo_salida == 0) {
            salida = new SalidaConsola();
        } else {
            salida = new SalidaImpresora();
        }
    }

    public void imprimir(String mensaje) {
        this.salida.imprimir(mensaje);
    }
}
