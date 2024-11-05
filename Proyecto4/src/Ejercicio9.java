import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        double baseTrin, altoTring, areaTrin, areaCuad, areaRectangulo, areaTotal;
        Scanner  teclado = new Scanner(System.in);
        System.out.println("INGRESA VALOR DE BASE DE TRIANGULO O LADO DE CUADRADO");
        baseTrin = teclado.nextDouble();
        System.out.println("INGRESA ALTURA DEL TRIANGULO");
        altoTring = teclado.nextDouble();

        areaCuad = baseTrin * baseTrin;
        areaTrin = (baseTrin * altoTring) / 2;
        areaRectangulo = altoTring * baseTrin;
        areaTotal = areaCuad + (areaTrin*3) + areaRectangulo;
        System.out.println(areaTotal);

    }
}

/*
* INGRESA VALOR DE BASE DE TRIANGULO O LADO DE CUADRADO
* 2
* INGRESA ALTURA DEL TRIANGULO
* 1
* 9.0
 */