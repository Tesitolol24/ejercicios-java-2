public class Ejercicio9 {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseFinal  = frase.replace("a", "e");
        fraseFinal = fraseFinal.concat(", La vida es feliz");
        System.out.println(fraseFinal);
    }
}
