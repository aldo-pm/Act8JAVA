package act8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);

        String Menu = ("Bienvenido a Poker!")
                + ("Selecciona una opción: \n")
                + ("1\t Mezclar deck \n")
                + ("2\t Sacar una carta \n")
                + ("3\t Carta al azar \n")
                + ("4\t Generar una mano de 5 cartas \n")
                + ("0\t Salir");
        
        int opcion;
        
        do {
            System.out.println(Menu);
            Deck mazo = new Deck();
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    mazo.shuffle();
                    break;
                    
                case 2:
                    mazo.head();
                    break;
                    
                case 3:
                    mazo.pick();
                    break;
                    
                case 4:
                    mazo.hand();
                    break;
                    
                case 0:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Opción no válida,vuelve a intentarlo \n");

            }
        } while (opcion < 0 || opcion > 4);
if (opcion < 0 || opcion > 4) {
            throw new Exception("Opción no válida,vuelve a intentarlo");    }
}
    }


