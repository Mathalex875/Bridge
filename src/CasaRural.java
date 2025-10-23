public class CasaRural extends Casa {
    private int distanciaCabecera;
    private int altitud;

    public CasaRural(int identificador, int area, String direccion, int habitaciones, int banos, int pisos,
                     int distancia, int altitud) {
        super(identificador, area, direccion, habitaciones, banos, pisos);
        this.distanciaCabecera = distancia;
        this.altitud = altitud;
    }

    public void calcularPrecio() {
        super.calcularPrecio(200);
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- CASA RURAL ---");
        super.imprimir();
        System.out.println("Distancia a la cabecera: " + distanciaCabecera + " km");
        System.out.println("Altitud: " + altitud + " m");
    }

}
