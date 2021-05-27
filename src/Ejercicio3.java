import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_--Bienvenid@ al calculador de radios--_");
        System.out.println("Ingrese el radio del circulo");
        double radio = scanner.nextDouble();

        double areaCirculo = Math.PI*(radio*radio);

        System.out.println("El area del circulo con un radio de: "+radio+
                " Es de: "+areaCirculo);
    }
}
