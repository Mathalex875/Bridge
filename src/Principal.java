import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE REGISTRO DE INMUEBLES ===");
            System.out.println("1. Registrar Casa Rural");
            System.out.println("2. Registrar Casa Conjunto Cerrado");
            System.out.println("3. Registrar Apartaestudio");
            System.out.println("4. Registrar Apartamento Familiar");
            System.out.println("5. Registrar Local Comercial");
            System.out.println("6. Registrar Oficina");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n--- REGISTRO CASA RURAL ---");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Área (m2): ");
                    int area = sc.nextInt(); sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Número de habitaciones: ");
                    int hab = sc.nextInt();
                    System.out.print("Número de baños: ");
                    int banos = sc.nextInt();
                    System.out.print("Número de pisos: ");
                    int pisos = sc.nextInt();
                    System.out.print("Distancia a la cabecera (km): ");
                    int distancia = sc.nextInt();
                    System.out.print("Altitud (m): ");
                    int altitud = sc.nextInt();

                    CasaRural casaRural = new CasaRural(id, area, direccion, hab, banos, pisos, distancia, altitud);
                    casaRural.calcularPrecio();
                    casaRural.imprimir();
                }

                case 2 -> {
                    System.out.println("\n--- REGISTRO CASA EN CONJUNTO CERRADO ---");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Área (m2): ");
                    int area = sc.nextInt(); sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Número de habitaciones: ");
                    int hab = sc.nextInt();
                    System.out.print("Número de baños: ");
                    int banos = sc.nextInt();
                    System.out.print("Número de pisos: ");
                    int pisos = sc.nextInt();
                    System.out.print("Valor administración: ");
                    double admin = sc.nextDouble();
                    System.out.print("¿Tiene piscina? (true/false): ");
                    boolean piscina = sc.nextBoolean();
                    System.out.print("¿Tiene campos deportivos? (true/false): ");
                    boolean campos = sc.nextBoolean();

                    CasaConjuntoCerrado casaConjunto = new CasaConjuntoCerrado(id, area, direccion, hab, banos, pisos, admin, piscina, campos);
                    casaConjunto.calcularPrecio();
                    casaConjunto.imprimir();
                }

                case 3 -> {
                    System.out.println("\n--- REGISTRO APARTAESTUDIO ---");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Área (m2): ");
                    int area = sc.nextInt(); sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Valor administración: ");
                    double admin = sc.nextDouble();

                    Apartaestudio aparta = new Apartaestudio(id, area, direccion, admin);
                    aparta.calcularPrecio();
                    aparta.imprimir();
                }

                case 4 -> {
                    System.out.println("\n--- REGISTRO APARTAMENTO FAMILIAR ---");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Área (m2): ");
                    int area = sc.nextInt(); sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Número de habitaciones: ");
                    int hab = sc.nextInt();
                    System.out.print("Número de baños: ");
                    int banos = sc.nextInt();
                    System.out.print("Valor administración: ");
                    double admin = sc.nextDouble();

                    ApartamentoFamiliar apto = new ApartamentoFamiliar(id, area, direccion, hab, banos, admin);
                    apto.calcularPrecio();
                    apto.imprimir();
                }

                case 5 -> {
                    System.out.println("\n--- REGISTRO LOCAL COMERCIAL ---");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Área (m2): ");
                    int area = sc.nextInt(); sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Tipo local (INTERNO/CALLE): ");
                    String tipo = sc.nextLine();
                    System.out.print("Centro comercial: ");
                    String centro = sc.nextLine();

                    LocalComercial local = new LocalComercial(id, area, direccion, tipo, centro);
                    local.calcularPrecio();
                    local.imprimir();
                }

                case 6 -> {
                    System.out.println("\n--- REGISTRO OFICINA ---");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Área (m2): ");
                    int area = sc.nextInt(); sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Tipo local (INTERNO/CALLE): ");
                    String tipo = sc.nextLine();
                    System.out.print("¿Es del gobierno? (true/false): ");
                    boolean gobierno = sc.nextBoolean();

                    Oficina oficina = new Oficina(id, area, direccion, tipo, gobierno);
                    oficina.calcularPrecio();
                    oficina.imprimir();
                }

                case 0 -> System.out.println("Saliendo del sistema...");

                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
