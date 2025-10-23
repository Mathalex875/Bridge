public class CasaConjuntoCerrado extends CasaUrbana{
    private double valorAdministracion;
    private boolean tienePiscina;
    private boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificador, int area, String direccion, int habitaciones, int banos, int pisos,
                               double valorAdministracion, boolean piscina, boolean campos) {
        super(identificador, area, direccion, habitaciones, banos, pisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = piscina;
        this.tieneCamposDeportivos = campos;
    }

    public void calcularPrecio() {
        super.calcularPrecio(350);
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- CASA EN CONJUNTO CERRADO ---");
        super.imprimir();
        System.out.println("Valor administración: $" + valorAdministracion);
        System.out.println("Tiene piscina: " + tienePiscina);
        System.out.println("Tiene campos deportivos: " + tieneCamposDeportivos);
    }
}
