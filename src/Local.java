public class Local extends Inmueble{
    protected String tipoLocal; // INTERNO o CALLE

    public Local(int identificador, int area, String direccion, String tipoLocal) {
        super(identificador, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}
