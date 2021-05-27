public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("NUMEROS PARES");
        for(int indexPares = 0;indexPares<=100;indexPares++){
            if(indexPares % 2 == 0){
                System.out.println("Numeros Pares: "+indexPares);
            }
        }
        System.out.println("NUMEROS IMPARES");
        for(int indexImpares = 0;indexImpares<=100;indexImpares++){
            if(indexImpares % 2 == 1){
                System.out.println("Numeros Pares: "+indexImpares);
            }
        }
    }
}
