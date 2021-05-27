import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio11 {
    public static void main(String[] args) {

        String texto = "";
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        System.out.println("Ingresa una frase");

        try{
            texto = buffer.readLine();
        }catch(Exception e){
            System.out.println("Debes ingreasar una frase");
        };

        int a = texto.length();
        System.out.println("La frase tiene: "+a+"Letras");

        for(int i=0;i<texto.length();i++){

            char c = texto.charAt(i);

            if(c == 'a'){
                contadorA++;
            }
            if(c == 'e'){
                contadorE++;
            }
            if(c == 'i'){
                contadorI++;
            }
            if(c == 'o'){
                contadorO++;
            }
            if(c == 'u'){
                contadorU++;
            }
        }

        System.out.println("La frase tiene "+contadorA+" vocales de A");
        System.out.println("La frase tiene "+contadorE+" vocales de E");
        System.out.println("La frase tiene "+contadorI+" vocales de I");
        System.out.println("La frase tiene "+contadorO+" vocales de O");
        System.out.println("La frase tiene "+contadorU+" vocales de U");

    }
}
