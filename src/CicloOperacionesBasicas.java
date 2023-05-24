import java.util.Scanner;

public class CicloOperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("---- Menú ----");
            System.out.println("1. Realizar suma");
            System.out.println("2. Realizar resta");
            System.out.println("3. Realizar multiplicación");
            System.out.println("4. Realizar división");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma(scanner);
                    break;
                case 2:
                    realizarResta(scanner);
                    break;
                case 3:
                    realizarMultiplicacion(scanner);
                    break;
                case 4:
                    realizarDivision(scanner);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public static void realizarSuma(Scanner scanner) {
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidad = scanner.nextInt();
        double resultado = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            resultado += numero;
        }

        System.out.println("La suma de los números es: " + resultado);
    }

    public static void realizarResta(Scanner scanner) {
        System.out.print("Ingrese el número inicial: ");
        double numeroInicial = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de números a restar: ");
        int cantidad = scanner.nextInt();
        double resultado = numeroInicial;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            resultado -= numero;
        }

        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMultiplicacion(Scanner scanner) {
        System.out.print("Ingrese la cantidad de números a multiplicar: ");
        int cantidad = scanner.nextInt();
        double resultado = 1;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            resultado *= numero;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void realizarDivision(Scanner scanner) {
        System.out.print("Ingrese el número inicial: ");
        double numeroInicial = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de números para la división: ");
        int cantidad = scanner.nextInt();
        double resultado = numeroInicial;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();

            if (numero != 0) {
                resultado /= numero;
            } else {
                System.out.println("No se puede dividir por cero. Ingrese otro número.");
                i--;
            }
        }

        System.out.println("El resultado de la división es: " + resultado);
    }
}

