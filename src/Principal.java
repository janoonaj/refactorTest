
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Impresora impresora;
		
		if (args.length == 1)
		{
			impresora = new Impresora(Integer.parseInt(args[0]), 0);			
		}
		else if (args.length > 1)
		{
			impresora = new Impresora(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		}
		else
		{
			impresora = new Impresora(0, 0);
		}
		
		impresora.Imprimir("Hola mundo");
		
	}

}
