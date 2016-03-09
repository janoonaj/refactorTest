import salida.Salida;
import salida.SalidaConsola;
import salida.SalidaImpresora;

public class Impresora {

	private int tipo_formato;
    private Salida salida;

	public Impresora(int tipo_formato, int tipo_salida) {
		this.tipo_formato = tipo_formato;
        if (tipo_salida == 0) {
            salida = new SalidaConsola();
        } else {
            new SalidaImpresora();
        }

	}

	public void Imprimir(String mensaje) {
        switch (this.tipo_formato)
		{
			case 0: imprimirSinFormato(mensaje);
			case 1: imprimirHTML(mensaje);
		}
	}

	private void imprimirHTML(String mensaje) {
		this.salida.imprimir("<html>" + mensaje + "</html>");
	}

	private void imprimirSinFormato(String mensaje) {
        this.salida.imprimir(mensaje);
	}

}
