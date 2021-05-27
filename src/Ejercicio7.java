import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Ingrese un numero");
            numero = scanner.nextInt();
            System.out.println(numero);

        }while (numero < 0);
        System.out.println("Ciclo Terminado en: "+numero);
    }
}
