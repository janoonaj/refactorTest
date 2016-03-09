package impresora;

import salida.Salida;
import salida.SalidaConsola;
import salida.SalidaImpresora;

public class ImpresoraSinFormato implements Impresora {
    private final int SALIDA_CONSOLA = 0;
    private final int SALIDA_IMPRESORA = 1;

    private Salida salida;

    public ImpresoraSinFormato(int tipo_salida) {
        salida = getSalida(tipo_salida);
    }

    public void imprimir(String mensaje) {
        this.salida.imprimir(mensaje);
    }

    private Salida getSalida(int tipo_salida) {
        if (tipo_salida == SALIDA_CONSOLA) {
            return new SalidaConsola();
        }

        if(tipo_salida == SALIDA_IMPRESORA){
            return new SalidaImpresora();
        }
        throw new IllegalArgumentException("Tipo de salida de datos incorrecto");
    }
}
