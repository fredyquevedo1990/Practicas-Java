import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos euros: " );
        double Euro = scanner.nextDouble();
        double TasaDeCambio = 1.06;
        double Dolares = Euro * TasaDeCambio;
        System.out.print(Euro + " "+"Los euros equivalen: "+ Dolares +" "+"dolares.");
    }
}
