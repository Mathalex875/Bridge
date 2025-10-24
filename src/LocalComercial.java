public class LocalComercial extends Local{
    private String centroComercial;

    public LocalComercial(int identificador, int area, String direccion, String tipoLocal, String centroComercial) {
        super(identificador, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    public void calcularPrecio() {
        super.calcularPrecio(400);
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- LOCAL COMERCIAL ---");
        super.imprimir();
        System.out.println("Centro Comercial: " + centroComercial);
    }
}
