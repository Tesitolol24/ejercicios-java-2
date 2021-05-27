import java.util.Scanner;

public class Ejercicio15 {

    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    static int numeroUno = 0, numeroDos = 0;


    public static void main(String[] args) {

        while (select != 0) {
            try {
                System.out.println("Elige opción:\n1.- NUEVO ACTOR" +
                        "\n2.- BUSCAR ACTOR \n" +
                        "3.- ELIMINAR ACTOR \n" +
                        "4.- MODIFICAR ACTOR \n" +
                        "5.- VER TODOS LOS ACTORES \n" +
                        "6.- VER PELICULAS DE LOS ACTORES \n" +
                        "7.- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n" +
                        "8.- Salir \n");

                select = Integer.parseInt(scanner.nextLine());

                switch (select) {
                    case 1:
                        obtenerNumeros();
                        System.out.println("Haz seleccionado Nuevo Actor");
                        break;
                    case 2:
                        obtenerNumeros();
                        System.out.println("Haz seleccionado Buscar Actor");
                        break;
                    case 3:
                        obtenerNumeros();
                        System.out.println("Haz seleccionado Elminar Actor");
                        break;
                    case 4:
                        obtenerNumeros();
                        System.out.println("Haz seleccionado Modificar Actor");
                        break;
                    case 5:
                        obtenerNumeros();
                        System.out.println("Haz selecionado Ver Todos");
                        break;
                    case 6:
                        obtenerNumeros();
                        System.out.println("Haz selecionado Ver Peliculas");
                        break;
                    case 7:
                        obtenerNumeros();
                        System.out.println("Haz selecionado Ver Categoria");
                        break;
                    case 8:
                        obtenerNumeros();
                        System.out.println("Haz selecionado Salir");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }

                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
        }
    }
    public static void obtenerNumeros(){
        System.out.println("Introduce el dato");
        numeroUno = Integer.parseInt(scanner.nextLine());
        System.out.println("\n");
    }
}
