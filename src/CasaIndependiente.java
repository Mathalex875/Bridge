public class CasaIndependiente extends CasaUrbana{

    public CasaIndependiente(int identificador, int area, String direccion, int habitaciones, int banos, int pisos) {
        super(identificador, area, direccion, habitaciones, banos, pisos);
    }

    public void calcularPrecio() {
        super.calcularPrecio(400);
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- CASA INDEPENDIENTE ---");
        super.imprimir();
    }
}
