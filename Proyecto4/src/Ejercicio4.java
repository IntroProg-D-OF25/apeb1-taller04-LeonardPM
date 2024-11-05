import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
double valorPlantillatelf, costoPorminutos, minutosConsumidosMes;
Scanner teclado = new Scanner(System.in);
System.out.println("Ingresar el costo por minutos");
costoPorminutos = teclado.nextDouble();
System.out.println("Ingresar numero de minutos consumidos en el mes");
minutosConsumidosMes = teclado.nextDouble();

valorPlantillatelf = costoPorminutos * minutosConsumidosMes;
System.out.println("El valor de la planilla. = "+ valorPlantillatelf);
    }
}

/*
* Ingresar el costo por minutos
* 1.23
* Ingresar numero de minutos consumidos en el mes
* 369
* El valor de la planilla. = 453.87
 */