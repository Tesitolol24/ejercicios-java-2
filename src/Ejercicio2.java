import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("_--Bienvenid@--_");
        System.out.println("ingrese el primer valor que desea comparar");
        int numeroUno = scanner.nextInt();
        System.out.println("ingrese el segundo valor que desea comparar");
        int numeroDos = scanner.nextInt();

        if(numeroUno == numeroDos){
            System.out.println("el valor: "+numeroUno+" y el valor: "+numeroDos+" Son iguales");
        }else {
            if (numeroUno > numeroDos){
                System.out.println("el valor: "+numeroUno+" es mayor que: "+numeroDos);
            }else {
                if (numeroUno < numeroDos){
                    System.out.println("el valor: "+numeroUno+" es menor que: "+numeroDos);
                }
            }
        }
    }
}
