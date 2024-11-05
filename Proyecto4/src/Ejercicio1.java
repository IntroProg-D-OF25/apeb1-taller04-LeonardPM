import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //BLOQUE DECLARACION DE VARIABLES > DATOS DE ENTRADA Y SALIDA
        double baseTriang, altoTriang, areaTriang;
        Scanner teclado = new Scanner (System.in);  //Para leer valores desde consola
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA
        System.out.println("DAME LA BASE DEL, T. : ");
        baseTriang = teclado.nextDouble();
        System.out.println("DAME LA ALTURA DEL T. : ");
        altoTriang = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        areaTriang = (baseTriang * altoTriang) / 2;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("AREA DEL, T. = " + areaTriang);

    }
}

/*
 * SALIDA DE RESULTADOS
 * debug:
 * DAME LA BASE DEL, T. :
 * 3
 * DAME LA ALTURA DEL T. :
 * 4
 * AREA DEL, T. = 6.0  * /

 */