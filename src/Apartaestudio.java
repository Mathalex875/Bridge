public class Apartaestudio extends Apartamento {
    public Apartaestudio(int identificador, int area, String direccion, double administracion) {
        super(identificador, area, direccion, 1, 1, administracion);
    }

    public void calcularPrecio() {
        super.calcularPrecio(200);
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- APARTAESTUDIO ---");
        super.imprimir();
    }
}
