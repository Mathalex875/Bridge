public class ApartamentoFamiliar extends Apartamento{
    public ApartamentoFamiliar(int identificador, int area, String direccion, int habitaciones, int banos, double administracion) {
        super(identificador, area, direccion, habitaciones, banos, administracion);
    }

    public void calcularPrecio() {
        super.calcularPrecio(300);
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- APARTAMENTO FAMILIAR ---");
        super.imprimir();
    }
}
