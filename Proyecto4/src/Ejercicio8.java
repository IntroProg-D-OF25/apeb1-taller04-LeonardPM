import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        double valorTotal, VNetflix, VYoutube, VDropbox, VSpotify, decuentoMenor30;
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        System.out.println("Ingresa el valor de Netflix");
        VNetflix = teclado.nextDouble();
        System.out.println("Ingresa el valor de youtube prime");
        VYoutube = teclado.nextDouble();
        System.out.println("Ingresa el valor de dropbox");
        VDropbox = teclado.nextDouble();
        System.out.println("Ingresa el valor de spotify");
        VSpotify = teclado.nextDouble();


        valorTotal = VNetflix + VYoutube + VDropbox + VSpotify;

        if (edad < 30) {
            decuentoMenor30 = 0.2;
            decuentoMenor30 *= valorTotal;
            valorTotal -= decuentoMenor30;
        }
        System.out.println("El valor total a pagar es de: = " + valorTotal);

    }
}

/*
* Ingrese su edad
* 18
* Ingresa el valor de Netflix
8
* Ingresa el valor de youtube prime
* 8
* Ingresa el valor de dropbox
* 6
* Ingresa el valor de spotify
* 6
* El valor total a pagar es de: = 22.4
 */