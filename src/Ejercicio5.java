public class Ejercicio5 {
    public static void main(String[] args) {
        int indexPares = 0;
        int indexImpares = 1;

        while(indexPares <= 100){
            System.out.println("Numeros Pares: "+ indexPares);
            indexPares = indexPares +2;
        }

        while(indexImpares <= 100){
            System.out.println("Numeros Impares "+ indexImpares);
            indexImpares = indexImpares +2;
        }
    }
}
