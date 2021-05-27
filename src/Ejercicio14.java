import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        int numeroInicial;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero de inicio");
        numeroInicial = lector.nextInt();

        for(int numero=numeroInicial;numero<1000;numero+=2){
            System.out.println("Los numeros desde el inicio: "+numeroInicial+" de dos en dos son: "+numero);
        }

    }
}
