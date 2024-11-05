import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
     double gastoHijo1, gastoHijo2, gastoHijo3, totalGastos;
        Scanner teclado = new Scanner(System.in);

        System.out.println("DAME GASTOS HIJO 1");
        gastoHijo1 = teclado.nextDouble();
        System.out.println("DAME GASTOS HIJO 2");
        gastoHijo2 = teclado.nextDouble();
        System.out.println("DAME GASTOS HIJO 3");
        gastoHijo3 = teclado.nextDouble();

        totalGastos = (gastoHijo1 + gastoHijo2 + gastoHijo3 );
        System.out.println("GASTOS DE LOS 3 HIJOS. = " + totalGastos);

    }
    }

/*
* DAME GASTOS HIJO 1
* 30
* DAME GASTOS HIJO 2
* 60
* DAME GASTOS HIJO 3
* 90
* GASTOS DE LOS 3 HIJOS. = 180.0
 */