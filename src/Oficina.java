public class Oficina extends Local{
    private boolean esGobierno;

    public Oficina(int identificador, int area, String direccion, String tipoLocal, boolean esGobierno) {
        super(identificador, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    public void calcularPrecio() {
        super.calcularPrecio(450);
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- OFICINA ---");
        super.imprimir();
        System.out.println("Es del gobierno: " + esGobierno);
    }
}
