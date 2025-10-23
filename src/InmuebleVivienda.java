public class InmuebleVivienda extends Inmueble{
    protected int numeroHabitaciones;
    protected int numeroBanos;

    public InmuebleVivienda(int identificador, int area, String direccion, int habitaciones, int banos) {
        super(identificador, area, direccion);
        this.numeroHabitaciones = habitaciones;
        this.numeroBanos = banos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Habitaciones: " + numeroHabitaciones);
        System.out.println("Baños: " + numeroBanos);
    }
}
