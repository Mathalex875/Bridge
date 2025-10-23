public class Apartamento extends InmuebleVivienda{
    protected double valorAdministracion;

    public Apartamento(int identificador, int area, String direccion, int habitaciones, int banos, double administracion) {
        super(identificador, area, direccion, habitaciones, banos);
        this.valorAdministracion = administracion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor administración: $" + valorAdministracion);
    }
}
