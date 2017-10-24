
package boletin3_3;
import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
    Circulo circulo1 = new Circulo();
    Scanner sc = new Scanner(System.in);
    System.out.println("teclea radio:");
   circulo1.setradio(sc.nextDouble());
   System.out.println("la area del circulo es ="+ circulo1.calcularArea());
   System.out.println("la longitud es "+circulo1.calcularLongitud());
    }
    
}
