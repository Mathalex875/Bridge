public class Casa extends InmuebleVivienda{
    protected int numeroPisos;

    public Casa(int identificador, int area, String direccion, int habitaciones, int banos, int pisos) {
        super(identificador, area, direccion, habitaciones, banos);
        this.numeroPisos = pisos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos: " + numeroPisos);
    }
}
