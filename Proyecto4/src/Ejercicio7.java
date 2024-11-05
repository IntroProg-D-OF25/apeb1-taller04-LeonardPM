import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double valorPlanilla, costoKilovatioHora, numeroKilovatConsumidMes, descuento3Edad;
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introdusca su edad");
        edad = teclado.nextInt();
        System.out.println("Ingresar el costo del kilovatio por hora");
        costoKilovatioHora = teclado.nextDouble();
        System.out.println("Ingresar el numero de kilovatio consumidos al mes");
        numeroKilovatConsumidMes = teclado.nextDouble();
        teclado.close();

        valorPlanilla = costoKilovatioHora * numeroKilovatConsumidMes;
        if (edad >= 60 ) {
            descuento3Edad = 0.1;
            descuento3Edad *= valorPlanilla;
            valorPlanilla -= descuento3Edad;
        }
        System.out.println("El valor de la plantilla de luz es:" + valorPlanilla);

    }
}
/*
* Introdusca su edad
* 60
* Ingresar el costo del kilovatio por hora
* 0.104
* Ingresar el numero de kilovatio consumidos al mes
* 270
* El valor de la plantilla de luz es:25.272
 */
