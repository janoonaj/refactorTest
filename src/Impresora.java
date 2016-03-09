
public class Impresora {

	private int tipo_formato;
	private int tipo_salida;
	private SalidaConsola salida_consola;
	private SalidaImpresora salida_impresora;

	public Impresora(int tipo_formato, int tipo_salida) {
		this.tipo_formato = tipo_formato;
		this.tipo_salida = tipo_salida;
	}

	public void Imprimir(String mensaje) {
		switch (this.tipo_formato)
		{
			case 0: ImprimirSinFormato(mensaje);
			case 1: ImprimirHTML(mensaje);
		}
	}

	private void ImprimirHTML(String mensaje) {
		if (this.tipo_salida == 0)
		{
			this.salida_consola = new SalidaConsola();
			this.salida_consola.Imprimir("<html>" + mensaje + "</html>");
		} 
		else
		{
			this.salida_impresora = new SalidaImpresora();
			this.salida_impresora.Imprimir("<html>" + mensaje + "</html>");
		}		
	}

	private void ImprimirSinFormato(String mensaje) {
		if (this.tipo_salida == 0)
		{
			this.salida_consola = new SalidaConsola();
			this.salida_consola.Imprimir(mensaje);
		} 
		else
		{
			this.salida_impresora = new SalidaImpresora();
			this.salida_impresora.Imprimir(mensaje);
		}
	}

}
