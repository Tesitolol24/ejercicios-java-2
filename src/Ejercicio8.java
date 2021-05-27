import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_--Bienvenid@--_");
        System.out.println("Ingrese un dia de la semana siendo: ");
        System.out.println("1. Lunes, 2. Martes, 3.Miercoles, 4.Jueves, 5.Viernes, 6.Sabado, 7.Domingo");
        int opcionDia = scanner.nextInt();

        switch (opcionDia){
            case 1:
                System.out.println("El dia lunes es laboral");
                break;
            case 2:
                System.out.println("El dia martes es laboral");
                break;
            case 3:
                System.out.println("El dia miercoles es laboral");
                break;
            case 4:
                System.out.println("El dia jueves es laboral");
                break;
            case 5:
                System.out.println("El dia viernes es laboral");
                break;
            case 6:
                System.out.println("El dia sabado no es laboral");
                break;
            case 7:
                System.out.println("El dia domingo no es laboral");
                break;
            default:
                System.out.println("Dia de la semana no valido");
        }
    }
}
