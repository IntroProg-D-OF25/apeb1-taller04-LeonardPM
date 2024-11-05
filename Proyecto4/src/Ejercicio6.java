import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
// Crear un objeto Scanner para leer la entrada del usuario
        double montoPrestamo, interesMensualPorcentaje, interesMensual, pagoMensual;
        int numeroPagos;
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto del préstamo al usuario
        System.out.print("Ingrese el monto del préstamo: ");
        montoPrestamo = scanner.nextDouble();

        // Solicitar el interés mensual al usuario
        System.out.print("Ingrese el interés mensual (en porcentaje): ");
        interesMensualPorcentaje = scanner.nextDouble();

        // Convertir el interés de porcentaje a decimal
        interesMensual = interesMensualPorcentaje / 100;

        // Número de pagos (12 meses para 1 año)
        numeroPagos = 12;

        // Calcular el pago mensual usando la fórmula de anualidad fija
        pagoMensual = (montoPrestamo * interesMensual) /
        (1 - Math.pow(1 + interesMensual, -numeroPagos));

        // Mostrar el resultado
        System.out.printf("El pago mensual del préstamo es: %.2f%n", pagoMensual);

        // Cerrar el objeto Scanner
        scanner.close();
            }
        }

/*
* Ingrese el monto del préstamo: 900
* Ingrese el interés mensual (en porcentaje): 3
* El pago mensual del préstamo es: 90.42
 */