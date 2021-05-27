public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroUno = 15;
        int numeroDos = 10;

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
