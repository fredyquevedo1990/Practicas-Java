import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el numero: " );
        double numero = scanner.nextDouble();

        double resultado = (numero * numero);

        System.out.print("La raiz cuadrada de "+numero+" "+" es: "+resultado);
    }
}

