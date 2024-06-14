import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        //Clase Scanner que nos permite que el usuario escriba
        Scanner scanner= new Scanner(System.in);

        //Declaraciones y Asignaciones
        String palabraSecreta= "inteligencia";
        int intentosMaximo = 10;
        int intentos= 0;
        boolean palabraAdivinada= false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Bucle de control: Iterativa 
        for(int i= 0; i<letrasAdivinadas.length; i++){
            letrasAdivinadas[i]= '_';
        }

        //Estructura de control: Iterativa
        while (!palabraAdivinada && intentos < intentosMaximo) {
            //                                         //Esto se usa cuando tenemos una palabra de chars, se va volviendo un String a medias hasta adivinar la palabra
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas)+ " " + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");
            //Usamos la clase scanner para pedir una letra
            char letra= Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for(int i=0; i< palabraSecreta.length(); i++){
                //Estructura de control condicional
                if (palabraSecreta.charAt(i)== letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta=true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecta te quedan: "+ (intentosMaximo-intentos)+ " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada= true;
                System.out.println("Felicidades, has adivinado la palabra correcta: " + palabraSecreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("Game Over te quedaste sin intentos");
        }
        scanner.close();
    }
}
