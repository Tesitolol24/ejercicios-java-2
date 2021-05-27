import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double IVA = 0.21;

        System.out.println("_--Bienvenid@--_");
        System.out.println("Ingrese el precio del producto sin IVA");
        double precio = scanner.nextDouble();

        double precioFinal = (precio*IVA)+precio;

        System.out.println("El precio del producto con IVA del 21% es de: "+precioFinal);
    }
}
