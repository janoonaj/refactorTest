package impresora;

public class ImpresoraFactory {
    private final int SIN_FORMATO = 0;
    private final int FORMATO_HTML = 1;

    private int tipo_formato = SIN_FORMATO;
    private int tipo_salida = 0;

    public ImpresoraFactory(String[] args) {
        actualizarTipoFormato(args);
        actualizarTipoSalida(args);
    }

    public Impresora build() {
        if(tipo_formato == SIN_FORMATO) {
            return new ImpresoraSinFormato(tipo_salida);
        }
        if(tipo_formato == FORMATO_HTML) {
            return new ImpresoraHTML(tipo_salida);
        }
        throw new IllegalArgumentException("Formato incorrecto");
    }

    private void actualizarTipoSalida(String[] args) {
        if(args.length <= 1) return;
        this.tipo_salida = Integer.parseInt(args[0]);
    }

    private void actualizarTipoFormato(String[] args) {
        if(args.length == 0) return;
        this.tipo_formato = Integer.parseInt(args[0]);
    }
}
