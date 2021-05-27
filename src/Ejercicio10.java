import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String frase = "";

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la frase que desea");
        frase = lector.nextLine();

        frase = frase.replace(" ", "");
        System.out.println(frase);
    }
}
