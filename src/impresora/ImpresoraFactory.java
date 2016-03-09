package impresora;

public class ImpresoraFactory {
    private int tipo_formato = 0;
    private int tipo_salida = 0;

    public ImpresoraFactory(String[] args) {
        if(args.length > 0) {
            this.tipo_formato = Integer.parseInt(args[0]);
        }
        if(args.length > 1) {
            this.tipo_salida = Integer.parseInt(args[0]);
        }
    }

    public Impresora build() {
        if(tipo_formato == 0) {
            return new ImpresoraSinFormato(tipo_salida);
        } else {
            return new ImpresoraHTML(tipo_salida);
        }
    }
}
