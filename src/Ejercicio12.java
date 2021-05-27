import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa la primera palabra");
        String palabraUno = lector.next();

        Scanner lectorDos = new Scanner(System.in);
        System.out.println("Ingresa la segunda palabra");
        String palabraDos = lectorDos.next();

        if(palabraUno.equals(palabraDos)){
            System.out.println("La palabra uno: "+palabraUno+" es igual a la palabra"+palabraDos);
        }else{
            System.out.println("Ingresaste la palabra: "+palabraUno+"y la palabra dos es: "+palabraDos);
        }

    }
}
