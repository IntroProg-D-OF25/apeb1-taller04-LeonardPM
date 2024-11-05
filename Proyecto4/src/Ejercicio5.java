import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double costoPc, costo_cpu, costoteclado, costoPantalla, costoRaton;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo del CPU");
        costo_cpu = teclado.nextDouble();
        System.out.println("Ingresar el costo del teclado");
        costoteclado = teclado.nextDouble();
        System.out.println("Ingresar el costo de la pantalla");
        costoPantalla = teclado.nextDouble();
        System.out.println("Ingresar el costo del raton");
        costoRaton = teclado.nextDouble();
        costoPc = costo_cpu + costoteclado + costoPantalla + costoRaton;
        System.out.println("Le costo de la computadora de escritorio es = " + costoPc);
            }
}
 /*
* Ingresar el costo del CPU
* 2
* Ingresar el costo del teclado
* 4
* Ingresar el costo de la pantalla
* 6
* Ingresar el costo del raton
* 8
* Le costo de la computadora de escritorio es = 20.0
  */